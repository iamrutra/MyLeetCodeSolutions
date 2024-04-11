import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution2299 {

    public boolean strongPasswordCheckerII(String password) {

        int l = password.length();

        boolean isUpper = false;
        boolean isLower = false;
        boolean isDigit = false;
        boolean isSpec = false;


            for (int i = 0; i < password.length() - 1; i++) {
                if (password.charAt(i) == password.charAt(i + 1)) return false;
            }

            for (char chr : password.toCharArray()) {
                if (Character.isUpperCase(chr)) {
                    isUpper = true;
                }
                else if (Character.isLowerCase(chr)) {
                    isLower = true;
                }
                else if (Character.isDigit(chr)) {
                    isDigit = true;
                }
                else if ("!@#$%^&*()-+".indexOf(chr) != -1) {
                    isSpec = true;
                }
            }
        boolean hasAllTypes = isUpper && isLower && isDigit && isSpec;
        return l>=8 && hasAllTypes;
    }
}

public class Ex2299Solution {
    public static void main(String[] args) {
        Solution2299 solution = new Solution2299();
        String pass = "Sigma129!";
        solution.strongPasswordCheckerII(pass);
        System.out.println(solution.strongPasswordCheckerII(pass));
    }
}
