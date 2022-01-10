package library.DAO.impl;

import library.DAO.BookDAO;
import library.PO.Book;

import java.sql.*;
import java.util.List;

public class BookDAOImpl implements BookDAO {
    String url = "jdbc:mysql://localhost:3306/library";
    String username = "root";
    String password = "123456";

    @Override
    public int insertBook(String id,  String title, String author, String publish, String price, String count) {
        Book book = null;
        //将连接数据库的方法 抽象一个方法 或者对象
        int resultSet = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //加载数据库驱动
            Connection conn = DriverManager.getConnection(url, username, password);//链接对象
            String sql = "insert into book values(?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,id);
            pst.setString(2,title);
            pst.setString(3,author);
            pst.setString(4,publish);
            pst.setString(5,price);
            pst.setString(6,count);
            resultSet = pst.executeUpdate();
            pst.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return resultSet;
    }

    @Override
    public List<Book> findBookByTitle(String title) {
        return null;
    }

    @Override
    public int deleteBookBy(String title) {
        return 0;
    }
}
