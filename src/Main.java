public class Main {
    public static void main(String[] args) {

        Autor levTolstoy = new Autor("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", 1965, levTolstoy);
        Book warAndPeaceSecond = new Book("War and Peace", 1965, levTolstoy);


        warAndPeace.setYearPublication(1867);
        warAndPeaceSecond.setYearPublication(1867);
        System.out.println(warAndPeace);
        System.out.println(warAndPeace.equals(warAndPeaceSecond));

      }

}