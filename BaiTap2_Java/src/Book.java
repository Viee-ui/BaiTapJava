public class Book {
    private String name;
    private Author author;

    private int qty;
    private double price;

    public Book(String name, Author author, int qty, double price) {
        this.name = name;
        this.author =author;
        this.price = price;
    }
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;

    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;

    }
    public int getQty() {
        return qty;

    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Book [name=" + name + ", qty=" + qty + ", price=" + price + "]";
    }
}
