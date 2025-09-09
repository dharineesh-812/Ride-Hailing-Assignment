package java_assign;
import java.util.*;

public class rideservice{	
	    private List<rider> riders = new ArrayList<>();
	    private List<driver> drivers = new ArrayList<>();
	    private List<String> tripHistory = new ArrayList<>();

	    public void registerRider(rider rider) {
	        riders.add(rider);
	    }

	    public void registerDriver(driver driver) {
	        drivers.add(driver);
	    }

	    public driver assignDriver() {
	        for (driver d : drivers) {
	            if (d.isAvailable()) {
	                d.setAvailable(false);
	                return d;
	            }
	        }
	        return null;
	    }

	    // Method overloading → fare calculation
	    public double fare(double distanceKm) {
	        return distanceKm * 10; // base fare
	    }

	    public double fare(double distanceKm, double timeMinutes, double surgeMultiplier) {
	        return (distanceKm * 10 + timeMinutes * 2) * surgeMultiplier;
	    }

	    public void requestRide(rider rider, double distance, double time, double surge) {
	        System.out.println(rider.name + " is requesting a ride...");
	        driver driver = assignDriver();
	        if (driver == null) {
	            System.out.println("No drivers available right now!");
	            return;
	        }

	        double fare = fare(distance, time, surge);
	        driver.addEarnings(fare);

	        String record = "Rider " + rider.name + " took a ride with Driver " + driver.name + " | Fare: " + fare;
	        tripHistory.add(record);

	        System.out.println(record);

	        driver.setAvailable(true); // after ride
	    }

	    public void showTripHistory() {
	        System.out.println("\n=== Trip History ===");
	        for (String trip : tripHistory) {
	            System.out.println(trip);
	        }
	    }

	    public void showDriverLeaderboard() {
	        System.out.println("\n=== Driver Leaderboard ===");
	        drivers.sort((d1, d2) -> Double.compare(d2.getEarnings(), d1.getEarnings()));
	        for (driver d : drivers) {
	            System.out.println(d.name + " | Rides: " + d.getCompletedRides() + " | Earnings: " + d.getEarnings());
	        }
	    }
	

}
