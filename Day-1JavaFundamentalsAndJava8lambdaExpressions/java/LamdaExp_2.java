package lambdaExpressions.java;

import java.util.ArrayList;
import java.util.List;

class Order {
    private int orderId;
    private double orderPrice;
    private String orderStatus;

    public Order(int orderId, double orderPrice, String orderStatus) {
        this.orderId = orderId;
        this.orderPrice = orderPrice;
        this.orderStatus = orderStatus;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}

public class LamdaExp_2 {
	
	public static void main(String[] args) {
		 List<Order> orders = new ArrayList<>();
	        orders.add(new Order(1, 15000, "ACCEPTED"));
	        orders.add(new Order(2, 8000, "PENDING"));
	        orders.add(new Order(3, 12000, "COMPLETED"));
	        orders.add(new Order(4, 9000, "ACCEPTED"));
	        orders.add(new Order(5, 11000, "REJECTED"));
	        
	        System.out.println("Filtered Orders:");
	        orders.stream()
	                .filter(order -> order.getOrderPrice()>10000 && (order.getOrderStatus().equals("ACCEPTED") || order.getOrderStatus().equals("COMPLETED")))
	                .forEach(order -> System.out.println("OrderID: " + order.getOrderId() +
	                        ", Price: " + order.getOrderPrice() +
	                        ", Status: " + order.getOrderStatus()));
	    }

}
