package JAVA_1;

public class Question_4 {

    public static void main(String[] args) {

        int a = 25,b = 30,c = 15;

        if (a <= b && a<=c){

            System.out.println(a + " is the smallest");
        } else if (b <= a && b <=c) {
            System.out.println(b + " is the smallest");
        }
        else{
            System.out.println(c + " is the smallest");
        }

    }
}
