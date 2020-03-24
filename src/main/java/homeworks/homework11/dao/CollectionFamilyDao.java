package homeworks.homework11.dao;

import homeworks.homework11.model.Family;
import homeworks.homework11.model.Human;
import homeworks.homework11.model.Pet;

import java.text.BreakIterator;
import java.text.spi.BreakIteratorProvider;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionFamilyDao implements DAO {
    List<Family> families = new ArrayList<>();
    List<Human> humans = new ArrayList<>();
    Set<Pet> pets = new HashSet<>();

    @Override
    public List<Family> getAllFamilies() {
        IntStream.range(0, families.size())
                .mapToObj(index -> index + 1 + ")" + "Family")
                .forEach(System.out::println);
        return families;

    }

    @Override
    public void displayAllFamilies() {
        IntStream.range(0, families.size())
                .mapToObj(index -> index + 1 + ")" + families.get(index))
                .forEach(System.out::println);
    }

    @Override
    public void getFamiliesBiggerThan(int countOfFamily) {
        families.stream()
                .filter(family -> family.countOfFamily() > countOfFamily)
                .forEach(System.out::println);

    }

    @Override
    public void getFamiliesLessThan(int countOfFamily) {
        families.stream()
                .filter(family -> family.countOfFamily() < countOfFamily)
                .forEach(System.out::println);
    }

    int count = 0;

    @Override
    public void countFamiliesWithMemberNumber(int countOfFamily) {
        long count1 = families.stream()
                .filter(family -> family.countOfFamily() == countOfFamily).count();
        System.out.println(count1);
//        List<Family> f =families.stream()
//                .filter(family -> family.countOfFamily()==countOfFamily).collect(Collectors.toList());
//        System.out.println(f.size());
    }

    @Override
    public void createNewFamily(Human mother, Human father) {
        Family f = new Family(mother, father);
        saveFamily(f);
    }

    @Override
    public void bornChild(Family family, String man, String woman) {
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
    }


    @Override
    public List<Family> deleteAllChildrenOlderThen(int age) {
        return   families.stream().filter(family -> {
            List<Human> c = family.getChildren().stream()
                    .filter(h->Period.between(LocalDate.ofEpochDay(h.getYear()), LocalDate.now()).getYears() < age)
                    .collect(Collectors.toList());;
            return true;
        }).collect(Collectors.toList());
    }

    @Override
    public int count() {
        count = families.size();
        return count;
    }

    @Override
    public void adoptChild(Family family, Human child) {
        int n = families.indexOf(family);
        if (families.get(n).getChildren() == null) {
            List<Human> newHumans = new ArrayList<>();
            newHumans.add(child);
            families.get(n).setChildren(newHumans);
        } else {
            families.get(n).getChildren().add(child);
        }

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
    public Set<Pet> getPets(int indexOfFamily) {
        return families.get(indexOfFamily).getPet();
    }

    @Override
    public void addPet(int indexOfFamily, Pet pet) {
        if (families.get(indexOfFamily).getPet() == null) {
            Set<Pet> newPets = new HashSet<>();
            newPets.add(pet);
            families.get(indexOfFamily).setPet(newPets);
        } else {
            families.get(indexOfFamily).getPet().add(pet);
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
