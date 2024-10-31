package Taskk_3;

public class Book {

        private int bookID;
        private String title;
        private String author;
        private boolean isAvailable;

        public Book(int bookID, String title, String author) {
            this.bookID = bookID;
            this.title = title;
            this.author = author;
            this.isAvailable = true;  // All new books are available by default
        }

        // Getter and Setter methods
        public int getBookID() {
            return bookID;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailability(boolean isAvailable) {
            this.isAvailable = isAvailable;
        }

        @Override
        public String toString() {
            return "BookID: " + bookID + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable;
        }


}
