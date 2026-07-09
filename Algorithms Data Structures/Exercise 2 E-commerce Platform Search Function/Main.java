import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(103, "Watch", "Accessories"),
                new Product(104, "Phone", "Electronics"),
                new Product(105, "Tablet", "Electronics")
        };

        System.out.println("Linear Search");

        Product p1 = SearchOperations.linearSearch(products, "Phone");

        if (p1 != null)
            p1.display();

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        System.out.println();

        System.out.println("Binary Search");

        Product p2 = SearchOperations.binarySearch(products, "Phone");

        if (p2 != null)
            p2.display();
    }
}