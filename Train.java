package railwaymanagement;

public class Train {
    private String trainName;
    private int trainNumber;

    public Train() {
        this("Unknown Train", 0000);
    }

    public Train(String trainName, int trainNumber) {
        this.trainName = trainName;
        this.trainNumber = trainNumber;
    }

    public void displayTrainInfo() {
        System.out.println("Train Name: " + trainName + ", Train Number: " + trainNumber);
    }
}
