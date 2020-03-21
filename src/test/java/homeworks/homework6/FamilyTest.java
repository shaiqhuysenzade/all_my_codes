package homeworks.homework6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    private Family f;
    private Human children[]= new Human[2];
    private Human mother;
    private Human father;
    private Human son;
    private Human daughter;
    private Human forFalseTest;
    private Pet pet;
    @BeforeEach
    void family(){
        mother = new Human("Valide" ,"Nezirova",1976);
        father = new Human("Xelil","Nezirov",1973);
        son = new Human("Rufet","Nezirov",2000);
        daughter=new Human("Guler","Nezirov",2002);
        forFalseTest=new Human("Nizami","Huseynov",2007);
        f=new Family(mother,father);
        children=new Human[]{son,daughter};
        f.setChildren(children);
        pet = new Pet(Species.Dog,"Sasha",3,new String[]{"eat","drink","sleep"});
        f.setPet(pet);
    }

    @Test
    void countOfFamily() {
        System.out.print("Count of Family is ");
        int count = 2 + children.length;
        assertEquals(count,f.countOfFamily());
    }

    @Test
    void addChild() {
        assertTrue(f.addChild(son));
    }

    @Test
    void deleteChildByIndex()
    {
        assertTrue(f.deleteChildByIndex(0));
    }

    @Test
    void deleteChildByObject1()
    {
        assertTrue(f.deleteChildByObject2(children,son));
    }

    @Test
    void deleteChildByIndexFalse() {
        assertTrue(f.deleteChildByIndex(-4));
    }
    @Test
    void deleteChildByObject1False() {
        assertTrue(f.deleteChildByObject2(children,forFalseTest));
    }

    @Test
    void testingToString() {
        String testing = "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
        assertEquals(testing,f.toString());
    }
}