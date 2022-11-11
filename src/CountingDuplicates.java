
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        // Write your code here
        text = text.toLowerCase();
        int duplicates = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if(
                text.charAt(i) != '#' &&
                countDuplicatesInString(text, c) > 1
                )
            {
                text = text.replace(c, '#');
                duplicates++;
            }
        }
        return duplicates;
    }
    public static int countDuplicatesInString(String text, char c){
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            
            if(text.charAt(i) == c)
                count++;
        }
        return count;
    }
  }