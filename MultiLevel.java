class Vehicle {
    void features(){
        System.out.println("This is a vehicle");

    }
}
class Car extends Vehicle {
    void carFeatures() {
        System.out.println("This is car");
    }
}
class Bike extends Car {
    void bikeFeatures(){
        System.out.println("This is bike");
    }
}
public class MultiLevel {
    public static void main(String[]args){
        Bike bike = new Bike();
        bike.features();
        bike.carFeatures();
        bike.bikeFeatures();
    }
}