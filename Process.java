import java.util.Scanner;

class Process{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the name");
        String name = scan.nextLine();
        System.out.println("Hello!"+name);
        scan.close();
    }
}