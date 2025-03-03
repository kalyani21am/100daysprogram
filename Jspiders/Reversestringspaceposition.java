package org;

public class Reversestringspaceposition {

    public static void main(String[] args) {
        String s = "E sala cup Namde";
        
        // Convert the string to a character array
        char[] charArray = s.toCharArray();
        
        // We will use two pointers: one from the start and one from the end.
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            // Skip spaces on the left
            if (charArray[left] == ' ') {
                left++;
            }
            // Skip spaces on the right
            else if (charArray[right] == ' ') {
                right--;
            }
            // Swap characters if both are not spaces
            else {
                // Swap characters
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                
                // Move both pointers
                left++;
                right--;
            }
        }
        
        // Convert the character array back to a string and print it
        String result = new String(charArray);
        System.out.println(result);
    }
}
