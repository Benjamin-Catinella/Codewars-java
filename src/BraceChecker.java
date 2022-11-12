import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
https://www.codewars.com/kata/5277c8a221e209d3f6000b56

Write a function that takes a string of braces, and determines if the order of the braces is valid. It should return true if the string is valid, and false if it's invalid.

This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}. Thanks to @arnedag for the idea!

All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
What is considered Valid?

A string of braces is considered valid if all braces are matched with the correct brace.
Examples

"(){}[]"   =>  True
"([{}])"   =>  True
"(}"       =>  False
"[(])"     =>  False
"[({})](]" =>  False


*/
public class BraceChecker {

    public static boolean isValid(String braces) {
        ArrayList<String> openedBracesMap = new ArrayList<String>( Arrays.asList("[","(","{") );
        ArrayList<String> closedBracesMap = new ArrayList<String>( Arrays.asList("]",")","}") );
        HashMap<String, String> bracesMap = new HashMap<String, String>();
        //Initialize map
        for (int i = 0; i < openedBracesMap.size(); i++) {
            bracesMap.put(openedBracesMap.get(i), closedBracesMap.get(i));
        }

        ArrayList<Character> openedBraces = new ArrayList<Character>();
        for (int i = 0; i < braces.length(); i++) {
            Character c = braces.charAt(i);
            //If is opening brace
            if ( openedBracesMap.contains(c.toString()) ) {
                if(i == braces.length()-1 )
                    return false;
                openedBraces.add(c);
            }
            //else is closing brace 
            else {
                //return false if first occurence is a closing bracket or openedBraces is empty
                if( i == 0 || openedBraces.size() == 0)
                    return false;
                // and last added opening brace corresponds to the current closing brace
                if(c.toString().equals( bracesMap.get( openedBraces.get( openedBraces.size()-1 ).toString() ) ) )
                    openedBraces.remove(openedBraces.size()-1);
                else
                    return false;
            }
        }

        //if openedBraces isn't empty, it means we didn't close all brackets thus we return false.
        return openedBraces.size() == 0 ;
    }

}