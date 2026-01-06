package GroupProject_OnlineFoodDeliverySystem_Pro2_CoreJava_TNSIF;

public class DeliveryPerson {
    private int deliveryPersonId;
    private String name;
    private long contactNo;

    public DeliveryPerson(int deliveryPersonId, String name, long contactNo) {
        this.deliveryPersonId = deliveryPersonId;
        this.name = name;
        this.setContactNo(contactNo);
    }

    public int getDeliveryPersonId() { return deliveryPersonId; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return name;
    }

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
}

