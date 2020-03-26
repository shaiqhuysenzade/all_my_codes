package homeworks.homework12;

import homeworks.homework12.controller.FamilyController;
import homeworks.homework12.model.Family;
import homeworks.homework12.model.Human;
import homeworks.homework12.model.Man;
import homeworks.homework12.model.Woman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ActionMenu {
    FamilyController fc = new FamilyController();

    public void  familyGenerate() {
        Man father = new Man("Asiman", "Veliyev", "12/12/1975");
        Woman mother = new Woman("Aysel", "Veliyeva", "12/12/2007");
        Man son = new Man("Vagif", "Huseynov", "12/12/2000");
        Woman daughter = new Woman("Aysel", "Veliyeva", "12/12/2000");
        Man father2= new Man("Kamal","Kamalov","13/12/1980");
        Man son2= new Man("Kerim","Kamalov","13/12/2000");
        Woman mother2= new Woman("Kamala","Kamalova","13/12/1989");
        Woman daughter2 = new Woman("Aysel", "Kamalova", "12/12/2001");
        Woman daughter3 = new Woman("Nigar", "Kamalova", "11/07/2015");
        List<Human> humanList = new ArrayList<>();
        humanList.add(son);
        humanList.add(daughter);
        List<Human> humanList2 = new ArrayList<>();
        humanList2.add(son2);
        humanList2.add(daughter2);
        humanList2.add(daughter3);
        Family family2 = new Family(mother, father);
        Family family1 = new Family(mother2,father2);
        family1.setChildren(humanList);
        family2.setChildren(humanList2);
        fc.saveFamilyController(family1);
        fc.saveFamilyController(family2);
    }
    public void showMenu() {
        while (true) {
            int menu = InputUtil.requireNumber("------MENU------"
                    + "\n1. Fill with test data (create several families and save them in the database)."
                    + "\n2. Display the entire list of families (displays a list of all families with indexation starting with 1)."
                    + "\n3. Display a list of families where the number of people is greater  than the specified number."
                    + "\n4. Display a list of families where the number of people is less than the specified number"
                    + "\n5. Calculate the number of families where the number of members is."
                    + "\n6. Create a new family."
                    + "\n7. Delete a family by its index in the general list. "
                    + "\n8. Edit a family by its index in the general list. "
                    + "\n9. Remove all children over the age of majority (all families remove children over the age of majority - let us assume they have grown up) "
                    + "\n10. Exit. "
                    + "\nPlease , choose one of these points ");
            switch (menu) {
                case 1:
                    familyGenerate();
                    break;
                case 2:
                    fc.displayAllFamiliesController();
                    break;
                case 3:
                    System.out.println("Add count");
                    Scanner in =  new Scanner(System.in);
                    int countOfFamily = in.nextInt();
                    fc.getFamiliesBiggerThanController(countOfFamily);
                    break;
                case 4:
                    System.out.println("Add count");
                    Scanner in2 =  new Scanner(System.in);
                    int countOfFamil = in2.nextInt();
                    fc.getFamiliesLessThanController(countOfFamil);
                    break;
                case 5:
                    System.out.println("Add count");
                    Scanner in3 =  new Scanner(System.in);
                    int count = in3.nextInt();
                    System.out.println("The number of families which member equals what you inout is ");
                    fc.countFamiliesWithMemberNumberController(count);
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("BYE");
                    break;
            }
            if (menu == 10) {
                return;
            }
        }
    }
}
