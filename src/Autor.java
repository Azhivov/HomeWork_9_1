public class Autor {
 private String name;
 private String surname;

 public Autor(String name, String surname) {
     this.name = name;
     this.surname = surname;
 }
  public String getName(){
        return name;
    }
    public String getSurname() {
    return surname;
 }

    @Override
    public String toString() {
        return "Автор: " +
                name + " "+ surname;
    }
}
