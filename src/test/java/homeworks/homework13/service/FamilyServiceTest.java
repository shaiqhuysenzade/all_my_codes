package homeworks.homework13.service;

import homeworks.homework13.model.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest {
    FamilyService familyService;

    @BeforeEach
    void beforeTest() {
        familyService = new FamilyService();
    }

    @Test
    void saveFamily() {

    }

    @Test
    void getAllFamilies() {
        Woman mother = new Woman("Gunay", "Mammedova", "12/03/1975");
        Man father = new Man("Namiq", "Mammedov", "07/05/1973");
        Family family1 = new Family(mother, father);
        familyService.createNewFamily(mother, father);
        List<Family> fm = new ArrayList<>();
        fm.add(family1);
        assertEquals(fm, familyService.getAllFamilies());
    }

    @Test
    void displayAllFamilies() {
        Woman mother1 = new Woman("Gunay", "Mammedova", "12/03/1975");
        Man father1 = new Man("Namiq", "Mammedov", "07/05/1973");
        Family family1 = new Family(mother1, father1);
        familyService.createNewFamily(mother1, father1);
        List<Family> fm = new ArrayList<>();
        fm.add(family1);
        assertEquals(fm.size(), familyService.getAllFamilies().size());
    }

    @Test
    void getFamiliesBiggerThan() {
        Woman mother1 = new Woman("Gunay", "Mammedova", "12/03/1975");
        Man father1 = new Man("Namiq", "Mammedov", "07/05/1973");
        Family family1 = new Family(mother1, father1);
        familyService.createNewFamily(mother1, father1);
        assertEquals(family1.countOfFamily() > 0, familyService.getFamilyById(0).countOfFamily() > 0);
    }

    @Test
    void getFamiliesLessThan() {
        Woman mother1 = new Woman("Gunay", "Mammedova", "12/03/1975");
        Man father1 = new Man("Namiq", "Mammedov", "07/05/1973");
        Family family1 = new Family(mother1, father1);
        familyService.createNewFamily(mother1, father1);
        assertEquals(family1.countOfFamily() < 0, familyService.getFamilyById(0).countOfFamily() < 0);
    }

    @Test
    void countFamiliesWithMemberNumber() {
        Woman mother1 = new Woman("Gunay", "Mammedova", "12/03/1975");
        Man father1 = new Man("Namiq", "Mammedov", "07/05/1973");
        Family family1 = new Family(mother1, father1);
        familyService.createNewFamily(mother1, father1);
        assertEquals(family1.countOfFamily(), familyService.getFamilyById(0).countOfFamily());
    }

    @Test
    void createNewFamily() {
        Woman mother1 = new Woman("Gunay", "Mammedova", "12/03/1975");
        Man father1 = new Man("Namiq", "Mammedov", "07/05/1973");
        Family family1 = new Family(mother1, father1);
        familyService.createNewFamily(mother1, father1);
        List<Family> fm = new ArrayList<>();
        fm.add(family1);
        assertTrue(familyService.getFamilyById(0).equals(fm.get(0)));
    }

    @Test
    void deleteFamilyByIndex() {
        Woman mother1 = new Woman("Gunay", "Mammedova", "12/03/1975");
        Man father1 = new Man("Namiq", "Mammedov", "07/05/1973");
        Family family1 = new Family(mother1, father1);
        familyService.createNewFamily(mother1, father1);
        assertTrue(familyService.deleteFamilyByIndex(0));
    }

    @Test
    void bornChild() {
        Woman mother1 = new Woman("Gunay", "Mammedova", "12/03/1975");
        Man father1 = new Man("Namiq", "Mammedov", "07/05/1973");
        Family family1 = new Family(mother1, father1);
        Man child = new Man("Damet", "Mammedov", "12/04/2020");
        List<Human> children = new ArrayList<>();
        family1.setChildren(children);
        List<Family> families = new ArrayList<>();
        families.add(family1);
        familyService.saveFamily(family1);
        familyService.bornChild(family1, "Damet", "Damet");
//        assertEquals(f.get(0).countOfFamily(),fs.getFamilyById(0).countOfFamily());
        assertTrue(familyService.getFamilyById(0).getChildren().get(0).equals(child));
    }

    @Test
    void adoptChild() {
        Woman mother1 = new Woman("Gunay", "Mammedova", "12/03/1975");
        Man father1 = new Man("Namiq", "Mammedov", "07/05/1973");
        Family family1 = new Family(mother1, father1);
        Human child = new Human("Damet", "Mammedov");
        familyService.saveFamily(family1);
        familyService.adoptChild(family1, child);
        assertEquals(child, familyService.getFamilyById(0).getChildren().get(0));
    }

    @Test
    void deleteAllChildrenOlderThen() {
        Woman mother1 = new Woman("Gunay", "Mammedova", "12/03/1975");
        Man father1 = new Man("Namiq", "Mammedov", "07/05/1973");
        Family family1 = new Family(mother1, father1);
        Human child = new Human("Damet", "Mammedov", "12/04/2005");
        familyService.saveFamily(family1);
        familyService.adoptChild(family1, child);
        familyService.deleteAllChildrenOlderThen(5);
        assertTrue(familyService.getFamilyById(0).getChildren().isEmpty());
    }

    @Test
    void count() {
        Woman mother1 = new Woman("Gunay", "Mammedova", "12/03/1975");
        Man father1 = new Man("Namiq", "Mammedov", "07/05/1973");
        Family family1 = new Family(mother1, father1);
        familyService.createNewFamily(mother1, father1);
        assertTrue(familyService.count() == 1);
    }

    @Test
    void getFamilyById() {
        Woman mother1 = new Woman("Gunay", "Mammedova", "12/03/1975");
        Man father1 = new Man("Namiq", "Mammedov", "07/05/1973");
        Family family1 = new Family(mother1, father1);
        familyService.createNewFamily(mother1, father1);
        List<Family> fm = new ArrayList<>();
        fm.add(family1);
        assertEquals(fm.get(0), familyService.getFamilyById(0));
    }

    @Test
    void getPets() {
        HashSet<String> habits = new HashSet<>();
        Dog dog = new Dog("Bobok", 2, habits);
        Set<Pet> pets = new HashSet<>();
        pets.add(dog);
        Family family = new Family();
        familyService.saveFamily(family);
        familyService.addPet(0, dog);
        assertEquals(pets, familyService.getFamilyById(0).getPet());
    }

    @Test
    void addPet() {
        HashSet<String> habits = new HashSet<>();
        Dog dog = new Dog("Bobok", 2, habits);
        Family family = new Family();
        familyService.saveFamily(family);
        familyService.addPet(0, dog);
        assertTrue(familyService.getFamilyById(0).getPet().iterator().next().equals(dog));
    }

//    @Test
//    void addToFile() {
//        Woman mother1 = new Woman("Gunay", "Mammedova", "12/03/1975");
//        Man father1 = new Man("Namiq", "Mammedov", "07/05/1973");
//        Family family1 = new Family(mother1, father1);
//        familyService.createNewFamily(mother1, father1);
//        List<Family> fm = new ArrayList<>();
//        fm.add(family1);
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("familyTest.txt")))) {
//            oos.writeObject(fm);
//        } catch (IOException e) {
//            System.out.println("Somewthing wrong");
//        }
//    }

    @Test
    void loadData() {
        Woman mother1 = new Woman("Gunay", "Mammedova", "12/03/1975");
        Man father1 = new Man("Namiq", "Mammedov", "07/05/1973");
        Family family1 = new Family(mother1, father1);
        familyService.createNewFamily(mother1, father1);
        List<Family> fm = new ArrayList<>();
        fm.add(family1);
        List<Family>fmTest;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("familyTest.txt")))){
            fmTest=(List<Family>)ois.readObject();
            assertEquals(fm,fmTest);
        } catch (IOException |ClassNotFoundException e){
            System.out.println("Something wrong");
        }

    }
}