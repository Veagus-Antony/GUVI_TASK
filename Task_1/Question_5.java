package JAVA_1;

import java.util.Scanner;

public class Question_5 {

    public static void main(String[] args) {

        Scanner purchse_amount = new Scanner(System.in);

        System.out.println("Enter the Amount :");

        int purchase_amount = purchse_amount.nextInt();

        if(purchase_amount > 500 && purchase_amount < 1000){

            int d = purchase_amount * 10 / 100;

            System.out.println((purchase_amount - d) + " 10% discount has been applied and " + "discount value is " + d);

        } else if (purchase_amount > 1000){

            int d = purchase_amount * 20 / 100;

            System.out.println((purchase_amount - d) + " 20% discount has been applied and " + "discount value is " + d);
        }
        else {

            System.out.println(purchase_amount + " No discounts are applied");
        }

    }
}
