package library.DAO;

import library.PO.User;

public interface UserDao {
    public User findUserByNameAndPassword(String name, String password);
}
