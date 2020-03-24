package homeworks.homework8;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Woman mother = new Woman("Gunay", "Mammedova", 1975);
        Man father = new Man("Namiq", "mammedov", 1973);
        Human son = new Human("Babek", "Mammedov", 2000);
        Map<DayOfWeek, String> shedule = new HashMap<>();
        shedule.put(DayOfWeek.Monday , "coding");
        shedule.put(DayOfWeek.Tuesday , "go to school");
        shedule.put(DayOfWeek.Wednesday,"go to the gym");
        shedule.put(DayOfWeek.Thursday , "coding");
        shedule.put(DayOfWeek.Friday , "meeting friends");
        shedule.put(DayOfWeek.Saturday , "coding");
        shedule.put(DayOfWeek.Sunday, "coding");
        son.setShedule(shedule);
        Human daughter = new Human("Aysel", "Mammedova", 1998);
        List<Human> children = new ArrayList<>();
        children.add(son);
        children.add(daughter);
        HashSet<String> habits = new HashSet<>();
        habits.add("eat");
        Dog dog = new Dog("Sasha ", 2,habits);
        dog.eat();
        Set<Pet> pets = new HashSet<>();
        pets.add(dog);
        Family f = new Family(mother, father, pets);
        f.setChildren(children);
        System.out.println(f.toString());
    }

}

