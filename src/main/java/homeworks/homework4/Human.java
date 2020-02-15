package homeworks.homework4;

import java.util.Random;

public class Human {
    private String name;
    private String surname;
    private int year;
    Random r = new Random();
    private int iq = r.nextInt(101);
     private Pet pet = new Pet();
    private Human father;
    private Human mother;
    private String shedule [][]=new String[7][2];

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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getFather() {
        return father;
    }
    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public String[][] getShedule() {
        return shedule;
    }

    public void setShedule(String[][] shedule) {
        this.shedule = shedule;
    }
    public void greetPet(){
        System.out.println("Привет, " +pet.getNickname());
    }
    public void describePet(){
    String v;
        if(pet.getTrickLevel()>50){
            v=" очень хитрый";
        }else {
            v=" почти не хитрый";
        }
        System.out.println("У меня есть " +pet.getSpecies()+ ", ему " +pet.getAge() + "  лет, он" + v);
    }
}
