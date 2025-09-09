package java_assign;

public class user {
	// User.java
	
	    protected int id;
	    protected String name;
	    protected String phone;

	    public user(int id, String name, String phone) {
	        this.id = id;
	        this.name = name;
	        this.phone = phone;
	    }

	    public void display() {
	        System.out.println("User ID: " + id + ", Name: " + name + ", Phone: " + phone);
	    }
	}


