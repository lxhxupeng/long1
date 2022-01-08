package java8InAction.chap1;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class FilteringApples {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(80, "green"));
        inventory.add(new Apple(155, "green"));
        inventory.add(new Apple(120, "red"));
        List<Apple> greenApples = new ArrayList<>();
        //用for循环遍历 获取green苹果
        for (Apple a:inventory
             ) {
            if (a.getColor() == "green") {
                greenApples.add(a);
            }
        }
        System.out.println(greenApples);

        //调用方法  filterApples  在库存中查找绿苹果   方法传递
        List<Apple> greenApple = filterApples(inventory, FilteringApples::isGreenApple);
        System.out.println(greenApples);
        List<Apple> heavyApple = filterApples(inventory, FilteringApples::isHeavyApple);
        System.out.println(heavyApple);

        //第二种  lambda表达式，比方法传递 就是不用在定义方法（一堆），也就是说用匿名lamda函数
        List<Apple> greenApple2 = filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));
        List<Apple> heavyApple2 = filterApples(inventory, (Apple a) -> a.getWeigth() > 150);
        List<Apple> weridApple = filterApples(inventory, (Apple a) -> a.getWeigth() < 80 || "brow".equals(a.getColor()));

    }


    public static class Apple{
        private int weigth = 0;
        private String color = "";

        @Override
        public String toString() {
            return "Apple{" +
                    "weigth=" + weigth +
                    ", color='" + color + '\'' +
                    '}';
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getWeigth() {
            return weigth;
        }

        public void setWeigth(int weigth) {
            this.weigth = weigth;
        }

        public Apple(int weigth, String color) {
            this.weigth = weigth;
            this.color = color;
        }
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory
             ) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterHeavyApple(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple:inventory
             ) {
            if (apple.getWeigth() > 150) {
                result.add(apple);
            }
        }
        return result;
    }
    //上面两个方法基本一样  很多重复的  优化下

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeigth() > 150;
    }

    public interface Predicate<T>{
        boolean test(T t);
    }

    static List<Apple> filterApples (List<Apple> inventory,Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple :inventory
                ) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }



// 筛选隐藏文件
/*
 步骤：1、编写一个方法判断是否是隐藏的
    2、但是目录 是一系列的文件  fileList
    3、要用它做筛选，你需要把它包在一个FileFilter对象里，然后传递给File.listFiles
 */
    File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
        @Override
        public boolean accept(File file) {
            return file.isHidden();
        }
    });
//已经有了函数isHidden，因此只需用Java 8的方法引用::语法（即“把这个方法作为值”）将其传给listFiles方法
    File[] hiddenFiles1 = new File(".").listFiles(File::isHidden);

//写(int x) -> x + 1，表示“调用时给定参数x，就返回x + 1值的函数
}

