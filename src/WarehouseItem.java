public class WarehouseItem {
    private String itemName;
    private int stock;

    public WarehouseItem(String itemName, int stock) throws InvalidQuantityException {
        if (stock < 0) {
            throw new InvalidQuantityException(stock);
        }
        this.itemName = itemName;
        this.stock = stock;
    }

    public void addStock(int quantity) throws InvalidQuantityException {
        if (quantity < 0) {
            throw new InvalidQuantityException(quantity);
        }
        stock += quantity;
    }

    public void removeStock(int quantity) throws InvalidQuantityException, InsufficientStockException {
        if (quantity < 0) {
            throw new InvalidQuantityException(quantity);
        }
        if (stock < quantity) {
            throw new InsufficientStockException(stock, quantity);
        }
        stock -= quantity;
    }

    public int getStock() {
        return stock;
    }

    public String getItemName() {
        return itemName;
    }
}
