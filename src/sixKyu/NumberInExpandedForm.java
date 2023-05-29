package sixKyu;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberInExpandedForm {
    public static void main(String[] args) {
//        System.out.println(expandedForm(9000000));
        System.out.println(expandedFormWithStream(9000000));
    }

    public static String expandedFormWithStream(int num) {
        String numStr = String.valueOf(num);
        return IntStream.range(0, numStr.length()).mapToObj(i -> getNumberWithZeroes(i, numStr)).filter(el -> el.length() > 0).collect(Collectors.joining(" + "));
    }

    public static String getNumberWithZeroes(int i,  String number) {
        char c = number.charAt(i);
        if('0' != c) {
            return String.valueOf(Character.getNumericValue(c) * (int)Math.pow(10, number.substring(i).length() - 1));
        }
        return "";
    }

    public static String expandedForm(int num) {
        String[] digitChars = String.valueOf(num).split("");
        StringBuilder res = new StringBuilder();
        String delimeter = "";
        for (int i  = 0; i < digitChars.length; i++) {
            if(!"0".equals(digitChars[i])) {
                String digit = digitChars[i] + getZeroes(digitChars.length - i - 1);
                if(i > 0) delimeter = " + ";
                res.append(delimeter + digit);
            }
        }

        return res.toString();
    }

    public static String getZeroes(int counter) {
        return "0".repeat(counter);
    }
}
