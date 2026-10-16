package fizzbuzz;
import java.util.Scanner;
public class Task2 {



        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your score: ");
            int score = scanner.nextInt();

            if (score >= 90) {
                System.out.println("Excellent");
            } else if (score >= 75) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }

            scanner.close();
        }
    }




