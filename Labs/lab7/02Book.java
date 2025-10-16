class Book {
    private String author_name;

    public Book(String author) {
        this.author_name = author;
    }

    public String getAuthorName() {
        return author_name;
    }

    void display() {
        System.out.println("Author: " + author_name);
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String author, String title) {
        super(author);
        this.title = title;
    }

    @Override
    void display() {
        System.out.println("Book Publication");
        System.out.println("Author: " + getAuthorName());
        System.out.println("Book Title: " + title);
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String author, String title) {
        super(author);
        this.title = title;
    }

    @Override
    void display() {
        System.out.println("Paper Publication");
        System.out.println("Author: " + getAuthorName());
        System.out.println("Paper Title: " + title);
    }
}

public class _02Book {
    public static void main(String[] args) {

        Book book1 = new BookPublication("J.K. Rowling", "Harry Potter");
        Book book2 = new PaperPublication("Albert Einstein", "Theory of Relativity");

        book1.display();
        System.out.println();
        book2.display();
    }
}
