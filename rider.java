package java_assign;

public class rider extends user{
	
	    private String preferredPayment;
	    private double rating;
	    private int rideCount;

	    public rider(int id, String name, String phone, String preferredPayment) {
	        super(id, name, phone);
	        this.preferredPayment = preferredPayment;
	        this.rating = 5.0; // default
	        this.rideCount = 0;
	    }

	    public void addRating(double newRating) {
	        rating = (rating * rideCount + newRating) / (++rideCount);
	    }

	    public double getRating() {
	        return rating;
	    }

	    @Override
	    public void display() {
	        System.out.println("Rider: " + name + " | Payment: " + preferredPayment + " | Rating: " + rating);
	    }
	}


