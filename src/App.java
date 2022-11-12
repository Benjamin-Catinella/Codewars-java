import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(BraceChecker.isValid("())({}}{()][][") );
        System.out.println(BraceChecker.isValid("({})[({})]") );
        System.out.println(BraceChecker.isValid("([{}])") );
        System.out.println(BraceChecker.isValid("(((((((({({[[") );
        System.out.println(BraceChecker.isValid(")(}{][") );
    }
}


