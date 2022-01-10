package library.controller;

import library.PO.User;
import library.service.BookService;
import library.service.Impl.BookServiceImpl;
import library.service.Impl.UserServiceImpl;
import library.service.UserService;

import java.util.Scanner;

public class libraryController {
    Scanner input = new Scanner(System.in);
    private UserService service = new UserServiceImpl();
    private BookService bookService = new BookServiceImpl();
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
                System.out.print("input your choice:");
                int choice = input.nextInt(); //这里选择数字类型的输入如
                switch (choice) {
                    case 1:
                        //新增
                        System.out.println("please creat your book id,title,author,publish,price,count");
                        String[] book = new String[7];
                        String sbook = input.next();
                        book = sbook.split(",");
                        String id = book[0];
                        String title = book[1];
                        String author = book[2];
                        String publish = book[3];
                        String price = book[4];
                        String count = book[5];
                        int num = bookService.insertBook(id, title, author, publish, price, count);
                        System.out.println(num);
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
