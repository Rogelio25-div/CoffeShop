package coffeShop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Login implements ActionListener {
    static JPanel panel1, panel2;
    static JLabel label, UserNameText, PassWordText, SignUpLabelText, SystemNameLabel, SystemNameLabel1;
    static JPasswordField Password;
    static JTextField UserName;
    static JFrame frame;
    static JButton LogInButton;
    static int x = 300;
    static int y = 250;
    static Font myFont = new Font("calibre",Font.PLAIN,12);




    Login() {
        frame = new JFrame("COFFEE CORNER");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //LABEL
        label = new JLabel("LOGIN");
        label.setFont(new Font("Calibri", Font.BOLD, 50)); // Set the font size to 30
        label.setBounds(145, -70, 250, 250);

        //SIGN UP label
        SignUpLabelText = new JLabel("<html><u>Click here to SIGN UP or REGISTER</u><html>");
        SignUpLabelText.setForeground(Color.BLUE);
        SignUpLabelText.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        SignUpLabelText.setFont(myFont);
        SignUpLabelText.setBounds(105, 250, 200, 150);

        //SYSTEM NAME LABEL
        SystemNameLabel = new JLabel("SYSTEM ");
        SystemNameLabel.setFont(new Font("Calibri", Font.BOLD, 50));
        SystemNameLabel.setBounds(30,80,350,200);

        SystemNameLabel1 = new JLabel("NAME ");
        SystemNameLabel1.setFont(new Font("Calibri", Font.BOLD, 50));
        SystemNameLabel1.setBounds(30,120,350,200);



        //Username
        UserNameText = new JLabel("Username:");
        UserNameText.setFont(myFont);
        UserNameText.setBounds(105,-5,250,250);

        //Password
        PassWordText = new JLabel("Password:");
        PassWordText.setFont(myFont);
        PassWordText.setBounds(105,55,250,250);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        panel1 = new JPanel();
        panel1.setBackground(Color.lightGray);
        panel1.setPreferredSize(new Dimension(400, 200));

        panel2 = new JPanel();
        panel2.setBackground(Color.ORANGE);
        panel2.setPreferredSize(new Dimension(300, 0));

        //TEXT FIELD
        UserName = new JTextField();
        UserName.setBounds(105, 130, 200, 25);
        UserName.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    Password.requestFocus();
                }
            }
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {
            }
        });


        Password = new JPasswordField();
        Password.setBounds(105, 190, 200, 25);
        Password.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) { // when enter key is press it will move to next textfield
            }
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        //BUTTON
        LogInButton = new JButton("LOGIN");
        LogInButton.setBounds(160, 240, 70, 30);
        LogInButton.setBackground(Color.ORANGE);
        LogInButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        LogInButton.addActionListener(this::LoginButton);
        /*LogInButton.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    JOptionPane.showMessageDialog(null, "YOU PRESS LOG IN", null, JOptionPane.WARNING_MESSAGE);
                }
            }
            @Override
            public void keyTyped(KeyEvent e) {
            }
            @Override
            public void keyReleased(KeyEvent e) {

            }
        });*/


        //PANEL 2
        frame.add(panel2, BorderLayout.WEST);
        //panel2.setLayout(new FlowLayout());
        panel2.add(SystemNameLabel);
        panel2.add(SystemNameLabel1);
        panel2.setLayout(null);


        //PANEL 1
        frame.add(panel1, BorderLayout.EAST);
        panel1.add(UserName, BorderLayout.CENTER);
        panel1.add(Password);
        panel1.add(label, BorderLayout.CENTER);

        panel1.add(UserNameText);
        panel1.add(PassWordText);
        panel1.add(LogInButton);
        panel1.add(SignUpLabelText);
        panel1.setLayout(null);

        frame.setSize(700, 400);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void mainPanel() {
        mainPanel panel = new mainPanel();
    }

    public void LoginPage(){
        Login LoginPage = new Login();

    }


    public void LoginButton(ActionEvent e) {
        String username = UserName.getText();
        String password = Password.getText();
        Login LoginPage = new Login();

        if (username.trim().equals("admin") && password.trim().equals("admin")) {

            new mainPanel();
            JOptionPane.showMessageDialog(null,"Wellcome");

        }
        else{
            JOptionPane.showMessageDialog(null,"Invalid");

        }




    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}