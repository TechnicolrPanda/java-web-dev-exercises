package exercises.chapter2;

import java.util.HashMap;

public class CountingCharacters {

    public static void main(String[] arr){
        String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String lowerHidden = hiddenFigures.toLowerCase();
        char[] stringArray = lowerHidden.toCharArray();

        HashMap<Character, Integer> values = new HashMap<Character, Integer>();

        for (char Character : stringArray){
            values.computeIfPresent(Character, (key, val) -> val + 1 );
            values.putIfAbsent(Character, 1);
        }

        System.out.println(values);

    }
}
