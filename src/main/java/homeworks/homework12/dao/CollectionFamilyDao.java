package homeworks.homework12.dao;

import homeworks.homework12.model.Family;
import homeworks.homework12.model.Human;
import homeworks.homework12.model.Pet;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionFamilyDao implements DAO {
    List<Family> families = new ArrayList<>();
    List<Human> humans = new ArrayList<>();
    Set<Pet> pets = new HashSet<>();

    @Override
    public List<Family> getAllFamilies() {
        IntStream.range(0, families.size())
                .mapToObj(index -> index + 1 + ")" + "Family")
                .collect(Collectors.toList());
        return families;

    }

    @Override
    public void displayAllFamilies() {
        IntStream.range(0, families.size())
                .mapToObj(index -> index + 1 + ")" + families.get(index))
                .forEach(System.out::println);
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if (families.size() > index) {
            return families.get(index);
        } else {
            return null;
        }

    }


    @Override
    public boolean deleteFamily(int index) {
        if (families.size() > index) {
            families.remove(index);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void deleteFamily(Family family) {
        if (families.contains(family)) {
            families.remove(family);
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    @Override
    public void saveFamily(Family family) {
        if (families.contains(family)) {
            int index = families.indexOf(family);
            families.set(index, family);
        } else {
            families.add(family);
        }
    }

}
