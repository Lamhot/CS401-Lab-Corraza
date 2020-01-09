package MPP_Final_Exams.Problem5.Exam;

public class Student {
	String name;
	int id;

	// You can define any Data member or Method here
	Graduate grd;
	public Student(String n, int i, Graduate g) {
		name = n;
		id = i;
		grd = g;
	}
	
	public int getTotal(){
		return grd.feeCal();
	}

}
