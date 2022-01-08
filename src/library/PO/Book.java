package library.PO;

public class Book {
    private String id;
    private String title;
    private String author;
    private String publish;
    private double price;
    private int count;

    public Book() {
    }

    public Book(String id, String title, String author, String publish, double price, int count) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publish = publish;
        this.price = price;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
