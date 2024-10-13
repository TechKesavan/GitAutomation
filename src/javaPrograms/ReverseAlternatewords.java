package javaPrograms;

public class ReverseAlternatewords {

	public static void main(String[] args) {
		 
        String input ="automation java selenium scrips";
        
        // Split the string into words
        String[] words = input.split(" ");
        
        for(int i=0;i<words.length;i++)
        if (i%2 != 0) {
            
            words[i] = new StringBuilder(words[i]).reverse().toString();
            
            // Join the words back into a single string
          //  String result = String.join(" ", words);
            
           
        }
        System.out.println(String.join(" ", words));
	}
}
