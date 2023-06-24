package Travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {

    JButton back;
    About(){

        setBounds(220,70,800,600);
        setLayout(null);

        JLabel heading = new JLabel("ABOUT");
        heading.setBounds(320,20,400,25);
        heading.setFont(new Font("SAN_SARIF",Font.BOLD,30));
        heading.setForeground(Color.black);
        add(heading);

        TextArea ta = new TextArea("Welcome to Travel Management Company, your reliable partner in travel management solutions. We are dedicated to simplifying and enhancing your travel experiences.\n" +
                "\n" +
                "At Travel Management Company, we understand the demands of the modern travel industry. Our experienced team leverages technology and industry expertise to provide seamless, personalized services that exceed your expectations.\n" +
                "\n" +
                "Our services include corporate travel management, individual travel planning, group travel management, and travel expense management. We offer unparalleled expertise, a personalized approach, 24/7 support, and cost-efficient solutions.\n" +
                "\n" +
                "Experience the difference with Travel Management Company. Contact us today to explore how we can enhance your travel experiences.\n" +
                "\n",10,40,Scrollbar.VERTICAL);
        ta.setEditable(false);
        ta.setBounds(50,70,700,400);
        ta.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        add(ta);

        JLabel contact = new JLabel("Contact Us   :   TravelManagementCompany@gmail.com");
        contact.setBounds(50,480,800,25);
        contact.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        contact.setForeground(Color.black);
        add(contact);

        JLabel no = new JLabel("Phone   :   1800 696 9999");
        no.setBounds(50,520,800,25);
        no.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        no.setForeground(Color.black);
        add(no);

        back = new JButton("Back");
        back.setBounds(620,510,100,40);
        back.setForeground(Color.white);
        back.setBackground(new Color(133,193,233));
        back.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        back.addActionListener(this);
        add(back);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new About();
    }
}
