package MPP_Final_Exams.Problem5.Exam;

public class MIS implements Graduate {
	int fee;
	int courses;

	public MIS(int f, int c) {
		fee = f;
		courses = c;
	}

	@Override
	public int feeCal() {
		return getFee() * getCourse() + 1700;
	}

	@Override
	public int getFee() {
		return this.fee;
	}

	@Override
	public int getCourse() {
		return this.courses;
	}

}
