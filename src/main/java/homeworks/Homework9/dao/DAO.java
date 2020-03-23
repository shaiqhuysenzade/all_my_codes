package homeworks.Homework9.dao;

import homeworks.Homework9.model.Family;
import homeworks.Homework9.model.Human;
import homeworks.Homework9.model.Pet;

import java.util.List;
import java.util.Set;

public interface DAO {
    List<Family> getAllFamilies();

    Family getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    void deleteFamily(Family family);

    void saveFamily(Family family);

    void displayAllFamilies();

    void getFamiliesBiggerThan(int countOfFamily);

    void getFamiliesLessThan(int countOfFamily);

    void countFamiliesWithMemberNumber(int countOfFamilies);

    void createNewFamily(Human mother, Human father);

    void bornChild(Family family, String man, String woman);

    void adoptChild(Family family, Human human);

    void deleteAllChildrenOlderThen(int year);

    int count();

    Set<Pet> getPets(int indexOfFamily);

    void addPet(int indexOfFamily,Pet pet);

}
