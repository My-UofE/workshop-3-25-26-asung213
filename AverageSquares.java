import java.util.Scanner;

public class AverageSquares {
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
        double startNum = in.nextInt();

        // clear any additonal text that remains uncollected 
        in.nextLine();
        
        System.out.print("Please enter the end value: ");
        double endNum = in.nextInt();

        System.out.println("Average of squares from " + startNum + " to " + endNum);

        double total = 0;
        double i = startNum;
        double num = 0;

        do{
            total += i * i;
            ++i;
            num++;

        } while (i <= endNum);

        System.out.println(total/num);
    }
    
}
