/*
 * Class: CMSC203  CRN 	34473
 * Instructor: Khandan Monshi
 * Description: This program is 
 * Due: 02/26/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Andy Gunawan
*/
public class Patient {
	
	//stating all the Variables
	private String firstName, middleName, lastName,
				   streetAddress, city, state, zipCode
				   , emergencyContactName, 
				   emergencyContactNumber ;
	
	// no arg constructor 
	public Patient() {
	}
	
	//parametrized constructor for name
	public Patient(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
	    this.middleName = middleName;
	    this.lastName = lastName;
	}
	//parametrized constructor for all attributes 
	public Patient(String firstName, String middleName, String lastName,
			   String streetAddress, String city, String state,
			   String zipCode,  String emergencyName, 
			   String emergencyNumber) {
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.streetAddress = streetAddress;
	this.city = city;
	this.state = state;
	this.zipCode = zipCode;
	this.emergencyContactName = emergencyName;
	this.emergencyContactNumber = emergencyNumber;
}
	
	//setter for all the attributes
	public void setFirstName(String name){
		this.firstName = name;	
	}
	public void setMiddleName(String name){
		this.middleName = name;
	}
	public void setLastName(String name){
		this.lastName = name;
	}
	public void setStreetAddress(String add) {
		this.streetAddress = add;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZipCode(String zip) {
		this.zipCode = zip;
	}
	public void setEmergencyContactName (String name) {
		emergencyContactName = name;
	}
	public void setEmergencyContactNumber (String number) {
		emergencyContactNumber = number;
	}
	
	//getter for the attributes 
	public String getFirstName() {
		return firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public String getEmergencyContactName () {
		return emergencyContactName;
	}
	public String getEmergencyContactNumber () {
		return emergencyContactNumber;
	}
	
	//method buildFullName to output the patient's full name
	public String buildFullName() {
		return((" Name: " + firstName +" " + middleName + " "
						    + lastName));
	}

	//method to output the Patient's address
	public String buildAddress() {
		return(" Address: " + streetAddress + " " + city + " " + state 
				           + " " + zipCode);
	}
	
	//method buildEmergencyContact to output the patient's 
	//emergency contact
	public String buildEmergencyContact() {
		return (" Emergency Contact: " + emergencyContactName +
							" " + emergencyContactNumber + "\n");
	}
	//method toString to display all the info
	public String toString() {
        return "Patient Information:\n" +
                 buildFullName() + "\n" +
                 buildAddress() + "\n" +
                 buildEmergencyContact();
    }
}
