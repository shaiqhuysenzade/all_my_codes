package homeworks.homework4;

import java.util.Arrays;
import java.util.Random;

public class Main extends RandomFunction {

    public static void main(String[] args) {
        Pet p = new Pet();
        p.setNickname("Damet");
        p.setAge(12);
        p.setSpecies("Lablador");
        p.setHabits(new String[]{"eat","drink","sleep"});
        System.out.println(Arrays.toString(p.getHabits()));
        Human h = new Human();
        h.setPet(p);
        System.out.println(        h.getPet());
        h.greetPet();
        h.describePet();
    }
}
