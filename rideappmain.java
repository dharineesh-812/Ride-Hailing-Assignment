package java_assign;

public class rideappmain {
	    public static void main(String[] args) {
	        rideservice service = new rideservice();

	        // Register some users
	        rider r1 = new rider(1, "Alice", "12345", "UPI");
	        rider r2 = new rider(2, "Bob", "67890", "Card");

	        driver d1 = new driver(101, "John", "99887", "KA01AB1234", "Sedan");
	        driver d2 = new driver(102, "Mike", "77665", "KA02XY5678", "Hatchback");

	        service.registerRider(r1);
	        service.registerRider(r2);
	        service.registerDriver(d1);
	        service.registerDriver(d2);

	        // Request rides
	        service.requestRide(r1, 12, 20, 1.0);  // distance, time, surge
	        service.requestRide(r2, 5, 10, 1.5);

	        // Show trip history and driver leaderboard
	        service.showTripHistory();
	        service.showDriverLeaderboard();
	    }
	

}
