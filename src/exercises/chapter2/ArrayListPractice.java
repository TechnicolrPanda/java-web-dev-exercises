package exercises.chapter2;

import java.util.ArrayList;

public class ArrayListPractice {

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(6);
        numbers.add(6);
        numbers.add(8);
        numbers.add(9);
        numbers.add(42);

        System.out.println(ArrayListPractice.sumEven(numbers));
    }

}
