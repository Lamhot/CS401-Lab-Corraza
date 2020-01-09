package lamda;

public class StringOrder {
    public static int byLength(String s1, String s2) {
        return s1.length() - s2.length();
    }

    public static int byLexicography(String s1, String s2) {
        return s1.compareTo(s2);
    }
   
    public static int byLexicographyIgnoreCase(String s1, String s2) {
        return s1.compareToIgnoreCase(s2);
    }
    
    public static void convertUppercase(String s1)
    {
    	s1.toUpperCase();
    }
   
}