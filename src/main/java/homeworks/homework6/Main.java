package homeworks.homework6;

public class Main {
    public static void main(String[] args) {
//        for (int i = 10000; i < 1000000; i++) {
//            new Human();
//            System.gc();
//        }

        //creating first child reference for Human object

        Human child1 = new Human();
        child1.setName("Shaiq");
        child1.setSurname("Huseynzade");
        child1.setYear(2000);
        child1.setShedule(new String[][]{{DayOfWeek.Monday.name(), "coding"}, {DayOfWeek.Tuesday.name(), "go to school"},
                {DayOfWeek.Wednesday.name(), "go to the gym"}, {DayOfWeek.Thursday.name(), "coding"},
                {DayOfWeek.Friday.name(), "meeting friends"}, {DayOfWeek.Saturday.name(), "coding"},
                {DayOfWeek.Sunday.name(), "coding"}});

        //creating mother reference for Human object
        Human mother = new Human();
        mother.setName("Vusale");
        mother.setSurname("Kerimova");
        mother.setShedule(new String[][]{{"Wednesday", "eat ice cream"}, {"Thursday", "go to the pool"}});

        //creating father reference for Human object
        Human father = new Human();
        father.setName("Ramil");
        father.setSurname("Huseynzade");
        father.setShedule(new String[][]{{"Monday", "go to work"}, {"Tuesday", "go to gym"}});

        //creating second child for Human object
        Human child2 = new Human();
        child2.setName("Babek");
        child2.setSurname("Jelilov");
        child2.setShedule(new String[][]{{"Monday", "do homework"}, {"Tuesday", "go to school"}});


        //creating family for to show mother , father and children together
        Family f = new Family(mother, father);
        Human childArray[] = {child1};
        f.setChildren(childArray);
        f.addChild( child2);
        f.setChildren(childArray);


        //using method addChild() to add child2
//        f.setChildren();
        System.out.println(f.countOfFamily());
        System.out.println(f.toString());
        //open from comment  to delete second child from childArray
        f.deleteChildByIndex(0);
        f.deleteChildByObject1(child1);
//        f.deleteChildByObject2(childArray,child2);
        //output family members
        System.out.println(f.toString());

        //output  the amount of family members
        System.out.println(f.countOfFamily());


    }

}

