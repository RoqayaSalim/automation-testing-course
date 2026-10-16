package fizzbuzz;
import java.util.Scanner;
public class Task2Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = scanner.nextInt();

        switch (true) {
            case (score >= 90) -> System.out.println("Excellent");
            case (score >= 75) -> System.out.println("Good");
            case (score >= 60) -> System.out.println("Pass");
            default -> System.out.println("Fail");
        }

        scanner.close();
    }



}
