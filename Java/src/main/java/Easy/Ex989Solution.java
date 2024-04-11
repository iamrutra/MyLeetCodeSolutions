import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution989 {

    public List<Integer> addToArrayForm(int[] num, int k) {
        //System.out.println(Arrays.toString(num));
        StringBuilder arrToIntBuilder = new StringBuilder();
        for (int n : num) {
            arrToIntBuilder.append(n);
        }

        String arrToInt = arrToIntBuilder.toString();

        BigInteger numBigInt = new BigInteger(arrToInt);

        // Добавление числа k к BigInteger
        numBigInt = numBigInt.add(BigInteger.valueOf(k));

        // Преобразование результата в строку
        String resultToString = numBigInt.toString();
        List<Integer> arrResult = new ArrayList<>();

        for (int i = 0; i<resultToString.length(); i++){
            char c = resultToString.charAt(i); // Получаем символ строки по индексу
            int digit = Character.getNumericValue(c); // Преобразуем символ в числовое значение
            arrResult.add(digit); // Добавляем числовое значение в список
        }
        return arrResult;
    }
}

public class Ex989Solution {
    public static void main(String[] args) {

        Solution989 solution = new Solution989();


        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(Arrays.toString(num) + " " + k);

        List<Integer> result = solution.addToArrayForm(num, k);


        System.out.println("Результат: " + result);
    }
}
