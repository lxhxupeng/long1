package library.DAO.impl;

import library.DAO.BookDAO;
import library.PO.Book;

import java.util.List;

public class BookDAOImpl implements BookDAO {
    @Override
    public int insertBook(String id, String title, String author, String publish, String price, String count) {
        return 1;
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
