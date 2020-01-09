package FinalExcercise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Creating a List of Strings 
        List<String> list = Arrays.asList("Geeks", "for", 
                                          "GeeksQuiz", "GFG"); 
  
        // Using Stream findAny() to return 
        // an Optional describing some element 
        // of the stream 
        Optional<String> answer = Optional.empty();
  
        // if the stream is empty, an empty 
        // Optional is returned. 
        if (answer.isPresent()) { 
            System.out.println(answer.get() +  answer.orElse("empty")); 
        } 
       String x = null;
       
     //   opt.orElse("Buka");
        System.out.println(Optional.ofNullable(x).orElse("Koma"));
      

	}

}
