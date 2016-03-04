package Lab1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SerializeObj {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//create scanner obj
		Scanner keys = new Scanner(System.in);
		
		//create array of objs
		TestScores[] testScoreObjs = new TestScores[5];
		
		//get data for objs
		for (int i = 0; i < testScoreObjs.length; i++) {
			
			ArrayList<Integer> _testScores = new ArrayList<>();
			
			for (int j = 1; j <= 2; j++) {
				System.out.printf("Test Day %d, Test %d score: ", i+1, j);
				_testScores.add(keys.nextInt());
			}
			System.out.println();
			testScoreObjs[i] = new TestScores(_testScores);
		}
		
		//create stream
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Lab1/NewObjects.dat"));
		
		//write serialized objs to file
		for (int i = 0; i < testScoreObjs.length; i++) {
			objectOutputStream.writeObject(testScoreObjs[i]);
		}
		
		objectOutputStream.close();
		keys.close();
		
		
		System.out.println("Objects Successfully Serialized!");
		

	}

}
