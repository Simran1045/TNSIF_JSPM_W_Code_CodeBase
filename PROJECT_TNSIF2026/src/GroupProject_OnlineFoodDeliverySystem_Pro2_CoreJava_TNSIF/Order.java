package GroupProject_OnlineFoodDeliverySystem_Pro2_CoreJava_TNSIF;

	import java.util.*;

	public class Order {
	    private int orderId;
	    private Customer customer;
	    private Map<FoodItem, Integer> items = new HashMap<>();
	    private String status = "Pending";
	    private DeliveryPerson deliveryPerson;

	    public Order(int orderId, Customer customer) {
	        this.orderId = orderId;
	        this.customer = customer;
	    }

	    public int getOrderId() { return orderId; }
	    public void setDeliveryPerson(DeliveryPerson deliveryPerson) {
	        this.deliveryPerson = deliveryPerson;
	    }

	    public void addItem(FoodItem foodItem, int qty) {
	        items.put(foodItem, qty);
	    }

	    @Override
	    public String toString() {
	        return "Order{orderId=" + orderId +
	               ", customer=" + customer +
	               ", items=" + items +
	               ", status='" + status + '\'' +
	               ", deliveryPerson=" +
	               (deliveryPerson == null ? "Not Assigned" : deliveryPerson.getName()) +
	               '}';
	    }
	}


