package stringDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] cars; //Square + brackets
		
		
		String[] NewCars = {"Volvo", "BMW", "LXS", "Ford", "Honda"}; // Array of String 
		
		//System.out.println(NewCars[0] = "Toyota");
		
		//System.out.println(NewCars.length);
		
		/*
		for(int i = 0 ; i<= NewCars.length - 1; i++) {
			
			System.out.println(NewCars[i].concat(": " + "My favorite car"));
		}*/
		
		// For loop in java 8
		
		for(String mycarlist : NewCars) {
			
			System.out.println(mycarlist);
			
		}
		
		
		//int[] myNum = {10,23,23,23,245,4543,3534};
		
		//System.out.println(myNum.length);
		
		
		
		
		
		
		

	}

}
