package stringDemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String demo  = "This is the program, I wrote";
		
		//int lenx = demo.length();
		
		//System.out.println("The length of the string is : " + lenx);
		//System.out.println("The length of the string is : " + demo.length());
		
		
		//Uppercase and Lowercase
		
		String jemal = demo.toUpperCase();
		
		System.out.println("Upper case example : " + jemal);
		
		System.out.println("Upper case example : " + demo.toLowerCase());
		
		// Find a char in a string
		
		String x = "Please come over here";
		
		System.out.println(x.indexOf("come"));
		
		
		// Concatenation
		
		String firstname = "jemal";
		String lastname = "Mohammed";
		
		System.out.println(firstname + " " + lastname);
		
		
		// \Single , \double quote and \\backslash
		
		String txt = "he said \"xxxx\" run for president";
		
		String txt2 = "he said jemal car get  renewed";
		
	/*
	 * Two ways to create a string
	 */

		String demoVar = "demo";  //String as a primitive data type
		
		String demovarObj = new String();  // String class ( Reference object)
		
		

	}

}
