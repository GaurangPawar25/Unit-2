public class Shape {
    double radius;
    double length;
    double breadth;

    public Shape() {
        radius = 5.0;
    }

    public Shape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calculateArea() {
        if (radius > 0) {
            double area = Math.PI * radius * radius;
            System.out.println("Area of Circle: " + area);
        } else if (length > 0 && breadth > 0) {
            double area = length * breadth;
            System.out.println("Area of Rectangle: " + area);
        } else {
            System.out.println("Invalid dimensions.");
        }
    }

    public static void main(String[] args) {
        Shape circle = new Shape();
        circle.calculateArea();
        
        Shape rectangle = new Shape(10.0, 5.0);
        rectangle.calculateArea();
    }
}
