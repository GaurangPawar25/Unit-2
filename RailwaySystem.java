package railwaymanagement;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RailwaySystem {
    static {
        System.out.println("Welcome to the Railway Management System!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking Train Details from User
            System.out.print("Enter Train Name: ");
            String trainName = scanner.nextLine().trim();
            if (trainName.isEmpty()) {
                throw new IllegalArgumentException("Train name cannot be empty.");
            }

            int trainNumber = getValidIntegerInput(scanner, "Enter Train Number: ");

            Train train = new Train(trainName, trainNumber);
            train.displayTrainInfo();

            // Taking Passenger Details
            int passengerCount = getValidIntegerInput(scanner, "Enter number of passengers: ");
            scanner.nextLine(); // Consume newline

            Passenger[] passengers = new Passenger[passengerCount];

            for (int i = 0; i < passengerCount; i++) {
                System.out.print("Enter Passenger Name: ");
                String name = scanner.nextLine().trim();
                if (name.isEmpty() || name.matches(".*\\d+.*") || name.contains("/")) {
                    System.out.println("Invalid name! Names should not contain numbers or special characters like '/'.");
                    i--; // Retry this iteration
                    continue;
                }

                int age = getValidIntegerInput(scanner, "Enter Passenger Age: ");
                passengers[i] = new Passenger(name, age);
            }

            // Ticket Booking
            int ticketNumber = getValidIntegerInput(scanner, "Enter Ticket Number: ");

            TicketBooking booking = new TicketBooking(ticketNumber, passengers);
            booking.bookTickets();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Railway System shutting down.");
        }
    }

    // Helper method to get a valid integer input
    private static int getValidIntegerInput(Scanner scanner, String message) {
        int value;
        while (true) {
            System.out.print(message);
            try {
                value = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                if (value <= 0) throw new IllegalArgumentException("Value must be greater than zero.");
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine(); // Clear buffer
            }
        }
    }
}
