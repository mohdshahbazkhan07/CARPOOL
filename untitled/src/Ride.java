
public class Ride {

    int id;
    String source;
    String destination;
    int total_seats;
    double fare;

    public Ride(String source, String destination, int total_seats, double fare) {
        this.source = source;
        this.destination = destination;
        this.total_seats = total_seats;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", total_seats=" + total_seats +
                ", fare=" + fare +
                '}';
    }
}
