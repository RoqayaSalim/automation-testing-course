package fizzbuzz;

public class Task1 {


    public static void main(String[] args) {

        String productName = "Sauce Labs Backpack";
        double price = 29.99;
        int quantity = 2;
        boolean inStock = true;

        System.out.println("===== Receipt =====");
        System.out.println("Product: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("In Stock: " + inStock);

        double totalPrice = price * quantity;

        System.out.println("Total Price: $" + totalPrice);
    }
}
