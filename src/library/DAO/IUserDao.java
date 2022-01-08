package library.DAO;

import library.PO.User;

public interface IUserDao {
    public User findUserByNameAndPassword(String name, String password);
}
