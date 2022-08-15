public class Main {
    public static void main(String[] args) {

        Autor levTolstoy = new Autor("Лев", "Толстой");
        Book warAndPeace = new Book("Война и мир", 1965, levTolstoy);

        warAndPeace.setYearPublication(1867);
        System.out.println(levTolstoy);
        System.out.println(warAndPeace);
    }

}