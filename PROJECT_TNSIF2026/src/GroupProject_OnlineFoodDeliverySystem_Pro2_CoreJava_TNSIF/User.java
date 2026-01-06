package GroupProject_OnlineFoodDeliverySystem_Pro2_CoreJava_TNSIF;

public class User {     // Base Class
	    private int userId;
	    private String username;
	    private long contactNo;

	    public User(int userId, String username, long contactNo) {
	        this.userId = userId;
	        this.username = username;
	        this.contactNo = contactNo;
	    }

	    public int getUserId() { return userId; }
	    public String getUsername() { return username; }
	    public long getContactNo() { return contactNo; }

	    @Override
	    public String toString() {
	        return username;
	    }
	}

