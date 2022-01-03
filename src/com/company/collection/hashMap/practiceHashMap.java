package com.company.collection.hashMap;

import com.company.OOP.Hero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
* 准备一个ArrayList其中存放3000000(三百万个)Hero对象，其名称是随机的,格式是hero-[4位随机数]
hero-3229
hero-6232
hero-9365
...
因为总数很大，所以几乎每种都有重复，把名字叫做 hero-5555的所有对象找出来  --怎么叫找出来  是要下标还是
要求使用两种办法来寻找
1. 不使用HashMap，直接使用for循环找出来，并统计花费的时间
2. 借助HashMap，找出结果，并统计花费的时间*/
public class practiceHashMap {


    public static void main(String[] args) {
        long starTime;
        long endTime;

        List<Hero> heroes = new ArrayList<>();

        for (int i = 0; i < 300*10000; i++) {
            heroes.add(new Hero("hero-" + (int)(Math.random()*10000))); //必须要这样写才能匹配hero-5555  为啥呢？
        }
        int count = 0;
        starTime = System.currentTimeMillis();
        for (int i = 0; i < heroes.size(); i++) {
            if (heroes.get(i).name.equals("hero-5555")) {
                count++;
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("for search " + count +" spend time is: "+ (endTime-starTime));

        HashMap<String, List<Hero>> hashMap = new HashMap<>();
        for (int i = 0; i < 300 * 10000; i++) {
            String heroName = "hero-" + (int) (Math.random() * 10000);
            List<Hero> list = hashMap.get(heroName); //这是取map的value
            if (list ==null) {
                list = new ArrayList<>();   //hero容器
                hashMap.put(heroName,list); //map中添加key-value  key是heroName  value是hero对象
            }
            list.add(new Hero(heroName)); //即使heroName名称一样  但是创建了是一个新的hero对象
//            List<Hero> result = hashMap.get("hero-5555");
//            List<Hero> list = new ArrayList<>();
//            list.add(new Hero(heroName));
//            hashMap.put(heroName, list);
        }
        List<Hero> result = hashMap.get("hero-5555");
        System.out.println(result.size());
    }

}

