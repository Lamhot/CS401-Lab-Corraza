package lesson9.exercise_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntArrayExample {
	
	//What is the following code doing? What will be the output?
	public static void main(String[] args) {	
		List<Integer> ints = Arrays.asList(1,5,2,3,8);
		List<int[]> intArrs = ints.stream()
				                  .map(int[]::new) // create new int
				                  .collect(Collectors.toList());
		System.out.println(intArrs);
		List<String> intArrsStr = intArrs.stream()
				                         .map(Arrays::toString)
				                         .collect(Collectors.toList());
		System.out.println(intArrsStr);
	}
}
