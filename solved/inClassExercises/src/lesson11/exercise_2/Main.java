package lesson11.exercise_2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> x = new ArrayList<String>();
		x.add("Lamhot");
		x.add("Lamhot2");
		System.out.println(CountStringOccurrences.countOccurrences(x,"Lamhot"));
		
		List<Integer> x2 = new ArrayList<Integer>();
		x2.add(1);
		x2.add(5);
		System.out.println(CountStringOccurrences.countOccurrences(x2,1));
		

	}

}
