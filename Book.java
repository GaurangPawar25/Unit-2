public class Book {
    String title;
    String author;
    double price;

    public Book() {
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
    }
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        Book book = new Book();
        book.displayBookDetails();
    }
}
