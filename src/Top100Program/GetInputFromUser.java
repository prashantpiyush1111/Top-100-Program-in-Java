package Top100Program;

import java.util.Scanner;

public class GetInputFromUser {
    public static void main(String args[]){
        int a;
        float b;
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sting");
        s=sc.nextLine();
        System.out.println(s);

        System.out.println("Enter a number");
        a=sc.nextInt();
        System.out.println(a);


        System.out.println("Enter a number");
        b=sc.nextInt();
        System.out.println(b);


    }
}
