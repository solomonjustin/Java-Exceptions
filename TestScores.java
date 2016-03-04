package Lab1;

import java.util.ArrayList;
import java.io.Serializable;

public class TestScores implements Serializable{
	
	private ArrayList<Integer> _testScores = new ArrayList<>();

	public TestScores(ArrayList<Integer> _testScores) {
		for (int i = 0; i < _testScores.size(); i++) {
			this._testScores.add(_testScores.get(i));
		}
	}
	
	public double getAverage() throws InvalidTestScore{
		double total = 0;
		
		for (int i = 0; i < _testScores.size(); i++) {
			
			if(_testScores.get(i) > 100 || _testScores.get(i) < 0){
				throw new InvalidTestScore(i+1);
			}
			
			total += _testScores.get(i);
		}
		
		return total/_testScores.size();
	}
	
	

}
