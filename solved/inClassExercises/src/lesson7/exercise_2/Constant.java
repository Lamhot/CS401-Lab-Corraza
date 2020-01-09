package lesson7.exercise_2;

public enum Constant {
	COMPANY("Microsoft"),
	SALES_TARGET(20000000);
	
	private String name;
	private int target;
	 
    Constant(String name) {
        this.name = name;
    }
    Constant(int target) {
        this.target= target;
    }
 
    public String getName() {
        return name;
    }
    
    public int getTarget() {
        return target;
    }

}
