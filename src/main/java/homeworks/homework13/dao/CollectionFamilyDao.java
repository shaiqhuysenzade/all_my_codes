package homeworks.homework13.dao;

import homeworks.homework13.model.Family;
import homeworks.homework13.model.Human;
import homeworks.homework13.model.Pet;

import java.io.*;
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
    public void addToFile() throws IOException {
        File f = new File("src\\main\\java\\homeworks\\homework13\\database\\family.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(families);
        oos.close();
        fos.close();
    }

    @Override
    public void loadData() throws IOException, ClassNotFoundException {
        File f = new File("src\\main\\java\\homeworks\\homework13\\database\\family.txt");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        families=(List<Family>) ois.readObject();
        System.out.println(families);
        ois.close();
        fis.close();
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
