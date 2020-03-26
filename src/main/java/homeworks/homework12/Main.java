package homeworks.homework12;

import homeworks.homework12.controller.FamilyController;
import homeworks.homework12.model.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ActionMenu actionMenu = new ActionMenu();
        actionMenu.showMenu();
//        Man father = new Man("Asiman","Veliyev","12/12/1975");
//        Woman mother = new Woman("Aysel","Veliyeva","12/12/2007");
//        Man son = new Man("Vagif", "Huseynov", "12/12/2000");
//        Woman daughter = new Woman("Aysel","Veliyeva","12/12/2000");
//        Human daughter1 = new Human("Ayselqq","Veliyevaqq","12/12/2001", 13);
//        List<Human>  humanList = new ArrayList<>();
//        humanList.add(son);
//        humanList.add(daughter);
//        humanList.add(daughter1);
//        Family f= new Family(mother,father);
//        f.setChildren(humanList);
//        System.out.println(f.toString());
    }
//    public static void main1(String[] args) {
//        ZoneId zoneId = ZoneId.systemDefault();
//        Woman mother1 = new Woman("Gunay", "Mammedova", LocalDate.of(2000, 03, 02).toEpochDay());
//        Man father1 = new Man("Namiq", "Mammedov", LocalDate.of(1971, 07, 03).toEpochDay());
//        Woman mother2 = new Woman("Vusale", "Kerimova", LocalDate.of(1976, 05, 01).toEpochDay());
//        Man father2 = new Man("Ramil", "Kerimov", LocalDate.of(1973, 9, 11).toEpochDay());
//
//        Human son = new Human("Babek", "Mammedov", 2000);
//        Human h = new Human("Vagif", "Huseynov", "12/12/2000", 12);
//
//        Map<DayOfWeek, String> shedule = new HashMap<>();
//        shedule.put(DayOfWeek.Monday, "coding");
//        shedule.put(DayOfWeek.Tuesday, "go to school");
//        shedule.put(DayOfWeek.Wednesday, "go to the gym");
//        shedule.put(DayOfWeek.Thursday, "coding");
//        shedule.put(DayOfWeek.Friday, "meeting friends");
//        shedule.put(DayOfWeek.Saturday, "coding");
//        shedule.put(DayOfWeek.Sunday, "coding");
//        son.setShedule(shedule);
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
//        fc.adoptChildController(family1, h);
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
////
//    }


}
