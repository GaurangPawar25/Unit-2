class Sample{
    // Use the overloaded `print` method to accept integer values.
    public void print(int a){
        System.out.println("int-0" +a);
    }
    // The overloaded `print` method accepts double values.
    public void print(double a){
        System.out.println("double-" +a);
    }
    //  print method is call that accepts the String.
    public void print(String a){
        System.out.println("String-" +a);
    }
}
// we  defined method of public class which is named as Overloading_Day0
class Overloading_Day0 {
    //  The main method is used as the entry point of the program.
    public static void main(String[] args) {
        // Created an instance of the above Sample class.
        Sample obj=new Sample();

        // Called the print method with an integer argument.
        obj.print(10);

        // Called the print method with a double argument.
        obj.print(10.2);

        // Called the print method with a String argument.
        obj.print("abc");
    }
}