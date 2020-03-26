package homeworks.homework9.service;

import homeworks.homework9.dao.CollectionFamilyDao;
import homeworks.homework9.dao.DAO;
import homeworks.homework9.model.Family;
import homeworks.homework9.model.Human;
import homeworks.homework9.model.Pet;

import java.time.LocalDate;
import java.time.Period;
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
        for (int i = 0; i < families.size(); i++) {
            if (families.get(i).countOfFamily() > countOfFamily) {
                System.out.println(families.get(i));
            }
        }
    }

    public void getFamiliesLessThan(int countOfFamily) {
        List<Family> families = getAllFamilies();
        for (int i = 0; i < families.size(); i++) {
            if (families.get(i).countOfFamily() < countOfFamily) {
                System.out.println(families.get(i));
            }
        }
//        dao.getFamiliesLessThan(countOfFamily);
    }

    public void countFamiliesWithMemberNumber(int countOfFamily) {
        int count = 0;
        List<Family> families = getAllFamilies();
        for (int i = 0; i < families.size(); i++) {
            if (families.get(i).countOfFamily() == countOfFamily) {
                count++;
            }
        }
        System.out.println(count);
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
        Human son = new Human();
        son.setName(man);
        son.setSurname(family.getFather().getSurname());
        son.setYear(LocalDate.now().getYear());
        Human daughter = new Human();
        daughter.setName(woman);
        daughter.setSurname(family.getFather().getSurname());
        daughter.setYear(LocalDate.now().getYear());
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
            families.get(n).getChildren().add(son);
            families.get(n).getChildren().add(daughter);
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
