import javax.swing.JOptionPane;
public class UsernamePassword {
    void main () {
        String username = JOptionPane.showInputDialog("User name: ");
        String password = JOptionPane.showInputDialog("User password: ");
        if (username != null && password != null) {
            if (
                    (username.equals("JohnCarmack")) && (password.equals("DOOM"))
                            ||
                            (username.equals("EdBoon")) && (password.equals("MortalKombat"))
            ) {
                JOptionPane.showMessageDialog(null, "Успешный вход");
            } else {
                JOptionPane.showMessageDialog(null, "Что-то пошло не так");
            }
        }
    }
}
