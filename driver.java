package java_assign;

public class driver extends user {
	    private String vehicleNo;
	    private String vehicleType;
	    private boolean available;
	    private double rating;
	    private int completedRides;
	    private double earnings;

	    public driver(int id, String name, String phone, String vehicleNo, String vehicleType) {
	        super(id, name, phone);
	        this.vehicleNo = vehicleNo;
	        this.vehicleType = vehicleType;
	        this.available = true;
	        this.rating = 5.0;
	        this.completedRides = 0;
	        this.earnings = 0.0;
	    }

	    public boolean isAvailable() {
	        return available;
	    }

	    public void setAvailable(boolean available) {
	        this.available = available;
	    }

	    public void addEarnings(double fare) {
	        earnings += fare;
	        completedRides++;
	    }

	    public double getEarnings() {
	        return earnings;
	    }

	    public int getCompletedRides() {
	        return completedRides;
	    }

	    @Override
	    public void display() {
	        System.out.println("Driver: " + name + " | Vehicle: " + vehicleNo + " (" + vehicleType + ") | Rating: " + rating + " | Available: " + available);
	    }
	
	

}
