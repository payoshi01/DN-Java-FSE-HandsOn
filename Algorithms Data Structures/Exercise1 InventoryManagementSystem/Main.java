public class Main {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        inventory.addProduct(new Product(101, "Laptop", 10, 75000));
        inventory.addProduct(new Product(102, "Mouse", 25, 800));
        inventory.addProduct(new Product(103, "Keyboard", 15, 1500));

        System.out.println("Initial Inventory");
        inventory.displayProducts();

        inventory.updateProduct(101, 12, 72000);

        inventory.deleteProduct(102);

        System.out.println("\nUpdated Inventory");
        inventory.displayProducts();
    }
}
