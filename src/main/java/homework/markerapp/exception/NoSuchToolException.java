package homework.markerapp.exception;

public class NoSuchToolException extends Exception {

    public NoSuchToolException(String toolType) {
        super("Teacher class can't use this tool \"" + toolType + "\"");
    }
}
