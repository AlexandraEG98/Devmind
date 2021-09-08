package Project_1;

public class Guest {

	private String lastName;
	private String firstName;
	private String email;
	private String phoneNumber;
	
	public Guest(String firstName, String lastName, String email, String phoneNumber) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public boolean equalsToName (Object guest) {
		Guest theObject = (Guest) guest;
		if( theObject.getFirstName() != null && theObject.getLastName() != null) {
			if((firstName.compareTo(theObject.getFirstName()) == 0) && (lastName.compareTo(theObject.getLastName()) == 0)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean equalsToEmail (Object guest) {
		Guest theObject = (Guest) guest;
		if( theObject.getEmail() != null ) {
			if(email.compareTo(theObject.getEmail()) == 0) {
				return true;
			}
		}
		return false;	
	}
	public boolean equalsToNumber (Object guest) {
		Guest theObject = (Guest) guest;
		if( theObject.getPhoneNumber() != null) {
			if(phoneNumber.compareTo(theObject.getPhoneNumber()) == 0) {
				return true;
			}
		}
		return false;	
	}
}
