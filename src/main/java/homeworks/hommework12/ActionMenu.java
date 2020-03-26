package homeworks.hommework12;

public class ActionMenu {
    public void showMenu() {
//        fc.generateFController();
        while (true) {
            int menu = InputUtil.requireNumber("------MENU------"
                    + "\n1. Fill with test data (create several families and save them in the database)."
                    + "\n2. Display the entire list of families (displays a list of all families with indexation starting with 1)."
                    + "\n3. Display a list of families where the number of people is less than the specified number."
                    + "\n4. Display a list of families where the number of people is less than the specified number"
                    + "\n5. Calculate the number of families where the number of members is."
                    + "\n6. Create a new family."
                    + "\n7. Delete a family by its index in the general list. "
                    + "\n8. Edit a family by its index in the general list. "
                    + "\n9. Remove all children over the age of majority (all families remove children over the age of majority - let us assume they have grown up) "
                    + "\n10. Exit ");
            switch (menu) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("BYE");
                    break;
            }
            if (menu == 6) {
                return;
            }
        }
    }
}
