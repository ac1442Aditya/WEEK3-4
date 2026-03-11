import java.util.Scanner;

public class Q2.2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = 0;

        // Check condition
        if (years > 5) {
            bonus = salary * 0.05;
        }

        // Output
        System.out.println("Bonus amount: " + bonus);

        sc.close();
    }
}
