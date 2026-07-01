import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class PasswordTest {
    void main() {
        JPasswordField passwordField = new JPasswordField();
        JOptionPane.showMessageDialog(
                null,
                new Object[] {"Пароль", passwordField}
        );
        String userInput = new String(passwordField.getPassword());

        if (userInput.equals("swordfish")) {
            JOptionPane.showMessageDialog(null, "You're in.");
        } else {
            JOptionPane.showMessageDialog(null, "You're suspicious.");
        }
    }
}

