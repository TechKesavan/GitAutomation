package javaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		  String input = "Automation";
	        String reversed="";
	        
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed=reversed+input.charAt(i);
	        }
	        
	        // Display the reversed string
	        System.out.println("Reversed string: " + reversed);
	}

}
