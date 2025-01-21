import java.util.Scanner;

public class NestedIfSecond {
    public static void main(String[] args) {
        double billAmount, netAmount, discount = 0.0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter bill amount:");
        billAmount = scan.nextDouble();

        // Nested if statements to calculate discount
        if (billAmount > 0) {
            if (billAmount >= 500) {
                discount = billAmount * 0.20; // 20% discount for bills >= 500
            } else if (billAmount >= 200) {
                discount = billAmount * 0.10; // 10% discount for bills >= 200
            } else {
                discount = billAmount * 0.05; // 5% discount for bills < 200
            }
        } else {
            System.out.println("Invalid bill amount.");
            scan.close();
            return;
        }

        netAmount = billAmount - discount;

        System.out.println("Bill Amount: $" + billAmount);
        System.out.println("Discount: $" + discount);
        System.out.println("Net Amount to be Paid: $" + netAmount);
        scan.close();
    }
}
