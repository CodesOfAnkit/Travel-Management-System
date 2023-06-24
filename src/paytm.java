package Travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class paytm extends JFrame implements ActionListener {

    JButton back;
    paytm(){

        setBounds(220,70,800,600);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/qr-code.png"));
        Image i3 = i2.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel image = new JLabel(i4);
        image.setBounds(0,0,400,400);
        add(image);

        JLabel head = new JLabel("Scane The QR Code For Payment");
        head.setBounds(220,20,400,25);
        head.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        head.setForeground(Color.black);
        image.add(head);

        JLabel upi = new JLabel("UPI  :  Travelmanagement@oksbi");
        upi.setBounds(50,500,400,25);
        upi.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        upi.setForeground(Color.black);
        image.add(upi);

        back = new JButton("Back");
        back.setBounds(610,500,80,40);
        back.setForeground(Color.white);
        back.setBackground(new Color(133,193,233));
        back.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        back.addActionListener(this);
        image.add(back);


        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==back){
            setVisible(false);
            new Payments();
        }
    }

    public static void main(String[] args) {
        new paytm();
    }
}
