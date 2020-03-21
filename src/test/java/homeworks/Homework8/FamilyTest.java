package homeworks.Homework8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    private Family f;
    private List<Human> children;
    private Woman mother;
    private Man father;
    private Human son;
    private Human daughter;
    private Human forFalseTest;
    private Dog dog;
    private DomesticCat cat;
    private Set<Pet> pet;
    HashSet<String> habits ;

    @BeforeEach
    void family() {
        habits = new HashSet<>();
        habits.add("eat");
        mother = new Woman("Valide", "Nezirova", 1976);
        father = new Man("Xelil", "Nezirov", 1973);
        son = new Human("Rufet", "Nezirov", 2000);
        daughter = new Human("Guler", "Nezirov", 2002);
        forFalseTest = new Human("Nizami", "Huseynov", 2007);
        dog = new Dog("Sasha ", 2,habits);
        cat = new DomesticCat("Pasha ", 3, habits);
        pet.add(dog);
        pet.add(cat);
        f = new Family(mother, father, pet);
        children = new ArrayList<>();
        children.add(son);
        children.add(daughter);

    }

    @Test
    void addChild() {
        Human son2 = new Human("K","l",23);
        assertTrue(f.addChild(son2));
    }


}