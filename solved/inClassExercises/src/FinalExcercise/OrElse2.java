package FinalExcercise;

import java.util.Optional;

public class OrElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Optional<Integer> op 
         = Optional.empty(); 

     // print value 
     System.out.println("Optional: "
                        + op); 

     try { 

         // orElse value 
         System.out.println("Value by orElse"
                            + "(100) method: "
                            + op.orElse(100)); 
     } 
     catch (Exception e) { 
         System.out.println(e); 
     } 

	}

}
