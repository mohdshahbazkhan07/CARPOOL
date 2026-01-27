public class Main {

    public static void main(String[] args) {

        RideBookingSystem rideBookingSystem = new RideBookingSystem();

        rideBookingSystem.createRide("Delhi", "Goa", 5, 725.00);
        rideBookingSystem.createRide("Gr-Noida", "Agra", 5, 525.00);

        System.out.println(rideBookingSystem.showAllRide());
    }
}