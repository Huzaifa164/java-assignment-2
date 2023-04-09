import java.util.Scanner;
import java.lang.Integer;

public class q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scn.nextInt();
        String binNumber = Integer.toBinaryString(number);
        System.out.println("Binary number: " + binNumber);
        String octNumber = Integer.toOctalString(number);
        System.out.println("Octal number: " + octNumber);
        String hexNumber = Integer.toHexString(number);
        System.out.println("Hexadecimal number: " + hexNumber);
    }
}
