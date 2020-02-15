package homeworks.homework4;

import java.util.Arrays;
import java.util.Random;

public class Main extends RandomFunction {

    public static void main(String[] args) {
        //P   E   T
        //default constuctor
        Pet pet1 = new Pet();
        pet1.setNickname("Дима");
        pet1.setAge(12);
        pet1.setSpecies("Лабладор");
        pet1.setHabits(new String[]{"eat","drink","sleep"});
        System.out.println(Arrays.toString(pet1.getHabits()));

        Pet pet2 = new Pet("Пудель","Брэйв");
        System.out.println(pet2.getSpecies() + " " + pet2.getNickname());
        //Constructor wth all fields
        Pet pet3=new Pet("Бульдог","Саша",7,new String[]{"eat","drink","sleep"});
        System.out.println(pet3.toString());
        //H   U  M  A  N
        //Constructor with three fields
        Human human1 = new Human("Shaiq","Huseynzade",2000);
        System.out.println("For human1 : name is + " + human1.getName()+", surname is " +human1.getSurname()
                + ", year is " + human1.getYear()  );
        //Constructor with all fields
        Human mother = new Human();
        mother.setName("Rebiye");
        Human father = new Human();
        father.setName("Raqil");
        Human human2 = new Human("Vagif" , "Memmedeliyev",1999 ,pet1,mother,father,new String[][]{});
        System.out.println(human2.toString());
        //Creating child , mother , father
        Human mother2 = new Human();
        mother2.setName("Zulfiye");
        Human father2=new Human();
        father.setName("Kenan");
        Human child = new Human("Kerim" , "Kerimov",2007 ,pet3,mother,father,new String[][]{});
        System.out.println("About child's family : "+child.toString());
    }
}

