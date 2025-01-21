public class DoubleOperation {
    static double big ( double a, double b){
        if(a>b) {
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String[]args){
        double x = big(5,10);
        double y = big(15,20);
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
}