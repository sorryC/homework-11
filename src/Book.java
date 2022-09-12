import java.util.Objects;

public class Book {
    private Author author;
    private int publisherYear;
    private String bookName;

    public Book(Author author, int publisherYear, String bookName) {
        this.author = author;
        this.publisherYear = publisherYear;
        this.bookName = bookName;
    }

    public int getPublisherYear(int i) {
        return publisherYear;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publisherYear == book.publisherYear && Objects.equals(author, book.author) && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, publisherYear, bookName);
    }

    @Override
    public String toString() {
        return "Книга - " + author +
                ", дата публикации " + publisherYear +
                ", название - " + bookName;
    }
}
