package homeworks.homework10.model;

public final class Man extends Human {
    public Man(String name, String surname, long year) {
        super(name, surname, year);
    }

    @Override
    public void greetPet() {
        super.greetPet();
    }

    public void beardHaircut(){
        System.out.println("Do it in 4 days and it also depends on man");
    }
}
