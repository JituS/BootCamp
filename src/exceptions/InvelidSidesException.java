package exceptions;

public class InvelidSidesException extends Throwable {
    public InvelidSidesException() {
        super("Sides should be positive value");
    }
}
