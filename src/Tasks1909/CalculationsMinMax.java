package Tasks1909;

import java.util.Scanner;

public class CalculationsMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type first number: ");
        String a = input.next();
        System.out.println("Type second number: ");
        String b = input.next();
        System.out.println("Type third number: ");
        String c = input.next();
        int ax = Integer.parseInt(a);
        int bx = Integer.parseInt(b);
        int cx = Integer.parseInt(c);
//        Max value
        if (ax>bx && ax>cx){
            System.out.println("Max number is "+ax);
        }
        else if (bx>ax &&bx>cx){
            System.out.println("Max number is "+bx);
        }
        else if (cx>ax &&cx>bx){
            System.out.println("Max number is "+cx);
        }
        else {
            System.out.println("Wrong results");
        }
//        Min value
        if (ax<bx && ax<cx){
            System.out.println("Min number is "+ax);
        }
        else if (bx<ax &&bx<cx){
            System.out.println("Min number is "+bx);
        }
        else if (cx<ax &&cx<bx){
            System.out.println("Min number is "+cx);
        }
        else {
            System.out.println("Wrong results");
        }
    }
}
