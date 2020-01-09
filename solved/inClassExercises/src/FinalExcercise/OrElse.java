package FinalExcercise;

import java.util.Optional;

public class OrElse {

	public static void main(String[] args) {
		Optional<Integer> op 
        = Optional.of(null); 

    // print value 
    System.out.println("Optional: "
                       + op); 

    // orElse value 
    System.out.println("Value by orElse"
                       + "(100) method: "
                       + op.orElse(100)); 
    
    

	}

}
