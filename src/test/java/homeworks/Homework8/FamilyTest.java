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
        son.setShedule(new String[][]{{DayOfWeek.Monday.name(), "coding"}, {DayOfWeek.Tuesday.name(), "go to school"},
                {DayOfWeek.Wednesday.name(), "go to the gym"}, {DayOfWeek.Thursday.name(), "coding"},
                {DayOfWeek.Friday.name(), "meeting friends"}, {DayOfWeek.Saturday.name(), "coding"},
                {DayOfWeek.Sunday.name(), "coding"}});
        daughter = new Human("Guler", "Nezirov", 2002);
        forFalseTest = new Human("Nizami", "Huseynov", 2007);
        dog = new Dog("Sasha ", 2,habits);
        cat = new DomesticCat("Pasha ", 3, habits);
        pet = new HashSet<>();
        pet.add(dog);
        pet.add(cat);
        f = new Family(mother, father, pet);
        children = new ArrayList<>();
        children.add(son);
        children.add(daughter);
        f.setChildren(children);

    }

    @Test
    void addChild() {
        assertTrue(f.addChild(son));
    }

    @Test
    void deleteChildByObject(){
        assertTrue(f.deleChildByObject(daughter));
    }

    @Test
    void deleteChildByIndex(){
        assertTrue(f.deleteChildByIndex(0));
    }

    @Test
    void deleteChildByObjectFalse(){
         Human forFalseTest=new Human("Nizami","Huseynov",2007);
        assertFalse(f.deleChildByObject(forFalseTest));
    }

    @Test
    void deleteChildByIndexFalse(){
        assertFalse(f.deleteChildByIndex(-8));
    }

    @Test
    void countFamily(){
//        System.out.print("Count of Family is ");
        int count = 2 + children.size();
        assertEquals(count,f.countOfFamily());
    }
    @Test
    void testToString(){
        String testing = "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + pet +
                '}';
        assertEquals(testing,f.toString());
    }

}