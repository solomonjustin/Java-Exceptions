package Lab1;

//handling custom exceptions
public class InvalidTestScore extends Exception {
	
	public InvalidTestScore(){
		super("Error: test score most be a positive number which is also less than 100.");
	}
	
	public InvalidTestScore(int test){
		super("Error: Test " + test + " is out of the range: 0 - 100.");
	}

}
