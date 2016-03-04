package Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDriver {

	public static void main(String[] args) {
		
		//create scanner obj
		Scanner keys = new Scanner(System.in);
		
		//declare array list fir test scores
		ArrayList<Integer> _testScores = new ArrayList<>();
		
		for (int j = 1; j <= 3; j++) {
			System.out.printf("Test %d score: ", j);
			_testScores.add(keys.nextInt());
		}
		
		TestScores finalsWeek = new TestScores(_testScores);
		
		try {
			finalsWeek.getAverage();
		} catch (InvalidTestScore e) {
			System.out.println(e.getMessage());
		}
		
		keys.close();

	}

}
