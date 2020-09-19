package Tasks1909;

import java.util.Scanner;

public class CalculationsDevided3or9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type first number: ");
        String a = input.next();
        int ax = Integer.parseInt(a);
        if (ax%3==0||ax%9==0){
            System.out.println("This number is devided by 3 or 9 ");
        }
        else System.out.println("This number is NOT devided by 3 or 9 ");
        System.out.println("Type second number: ");
        String b = input.next();
        int bx = Integer.parseInt(b);
        if (bx%3==0||bx%9==0){
            System.out.println("This number is devided by 3 or 9 ");
        }
        else System.out.println("This number is NOT devided by 3 or 9");
        System.out.println("Type third number: ");
        String c = input.next();
        int cx = Integer.parseInt(c);
        if (cx%3==0||cx%9==0){
            System.out.println("This number is devided by 3 or 9 ");
        }
        else System.out.println("This number is NOT devided by 3 or 9");


    }
}
