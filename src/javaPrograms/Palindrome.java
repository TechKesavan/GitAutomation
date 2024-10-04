package javaPrograms;

public class Palindrome {

	public static void main(String[] args) {
	    String s1 = "Madam";
        String s2="";
        
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2=s2+s1.charAt(i);
        }
        
        if(s1.equals(s2)){
        System.out.println("Entered string is a Palindrome");
        }
        else{
        System.out.println("Entered string is a not a Palindrome");
        }
	}

}
