package homeworks.homework11.controller;

import homeworks.homework11.model.Family;
import homeworks.homework11.model.Human;
import homeworks.homework11.model.Pet;
import homeworks.homework11.service.FamilyService;

import java.util.List;
import java.util.Set;

public class FamilyController {
    FamilyService fs = new FamilyService();

    public void saveFamilyController(Family family) {
        fs.saveFamily(family);
    }

    public List<Family> getAllFamiliesController() {
        return fs.getAllFamilies();
    }

    public void displayAllFamiliesController() {
        fs.displayAllFamilies();
    }

    public void getFamiliesBiggerThanController(int countOfFamily) {
        fs.getFamiliesBiggerThan(countOfFamily);
    }

    public void getFamiliesLessThanController(int countOfFamily) {
        fs.getFamiliesLessThan(countOfFamily);
    }

    public void countFamiliesWithMemberNumberController(int countOfFamily) {
        fs.countFamiliesWithMemberNumber(countOfFamily);
    }

    public void createNewFamilyController(Human mother, Human father) {
        fs.createNewFamily(mother, father);
    }

    public boolean deleteFamilyByIndexController(int index) {
       return  fs.deleteFamilyByIndex(index);
    }

    public void bornChildController(Family family, String man, String woman) {
        fs.bornChild(family, man, woman);
    }

    public void adoptChildController(Family family, Human human) {
        fs.adoptChild(family, human);
    }

    public List<Family> deleteAllChildrenOlderThenController(int year) {
        return fs.deleteAllChildrenOlderThen(year);
    }

    public int countController() {
        return fs.count();
    }

    public Family getFamilyByIdController(int index) {
        return fs.getFamilyById(index);
    }

    public Set<Pet> getPetsController(int indexOfFamily) {
        return fs.getPets(indexOfFamily);
    }

    public void addPetController(int indexOfFamily, Pet pet) {
        fs.addPet(indexOfFamily, pet);
    }
}
