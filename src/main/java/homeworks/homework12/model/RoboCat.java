package homeworks.homework12.model;

import java.util.HashSet;

public class RoboCat extends Pet {
    public RoboCat( String name, int age, HashSet<String> habits) {
        super(Species.RoboCat, name, age, habits);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void respond() {
        System.out.println("Я кошка робот и мне на все наплевать");
    }
}
