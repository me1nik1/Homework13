import java.util.Objects;

public class Book {

    private final String title;
    private final Author author;
    private int publisherYear;

    public Book(String title, Author author, int publisherYear) {
        this.title = title;
        this.author = author;
        this.publisherYear = publisherYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publisherYear == book.publisherYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publisherYear);
    }

    @Override
    public String toString() {
        return "'" + title + "'" + ", " + author + ", год издания: " + publisherYear;
    }
}
