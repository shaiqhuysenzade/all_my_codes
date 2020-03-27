package homeworks.homework13.model;

import java.io.Serializable;
import java.util.HashSet;

public class Fish extends Pet implements Serializable {

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
