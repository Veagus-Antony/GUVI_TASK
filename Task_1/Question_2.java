package JAVA_1;

import java.util.Scanner;

public class Question_2 {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        System.out.println("Enter a Number: ");

        int age = number.nextInt();

        if (age > 0){
            System.out.println(age + " is a Positive Number");
        }
        else {
            System.out.println(age + " is a Negative Number");

        }

    }
}
