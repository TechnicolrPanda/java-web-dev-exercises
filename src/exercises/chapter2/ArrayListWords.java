package exercises.chapter2;

import java.util.ArrayList;

public class ArrayListWords {

    public static void five(ArrayList<String> arr){
        for (String word: arr){
            if(word.length() == 5){
                System.out.println(word);
            }
        }
    }
    public static void main(String[] arr){
        ArrayList<String> words = new ArrayList<String>();
            words.add("Poppy");
            words.add("cat");
            words.add("tuba");
            words.add("pancake");
            words.add("apple");

            ArrayListWords.five(words);
    }




}
