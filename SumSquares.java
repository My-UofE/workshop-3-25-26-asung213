import java.util.Scanner;

import javax.sound.midi.Sequence;

public class SumSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        // System.out.print("Enter your name: ");

        // Read in line from standard input
        // String name = in.nextLine();

        // System.out.println("Hi " + name + "!");


        System.out.print("Please enter the start value: ");
        // Reads in an int from standard input
        int startNum = in.nextInt();

        // clear any additonal text that remains uncollected 
        in.nextLine();
        
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("Sum of squares from " + startNum + " to " + endNum);
        int total = 0;
        for (int i = startNum; i <= endNum; i++){
            total += i * i;
        }
        System.out.println(total);
    }
    
}
