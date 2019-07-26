package homework.drawfigureapp.exception;

public class NoSuchFigureTypeException extends RuntimeException {
    public NoSuchFigureTypeException(String type) {
        super("Incorrect figures type: \"" + type + "\"");
    }
}
