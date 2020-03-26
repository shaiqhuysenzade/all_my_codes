package homeworks.homework9.dao;

import homeworks.homework9.model.Family;
import homeworks.homework9.model.Human;
import homeworks.homework9.model.Pet;

import java.util.List;
import java.util.Set;

public interface DAO {
    List<Family> getAllFamilies();

    Family getFamilyByIndex(int index);

    boolean deleteFamily(int index);

    void deleteFamily(Family family);

    void saveFamily(Family family);

    void displayAllFamilies();
}
