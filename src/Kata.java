public class Kata {
    public static boolean solution(String str, String ending) {
        int y = ending.length()-1;
        //Filter out bad input
        if( ending.length() > str.length())
            return false;
        for (int i = str.length()-1; y >= 0; i--, y--) {
            if (!(ending.charAt(y) == str.charAt(i))) {
                return false;
            }
        }

      return true;
    }
    public static boolean solution2(String str, String ending){
        return str.endsWith(ending);
    }
  }