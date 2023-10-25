package bg.smg;

public class Book {
    private String title;
    private Author author;
    private BookType type;
    private int available;
    private double price;

    public Book(){
        this.title = "";
        this.author = "";
        this.type = BookType.BOOK;
        this.available = 0;
        this.price = 0;
    }

    public Book(String title, Author author, BookType type, int available, double price){
        this.title = "";
        this.author = "";
        this.type = "";
        this.available = 0;
        this.price = 0;
    }
}
