package oops.java;

import java.util.Scanner;

abstract class DessertItem{
	abstract double getCost();
}

class Candy extends DessertItem{

	private double priceInDollars;
	
	public Candy(double candyPrice) {
		this.priceInDollars=candyPrice;
	}

	@Override
	double getCost() {
		// TODO Auto-generated method stub
		return priceInDollars*60;
	}
	
}

class Cookie extends DessertItem{

	private double priceInEuros;
	
	public Cookie(double cookiePrice) {
		this.priceInEuros= cookiePrice;
	}

	@Override
	double getCost() {
		// TODO Auto-generated method stub
		return priceInEuros*70;
	}
	
}

class IceCream extends DessertItem{
	
	private double priceInRupees;

	public IceCream(double iceCreamPrice) {
		this.priceInRupees= iceCreamPrice;
	}

	@Override
	double getCost() {
		// TODO Auto-generated method stub
		return priceInRupees;
	}
	
}
class DessertShop_7 {

	static void placeOrder() {
		 System.out.print("Enter the dessert type (Candy/Cookie/IceCream): ");
	        Scanner scanner= new Scanner(System.in);
			String dessertType = scanner.nextLine();

	        DessertItem dessertItem;

	        switch (dessertType.toLowerCase()) {
	            case "candy":

	                double candyPrice = scanner.nextDouble();
	                dessertItem = new Candy(12);
	                break;

	            case "cookie":

	                double cookiePrice = scanner.nextDouble();
	                dessertItem = new Cookie(15);
	                break;

	            case "icecream":

	                double iceCreamPrice = scanner.nextDouble();
	                dessertItem = new IceCream(60);
	                break;

	            default:
	                System.out.println("Invalid dessert type. Exiting the application.");
	                return;
	        }

	        // Display the total cost for the customer
	        System.out.println("Total cost in rupees: " + dessertItem.getCost());
		
	}

	static void addItemsToStorage() {
		// adding items to storage
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your role (owner/customer): ");
        String role = scanner.nextLine();

        if ("owner".equalsIgnoreCase(role)) {
            addItemsToStorage();
        } else if ("customer".equalsIgnoreCase(role)) {
            placeOrder();
        } else {
            System.out.println("Invalid role. Exiting the application.");
        }
	}

}
