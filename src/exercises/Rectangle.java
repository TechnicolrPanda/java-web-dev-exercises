package exercises;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle?");
        Integer length = input.nextInt();

        System.out.println("What is the width of the rectangle?");
        Integer width = input.nextInt();

        Integer area = length * width;
        input.close();

        System.out.println("The area of a rectangle with " + length + " length and " + width +" width is " + area);
    }
}
