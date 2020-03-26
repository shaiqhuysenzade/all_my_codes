package homeworks.homework12.model;

public final class Woman extends Human {
    public Woman(String name, String surname, String year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, String year, int iq) {
        super(name, surname, year, iq);
    }

    @Override
    public void greetPet() {
        super.greetPet();
    }

    public void makeUp() {
        System.out.println("Do it every morning , bit it depends on woman");
    }
}
