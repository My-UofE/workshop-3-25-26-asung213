import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // System.out.print("Please enter a value between 1 and 5: ");
        // Reads in an int from standard input
        int value = 1;
        do{
            if (value > 5){
                System.out.println("Too Big!");
            } else if (value < 1){
                System.out.println("Too Small!");
            }
            
            System.out.print("Please enter a value between 1 and 5: ");
            // Reads in an int from standard input
            value = in.nextInt();

        } while (value > 5 || value < 1);

        int range = value;
        for (int row = 1; row <= value; row ++){
            for (int col = row; col <= range; col ++){
                System.out.print(col);
            }

            for (int col = range; col >= row; col --){
                System.out.print(col);
            }
            range++;
            System.out.println("");
        }
        for (int row = value; row >= 1; row --){
            range--;
            for (int col = row; col <= range; col ++){
                System.out.print(col);
            }

            for (int col = range; col >= row; col --){
                System.out.print(col);
            }
            System.out.println();
        }
        
        in.close();
    }
    
}
