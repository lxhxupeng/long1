package library.DAO.impl;

import library.DAO.IUserDao;
import library.PO.User;

import java.sql.*;

public class UserDaoImpl implements IUserDao {
    String url = "jdbc:mysql://localhost:3306/library";
    String username = "root";
    String password = "123456";

    @Override
    public User findUserByNameAndPassword(String name, String pw) {
        User user = null;
        try {

            Class.forName("com.mysql.jdbc.Driver"); //加载数据库驱动
            Connection conn = DriverManager.getConnection(url, username, password);//链接对象
            String sql = "select * from user where name = ? and password = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,name);
            pst.setString(2,pw);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setFlag(rs.getString("id"));
                user.setFlag(rs.getString("name"));
                user.setFlag(rs.getString("password"));
                user.setFlag(rs.getString("flag"));
                user.setFlag(rs.getString("id"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        User admin = userDao.findUserByNameAndPassword("admin", "123");
        System.out.println(admin);
    }
}
