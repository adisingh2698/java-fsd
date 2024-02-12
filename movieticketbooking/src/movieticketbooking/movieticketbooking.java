package movieticketbooking;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Arrays;

class Theatre {
    List<List<String>> seats  = new ArrayList<>();
    List<String> showTime;

    Theatre() {
       
        seats.add(Arrays.asList("A1", "A2", "A3", "A4", "A5"));
        seats.add(Arrays.asList("B1", "B2", "B3", "B4", "B5"));
        seats.add(Arrays.asList("C1", "C2", "C3", "C4", "C5"));
        seats.add(Arrays.asList("D1", "D2", "D3", "D4", "D5"));
        seats.add(Arrays.asList("E1", "E2", "E3", "E4", "E5"));

        showTime = Arrays.asList("10:00AM", "02:00PM");
    }

    void displayAvailableSeats() {
        System.out.println("Available Seats for Show Time: " + showTime);
        for (List<String> row : seats) {
            for (String seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }

    void bookTickets(Movie movie) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Input Customer Name: ");
            movie.setCustomerName(scanner.nextLine());

            System.out.print("Input Date (yyyy-MM-dd): ");
            LocalDate showDate = LocalDate.parse(scanner.nextLine());
            movie.setShowDate(showDate);

            System.out.print("Input Show Time: ");
            movie.setShowTime(scanner.nextLine());

            System.out.print("Input Number of Tickets: ");
            movie.setNoOfTickets(scanner.nextInt());

            System.out.print("Input Ticket Price: ");
            movie.setTicketPrice(scanner.nextFloat());

            System.out.print("Input Seat Numbers (comma-separated): ");
            scanner.nextLine(); // Consume newline
            String seatInput = scanner.nextLine();
            movie.setSeatNumbers(seatInput.split(","));

            float totalAmount = movie.calculateTotalAmount();
            System.out.println("Total Amount: rupees" + totalAmount);

            // Display booked seats in red color
            displayBookedSeats(movie.getSeatNumbers());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    void displayBookedSeats(List<String> bookedSeats) {
        System.err.print("Booked Seats: ");
        for (String seat : bookedSeats) {
            System.err.print(seat + " ");
        }
        System.err.println();
    }
}

class Movie {
    private String customerName;
    private int noOfTickets;
    private float ticketPrice;
    private LocalDate showDate;
    private String showTime;
    private List<String> seatNumbers;

    public Movie() {
        seatNumbers = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getNoOfTickets() {
        return noOfTickets;
    }

    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public List<String> getSeatNumbers() {
        return seatNumbers;
    }

    public void setSeatNumbers(String[] seatNumbers) {
        this.seatNumbers = Arrays.asList(seatNumbers);
    }

    public float calculateTotalAmount() {
        return noOfTickets * ticketPrice;
    }
}

public class movieticketbooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Theatre theatre = new Theatre();
        Movie movie = new Movie();

        while (true) {
            System.out.println("\n1. Show Available Seats\n2. Book Tickets\n3. Exit");
            System.out.print("Select an Option: ");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        theatre.displayAvailableSeats();
                        break;
                    case 2:
                        theatre.bookTickets(movie);
                        break;
                    case 3:
                        System.out.println("Exiting the program.");
                        System.exit(0);
                    default:
                        System.out.println("Invalid Option. Please try again.");
                }
            } catch (Exception e) {
                System.err.println("Error: Invalid input. Please try again.");
                scanner.nextLine(); // Consume newline
            }
        }
    }
}
