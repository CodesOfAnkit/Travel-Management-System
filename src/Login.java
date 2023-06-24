package Travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel lblusername,lblpassword;
    JTextField tfusername,tfpassword;

    JButton login, signup;

    Login(){

        setSize(900,400);
        setLocation(200,150);
        setLayout(null);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i3 = i2.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel image = new JLabel(i4);
        image.setBounds(100,100,200,200);
        add(image);

        //1. label for user-name heading
        lblusername = new JLabel("Username");
        lblusername.setBounds(400,20,100,25);
        lblusername.setFont(new Font("SAN_SARIF", Font.PLAIN,20));
        add(lblusername);

        //1. textfield for username filling
        tfusername = new JTextField();
        tfusername.setBounds(540,20,200,30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        add(tfusername);

        lblpassword = new JLabel("Password");
        lblpassword.setBounds(400,80,100,25);
        lblpassword.setFont(new Font("SAN_SARIF", Font.PLAIN,20));
        add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(540,80,200,30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        add(tfpassword);

        login = new JButton("Login");
        login.setBounds(430,150,130,30);
        login.setBackground(new Color(133,193,233));
        login.setForeground(Color.white);
//        b1.setBorder(new LineBorder(new Color(133,193,233)));
        login.addActionListener(this);
        add(login);

        signup = new JButton("Signup");
        signup.setBounds(580,150,130,30);
        signup.setBackground(new Color(133,193,233));
        signup.setForeground(Color.white);
//        b1.setBorder(new LineBorder(new Color(133,193,233)));
        signup.addActionListener(this);
        add(signup);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==login){

            String username = tfusername.getText();
            String password = tfpassword.getText();

            try {
                Conn c = new Conn();
                String query = "select * from login where username ='"+username+"'and Password ='"+password+"' ";

                ResultSet rs = c.s.executeQuery(query);

                if (rs.next()){
                    setVisible(false);
                    new Loading(username);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Invalid Login");
                }

            }catch (Exception ae){
                ae.printStackTrace();
            }

        }else if (e.getSource()==signup){
            setVisible(false);
            new Signup();
        }

    }

    public static void main(String[] args){
        new Login();
    }
}
