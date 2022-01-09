package library.service.Impl;

import library.DAO.UserDao;
import library.DAO.impl.UserDaoImpl;
import library.PO.User;
import library.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();
    @Override
    public User findUserByNameAndPassword(String name, String password) {
        return dao.findUserByNameAndPassword(name,password);
    }
}
