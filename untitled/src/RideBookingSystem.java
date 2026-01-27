import java.util.ArrayList;
import java.util.List;

public class RideBookingSystem {

    public List<Ride> ridelist = new ArrayList<>();

    public void createRide(String source, String destination, int total_seats, double fare) {
        Ride ride = new Ride(source, destination, total_seats, fare);
        ridelist.add(ride);

    }

    public List<Ride> showAllRide() {
        return ridelist;
    }
}