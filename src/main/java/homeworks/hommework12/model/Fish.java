package homeworks.hommework12.model;

import java.util.HashSet;

public class Fish extends Pet {

    public Fish(String name, int age, HashSet<String> habits) {
        super(Species.Fish, name, age, habits);
    }


    @Override
    public void respond() {
        System.out.println("Я рыба и я умею плавать");
    }

    @Override
    public void eat() {
        super.eat();
    }


}
