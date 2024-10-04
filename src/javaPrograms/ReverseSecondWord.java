package javaPrograms;

public class ReverseSecondWord {

	public static void main(String[] args) {
		 
        String input ="automation java selenium";
        
        // Split the string into words
        String[] words = input.split(" ");
        
        // Check if there are at least two words
        if (words.length >= 2) {
            
            words[1] = new StringBuilder(words[1]).reverse().toString();
            
            // Join the words back into a single string
            String result = String.join(" ", words);
            
            // Display the result
            System.out.println("Result: " + result);
        }
        else {
             System.out.println("The string must contain at least two words.");
        }
	}

}
