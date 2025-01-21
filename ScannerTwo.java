import java.util.Scanner;

public class ScannerTwo {

    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n");
        n = scan.nextInt();

        int count = 0;
        int i;
        i = 1;
        while (i <= n) {

            if (n % i == 0) {
                count++;
            }
            i++;
        }
        System.out.println("The number of factors of " + n + " is: " + count);
        scan.close();
    }
}
