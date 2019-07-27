package homework.markerapp.exception;

public class NoInkException extends Exception {
    public NoInkException(String toolClassName) {
        super(String.format("The tool \"%s\" is not suitable for writing.", toolClassName));
    }
}
