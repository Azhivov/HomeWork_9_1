public class Main {
    public static void main(String[] args) {

        Autor levTolstoy = new Autor("���", "�������");
        Book warAndPeace = new Book("����� � ���", 1965, levTolstoy);

        warAndPeace.setYearPublication(1867);
        System.out.println(levTolstoy);
        System.out.println(warAndPeace);
    }

}