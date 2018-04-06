
public class Banking {

	Calculator calc = new Calculator();
	
	public void add(){
		
		/*
		 * functionality is same as the calculator
		 * so I can implement this functionality
		 * we can also add the jar file of the calculator
		 * it would be added as a reference jar
		 * this jar file is now an API
		 */
		calc.add();
	}
	
	public void profit(){
		
	}
	
	public void loss(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banking banking = new Banking();
		banking.add();

	}
	
	

}
