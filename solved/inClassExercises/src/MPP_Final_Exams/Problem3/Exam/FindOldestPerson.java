package MPP_Final_Exams.Problem3.Exam;

import java.util.List;

//DO NOT MODIFY METHOD SIGNATURE OR STATIC QUALIFIER
public class FindOldestPerson {
	public static Person findOldestPerson(List<Person> persons) {
		
		return persons.stream()
				.reduce((x,y)->x.getAge()>y.getAge()? x:y).get();
	}
	
	
}
