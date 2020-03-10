package methodDemo;

public class MethodDemo {
	
// does not take anything
	public static void mydemomethod() {  //parentheses
		
		System.out.println("test");
		
	}
	
	// method to take parameter vs argument 
	
	public static void mymethod(String myname) {
		
		System.out.println(myname);
		
	}
	
	// Method overloading 
	
	public static int addTwoNumbers(int a, int b) {
		
		int c = a + b;
		
		return c;
		
	}
	
  public static int addTwoNumbers(int a, int b, int c) {
		
		int d = a + b + c;
		
		return d;
		
	}
  
  public static boolean compareTwoNumbers(int a, int b) {
		
		boolean c = a >= b;
		
		if (c) {
			System.out.println("The result is correct");
		}else {
			System.out.println("The result is wrong");
		}
		
		return true;
		
	}
  
	
	public static void main(String[] args) {
		mydemomethod();
		mymethod("BK");  // Argument 
		addTwoNumbers(2,3);
		addTwoNumbers(2,4,5);
		compareTwoNumbers(10,20);
		
		System.out.println(addTwoNumbers(2,3));
		System.out.println(addTwoNumbers(2,4,5));

	}

}
