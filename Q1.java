import java.util.Scanner;

class profilePrint {
    public static void main (String[] args) {
        Scanner consoleReader = new Scanner(System.in);

        System.out.print("\nName: ");
        String userName = consoleReader.nextLine();
        
        System.out.print("Age: ");
        int userAge = consoleReader.nextInt();

        System.out.print("Weight: ");
        float userWeight = consoleReader.nextFloat();

        System.out.println("\nName: " + userName);
        System.out.println("Age: " + userAge + " years");
        System.out.println("Weight: " + userWeight + "Kg");
    }
}