public class Main {
    public static void main(String[] args) {
        try {
            WarehouseItem item = new WarehouseItem("Monitor", 10);

            System.out.println("Initial stock: " + item.getStock());

            // Test InvalidQuantityException with negative addition
            item.addStock(-100); // This will throw exception

        } catch (InvalidQuantityException | InsufficientStockException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            WarehouseItem item2 = new WarehouseItem("Keyboard", 5);
            System.out.println("Initial stock: " + item2.getStock());

            // Test InsufficientStockException
            item2.removeStock(10); // This will throw exception

        } catch (InvalidQuantityException | InsufficientStockException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
