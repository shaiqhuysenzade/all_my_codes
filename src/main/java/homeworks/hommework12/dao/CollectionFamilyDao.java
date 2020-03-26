//package homeworks.hommework12.dao;
//
//import homeworks.hommework12.model.Family;
//import homeworks.hommework12.model.ForChildren;
//import homeworks.hommework12.model.Human;
//import homeworks.hommework12.model.Pet;
//
//import java.time.LocalDate;
//import java.time.Period;
//import java.util.*;
//import java.util.stream.IntStream;
//
//public class CollectionFamilyDao implements DAO {
//    List<Family> families = new ArrayList<>();
//    List<Human> humans = new ArrayList<>();
//    Set<Pet> pets = new HashSet<>();
//
//    @Override
//    public List<Family> getAllFamilies() {
//        IntStream.range(0, families.size())
//                .mapToObj(index -> index + 1 + ")" + "Family")
//                .forEach(System.out::println);
//        return families;
//
//    }
//
//    @Override
//    public void displayAllFamilies() {
//        IntStream.range(0, families.size())
//                .mapToObj(index -> index + 1 + ")" + families.get(index))
//                .forEach(System.out::println);
//    }
//
//    @Override
//    public void getFamiliesBiggerThan(int countOfFamily) {
//        families.stream()
//                .filter(family -> family.countOfFamily() > countOfFamily)
//                .forEach(System.out::println);
//
//    }
//
//    @Override
//    public void getFamiliesLessThan(int countOfFamily) {
//        families.stream()
//                .filter(family -> family.countOfFamily() < countOfFamily)
//                .forEach(System.out::println);
//    }
//
//    int count = 0;
//
//    @Override
//    public void countFamiliesWithMemberNumber(int countOfFamily) {
//        long count1 = families.stream()
//                .filter(family -> family.countOfFamily() == countOfFamily).count();
//        System.out.println(count1);
////        List<Family> f =families.stream()
////                .filter(family -> family.countOfFamily()==countOfFamily).collect(Collectors.toList());
////        System.out.println(f.size());
//    }
//
//    @Override
//    public void createNewFamily(Human mother, Human father) {
//        Family f = new Family(mother, father);
//        saveFamily(f);
//    }
//
//    @Override
//    public void bornChild(Family family, String man, String woman) {
//        Human son = new Human();
//        son.setName(man);
//        son.setSurname(family.getFather().getSurname());
//        son.setYear(LocalDate.now().getYear());
//        Human daughter = new Human();
//        daughter.setName(woman);
//        daughter.setSurname(family.getFather().getSurname());
//        daughter.setYear(LocalDate.now().getYear());
//        int n = families.indexOf(family);
//        if (families.get(n).getChildren() == null) {
//            Map<ForChildren, Human> newChild = new HashMap<>();
//            if (newChild.keySet().equals(ForChildren.boy)) {
//                newChild.put(ForChildren.boy, son);
//            } else {
//                newChild.put(ForChildren.girl, daughter);
//            }
//            families.get(n).setChildren(newChild);
//        } else {
//            families.get(n).getChildren().put(ForChildren.boy, son);
//            families.get(n).getChildren().put(ForChildren.girl, daughter);
////        if (families.get(n).getChildren() == null) {
////            List<Human> newHumans = new ArrayList<>();
////            if (new Random().nextBoolean()) {
////                newHumans.add(son);
////            } else {
////                newHumans.add(daughter);
////            }
////            families.get(n).setChildren(newHumans);
////        } else {
////            families.get(n).getChildren().add(son);
////            families.get(n).getChildren().add(daughter);
////        }
//        }
//    }
//
//
//    @Override
//    public void deleteAllChildrenOlderThen(int age) {
//        for (int i = 0; i < families.size(); i++) {
//            if (families.get(i).getChildren() == null) {
//                System.out.println("bura girdi");
//                break;
//            } else {
//                for (int j = 0; j < families.get(i).getChildren().size(); j++) {
//                    System.out.println(families.get(i).getChildren());
////                    Family f = families.get(i);
////
////                    f.getChildren().forEach((forChildren, human) -> {
////                        if (Period.between(LocalDate.ofEpochDay(f.getChildren().get(forChildren).getYear()), LocalDate.now()).getYears() > age) {
////                            System.out.println("hemde ayeeeeeeeeeeeee");
//////                            System.out.println(f.getChildren());
////                f.getChildren().remove(forChildren,human);
////                        }
////                    });
//                    for (ForChildren f : families.get(i).getChildren().keySet()) {
//                        System.out.println(f);
////                        HashMap<ForChildren,Human> m = new HashMap();
//                        if (Period.between(LocalDate.ofEpochDay(families.get(i)
//                                .getChildren().get(f).getYear()), LocalDate.now()).getYears() > age) {
//                            System.out.println("Salam Aleykuma");
//                            families.get(i).getChildren().remove(f);
//                        }
//                        if (families.isEmpty()) {
//                            break;
//                        }
//                    }
////                    Iterator<Map.Entry<ForChildren,Human>> it = families.get(i).getChildren().entrySet().iterator();
////                    ForChildren f = it.ge;
////                    if (Period.between(LocalDate.ofEpochDay(families.get(i)
////                            .getChildren().get(j).getYear()), LocalDate.now()).getYears() > age) {
////                        System.out.println("hemde girdi");
////                        families.get(i).getChildren().clear();
////                    }
////                    if (families.isEmpty()) {
////                        break;
////                    }
//                }
//            }
//        }
//
//    }
//
//    @Override
//    public int count() {
//        count = families.size();
//        return count;
//    }
//
//    @Override
//    public void adoptChild(Family family, Human child, ForChildren type) {
//        int n = families.indexOf(family);
//        if (families.get(n).getChildren() == null) {
//            Map<ForChildren, Human> children1 = new HashMap<>();
//            children1.put(type, child);
//            families.get(n).setChildren(children1);
//        } else {
//            families.get(n).getChildren().put(type, child);
//        }
//
//    }
//
//    @Override
//    public Family getFamilyByIndex(int index) {
//        if (families.size() > index) {
//            return families.get(index);
//        } else {
//            return null;
//        }
//
//    }
//
//    @Override
//    public Set<Pet> getPets(int indexOfFamily) {
//        return families.get(indexOfFamily).getPet();
//    }
//
//    @Override
//    public void addPet(int indexOfFamily, Pet pet) {
//        if (families.get(indexOfFamily).getPet() == null) {
//            Set<Pet> newPets = new HashSet<>();
//            newPets.add(pet);
//            families.get(indexOfFamily).setPet(newPets);
//        } else {
//            families.get(indexOfFamily).getPet().add(pet);
//        }
//    }
//
//    @Override
//    public boolean deleteFamily(int index) {
//        if (families.size() > index) {
//            families.remove(index);
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    @Override
//    public void deleteFamily(Family family) {
//        if (families.contains(family)) {
//            families.remove(family);
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//    }
//
//    @Override
//    public void saveFamily(Family family) {
//        if (families.contains(family)) {
//            int index = families.indexOf(family);
//            families.set(index, family);
//        } else {
//            families.add(family);
//        }
//    }
//
//}
