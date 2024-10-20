package JAVA_1;

import java.util.Scanner;

public class Question_3 {

    public static void main(String[] args) {

        Scanner numbr = new Scanner(System.in);

        System.out.println("Enter a Number: ");

        int number = numbr.nextInt();

        int reverse = 0;

        for (int input = number; input != 0; input /= 10) {
            int digit = input % 10; // Get the last digit
            reverse = reverse * 10 + digit;

        }
        System.out.println(reverse);

    }
}
