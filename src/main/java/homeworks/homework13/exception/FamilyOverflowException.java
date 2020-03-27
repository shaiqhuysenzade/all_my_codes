package homeworks.homework13.exception;

public class FamilyOverflowException extends RuntimeException {
    private int count;

    public FamilyOverflowException(String message) {
        super(message);
    }
}
