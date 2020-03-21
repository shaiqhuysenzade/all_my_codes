package homeworks.Homework8;

import javax.naming.ldap.HasControls;
import java.util.HashSet;

public class DomesticCat extends Pet implements PetInterface {
    public DomesticCat( String name, int age, HashSet<String> habits) {
        super(Species.DomesticCat, name, age,habits);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void respond() {
        System.out.println("Я кошка и я умею мяукать");
    }

    @Override
    public void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }
}
