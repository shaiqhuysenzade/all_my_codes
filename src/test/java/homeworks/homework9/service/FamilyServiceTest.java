package homeworks.homework9.service;

import homeworks.homework9.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest {
    FamilyService fs;
    @BeforeEach
    void beforeTest(){
        fs = new FamilyService();
    }

    @Test
    void getAllFamilies() {
        Woman mother1 = new Woman("Gunay", "Mammedova", 1975);
        Man father1 = new Man("Namiq", "Mammedov", 1974);
        Woman mother2 = new Woman("Vusale", "Kerimova", 1977);
        Family family1 = new Family(mother1,father1);
        fs.createNewFamily(mother1,father1);
        List<Family> fm = new ArrayList<>();
        fm.add(family1);
        assertEquals(fm,fs.getAllFamilies());
    }

    @Test
    void displayAllFamilies() {
        Woman mother1 = new Woman("Gunay", "Mammedova", 1975);
        Man father1 = new Man("Namiq", "Mammedov", 1974);
        Woman mother2 = new Woman("Vusale", "Kerimova", 1977);
        Family family1 = new Family(mother1,father1);
        fs.createNewFamily(mother1,father1);
        List<Family> fm = new ArrayList<>();
        fm.add(family1);
        assertEquals(fm.size(),fs.getAllFamilies().size());
    }

    @Test
    void getFamiliesBiggerThan() {
        Woman mother1 = new Woman("Gunay", "Mammedova", 1975);
        Man father1 = new Man("Namiq", "Mammedov", 1974);
        Woman mother2 = new Woman("Vusale", "Kerimova", 1977);
        Family family1 = new Family(mother1,father1);
        fs.createNewFamily(mother1,father1);
        assertEquals(family1.countOfFamily()>0,fs.getFamilyById(0).countOfFamily()>0);
    }

    @Test
    void getFamiliesLessThan() {
        Woman mother1 = new Woman("Gunay", "Mammedova", 1975);
        Man father1 = new Man("Namiq", "Mammedov", 1974);
        Woman mother2 = new Woman("Vusale", "Kerimova", 1977);
        Family family1 = new Family(mother1,father1);
        fs.createNewFamily(mother1,father1);
        assertEquals(family1.countOfFamily()<0,fs.getFamilyById(0).countOfFamily()<0);
    }

    @Test
    void countFamiliesWithMemberNumber() {
        Woman mother1 = new Woman("Gunay", "Mammedova", 1975);
        Man father1 = new Man("Namiq", "Mammedov", 1974);
        Woman mother2 = new Woman("Vusale", "Kerimova", 1977);
        Family family1 = new Family(mother1,father1);
        fs.createNewFamily(mother1,father1);
        assertEquals(family1.countOfFamily(),fs.getFamilyById(0).countOfFamily());
    }

    @Test
    void createNewFamily() {
        Woman mother1 = new Woman("Gunay", "Mammedova", 1975);
        Man father1 = new Man("Namiq", "Mammedov", 1974);
        Woman mother2 = new Woman("Vusale", "Kerimova", 1977);
        Family family1 = new Family(mother1,father1);
        fs.createNewFamily(mother1,father1);
        List<Family> fm = new ArrayList<>();
        fm.add(family1);
        assertTrue(fs.getFamilyById(0).equals(fm.get(0)));
    }

    @Test
    void deleteFamilyByIndex() {
        Woman mother1 = new Woman("Gunay", "Mammedova", 1975);
        Man father1 = new Man("Namiq", "Mammedov", 1974);
        Woman mother2 = new Woman("Vusale", "Kerimova", 1977);
        Family family1 = new Family(mother1,father1);
        fs.createNewFamily(mother1,father1);
        assertTrue(fs.deleteFamilyByIndex(0));
    }

    @Test
    void bornChild() {
        Woman mother1 = new Woman("Gunay", "Mammedova", 1975);
        Man father1 = new Man("Namiq", "Mammedov", 1974);
        Family family1 = new Family(mother1,father1);
        Human child = new Human("Damet","Mammedov",2020);
        List<Human> children = new ArrayList<>();
        family1.setChildren(children);
        List<Family> f = new ArrayList<>();
        f.add(family1);
        fs.saveFamily(family1);
        fs.bornChild(family1,"Damet","Damet");
//        assertEquals(f.get(0).countOfFamily(),fs.getFamilyById(0).countOfFamily());
        assertTrue(fs.getFamilyById(0).getChildren().get(0).equals(child));
    }

    @Test
    void adoptChild() {
        Woman mother1 = new Woman("Gunay", "Mammedova", 1975);
        Man father1 = new Man("Namiq", "Mammedov", 1974);
        Family family1 = new Family(mother1,father1);
        Human child = new Human("Damet","Mammedov");
        fs.saveFamily(family1);
        fs.adoptChild(family1,child);
        assertEquals(child,fs.getFamilyById(0).getChildren().get(0));
    }

    @Test
    void deleteAllChildrenOlderThen() {
        Woman mother1 = new Woman("Gunay", "Mammedova", 1975);
        Man father1 = new Man("Namiq", "Mammedov", 1974);
        Family family1 = new Family(mother1,father1);
        Human child = new Human("Damet","Mammedov",2000);
        fs.saveFamily(family1);
        fs.adoptChild(family1,child);
        fs.deleteAllChildrenOlderThen(5);
        assertTrue(fs.getFamilyById(0).getChildren().isEmpty());
    }

    @Test
    void count() {
        Woman mother1 = new Woman("Gunay", "Mammedova", 1975);
        Man father1 = new Man("Namiq", "Mammedov", 1974);
        Family family1 = new Family(mother1,father1);
        fs.createNewFamily(mother1,father1);
        assertTrue(fs.count()==1);
    }

    @Test
    void getFamilyById() {
        Woman mother1 = new Woman("Gunay", "Mammedova", 1975);
        Man father1 = new Man("Namiq", "Mammedov", 1974);
        Woman mother2 = new Woman("Vusale", "Kerimova", 1977);
        Family family1 = new Family(mother1,father1);
        fs.createNewFamily(mother1,father1);
        List<Family> fm = new ArrayList<>();
        fm.add(family1);
        assertEquals(fm.get(0),fs.getFamilyById(0));
    }

    @Test
    void getPets() {
        HashSet<String> habits = new HashSet<>();
        Dog dog = new Dog("Bobok",2,habits);
        Set<Pet> pets = new HashSet<>();
        pets.add(dog);
        Family family = new Family();
        fs.saveFamily(family);
        fs.addPet(0,dog);
        assertEquals(pets,fs.getFamilyById(0).getPet());
    }

    @Test
    void addPet() {
        HashSet<String> habits = new HashSet<>();
        Dog dog = new Dog("Bobok",2,habits);
        Family family = new Family();
        fs.saveFamily(family);
        fs.addPet(0,dog);
        assertTrue(fs.getFamilyById(0).getPet().iterator().next().equals(dog));
    }
}