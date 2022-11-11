import java.util.*;
public class StringSplit {
    public static String[] solution(String s) {
        //Write your code here
        ArrayList<String> sList = new ArrayList<>();
        for (int i = 0; i < s.length(); i+=2) {
            sList.add(i == s.length()-1 ? s.charAt(i) + "_" : s.charAt(i) + "" +s.charAt(i+1) );
        }
        return sList.toArray(new String[sList.size()]);
    }
}