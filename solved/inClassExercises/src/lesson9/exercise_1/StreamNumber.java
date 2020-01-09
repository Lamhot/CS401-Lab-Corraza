package lesson9.exercise_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ints = Arrays.asList(1, 2, 3, 5, 2, 3, 8, 9, 10, 11, 12, 13, 14, 15);

//		ints.stream()
//		.filter(val -> onlyOdd(val)
//				.collect(Collector.toList();

		// List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

		// Using Stream filter(Predicate predicate)
		// to get a stream consisting of the
		// elements that are divisible by 5
		ints.stream().filter(num -> num % 2 == 1 && num>8).forEach(System.out::println);
		
		
		Stream<Integer> infiniteStream = Stream.iterate(1, i -> i +2);

	    List<Integer> collect = infiniteStream
	      .skip(3)
	      .limit(5)
	      .collect(Collectors.toList());
	    
	    System.out.println(collect);
	    
	    

	//	Optional<String> largesr =accounts.stream().max(String::compareToIgnoreCase);
		
		List<String> words = Arrays.asList("aaaaaaaaaaaaaaaaaa","b");
				int numLongWords= (int) words.stream()
				.filter(w -> w.length() > 12)
				.count();
				
				System.out.println(numLongWords);


	}

}
