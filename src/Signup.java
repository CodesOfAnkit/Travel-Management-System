package Travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame implements ActionListener {

    JLabel lblusername,lblname,lblpassword;
    JTextField tfusername,tfname,tfpassword;

    JButton create,back;
    Signup(){
        setBounds(350,150,600,360);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,50,200,200);
        add(image);

        //creating label for username heading sections
        lblusername = new JLabel("Username");
        lblusername.setBounds(50,20,125,25);
        lblusername.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblusername);

        // creating textfield for username filling section
        tfusername = new JTextField();
        tfusername.setBounds(150,20,150,25);
//        tfusername.setBorder(BorderFactory.createEmptyBorder());
        add(tfusername);

        //creating label for name heading sections
        lblname = new JLabel("Name");
        lblname.setBounds(50,80,125,25);
        lblname.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblname);

        // creating textfield for username
        tfname = new JTextField();
        tfname.setBounds(150,80,150,25);
//        tfname.setBorder(BorderFactory.createEmptyBorder());
        add(tfname);

        //creating label for password heading sections
        lblpassword = new JLabel("Password");
        lblpassword.setBounds(50,140,125,25);
        lblpassword.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblpassword);

        // creating textfield for password section
        tfpassword = new JTextField();
        tfpassword.setBounds(150,140,150,25);
//        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        add(tfpassword);

        //now create button for crate
        create = new JButton("Create");
        create.setBounds(60,200,100,30);
        create.setForeground(Color.white);
        create.setBackground(new Color(133,193,233));
        create.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        //to perform actionEvent
        create.addActionListener(this);
        add(create);

        //now create button for back
        back = new JButton("Back");
        back.setBounds(190,200,100,30);
        back.setBackground(new Color(133,193,233));
        back.setForeground(Color.white);
        back.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        //to perform actionevent
        back.addActionListener(this);
        add(back);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==create){

            String username = tfusername.getText();
            String name = tfname.getText();
            String Password = tfpassword.getText();

            try{
                Conn c = new Conn();
                String query = "insert into login values('"+username+"', '"+name+"', '"+Password+"')";

                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"Account Created Successfully");

                setVisible(false);
                new Login();

            }catch (Exception ae){
                ae.printStackTrace();
            }

        } else if (e.getSource()==back) {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args){
        new Signup();
    }
}
