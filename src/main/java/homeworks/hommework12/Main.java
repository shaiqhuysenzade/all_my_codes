package homeworks.hommework12;

//import homeworks.hommework12.controller.FamilyController;
//import homeworks.hommework12.controller.FamilyController;
import homeworks.hommework12.model.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        Man father = new Man("Asiman","Veliyev",LocalDate.of(2000, 03, 02).toEpochDay());
//        Woman mother = new Woman("Aysel","Veliyeva",LocalDate.of(1971, 07, 03).toEpochDay());

        Human son = new Human("Vagif", "Huseynov", "12/12/2000", 12);
        Human daughter = new Human("Aysel","Veliyeva","12/12/2000", 12);
        Human daughter1 = new Human("Ayselqq","Veliyevaqq","12/12/2001", 13);
        Map<ForChildren , Human>  childrenHumanMap = new HashMap<>();
        childrenHumanMap.put(ForChildren.boy,son);
        childrenHumanMap.put(ForChildren.girl,daughter1);

//        Family f = new Family(mother,father);
//        f.setChildren(childrenHumanMap);
//        System.out.println(f.prettyFormat());
//        FamilyController fc = new FamilyController();
//        fc.saveFamilyController(f);
////        fc.displayAllFamiliesController();
//        fc.deleteAllChildrenOlderThenController(5);
//        fc.adoptChildController(f,son,ForChildren.boy);
//        fc.displayAllFamiliesController();

//        f.getChildren().forEach((forChildren, human) -> {
//            if (Period.between(LocalDate.ofEpochDay(f.getChildren().get(forChildren).getYear()), LocalDate.now()).getYears() > 5) {
//                System.out.println("hemde ayeeeeeeeeeeeee");
//                System.out.println(f.getChildren());
////                f.getChildren().clear();
//            }
//        });
//        Iterator<Map.Entry<ForChildren,Human>> it = childrenHumanMap.entrySet().iterator();
//        for (int j = 0; j < f.getChildren().size(); j++) {
//            System.out.println("hemde girdi");
//            if (Period.between(LocalDate.ofEpochDay(f.getChildren().getOrDefault().getYear()), LocalDate.now()).getYears() > 5) {
//                System.out.println("hemde ayeeeeeeeeeeeee");
//                System.out.println(f.getChildren());
////                f.getChildren().clear();
//            }
////            if (f.isEmpty()) {
////                break;
////            }
//        }
//        Woman mother1 = new Woman("Gunay", "Mammedova", LocalDate.of(2000, 03, 02).toEpochDay());
//        Man father1 = new Man("Namiq", "Mammedov", LocalDate.of(1971, 07, 03).toEpochDay());
//        Woman mother2 = new Woman("Vusale", "Kerimova", LocalDate.of(1976, 05, 01).toEpochDay());
//        Man father2 = new Man("Ramil", "Kerimov", LocalDate.of(1973, 9, 11).toEpochDay());
//        Map<DayOfWeek, String> shedule1 = new HashMap<>();
//        shedule1.put(DayOfWeek.Tuesday, "go to school");
//        shedule1.put(DayOfWeek.Wednesday, "go to the gym");
//        shedule1.put(DayOfWeek.Thursday, "coding");
//        mother1.setShedule(shedule1);
//        Man son = new Man("Babek", "Mammedov", 2000);
//        Human human = new Human("Vagif", "Huseynov", "12/12/2000", 12);
//
//        Map<DayOfWeek, String> shedule = new HashMap<>();
//        shedule.put(DayOfWeek.Monday, "coding");
//        shedule.put(DayOfWeek.Tuesday, "go to school");
//        shedule.put(DayOfWeek.Wednesday, "go to the gym");
//        shedule.put(DayOfWeek.Thursday, "coding");
//        shedule.put(DayOfWeek.Friday, "meeting friends");
//        shedule.put(DayOfWeek.Saturday, "coding");
//        shedule.put(DayOfWeek.Sunday, "coding");
////        son.setShedule(shedule);
//        HashSet<String> habits = new HashSet<>();
//        habits.add("eat");
//        Human daughter = new Human("Aysel", "Mammedova", 1998);
//        Dog dog = new Dog("Sasha ", 2, habits);
//        DomesticCat domesticCat = new DomesticCat("Sasha ", 2, habits);
//        Family family1 = new Family(mother1, father1);
//
//        //create family controller
//        FamilyController fc = new FamilyController();
//
//        //saving and creating family
//        fc.saveFamilyController(family1);
////        fc.createNewFamilyController(mother2, father2);
//
//        //born and adopt  child
////        fc.bornChildController(family1, "Damet", "Nezrin");
//        fc.adoptChildController(family1, son);
//
////
////        //add pet
////        fc.addPetController(0, domesticCat);
////        fc.addPetController(1, dog);
////
////        //count families and members
////        fc.countController();
////        fc.countFamiliesWithMemberNumberController(0);
////
////        //get families and bigger and less then and by id
////        fc.getFamiliesBiggerThanController(2);
////        fc.getFamiliesLessThanController(3);
////        fc.getFamilyByIdController(1);
////        fc.getPetsController(1);
////
////        //delete methods
////        fc.deleteAllChildrenOlderThenController(4);
////        fc.deleteFamilyByIndexController(1);
////
////        //display all families
////        fc.displayAllFamiliesController();
//////        fc.getAllFamiliesController();
////        System.out.println(mother1.describeAge());
//        fc.getFamiliesLessThanController(5);
//        fc.deleteAllChildrenOlderThenController(6);
//        fc.displayAllFamiliesController();
//
    }


}
