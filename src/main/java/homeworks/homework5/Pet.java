package homeworks.homework5;


import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    Random r = new Random();
    private int trickLevel = r.nextInt(101);
    private String habits[] = new String[3];

    public Pet() {
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.r = r;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("Я кушаю!");
    }

    public void respond() {
        System.out.println("Привет, хозяин. Я -" + getNickname() + " Я соскучился!");
    }

    public void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(species, pet.species) &&
                Objects.equals(nickname, pet.nickname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(species, nickname);
    }

    @Override
    public String toString() {
        return species + "{" +
                " nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

}
