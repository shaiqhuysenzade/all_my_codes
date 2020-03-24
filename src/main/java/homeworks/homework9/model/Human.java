package homeworks.homework9.model;


import java.util.*;

public class Human {
    private Family family;
    private String name;
    private String surname;
    private int year;
    Random r = new Random();
    private int iq = r.nextInt(101);
    private Map<DayOfWeek, String> shedule = new HashMap<>();

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    public void greetPet() {
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

    public Map<DayOfWeek, String> getShedule() {
        return shedule;
    }

    public void setShedule(Map<DayOfWeek, String> schedule) {
        this.shedule = schedule;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(family, name, surname);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq = " + iq +
                ", shedule=" + shedule +
                '}';
    }


}

