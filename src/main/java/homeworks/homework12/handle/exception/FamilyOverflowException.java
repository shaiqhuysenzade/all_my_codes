package homeworks.homework12.handle.exception;

public class FamilyOverflowException extends RuntimeException {
    private int count;

    public FamilyOverflowException(String message) {
        super(message);
    }
}
