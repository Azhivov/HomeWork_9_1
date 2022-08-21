import java.util.Objects;

public class Book {

    private final String title;
    private int yearPublication;
    private final Autor autor;

    public Book(String title, int yearPublication, Autor autor) {
        this.title = title;
        this.yearPublication = yearPublication;
        this.autor = autor;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "Book: " + title + " " + yearPublication + " " + autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(title, book.title) && Objects.equals(autor, book.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, autor);
    }
}
