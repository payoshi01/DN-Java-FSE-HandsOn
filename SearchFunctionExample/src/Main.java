package SearchFunctionExample.src;

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

        System.out.println("Linear Search:");

        Product result1 = SearchOperations.linearSearch(products, "Phone");

        if (result1 != null)
            result1.display();
        else
            System.out.println("Product Not Found");

        Arrays.sort(products, Comparator.comparing(product -> product.productName));

        System.out.println();

        System.out.println("Binary Search:");

        Product result2 = SearchOperations.binarySearch(products, "Phone");

        if (result2 != null)
            result2.display();
        else
            System.out.println("Product Not Found");
    }
}
