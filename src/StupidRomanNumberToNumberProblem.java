import java.util.HashMap;
import java.util.Scanner;

public class StupidRomanNumberToNumberProblem {

    public static void main(String[] args) {

        HashMap<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter tests:");
        int tests = sc.nextInt();
        int result = 0;
        int j = 0;

        System.out.println("Enter Roman:");
        String romanNumber = sc.next();

        while (j < romanNumber.length() - 1) {
            if (romanToIntMap.containsKey(romanNumber.charAt(j))) {
                if (romanToIntMap.get(romanNumber.charAt(j)) < romanToIntMap.get(romanNumber.charAt(j + 1))) {
                    result = result - romanToIntMap.get(romanNumber.charAt(j));
                } else {
                    result = result + romanToIntMap.get(romanNumber.charAt(j));
                }
            }
            j++;
        }
        result = result + romanToIntMap.get(romanNumber.charAt(romanNumber.length() - 1));
        System.out.println(result);
    }
}