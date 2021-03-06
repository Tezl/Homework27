package duplicatingLetters;


import java.util.function.Function;

public class Main {

    static String s;
    private static Object String;


    public static void main(String[] args) {

        Function<String, String> duplicateLetters = stringToDuplicateLetters ->
                (java.lang.String) String;
        s = "test";
        String result = "";
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            result = result + c + c;
            i++;
            System.out.println(result);
        }

    }

    public static void changeString(String string, Function<String, String> function) {

        String newString = function.apply(string);
        System.out.println(newString);

    }


}
