import java.util.*;

// Book class to store book details
class Book {
    private String title;
    private String author;
    private int availableCopies;

    public Book(String title, String author, int availableCopies) {
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }
}

// Library class to manage books and users
class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public List<Book> searchBooks(String keyword) {
        List<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }

    public Book borrowBook(Book book) {
        if (book.getAvailableCopies() > 0) {
            book.setAvailableCopies(book.getAvailableCopies() - 1);
            return book;
        }
        return null;
    }

    public void returnBook(Book book) {
        book.setAvailableCopies(book.getAvailableCopies() + 1);
    }
}

// Main class to demonstrate the library system
public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding sample books to the library
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 5));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 3));
        library.addBook(new Book("1984", "George Orwell", 2));

        // User actions
        Book borrowedBook = library.borrowBook(library.getAllBooks().get(0));
        if (borrowedBook != null) {
            System.out.println("Book borrowed: " + borrowedBook.getTitle());
        } else {
            System.out.println("Book unavailable.");
        }

        library.returnBook(borrowedBook);
        System.out.println("Book returned: " + borrowedBook.getTitle());

        List<Book> searchResults = library.searchBooks("Mockingbird");
        if (!searchResults.isEmpty()) {
            System.out.println("Search results:");
            for (Book book : searchResults) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
            }
        } else {
            System.out.println("No books found.");
        }
    }
}
