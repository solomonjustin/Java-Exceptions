package Lab1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeObj {

	public static void main(String[] args) throws Exception {//create array of objs
		
		//create stream
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Lab1/NewObjects.dat"));
		
		//array to hold objs
		TestScores[] testScoreObjs = new TestScores[5];
		
		//read data for objs
		for (int i = 0; i < testScoreObjs.length; i++) {
			testScoreObjs[i] = (TestScores)objectInputStream.readObject();
		}
		
		objectInputStream.close();
		
		//read data for objs
		for (int i = 0; i < testScoreObjs.length; i++) {
			System.out.printf("Test Day %d Average: %.1f\n", i+1,  testScoreObjs[i].getAverage());
		}
		
		System.out.println("Objects Successfully Deserialized!");
		

	}

}
