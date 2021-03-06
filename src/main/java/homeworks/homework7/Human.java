package homeworks.homework7;



import java.util.Arrays;
import java.util.Random;

public class Human {
    private Family family;
    private String name;
    private String surname;
    private int year;
    Random r = new Random();
    private int iq = r.nextInt(101);
    private String shedule[][] = new String[7][2];

    public Human() {
    }
    public Human(String name , String surname, int year){
        this.name=name;
        this.surname=surname;
        this.year=year;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void greetPet(){
        System.out.println("Hi ");
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public String[][] getShedule() {
        return shedule;
    }

    public void setShedule(String[][] shedule) {
        this.shedule = shedule;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("This object was deleted" + this);
//    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("This object was deleted" + this);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq = " + iq +
                ", shedule=" + Arrays.deepToString(shedule) +
                '}';
    }


}

