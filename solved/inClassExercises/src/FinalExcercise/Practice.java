package FinalExcercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Practice {

	public static void main(String args[]) {

		/*
		 * 
		 * In addition to an SCI question at the end, the exam will consist of 6
		 * programming questions selected from the following areas: 
		 * 1. Overriding equals
		 * and also sorting using Comparators (must use comparing and thenComparing),
		 * following best practices (i.e., comparisons should be consistent with equals)
		 * . You should be ready to override hashCode() whenever you override equals()
		 * 2. Solve problems using stream pipelines; then generalize your solutions to
		 * Lambda Library elements. Finally, replace lambdas with inner classes. (Like
		 * the quiz) 3. Given a lambda expression, find an appropriate type for it, name
		 * it with a (typed) variable, rewrite it as a method reference, state which
		 * type of method reference it is, and finally, rewrite the lambda expression as
		 * an inner class that implements the functional interface that represents the
		 * lambda expression. (Like Lab 8, Problem 6) 4. Write code that handles a
		 * situation in which one of the lambdas in a stream pipeline needs to throw a
		 * checked exception but cannot because the functional interface it implements
		 * does not permit an exception to be thrown (use one of the techniques
		 * mentioned in Lesson 10; see Problems 5 and 6 in Lab 10). 5. Use the reduce
		 * method on Streams to solve a problem. 6. Create the most general possible
		 * method (a “generic method”) to solve some problem (like finding max element
		 * of a list, finding second largest element of a list). 7. The Java 8 features
		 * of interfaces (static and default methods) and best practices for using them.
		 * 
		 */

		/* Stream API operations that you should know: */
		// of
		Stream<String> stream = Stream.of("Geeks", "for", "Geeks");
		// Displaying the sequential ordered stream
		stream.forEach(str -> System.out.println(str + " "));
		// output Geeks for Geeks

		// iterate, limit, skip

		Stream<Integer> infiniteStream = Stream.iterate(1, i -> i + 2);

		List<Integer> collect = infiniteStream.skip(4).limit(4).collect(Collectors.toList());

		System.out.println(collect);
		// output 9,11,13,15
        
		Stream<String> strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
		
		System.out.println(Stream.of("A", "good", "day", "to", "write", "some", "Java").reduce("",
				(s, t) -> (new StringBuilder(s)).append(t + " ").toString()));

		Optional<String> s = strings.reduce((x, y) -> x + " " + y);
		System.out.println(s.orElse("The string is null"));		// filter

		List<Integer> ints = Arrays.asList(1, 2, 3, 5, 2, 3, 8, 9, 10, 11, 12, 13, 14, 15);

//		ints.stream()
//		.filter(val -> onlyOdd(val)
//				.collect(Collector.toList();

		// List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

		// Using Stream filter(Predicate predicate)
		// to get a stream consisting of the
		// elements that are divisible by 5
		ints.stream().filter(num -> num % 2 == 1).skip(4).limit(4).forEach(System.out::println);

		// map

		List<Integer> listOfIntegers = Stream.of("1", "2", "3", "4").map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(listOfIntegers);

		// flatMap

		List<Integer> evens = Arrays.asList(2, 4, 6);
		List<Integer> odds = Arrays.asList(3, 5, 7);
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);

		List<Integer> numbers = Stream.of(evens, odds, primes).flatMap(list -> list.stream())
				.collect(Collectors.toList());

		System.out.println("flattend list: " + numbers);

		// Output:
		// flattend list: [2, 4, 6, 3, 5, 7, 2, 3, 5, 7, 11]

		// reduce
		System.out.println(
				Stream.of("A", "good", "day", "to", "write", "some", "Java").reduce("", (w, t) -> w + t + " "));
		// distinct
		Stream<String> list = Stream.of("1", "2", "3", "4");

		list.map(c -> c.length())
		.distinct()
		.sorted()
		.collect(Collectors.toList());
		// sorted (should also know Comparator.comparing and Comparator's thenComparing)
		
		List<Employee> list2 = new ArrayList<Employee>();
		Function<Employee,Integer> bySalary = e -> e.getSalary();
		Function<Employee, String> byName = e-> e.getName();
		System.out.println(list2.stream()
								.sorted(Comparator.comparing(byName).thenComparing(Comparator.comparing(bySalary, Comparator.reverseOrder())))
								.collect(Collectors.toList()));		
		// reversed
		List<String> words = Arrays.asList("Tom", "Joseph", "Richard");
		Stream<String> longestFirst  
		    = words.stream().sorted(Comparator.comparing(String::length).reversed());
		System.out.println(longestFirst .collect(Collectors.toList()));
		// count
		final long count = words.stream().filter(w->w.length()>1).count();
		// max (need to know how the Optional class works)
		Optional<String> largest = words.stream()
				.max(String::compareToIgnoreCase);
		if(largest.isPresent())
			System.out.println(largest.get());
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		Function<Employee,Integer> salaryP = e -> e.getSalary();
		Function<Employee,String> salaryS= e->e.getName();
		System.out.println(list2.stream()
				.sorted(Comparator.comparing(salaryP).
						thenComparing(Comparator.comparing(salaryS,Comparator.reverseOrder())))
						.collect(Collectors.toList()));
		// findFirst
		
		Optional<String> ff = words.stream()
				.findFirst();
		if(largest.isPresent())
			System.out.println(ff.get());
		
		
	}
}
