package collections.java;

import java.util.Set;
import java.util.TreeSet;

class Product_1 implements Comparable<Product_1>{

	private long productId;
	private String name;
	
	
	public Product_1(long productId, String name) {
		super();
		this.productId = productId;
		this.name = name;
	}
	
	 @Override
	    public String toString() {
	        return "Product{" +
	                "productId=" + productId +
	                ", productName='" + name + '\'' +
	                '}';
	    }

	@Override
	public int compareTo(Product_1 o) {
		// TODO Auto-generated method stub
		return Long.compare(this.productId, o.productId);
	}
	
}

public class TreeSet_2 {
	
	 public static void main(String[] args) {
	        Set<Product_1> productSet = new TreeSet<>();

	        // Adding unique products
	        productSet.add(new Product_1(1, "Laptop"));
	        productSet.add(new Product_1(2, "Smartphone"));
	        productSet.add(new Product_1(3, "Headphones"));
	        productSet.add(new Product_1(4, "Tablet"));
	        productSet.add(new Product_1(5, "Camera"));
	        productSet.add(new Product_1(6, "Printer"));
	        productSet.add(new Product_1(7, "Monitor"));
	        productSet.add(new Product_1(8, "Keyboard"));
	        productSet.add(new Product_1(9, "Mouse"));

	        // Attempt to add a duplicate product (silently rejected)
	        boolean duplicateAdded = productSet.add(new Product_1(10, "Laptop"));  // Duplicate productName

	        if (!duplicateAdded) {
	            System.out.println("Duplicate product not added.");
	        }

	        // Print all products in the set
	        System.out.println("All Products in the Set (Sorted by productName):");
	        for (Product_1 product : productSet) {
	            System.out.println(product);
	        }
	    }

}
