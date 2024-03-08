import java.util.Scanner;

class operators {
    public static void main (String[] args) {
        Scanner consoleReader = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number_01 = consoleReader.nextInt();

        System.out.print("Enter second number: ");
        int number_02 = consoleReader.nextInt();

        System.out.println("Bitwise AND:\t" + (number_01 & number_02));
        System.out.println("Bitwise OR:\t" + (number_01 | number_02));
        System.out.println("Bitwise XOR:\t" + (number_01 ^ number_02));
        System.out.println("Bitwise NOT:\t" + ~number_01);
        System.out.println("Bitwise Left Shift:\t" + (number_01 << number_02));
        System.out.println("Bitwise Right Shift:\t" + (number_01 >> number_02));
        System.out.println("Bitwise Unsigned Right Shift:\t" + (number_01 >>> number_02));
    }
}