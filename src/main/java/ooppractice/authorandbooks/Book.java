package ooppractice.authorandbooks;

public class Book {

    private String title;
    private Author author;
    private double price;
    private int qtyInStock=0;

    public Book(String title, Author author, double price, int qtyInStock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public Book(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getAuthorName(){
        return author.getName();
    }
    public String getAuthorEmail(){
        return author.getEmail();
    }
    public char getAuthorGender(){
        return author.getGender();
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    @Override
    public String toString() {
        return "'"+ title + "' by " + author.toString();
    }


}
