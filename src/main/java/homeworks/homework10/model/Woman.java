package homeworks.homework10.model;

public final class Woman extends Human {
    public Woman(String name, String surname, long year) {
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
