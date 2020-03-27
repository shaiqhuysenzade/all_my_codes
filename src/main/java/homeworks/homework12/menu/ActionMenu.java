package homeworks.homework12.menu;

import homeworks.homework12.controller.FamilyController;
import homeworks.homework12.handle.exception.FamilyOverflowException;
import homeworks.homework12.model.Family;
import homeworks.homework12.model.Human;
import homeworks.homework12.model.Man;
import homeworks.homework12.model.Woman;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ActionMenu {
    FamilyController fc = new FamilyController();

    public void familyGenerate() {
        Man father = new Man("Asiman", "Veliyev", "12/12/1975");
        Woman mother = new Woman("Aysel", "Veliyeva", "12/12/2007");
        Man son = new Man("Vagif", "Huseynov", "12/12/2000");
        Woman daughter = new Woman("Aysel", "Veliyeva", "12/12/2000");
        Man father2 = new Man("Kamal", "Kamalov", "13/12/1980");
        Man son2 = new Man("Kerim", "Kamalov", "13/12/2000");
        Woman mother2 = new Woman("Kamala", "Kamalova", "13/12/1989");
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
        Family family1 = new Family(mother2, father2);
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
                    Scanner in = new Scanner(System.in);
                    int countOfFamily = in.nextInt();
                    fc.getFamiliesBiggerThanController(countOfFamily);
                    break;
                case 4:
                    System.out.println("Add count");
                    Scanner in2 = new Scanner(System.in);
                    int countOfFamil = in2.nextInt();
                    fc.getFamiliesLessThanController(countOfFamil);
                    break;
                case 5:
//                    System.out.println("Add count");
                    Scanner in3 = new Scanner(System.in);
                    int count = 0;
                    do {
                        try {
                            System.out.print("Add count: ");
                            count = in3.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.print("Invalid number of count. ");
                        }
                        in3.nextLine();
                    } while (count == 0);
                    System.out.println("The number of families which member equals what you inout is ");
                    fc.countFamiliesWithMemberNumberController(count);
                    break;
                case 6:
//                    do{
//                        try{
//
//                        }
//                    }while();
                    System.out.println("Creating new familly");
                    Scanner in4 = new Scanner(System.in);
                    System.out.println("Please add for mother name :");
                    String name = in4.nextLine();
                    System.out.println("Please add for mother surname :");
                    String surname = in4.nextLine();
                    System.out.println("Please add for mother birthDate:");
                    String birthDate = in4.nextLine();
                    Woman w = new Woman(name, surname, birthDate);
                    System.out.println("Please add for father name :");
                    String nameForFather = in4.nextLine();
                    System.out.println("Please add for father surname :");
                    String surnameForFather = in4.nextLine();
                    System.out.println("Please add for father birthDate:");
                    String birthDateF = in4.nextLine();
                    Man man = new Man(nameForFather, surnameForFather, birthDateF);
                    fc.createNewFamilyController(w, man);
                    System.out.println("new Family created successfuly ");
                    break;
                case 7:
                    Scanner in5 = new Scanner(System.in);
                    int index = 0;
                    do {
                        try {
                            System.out.println("Add index of family for to delete it");
                            index = in5.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.print("Invalid number of count. ");
                        }
                        in5.nextLine();
                    } while (index <= 0);
                    fc.deleteFamilyByIndexController(index - 1);
                    break;
                case 8:
                    int menu2 = InputUtil.requireNumber("------Edit Family-----"
                            + "\n1. Born a child."
                            + "\n2. Adopt a child."
                            + "\n3. Return to the main menu."
                            + "\nPlease ,choose one of three pints");
                    switch (menu2) {
                        case 1:
                            System.out.println("You choose born a child");
                            Scanner in6 = new Scanner(System.in);
                            int index2 = 0;
                            do {
                                try {
                                    System.out.println("Please input an index of family : ");
                                    index2 = in6.nextInt();
                                } catch (InputMismatchException e) {
                                    System.out.print("Invalid number of count. ");
                                }
                                in6.nextLine();
                            } while (index2 <= 0);
                            try {
                                Scanner in7 = new Scanner(System.in);
                                System.out.println("Boy's name is");
                                String nameForBoy = in7.nextLine();
                                System.out.println("Girl's name is ");
                                String nameForGirl = in7.nextLine();
                                fc.bornChildController(fc.getFamilyByIdController(index2 - 1), nameForBoy, nameForGirl);
                            } catch (FamilyOverflowException f) {
                                System.out.println(f.getMessage());
                            }
                            break;
                        case 2:
                            System.out.println("You choose adopt a child");
                            Scanner in8 = new Scanner(System.in);
                            int index3 = 0;
                            do {
                                try {
                                    System.out.println("Please input an index of family : ");
                                    index3 = in8.nextInt();
                                } catch (InputMismatchException e) {
                                    System.out.print("Invalid number of count. ");
                                }
                                in8.nextLine();
                            } while (index3 <= 0);
                            try {
                                Scanner in9 = new Scanner(System.in);
                                System.out.println("Is it a boy?\nPlease answer YES or NO!");
                                String answer = in9.nextLine();
                                if (answer.equalsIgnoreCase("YES")) {
                                    System.out.println("Boy's name is");
                                    String nameForBoy1 = in9.nextLine();
                                    System.out.println("His surname is ");
                                    String surnameForBoy1 = in9.nextLine();
                                    System.out.println("His birth date is ");
                                    String birthdateForBoy1 = in9.nextLine();
                                    System.out.println("His iq is ");
                                    int iq = in9.nextInt();
                                    Man boy = new Man(nameForBoy1, surnameForBoy1, birthdateForBoy1, iq);
                                    fc.adoptChildController(fc.getFamilyByIdController(index3 - 1), boy);
                                } else {
                                    System.out.println("Girl's name is");
                                    String nameForGirl1 = in9.nextLine();
                                    System.out.println("Her surname is ");
                                    String surnameForGirl1 = in9.nextLine();
                                    System.out.println("Her birth date is ");
                                    String birthdateForGirl1 = in9.nextLine();
                                    System.out.println("Her iq is ");
                                    int iq = in9.nextInt();
                                    Woman girl = new Woman(nameForGirl1, surnameForGirl1, birthdateForGirl1, iq);
                                    fc.adoptChildController(fc.getFamilyByIdController(index3 - 1), girl);
                                }
                            } catch (FamilyOverflowException f) {
                                System.out.println(f.getMessage());
                            }
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 9:
                    Scanner in10 = new Scanner(System.in);
                    int age = 0;
                    do {
                        try {
                            System.out.println("Please input children's age which you want to delete : ");
                            age = in10.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.print("Invalid number of count. ");
                        }
                        in10.nextLine();
                    } while (age <= 0);
                    fc.deleteAllChildrenOlderThenController(age);
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
