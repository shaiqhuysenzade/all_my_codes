package homeworks.homework9.model;

public final class Woman extends Human {
    public Woman(String name, String surname, int year) {
        super(name, surname, year);
    }

    @Override
    public void greetPet() {
        super.greetPet();
    }
    public void makeUp(){
        System.out.println("Do it every morning , bit it depends on woman");
    }
}
