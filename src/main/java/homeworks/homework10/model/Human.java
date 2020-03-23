package homeworks.homework10.model;


import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

public class Human {
    private Family family;
    private String name;
    private String surname;
    private long birthDate;
    Random r = new Random();
    //    private int iq = r.nextInt(101);
    private int iq;
    private Map<DayOfWeek, String> shedule = new HashMap<>();
    ZoneId zoneId = ZoneId.systemDefault();

    public Human(String name, String surname, String birthDate, int iq) {
        this.name = name;
        this.surname = surname;
        this.birthDate= LocalDate.parse(birthDate,DateTimeFormatter.ofPattern("dd/MM/yyyy")).toEpochDay();
        this.iq = iq;
    }

    public Human(String name, String surname, long birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Human(){}

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String describeAge() {
        LocalDate localDate = LocalDate.now();
        LocalDate dateOfHuman = LocalDate.ofEpochDay(birthDate);
        Period p = Period.between(dateOfHuman, localDate);
        return String.format("%d years,%d months, %d days", p.getYears(), p.getMonths(), p.getDays());
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

    public long getYear() {
        return birthDate;
    }

    public void setYear(long year) {
        this.birthDate = year;
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
                ", year=" + LocalDate.ofEpochDay(birthDate).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", iq = " + iq +
                ", shedule=" + shedule +
                '}';
    }


}

