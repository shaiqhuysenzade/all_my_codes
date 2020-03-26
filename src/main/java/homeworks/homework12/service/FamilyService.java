package homeworks.homework12.service;

import homeworks.homework12.dao.CollectionFamilyDao;
import homeworks.homework12.dao.DAO;
import homeworks.homework12.model.*;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class FamilyService {
    private DAO dao = new CollectionFamilyDao();

    public void saveFamily(Family family) {
        dao.saveFamily(family);
    }

    public List<Family> getAllFamilies() {
        return dao.getAllFamilies();
    }

    public void displayAllFamilies() {
        dao.displayAllFamilies();
    }

    public void getFamiliesBiggerThan(int countOfFamily) {
//        dao.getFamiliesBiggerThan(countOfFamily);
        List<Family> families = getAllFamilies();
        families.stream()
                .filter(family -> family.countOfFamily() > countOfFamily)
                .forEach(System.out::println);
    }

    public void getFamiliesLessThan(int countOfFamily) {
        List<Family> families = getAllFamilies();
        families.stream()
                .filter(family -> family.countOfFamily() < countOfFamily)
                .forEach(System.out::println);
//        dao.getFamiliesLessThan(countOfFamily);
    }

    public void countFamiliesWithMemberNumber(int countOfFamily) {
        List<Family> families = getAllFamilies();
        long count1 = families.stream()
                .filter(family -> family.countOfFamily() == countOfFamily).count();
        System.out.println(count1);
//        dao.countFamiliesWithMemberNumber(countOfFamily);
    }

    public void createNewFamily(Human mother, Human father) {
        Family f = new Family(mother, father);
        saveFamily(f);
//        dao.createNewFamily(mother, father);
    }

    public boolean deleteFamilyByIndex(int index) {
        List<Family> families = getAllFamilies();
        if (families.size() > index) {
            families.remove(index);
            return true;
        } else {
            return false;
        }
//        return dao.deleteFamily(index);
    }

    public void bornChild(Family family, String man, String woman) {
        List<Family> families = getAllFamilies();
        Man son = new Man(man, family.getFather().getSurname(), LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//        son.setName(man);
//        son.setSurname(family.getFather().getSurname());
//        son.setYear(LocalDate.now().getYear());
        Woman daughter = new Woman(woman, family.getFather().getSurname(), LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//        daughter.setName(woman);
//        daughter.setSurname(family.getFather().getSurname());
//        daughter.setYear(LocalDate.now().getYear());
        int n = families.indexOf(family);
        if (families.get(n).getChildren() == null) {
            List<Human> newHumans = new ArrayList<>();
            if (new Random().nextBoolean()) {
                newHumans.add(son);
            } else {
                newHumans.add(daughter);
            }
            families.get(n).setChildren(newHumans);
        } else {
            if (new Random().nextBoolean()) {
                families.get(n).getChildren().add(son);
            } else {
                families.get(n).getChildren().add(daughter);
            }
        }
//        dao.bornChild(family, man, woman);
    }

    public void adoptChild(Family family, Human child) {
        List<Family> families = getAllFamilies();
        int n = families.indexOf(family);
        if (families.get(n).getChildren() == null) {
            List<Human> newHumans = new ArrayList<>();
            newHumans.add(child);
            families.get(n).setChildren(newHumans);
        } else {
            families.get(n).getChildren().add(child);
        }
//        dao.adoptChild(family, human);
    }

    public void deleteAllChildrenOlderThen(int age) {
        List<Family> families = getAllFamilies();
        for (int i = 0; i < families.size(); i++) {
            if (families.get(i).getChildren() == null) {
                break;
            } else {
                for (int j = 0; j < families.get(i).getChildren().size(); j++) {
                    if (Period.between(LocalDate.ofEpochDay(families.get(i).getChildren().get(j).getYear()), LocalDate.now()).getYears() > age) {
                        System.out.println(families.get(i).getChildren().get(j));
                        families.get(i).getChildren().remove(j);
                        j--;
                    }
                    if (families.isEmpty()) {
                        break;
                    }
                }
            }
        }
//        dao.deleteAllChildrenOlderThen(year);
    }

    public int count() {
        List<Family> families = getAllFamilies();
        int count = families.size();
        return count;
//        return dao.count();
    }

    public Family getFamilyById(int index) {
        return dao.getFamilyByIndex(index);
    }

    public Set<Pet> getPets(int indexOfFamily) {
        List<Family> families = getAllFamilies();
        return families.get(indexOfFamily).getPet();
//        return dao.getPets(indexOfFamily);
    }

    public void addPet(int indexOfFamily, Pet pet) {
        List<Family> families = getAllFamilies();
        if (families.get(indexOfFamily).getPet() == null) {
            Set<Pet> newPets = new HashSet<>();
            newPets.add(pet);
            families.get(indexOfFamily).setPet(newPets);
        } else {
            families.get(indexOfFamily).getPet().add(pet);
        }
//        dao.addPet(indexOfFamily, pet);
    }
}
