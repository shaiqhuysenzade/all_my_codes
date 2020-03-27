package homeworks.homework13.model;

import java.io.Serializable;

public final class Man extends Human implements Serializable {
    public Man(String name, String surname, String year) {
        super(name, surname, year);
    }
    public Man(String name, String surname, String year,int iq) {
        super(name, surname, year,iq);
    }

    @Override
    public void greetPet() {
        super.greetPet();
    }

    public void beardHaircut(){
        System.out.println("Do it in 4 days and it also depends on man");
    }
}
