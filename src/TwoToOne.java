import java.util.Arrays;

/*
Take 2 strings s1 and s2 including only letters from a to z. 
 
Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.  
Examples:
a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"
a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
*/


public class TwoToOne {
    public static String longest (String s1, String s2) {
        /*char[] s1CharArray = s1.toCharArray();
        Arrays.sort(s1CharArray);
        s1 = new String (s1CharArray);
        s1 = recomposeString(s1);
        
        char[] s2CharArray = s2.toCharArray();
        Arrays.sort(s2CharArray);
        s2 = new String (s2CharArray);
        s2 = recomposeString(s2);*/
        String s3 = s1+s2;
        char[] s3CharArray = s3.toCharArray();
        Arrays.sort(s3CharArray);
        s3 = new String (s3CharArray);

        return recomposeString(s3);
    }

    public static String recomposeString(String s){
        String newS = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!newS.contains( Character.toString(c) ) ){
                newS += c;
            }
        }
        

        return newS;
    }
}