public class Book {

    private final String title;
    private  int yearPublication;
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
        return "Книга: " + title + " " + yearPublication + " " + autor;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public Autor getAutor() {
        return autor;
    }
}
