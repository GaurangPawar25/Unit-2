public class NestedIfOperation {
    public static void main(String[] args) {
        int a = 25, b = 20, c = 30;
        int big;
        if (a > b && a > c) {
            big = a;
        } else if (b > c) {
            big = b;
        } else {
            big = c;
        }
        System.out.println(big);
    }
}
