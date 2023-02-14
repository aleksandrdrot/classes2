import java.util.Objects;

public class Book {
    private int publishingYear;
    private String bookName;
    private Author author;

    public Book(Author author, String bookName, int publishingYear){
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public Author getAuthor(){
        return author;
    }

    public String getBookName(){
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return bookName + " " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishingYear, bookName, author);
    }
}

