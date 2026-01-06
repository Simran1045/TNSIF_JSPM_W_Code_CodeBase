package GroupProject_OnlineFoodDeliverySystem_Pro2_CoreJava_TNSIF;

import java.util.*;

public class FoodDeliveryApp {                     // Main  Program
    static Scanner sc = new Scanner(System.in);
    static List<Restaurant> restaurants = new ArrayList<>();
    static List<Customer> customers = new ArrayList<>();
    static List<Order> orders = new ArrayList<>();
    static List<DeliveryPerson> deliveryPersons = new ArrayList<>();
    static int orderCounter = 1;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Admin Menu\n2. Customer Menu\n3. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> adminMenu();
                case 2 -> customerMenu();
                case 3 -> System.exit(0);
            }
        }
    }

    static void adminMenu() {
        while (true) {
            System.out.println("""
                \nAdmin Menu:
                1. Add Restaurant
                2. Add Food Item
                3. View Restaurants
                4. View Orders
                5. Add Delivery Person
                6. Assign Delivery Person
                7. Exit
                """);
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("Enter Restaurant ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    restaurants.add(new Restaurant(id, name));
                }
                case 2 -> {
                    System.out.print("Enter Restaurant ID: ");
                    int rid = sc.nextInt();
                    Restaurant r = findRestaurant(rid);
                    if (r != null) {
                        System.out.print("Food ID: ");
                        int fid = sc.nextInt();
                        System.out.print("Food Name: ");
                        String fname = sc.next();
                        System.out.print("Price: ");
                        double price = sc.nextDouble();
                        r.addFoodItem(new FoodItem(fid, fname, price));
                    }
                }
                case 3 -> restaurants.forEach(res -> {
                    System.out.println(res);
                    res.getMenu().forEach(System.out::println);
                });
                case 4 -> orders.forEach(System.out::println);
                case 5 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Contact: ");
                    long c = sc.nextLong();
                    deliveryPersons.add(new DeliveryPerson(id, name, c));
                }
                case 6 -> {
                    System.out.print("Order ID: ");
                    int oid = sc.nextInt();
                    System.out.print("Delivery Person ID: ");
                    int did = sc.nextInt();
                    Order o = findOrder(oid);
                    DeliveryPerson dp = findDeliveryPerson(did);
                    if (o != null && dp != null) o.setDeliveryPerson(dp);
                }
                case 7 -> { return; }
            }
        }
    }

    static void customerMenu() {
        while (true) {
            System.out.println("""
                \nCustomer Menu:
                1. Add Customer
                2. View Food Items
                3. Add Food to Cart
                4. View Cart
                5. Place Order
                6. View Orders
                7. Exit
                """);
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Contact: ");
                    long c = sc.nextLong();
                    customers.add(new Customer(id, name, c));
                }
                case 2 -> restaurants.forEach(r -> {
                    System.out.println(r);
                    r.getMenu().forEach(System.out::println);
                });
                case 3 -> {
                    Customer c = getCustomer();
                    System.out.print("Restaurant ID: ");
                    Restaurant r = findRestaurant(sc.nextInt());
                    if (c != null && r != null) {
                        System.out.print("Food ID: ");
                        int fid = sc.nextInt();
                        System.out.print("Qty: ");
                        int q = sc.nextInt();
                        for (FoodItem f : r.getMenu())
                            if (f.getId() == fid)
                                c.getCart().addItem(f, q);
                    }
                }
                case 4 -> System.out.println(getCustomer().getCart());
                case 5 -> {
                    Customer c = getCustomer();
                    Order o = new Order(orderCounter++, c);
                    c.getCart().getItems().forEach(o::addItem);
                    orders.add(o);
                    System.out.println("Order placed! ID: " + o.getOrderId());
                }
                case 6 -> orders.forEach(System.out::println);
                case 7 -> { return; }
            }
        }
    }

    static Restaurant findRestaurant(int id) {
        return restaurants.stream().filter(r -> r.getId() == id).findFirst().orElse(null);
    }

    static Customer getCustomer() {
        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        return customers.stream().filter(c -> c.getUserId() == id).findFirst().orElse(null);
    }

    static Order findOrder(int id) {
        return orders.stream().filter(o -> o.getOrderId() == id).findFirst().orElse(null);
    }

    static DeliveryPerson findDeliveryPerson(int id) {
        return deliveryPersons.stream().filter(d -> d.getDeliveryPersonId() == id).findFirst().orElse(null);
    }
}

	       
