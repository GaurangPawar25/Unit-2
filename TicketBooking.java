package railwaymanagement;

public class TicketBooking {
    private static final int MAX_TICKETS = 5; // Final Modifier (Constant)
    private int ticketNumber;
    private Passenger[] passengers;

    public TicketBooking(int ticketNumber, Passenger[] passengers) {
        this.ticketNumber = ticketNumber;
        this.passengers = passengers;
    }

    public void bookTickets() {
        if (passengers.length > MAX_TICKETS) {
            System.out.println("Cannot book more than " + MAX_TICKETS + " tickets.");
        } else {
            System.out.println(passengers.length + " Tickets Successfully Booked. Ticket Number: " + ticketNumber);
            issueTickets();
        }
    }

    private void issueTickets() {
        for (Passenger p : passengers) {
            System.out.println("Ticket issued to: " + p.getName());
        }
    }
}
