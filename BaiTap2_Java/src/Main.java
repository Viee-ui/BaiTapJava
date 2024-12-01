import javax.sql.rowset.serial.SQLOutputImpl;

public class Main {
    public static void main(String[] args) {
       Author author = new Author("Phạm Ngọc Việt", "ngocvietpham.dmxtp@gmail.com", 'm');
        Book book = new Book("Java for Beginers",author, 22, 100);

        System.out.println("Book name: " + book.getName());
        System.out.println("Author name: " + book.getAuthor().getName());

        System.out.println("Price: " + book.getPrice());

                          book.setPrice(29.95);
                          book.setQty(28);

        System.out.println("Updated price: " + book.getPrice());
        System.out.println("Updated qty: " + book.getQty());

        author.setEmail("ngocvietpham.dmxtp@gmail.com");
        System.out.println("Author email: " + author.getEmail());
    }
}