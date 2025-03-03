package org;
import java.util.Scanner;
import java.util.regex.*;
public class StringProcessor
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of length 12 containing words:");
        String input = scanner.nextLine();
        scanner.close(); 
        if (input.isEmpty()) {
            System.out.println("null");
            return;
        }
        String[] words = input.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) 
            {
                longestWord = word;
            }
        }
        if (isPalindrome(longestWord)) 
        {
            System.out.println(longestWord.charAt(0) + " " + longestWord.charAt(longestWord.length() - 1));
        } 
        else
        {
            printVowels(longestWord);
        }
    }    
    private static boolean isPalindrome(String word) 
    {
        int left = 0, right = word.length() - 1;
        while (left < right) 
        {
            if (word.charAt(left) != word.charAt(right)) 
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }  
    private static void printVowels(String word)
    {
        Pattern vowelPattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher = vowelPattern.matcher(word);      
        while (matcher.find())
        {
            System.out.print(matcher.group() + " ");
        }
    }
}
