package homework.markerapp.exception;

public class NoSuchToolException extends Exception {

    public NoSuchToolException(String toolsClassName) {
        super("Teacher class can't use this tool \"" + toolsClassName + "\"");
    }
}
