public final class Book {
    private final String title;
    private final String author;
    private final int pages;
    public final int bookCounter;
    public final int bookID;


    public Book(String title, String author, int pages, int bookCounter, int bookID) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.bookCounter = bookCounter ;
        this.bookID = bookID;
    }

    public Book(String title, String author, int pages, int bookCounter) {
        this(title, author, pages, bookCounter, 0);
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getBookCounter() {
        return bookCounter  ;
    }

    public int getBookID() {
        return bookID;
    }



    @Override
    public String toString() {

        return "("+bookCounter + ")" + title + ", " + author + ", " + "(" + pages + " pages)" ;
    }
}
