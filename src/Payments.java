package Travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Payments extends JFrame implements ActionListener {

    JButton pay,back;

    String username;

    Payments(){
        setBounds(230,70,800,580);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i3 = i2.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel image = new JLabel(i4);
        image.setBounds(0,0,800,600);
        add(image);
//
        pay = new JButton("Pay");
        pay.setBounds(600,450,80,40);
        pay.setForeground(Color.white);
        pay.setBackground(new Color(133,193,233));
        pay.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        pay.addActionListener(this);
        image.add(pay);
//
        back = new JButton("Back");
        back.setBounds(100,450,80,40);
        back.setForeground(Color.white);
        back.setBackground(new Color(133,193,233));
        back.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        back.addActionListener(this);
        image.add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
       try{
           if (ae.getSource()==pay){
               setVisible(false);
               new paytm();
           }else {
               setVisible(false);
//               new Dashboard(username);
           }

       }catch (Exception ee){
           ee.printStackTrace();
       }
    }

    public static void main(String[] args) {
        new Payments();
    }
}
