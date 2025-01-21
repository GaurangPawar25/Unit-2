class Vehicle{
    String brand, music, ac;
    int registration, cc, gears, topSpeed, wheels;

}
class Car extends Vehicle{
    public void car(String brand, String music, String ac, int reg, int cc, int gears, int topspeed, int wheels){
        System.out.println("Brand - " + brand);
        System.out.println("Music - " + music);
        System.out.println("AC - " + ac);
        System.out.println("Registration number - " + reg);
        System.out.println("CC - " + cc);
        System.out.println("Gears - " + gears);
        System.out.println("Topspedd - " + topspeed);
        System.out.println("Wheels - " + wheels);
    }
}
class Bike extends Vehicle{
    public void bike(String brand, String music, String ac, int reg, int cc, int gears, int topspeed, int wheels){
        System.out.println("Brand - " + brand);
        System.out.println("Music - " + music);
        System.out.println("AC - " + ac);
        System.out.println("Registration number - " + reg);
        System.out.println("CC - " + cc);
        System.out.println("Gears - " + gears);
        System.out.println("Topspedd - " + topspeed);
        System.out.println("Wheels - " + wheels);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.car("Tata","Yes","No",34353636, 454546, 4, 300, 4);
        Bike bike1 = new Bike();
        bike1.bike("Tata","Yes","No",34353636, 454546, 4, 300, 4);

    }
}
