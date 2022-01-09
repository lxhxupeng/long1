package library.service.Impl;

import library.DAO.BookDAO;
import library.DAO.impl.BookDAOImpl;
import library.service.BookService;

public class BookServiceImpl implements BookService {
    BookDAO bookDAO = new BookDAOImpl();

    @Override
    public int insertBook(String id, String title, String author, String publish, String price, String count) {
        return bookDAO.insertBook(id,title,author,publish,price,count);
    }
}
