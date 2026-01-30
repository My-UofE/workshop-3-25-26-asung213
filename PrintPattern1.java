import java.util.Scanner;

public class PrintPattern1 {
     public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        // System.out.print("Enter your name: ");

        // Read in line from standard input
        // String name = in.nextLine();

        // System.out.println("Hi " + name + "!");


        System.out.print("Please enter a value: ");
        // Reads in an int from standard input
        int value = in.nextInt();

        for (int row = 1; row <= value; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println("");
        }
    }
}
