import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class welcomeToLeague {
    public static void main(String[] args) {
        //Add the 'Scanner' class to the program:
        Scanner input = new Scanner(System.in);

        //Create a pop-up window to welcome the user:
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame, "Welcome to League of Legends");

        //Present the 'Role Selection Window' window to the user:
        String roleWindow;   //Variable for the dialog box
        roleWindow = JOptionPane.showInputDialog("Please select the role you would like to play: " + "Top, Jungle, Mid, Adc, or Support?");
        String roleSelect = (roleWindow);
        //Display the Role that the user selected:
        JOptionPane.showMessageDialog(frame, "You have selected your role!");
        JOptionPane.showMessageDialog(frame, "Refer to the terminal to continue.");

        //Declare the 5 Roles as variables:
        int roleTop = 1;
        int roleJungle = 2;
        int roleMid = 3;
        int roleADC = 4;
        int roleSupport = 5;

        //Ask the user to enter the role the selected in the display screen:
        System.out.println("Please enter the number that was assigned to the role you selected");
        System.out.println("Top [1], Jungle [2], Mid [3], ADC [4], or Support [5]" + " : ");
        int selectedRole = input.nextInt(); // <- the 'selected-role' variable declared + enterned by the user

        //Create an 'if-else' scenario: [started on 02.06.24 -- having trouble with this]
            if (selectedRole == 1) {
                System.out.println("Your position is the \"Top\" role. Your champions will be displayed in the pop-up!");
                JOptionPane.showMessageDialog(frame, "Champion List: Darius[1], Sett[2], Garen[3], Vayne[4], or Diana[5]"); 
                JOptionPane.showMessageDialog(frame, "Enter the champion you would like to select in the terminal.");
                System.out.println("Who would you like to play in the Top Lane?");
                     //declaring the variables for user to select their champion
                    int topDarius = 1, topSett = 2, topGaren = 3, topVayne = 4, topDiana = 5;
                System.out.print("Enter your champion here: ");
                int topChampSelected = input.nextInt();
                    if (topChampSelected == 1){
                        JOptionPane.showInputDialog("You chose Darius.");
                    } else if (topChampSelected == 2){
                        JOptionPane.showInputDialog("You chose Sett.");
                    } else if (topChampSelected == 3) {
                        JOptionPane.showInputDialog("You chose Garen.");
                    } else if (topChampSelected == 4) {
                        JOptionPane.showInputDialog("You chose Vayne.");
                    } else if (topChampSelected == 5){
                    JOptionPane.showInputDialog("You chose Diana.");
                    } else
                        System.out.println("Please select a listed champion.");

            }





    }
}
