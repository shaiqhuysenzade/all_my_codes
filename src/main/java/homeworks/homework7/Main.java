package homeworks.homework7;

public class Main {
    public static void main(String[] args) {

        Woman mother = new Woman("Gunay", "Mammedova", 1975);
        Man father = new Man("Namiq", "mammedov", 1973);
        Human son = new Human("Babek", "Mammedov", 2000);
        son.setShedule(new String[][]{{DayOfWeek.Monday.name(), "coding"}, {DayOfWeek.Tuesday.name(), "go to school"},
                {DayOfWeek.Wednesday.name(), "go to the gym"}, {DayOfWeek.Thursday.name(), "coding"},
                {DayOfWeek.Friday.name(), "meeting friends"}, {DayOfWeek.Saturday.name(), "coding"},
                {DayOfWeek.Sunday.name(), "coding"}});
        Human daughter = new Human("Aysel", "Mammedova", 1998);
        Human children[] = new Human[]{son, daughter};
        Dog dog = new Dog("Sasha ", 2, new String[]{"eat"});
        dog.eat();
        Family f = new Family(mother, father, dog);
        f.setChildren(children);
        System.out.println(f.toString());
    }

}

