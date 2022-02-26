import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JDialog {
    private JTextField textPhone;
    private JTextField textEmail;
    private JTextField textName;
    private JTextField textAddress;
    private JTextField textConfirmPassword;
    private JTextField textPassowrd;
    private JButton registerButton;
    private JButton cancelButton;
    private JPanel RegisterPanel;


    public RegistrationForm(JFrame parent){
        super(parent);
        setTitle("Create a new account");
        setContentPane(RegisterPanel);
        setMinimumSize(new Dimension(450,474));
        setModal(true);
        setLocationRelativeTo(parent);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterUser();
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    private void RegisterUser() {
         String name=textName.getText();
         String email=textEmail.getText();
         String phone=textPhone.getText();
         String address=textAddress.getText();
         String password=String.valueOf(textPassowrd.getText());
         String confirmpassoword=String.valueOf(textConfirmPassword.getText());

         if(name.isEmpty()||email.isEmpty()||phone.isEmpty()||address.isEmpty()||password.isEmpty() ){
             JOptionPane.showMessageDialog(this,"please enter all fields","try again",JOptionPane.ERROR_MESSAGE);

             return;
        }
         if(!password.equals(confirmpassoword)){
             JOptionPane.showMessageDialog(this,"confirm password does not match","try again",JOptionPane.ERROR_MESSAGE);
             return;
         }
       addUserToDatbase(name,email,phone,address,password);
    }

    private User addUserToDatbase(String name, String email, String phone, String address, String password) {
        User user=null;
        return user;
    } 

    public static void main(String[] args) {
               RegistrationForm myform=new RegistrationForm(null);
    }
}
