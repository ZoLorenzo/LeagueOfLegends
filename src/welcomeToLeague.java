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
        String role1 = "Top";
        String role2 = "Jungle";
        String role3 = "Mid";
        String role4 = "ADC";
        String role5 = "Support";

        //Create 





    }
}
