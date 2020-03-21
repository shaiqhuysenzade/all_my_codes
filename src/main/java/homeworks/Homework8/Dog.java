package homeworks.Homework8;

import java.util.HashSet;

public class Dog extends Pet implements PetInterface {
    public Dog( String name, int age, HashSet<String> habits) {
        super(Species.Dog, name, age, habits);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void respond() {
        System.out.println("Я собака и я гоняюсь за кошками");
    }

    @Override
    public void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }
}
