public class InvalidQuantityException extends RuntimeException {
    public InvalidQuantityException(int quantity) {
        super("invalid quantity: " + quantity + ". Quantity cannot be negative");
    }
}
