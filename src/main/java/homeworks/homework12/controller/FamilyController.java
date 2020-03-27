package homeworks.homework12.controller;

import homeworks.homework12.handle.exception.FamilyOverflowException;
import homeworks.homework12.model.Family;
import homeworks.homework12.model.Human;
import homeworks.homework12.model.Pet;
import homeworks.homework12.service.FamilyService;

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
        return fs.deleteFamilyByIndex(index);
    }

    public void bornChildController(Family family, String man, String woman) throws FamilyOverflowException {
        int index = fs.getAllFamilies().indexOf(family);
        fs.bornChild(family, man, woman);
        StringBuilder sb = new StringBuilder();
        sb.append("======================================================================================================\n");
        sb.append("|                                      Family members can not be more then 7                         |\n");
        sb.append("======================================================================================================\n");
        if (fs.getAllFamilies().get(index).countOfFamily() > 6)
            throw new FamilyOverflowException(sb.toString());


    }

    public void adoptChildController(Family family, Human human) {
        int index = fs.getAllFamilies().indexOf(family);
        fs.adoptChild(family, human);
        StringBuilder sb = new StringBuilder();
        sb.append("======================================================================================================\n");
        sb.append("|                                      Family members can not be more then 7                           |\n");
        sb.append("======================================================================================================\n");
        if (fs.getAllFamilies().get(index).countOfFamily() > 6)
            throw new FamilyOverflowException(sb.toString());

    }

    public void deleteAllChildrenOlderThenController(int year) {
        fs.deleteAllChildrenOlderThen(year);
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
