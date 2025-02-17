package railwaymanagement;

public class Passenger {
    private String name;
    private int age;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPassengerInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Getter for Name
    public String getName() {
        return name;
    }
}
