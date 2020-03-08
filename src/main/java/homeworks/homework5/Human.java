package homeworks.homework5;

import java.util.Arrays;
import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year &&
                Objects.equals(family, human.family) &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(family, name, surname, year);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("This object was deleted" + this);
    }
}
