package atHome.talents_5.set_get;

public class MainApp {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        SetterGetter sg = new SetterGetter();
        sg.setArray(a);
        sg.displayScores();
        a[1]=7;
        sg.displayScores();
    }
}
