package Tasks1909;

import java.util.Scanner;

public class CaclulationsDevided5and7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type first number: ");
        String a = input.next();
        int ax = Integer.parseInt(a);
        if (ax%5==0&&ax%7==0){
            System.out.println("This number is devided by 5 and 7 ");
        }
        else System.out.println("This number is NOT devided by 5 and 7 ");
        System.out.println("Type second number: ");
        String b = input.next();
        int bx = Integer.parseInt(b);
        if (bx%5==0&&bx%7==0){
            System.out.println("This number is devided by 5 and 7 ");
        }
        else System.out.println("This number is NOT devided by 5 and 7");
        System.out.println("Type third number: ");
        String c = input.next();
        int cx = Integer.parseInt(c);
        if (cx%5==0&&cx%7==0){
            System.out.println("This number is devided by 5 and 7 ");
        }
        else System.out.println("This number is NOT devided by 5 and 7");


    }
}

