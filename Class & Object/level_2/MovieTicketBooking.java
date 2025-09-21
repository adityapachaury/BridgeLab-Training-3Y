
// Program to Model a Movie Ticket Booking System
class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void bookTicket(String movie, int seat, double price) {
        this.movieName = movie;
        this.seatNumber = seat;
        this.price = price;
    }

    void displayTicket() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket("RRR", 12, 250);
        t1.displayTicket();
    }
}
