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
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book name = (Book) other;
        return bookName.equals(name.bookName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }

}

