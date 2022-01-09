package library.service;

import library.PO.User;

public interface UserService {
    public User findUserByNameAndPassword(String name, String password);
}

