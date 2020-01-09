package MPP_Final_Exams.Problem5.Exam;

public interface Graduate 
{
	//You can change 
	static int scholarships(){
		return 2500;
	};
    default int feeCal(){
    	return getFee()*getCourse()+1000;
    }
    int getFee();
    int getCourse();
}
