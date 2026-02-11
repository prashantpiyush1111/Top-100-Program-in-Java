import java.util.Scanner;

class AddNumbers {
    public static void main(String[] args) {

        int x, y, z;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number:");
        x = in.nextInt();

        System.out.println("Enter second number:");
        y = in.nextInt();

        z = x + y;

        System.out.println("Sum = " + z);

        in.close();
    }
}
