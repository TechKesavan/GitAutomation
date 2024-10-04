package javaPrograms;


public class CountsomeCharacters {
    public static void main(String[] args) {
        String input = "selenium automation";
        int countA = 0, countO = 0,countE=0;

        // Convert the string to lowercase to ensure case-insensitive comparison
        input = input.toLowerCase();

        // Loop through each character in the string
        for (char c : input.toCharArray()) {
            if (c == 'a') {
                countA++;
            } else if (c == 'o') {
                countO++;
            }
            else if(c=='e'){
            	countE++;
            }
        }

        System.out.println("Number of 'a': " + countA);
        System.out.println("Number of 'o': " + countO);
        System.out.println("Number of 'e': " + countE);

    }
}