package exercises.chapter2;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){
        int[] someInts = {1, 1, 2, 3, 5, 8};

        for (int i: someInts) {
            if ( i%2 == 1){
                System.out.println(i);
            }
        }

        String samIam = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] greenEggs = samIam.split(" ");

        System.out.println(Arrays.toString(greenEggs));

        String[] andHam = samIam.split("\\.");
        System.out.println(Arrays.toString(andHam));
    }
}
