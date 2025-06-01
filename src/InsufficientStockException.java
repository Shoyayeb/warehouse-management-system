public class InsufficientStockException extends RuntimeException {
    public InsufficientStockException(int currentStock, int requestedQuantity) {
        super("Insufficient Stock. Current stock " + currentStock +
                " is lower than requested quantity " + requestedQuantity + ".");
    }
}
