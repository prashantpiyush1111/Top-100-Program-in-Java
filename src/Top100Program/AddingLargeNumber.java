package Top100Program;
import java.util.Scanner;
import java.math.BigInteger;

class AddingLargeNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first large number:");
        String number1 = in.nextLine();

        System.out.println("Enter second large number:");
        String number2 = in.nextLine();

        BigInteger first = new BigInteger(number1);
        BigInteger second = new BigInteger(number2);

        BigInteger sum = first.add(second);

        System.out.println("Result of addition = " + sum);

        in.close();
    }
}
