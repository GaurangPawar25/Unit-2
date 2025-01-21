import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double area, r; //area and radius in 'double' datatype as it can be in decimal
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        r = sc.nextDouble();
        area = 3.14 * r * r;
        System.out.println("Area is " + area);
        sc.close();
    }
}
