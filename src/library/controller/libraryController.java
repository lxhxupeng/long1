package library.controller;

import library.PO.User;
import library.service.Impl.UserServiceImpl;
import library.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class libraryController {
    Scanner input = new Scanner(System.in);
    private UserService service = new UserServiceImpl();
    public void start() {
        System.out.println("====================");
        System.out.println("welcom library");
        for (int i = 0; i < 3; i++) {
            System.out.println("input your name:");
            String name = input.next();
            System.out.println("input your mima");
            String password = input.next();
            User user = service.findUserByNameAndPassword(name, password);
            if (user != null) {
                if (user.getFlag().equals("1")) {
                    System.out.println("welcom " + name);
                    System.out.println("\t1、 新增");
                    System.out.println("\t2、 查看");
                    System.out.println("\t3、 删除");
                    System.out.println("\t4、 借阅");
                    System.out.println("\t5、 归还");
                    System.out.println("\t0、 退出");
                } else {
                    System.out.println("welcom " + name);
//                    System.out.println("\t1、 新增");
                    System.out.println("\t2、 查看");
//                    System.out.println("\t3、 删除");
                    System.out.println("\t4、 借阅");
                    System.out.println("\t5、 归还");
                    System.out.println("\t0、 退出");
                }
                System.out.println("input your choice:");
                String choice = input.next();
                switch (choice) {
                    case 1:
                        //新增
                        System.out.println("please creat your book id,name,title,author,publish,price,count");

                    case 2:
                        //新增
                    case 3:
                        //新增
                    case 4:
                        //新增
                    case 5:
                        //新增
                    case 6:
                        //新增

                }
                break;
            } else {
                System.out.println("sorry your name or password is erro");
                System.out.println("还有 "+(3-i)+"次");
            }
        }
    }

    public static void main(String[] args) {
        libraryController controller = new libraryController();
        controller.start();
    }
}
