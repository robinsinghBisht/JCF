package jcf.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//**Problem 2: Password validator (string manipulation)**
//
//Return 1 if valid, 0 otherwise.
// Rules: ≥4 characters,at least one digit,
// at least one uppercase letter, no spaces or `/`, first character not a digit.
//        Input: `"aB1cdef"` → Output: `1` | Input: `"1abc"` → Output: `0`

public class PasswordValidator {

    public static int checkPassword(String str, int n) {
        if (n < 4 || Character.isDigit(str.charAt(0))) return 0;
        boolean hasDigit = false, hasUpper = false;
        for (char c : str.toCharArray()) {
            if (c == ' ' || c == '/') return 0;
            if (Character.isDigit(c)) hasDigit = true;
            if (Character.isUpperCase(c)) hasUpper = true;
        }
        return (hasDigit && hasUpper) ? 1 : 0;
    }

    public static void main(String[] args) {
     String arr = "aB1acdef";
        System.out.println( checkPassword(arr, arr.length()));
    }
}
