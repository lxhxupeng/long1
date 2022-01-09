package library.DAO;

import library.PO.Book;

import java.util.List;

public interface BookDAO {
//新增
    public int insertBook(String id, String title, String author, String publish, String price, String count);
//查找
    public List<Book> findBookByTitle(String title);
//删除
    public int deleteBookBy(String title);

}
