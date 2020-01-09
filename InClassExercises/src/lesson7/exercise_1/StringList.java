package lesson7.exercise_1;

public interface StringList {
		
	String[] strArray();
	int size();
	void incrementSize();
	
	/** Adds a string to the end of the list */
	public void add(String s);
	
	/** Gets the i_th string in the list */
	public String get(int i);
	
}
