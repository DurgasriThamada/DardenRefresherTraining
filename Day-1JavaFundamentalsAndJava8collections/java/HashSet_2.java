package collections.java;

import java.util.HashSet;
import java.util.Set;

class Product {
    private int productId;
    private String productName;

    public Product(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    // Getter methods...
    
    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                '}';
    }

    // Equals and hashCode methods to ensure uniqueness based on productId
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(productId);
    }
}

public class HashSet_2 {
    public static void main(String[] args) {
        Set<Product> productSet = new HashSet<>();

        // Adding unique products
        productSet.add(new Product(1, "Laptop"));
        productSet.add(new Product(2, "Smartphone"));
        productSet.add(new Product(3, "Headphones"));
        productSet.add(new Product(4, "Tablet"));
        productSet.add(new Product(5, "Camera"));
        productSet.add(new Product(6, "Printer"));
        productSet.add(new Product(7, "Monitor"));
        productSet.add(new Product(8, "Keyboard"));
        productSet.add(new Product(9, "Mouse"));

        // Attempt to add a duplicate product (silently rejected)
        boolean duplicateAdded = productSet.add(new Product(1, "Laptop"));  // Duplicate productId

        if (!duplicateAdded) {
            System.out.println("Duplicate product not added.");
        }

        // Print all products in the set
        System.out.println("All Products in the Set:");
        for (Product product : productSet) {
            System.out.println(product);
        }
    }
}
