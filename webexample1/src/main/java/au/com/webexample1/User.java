package au.com.webexample1;

public class User {
	private String firstName;
	private String lastName;
	
	public User(String fName, String lName){
		this.firstName = fName;
		this.lastName =  lName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
