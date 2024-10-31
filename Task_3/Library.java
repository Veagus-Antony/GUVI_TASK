package Taskk_3;

import java.util.ArrayList;

public class Library {

        private ArrayList<Book> books;

        public Library() {
            books = new ArrayList<>();
        }

        // Method to add a book to the library
        public void addBook(Book book) {
            books.add(book);
            System.out.println("Book added: " + book.getTitle());
        }

        // Method to remove a book from the library using book ID
        public void removeBook(int bookID) {
            Book bookToRemove = searchBook(bookID);
            if (bookToRemove != null) {
                books.remove(bookToRemove);
                System.out.println("Book removed: " + bookToRemove.getTitle());
            } else {
                System.out.println("Book with ID " + bookID + " not found.");
            }
        }

        // Method to search for a book using book ID
        public Book searchBook(int bookID) {
            for (Book book : books) {
                if (book.getBookID() == bookID) {
                    return book;
                }
            }
            return null; // Book not found
        }

        // Method to display all books in the library
        public void displayBooks() {
            if (books.isEmpty()) {
                System.out.println("No books in the library.");
            } else {
                System.out.println("Library Books:");
                for (Book book : books) {
                    System.out.println(book);
                }
            }
        }


}
