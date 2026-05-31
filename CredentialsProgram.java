import javax.swing.JOptionPane;

public class CredentialsProgram {
    public static void main(String[]args){

        // Ask for username
        String username =
    JOptionPane.showInputDialog("Enter username: ");

        // Ask for password
        String password = 
    JOptionPane.showInputDialog("Enter password: ");

        // Check credentials
        if (username.equals("Hero") && password.equals("Zero")){
            JOptionPane.showMessageDialog(null,"Access Granted");
        } else {
            JOptionPane.showMessageDialog(null,"Incorrect Credentials");
        }
    }
}
