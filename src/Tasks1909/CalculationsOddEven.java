package Tasks1909;

import java.util.Scanner;

public class CalculationsOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type first number: ");
        String a = input.next();
        int ax = Integer.parseInt(a);
        if (ax%2==0){
            System.out.println("This number is even");
        }
        else System.out.println("This number is odd");
        System.out.println("Type second number: ");
        String b = input.next();
        int bx = Integer.parseInt(b);
        if (bx%2==0){
            System.out.println("This number is even");
        }
        else System.out.println("This number is odd");
        System.out.println("Type third number: ");
        String c = input.next();
        int cx = Integer.parseInt(c);
        if (cx%2==0){
            System.out.println("This number is even");
        }
        else System.out.println("This number is odd");


    }
}
