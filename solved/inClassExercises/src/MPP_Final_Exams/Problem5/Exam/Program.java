package MPP_Final_Exams.Problem5.Exam;

import java.util.ArrayList;
import java.util.List;

public class Program {
	private String name;

	public Program(String n) {
		name = n;
		students = new ArrayList<>();
	}
	// You can write any method required here
	List<Student> students;
	
	public void addStd(Student s){
		students.add(s);
	}
	
	private List<Student> getstdlst() {
		return students;
	}
	
	private static Long totalFee(List<Student> getstdlst) {
		Long totalFee = 0L;
		/*
		 * Sol1 Prejava 8 with Polimorphism
		 */
		for(Student s :getstdlst)
			totalFee += s.grd.feeCal();

		/*
		 * Sol 2 Java 8 with Stream and Delegating
		 */
		Long total = getstdlst
					.stream()
					.mapToLong(Student::getTotal)
					.sum();
		
		return total;
	}
	
	public static void main(String args[]) {
		Program p = new Program("Data Science Program");
		Student std1 = new Student("Mahd", 1, new CS(4, 4));
		Student std2 = new Student("Davis", 1, new CS(3, 2));
		Student std3 = new Student("Rick", 1, new MIS(3, 3));
		p.addStd(std1);
		p.addStd(std2);
		p.addStd(std3);
		System.out.println("Total fee:" + Program.totalFee(p.getstdlst()));
	}

	



}
