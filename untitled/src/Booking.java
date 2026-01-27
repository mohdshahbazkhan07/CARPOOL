public class Booking {
    int Booking_id;
    int Ride_id;
    int user_id;
    int seats_booked;
    double total_fare;

    public Booking(int booking_id, int ride_id, int user_id, int seats_booked, double total_fare) {
        Booking_id = booking_id;
        Ride_id = ride_id;
        this.user_id = user_id;
        this.seats_booked = seats_booked;
        this.total_fare = total_fare;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "Booking_id=" + Booking_id +
                ", Ride_id=" + Ride_id +
                ", user_id=" + user_id +
                ", seats_booked=" + seats_booked +
                ", total_fare=" + total_fare +
                '}';
    }
}
