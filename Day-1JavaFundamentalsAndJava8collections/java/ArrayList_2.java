package collections.java;

import java.util.ArrayList;
import java.util.List;

class Product_2 {
    private int productId;
    private String productName;

    public Product_2(int productId, String productName) {
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
        Product_2 product = (Product_2) o;
        return productId == product.productId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(productId);
    }
}

public class ArrayList_2 {

    public static void main(String[] args) {
        List<Product_2> productList = new ArrayList<>();

        // Adding unique products
        addUniqueProduct(productList, new Product_2(1, "Laptop"));
        addUniqueProduct(productList, new Product_2(2, "Smartphone"));
        addUniqueProduct(productList, new Product_2(3, "Headphones"));
        addUniqueProduct(productList, new Product_2(4, "Tablet"));
        addUniqueProduct(productList, new Product_2(5, "Camera"));
        addUniqueProduct(productList, new Product_2(6, "Printer"));
        addUniqueProduct(productList, new Product_2(7, "Monitor"));
        addUniqueProduct(productList, new Product_2(8, "Keyboard"));
        addUniqueProduct(productList, new Product_2(9, "Mouse"));

        // Attempt to add a duplicate product (silently rejected)
        boolean duplicateAdded = addUniqueProduct(productList, new Product_2(1, "Laptop"));  // Duplicate productId

        if (!duplicateAdded) {
            System.out.println("Duplicate product not added.");
        }

        // Print all products in the list
        System.out.println("All Products in the List:");
        for (Product_2 product : productList) {
            System.out.println(product);
        }
    }

    private static boolean addUniqueProduct(List<Product_2> productList, Product_2 newProduct) {
        // Check for duplicates before adding
        if (!productList.contains(newProduct)) {
            productList.add(newProduct);
            return true;  // Product added successfully
        } else {
            return false;  // Duplicate product, not added
        }
    }
}
