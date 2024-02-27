/*
 * Class: CMSC203  CRN 	34473
 * Instructor: Khandan Monshi
 * Description: This program is a where the 
 * Due: 02/26/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Andy Gunawan
*/

public class PatientDriverApp {

	public static void main(String[] args) {
	
		Patient patient = new Patient("Jenny","Elaine", "Santori", 
				 			"123 Main Street", "Mytown", 
				 			"CA", "01234", "Bill Santori", 
				 			"777-555-1212");
		
		System.out.println(patient.toString());
		
		Procedure p1 = new Procedure("Physical Exam", "7/20/2019", "Dr. Irvine", 3250.0);
		System.out.println(p1.toString());
		Procedure p2 = new Procedure("X-Ray", "7/20/2019", "Dr. Jamison", 5500.43);
		System.out.println(p2.toString());
		Procedure p3 = new Procedure("Blood Test", "7/20/2019", "Dr. Smith", 1400.75);
		System.out.println(p3.toString());
		
		double totalCost = p1.getCost() + p2.getCost()
						   + p3.getCost();
		
		System.out.println("Total Charges: " + totalCost +"\n");
		
		System.out.println("Student Name: Andy Gunawan \n" +
					       "MC# 21113858 \n" +
						   "Due Date: 2/26/2024");
		
		
		
		
		
	}

}
