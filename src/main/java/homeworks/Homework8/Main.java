package homeworks.Homework8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Woman mother = new Woman("Gunay", "Mammedova", 1975);
        Man father = new Man("Namiq", "mammedov", 1973);
        Human son = new Human("Babek", "Mammedov", 2000);
        son.setShedule(new String[][]{{DayOfWeek.Monday.name(), "coding"}, {DayOfWeek.Tuesday.name(), "go to school"},
                {DayOfWeek.Wednesday.name(), "go to the gym"}, {DayOfWeek.Thursday.name(), "coding"},
                {DayOfWeek.Friday.name(), "meeting friends"}, {DayOfWeek.Saturday.name(), "coding"},
                {DayOfWeek.Sunday.name(), "coding"}});
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

