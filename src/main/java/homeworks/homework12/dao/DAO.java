package homeworks.homework12.dao;

import homeworks.homework12.model.Family;
import homeworks.homework12.model.Human;
import homeworks.homework12.model.Pet;

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
