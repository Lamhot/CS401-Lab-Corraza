package FinalExcercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating a List of Integers 
        List<Integer> list = Arrays.asList(3, 4, 6, 8, 10); 
  
        // Using Stream findAny() to return 
        // an Optional describing some element 
        // of the stream 
        Optional<Integer> answer = list.stream().findAny(); 
        Optional<Integer> answer2 = list.stream().findFirst() ;
        Optional<Integer> answer3 = list.stream().max(Integer::compare);
        // for minimum
        System.out.println(answer3); 
        
        if (answer3.isPresent()) { 
            System.out.println(answer3.get()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
        
        System.out.println(answer2); 
  
        // if the stream is empty, an empty 
        // Optional is returned. 
        if (answer.isPresent()) { 
           // System.out.println(answer.get()); 
        } 
        else { 
            System.out.println("no value"); 
        } 

	}

}
