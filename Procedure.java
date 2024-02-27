/*
 * Class: CMSC203  CRN 	34473
 * Instructor: Khandan Monshi
 * Description: This program is a 
 * Due: 02/26/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Andy Gunawan
*/
public class Procedure {
	
	//stating variables
	private String procedure, date, doctor;
	private double cost;

	//no arg constructor
	public Procedure(){
	}

	//parametrized constructor for name and date
	public Procedure(String procedure, String date) {
		this.procedure = procedure;
		this.date = date;
	}
	
	//parametrized constructor for all attributes 
	public Procedure(String procedure, String date, 
			String doctor, double cost) {
		this.procedure = procedure;
		this.date = date;
		this.doctor = doctor;
		this.cost = cost;
	}
	
	//setter for all the attributes
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	//getter for all the attributes
	public String getProcedure() {
		return procedure;
	}
	public String getDate() {
		return date;
	}
	public String getDoctor() {
		return doctor;
	}
	public double getCost() {
		return cost;
	}
	
	// Method to display all the info
	public String toString() {
		return "        Procedure: " + procedure + "\n" +
			   "        Procedure Date: " + date + "\n" +
			   "        Pracitioner: " + cost + "\n";
	}
}
