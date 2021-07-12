import java.util.ArrayList;
import java.util.Scanner;

public class PlayerSection {
    public static void main(String[] args) {
        ArrayList<String> players = new ArrayList<String>();


        int round = 0;
        while (round != 99) {
            System.out.println("Enter 'A' to add a player");
            System.out.println("Enter 'V' to view all players");
            System.out.println("Enter 'B' to display two best batsmen");
            System.out.println("Enter 'C' to display two best bowlers");
            System.out.println("Enter 'D' to display the best keeper");

            System.out.println("");
            Scanner input = new Scanner(System.in);
            System.out.println("Your selection: ");
            String user = input.next();
            switch (user) {
                case "A":
                    //Adding players method
                    break;
                case "V":
                    //Viewing player details method
                    break;
                case "B":
                    //Displaying best two batsmen method
                    break;
                case "C":
                    //Displaying best two bowlers method
                    break;
                case "D":
                    //Displaying best keeper
                    break;
                default:
                    System.out.println("Invalid selection!");
            }


        }
    }
}