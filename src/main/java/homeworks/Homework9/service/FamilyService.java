package homeworks.Homework9.service;

import homeworks.Homework9.dao.CollectionFamilyDao;
import homeworks.Homework9.dao.DAO;
import homeworks.Homework9.model.Family;
import homeworks.Homework9.model.Human;
import homeworks.Homework9.model.Pet;

import java.util.List;
import java.util.Set;

public class FamilyService {
    private DAO familyDao = new CollectionFamilyDao();

    public void saveFamily(Family family) {
        familyDao.saveFamily(family);
    }

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyDao.displayAllFamilies();
    }

    public void getFamiliesBiggerThan(int countOfFamily) {
        familyDao.getFamiliesBiggerThan(countOfFamily);
    }

    public void getFamiliesLessThan(int countOfFamily) {
        familyDao.getFamiliesLessThan(countOfFamily);
    }

    public void countFamiliesWithMemberNumber(int countOfFamily) {
        familyDao.countFamiliesWithMemberNumber(countOfFamily);
    }

    public void createNewFamily(Human mother, Human father) {
        familyDao.createNewFamily(mother, father);
    }

    public boolean deleteFamilyByIndex(int index) {
        return familyDao.deleteFamily(index);
    }

    public void bornChild(Family family, String man, String woman) {
        familyDao.bornChild(family, man, woman);
    }

    public void adoptChild(Family family, Human human) {
        familyDao.adoptChild(family, human);
    }

    public void deleteAllChildrenOlderThen(int year) {
        familyDao.deleteAllChildrenOlderThen(year);
    }

    public int count() {
        return familyDao.count();
    }

    public Family getFamilyById(int index) {
        return familyDao.getFamilyByIndex(index);
    }

    public Set<Pet> getPets(int indexOfFamily) {
        return familyDao.getPets(indexOfFamily);
    }

    public void addPet(int indexOfFamily, Pet pet) {
        familyDao.addPet(indexOfFamily, pet);
    }
}
