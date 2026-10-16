package fizzbuzz;
import java.util.Arrays;
public class Task3 {



        public static void main(String[] args) {

            String[] products = {
                    "Sauce Labs Backpack",
                    "Sauce Labs Bike Light",
                    "Sauce Labs Bolt T-Shirt",
                    "Sauce Labs Fleece Jacket",
                    "Sauce Labs Onesie",
                    "Test.allTheThings() T-Shirt"
            };

            Arrays.sort(products);

            System.out.println("Sorted products:");
            for (String product : products) {
                System.out.println(product);
            }

            String target = "Sauce Labs Onesie";

            int index = Arrays.binarySearch(products, target);
            System.out.println("Index of " + target + ": " + index);

            // Reverse the sorted array
            for (int i = 0; i < products.length / 2; i++) {
                String temp = products[i];
                products[i] = products[products.length - 1 - i];
                products[products.length - 1 - i] = temp;
            }

            System.out.println("Reversed products:");
            for (String product : products) {
                System.out.println(product);
            }
        }
    }





