package Travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    JLabel heading;

    JButton addpersonaldetail,updatepersonaldetails,deletepersonaldetails,checkpackage,viewpersonaldetails,bookedpackage,viewpackage,viewhotels, bookhotels,bookedhotel,destinations,payments,calculator,back,about;

    String username;
    Dashboard(String username){

        this.username = username;

//        setBounds(0,0,1600,500);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        //create panel for heading section
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i3 = i2.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel image = new JLabel(i4);
        image.setBounds(5,0,70,70);
        p1.add(image);

        heading = new JLabel("Dashboard");
        heading.setBounds(80,0,200,70);
        heading.setForeground(Color.white);
        heading.setFont(new Font("SAN_SARIF",Font.BOLD,30));
        p1.add(heading);

        //create panel for side menu section
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);

        addpersonaldetail = new JButton("Add personal details");
        addpersonaldetail.setBounds(0,0,300,40);
        addpersonaldetail.setForeground(Color.white);
        addpersonaldetail.setBackground(new Color(133,193,233));
        addpersonaldetail.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        addpersonaldetail.addActionListener(this);
        p2.add(addpersonaldetail);

        viewpersonaldetails = new JButton("View personal details");
        viewpersonaldetails.setBounds(0,45,300,40);
        viewpersonaldetails.setForeground(Color.white);
        viewpersonaldetails.setBackground(new Color(133,193,233));
        viewpersonaldetails.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        viewpersonaldetails.addActionListener(this);
        p2.add(viewpersonaldetails);

        updatepersonaldetails = new JButton("Update personal details");
        updatepersonaldetails.setBounds(0,90,300,40);
        updatepersonaldetails.setForeground(Color.white);
        updatepersonaldetails.setBackground(new Color(133,193,233));
        updatepersonaldetails.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        updatepersonaldetails.addActionListener(this);
        p2.add(updatepersonaldetails);

        deletepersonaldetails = new JButton("Delete personal details");
        deletepersonaldetails.setBounds(0,135,300,40);
        deletepersonaldetails.setForeground(Color.white);
        deletepersonaldetails.setBackground(new Color(133,193,233));
        deletepersonaldetails.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        deletepersonaldetails.addActionListener(this);
        p2.add(deletepersonaldetails);

        checkpackage = new JButton("Check Packages");
        checkpackage.setBounds(0,180,300,40);
        checkpackage.setForeground(Color.white);
        checkpackage.setBackground(new Color(133,193,233));
        checkpackage.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        checkpackage.addActionListener(this);
        p2.add(checkpackage);

        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0,225,300,40);
        viewhotels.setForeground(Color.white);
        viewhotels.setBackground(new Color(133,193,233));
        viewhotels.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);

        bookhotels = new JButton("Book Hotel");
        bookhotels.setBounds(0,270,300,40);
        bookhotels.setForeground(Color.white);
        bookhotels.setBackground(new Color(133,193,233));
        bookhotels.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        bookhotels.addActionListener(this);
        p2.add(bookhotels);

        bookedpackage = new JButton("View Booked Package");
        bookedpackage.setBounds(0,315,300,40);
        bookedpackage.setForeground(Color.white);
        bookedpackage.setBackground(new Color(133,193,233));
        bookedpackage.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        bookedpackage.addActionListener(this);
        p2.add(bookedpackage);

        bookedhotel = new JButton("View Booked Hotel");
        bookedhotel.setBounds(0,360,300,40);
        bookedhotel.setForeground(Color.white);
        bookedhotel.setBackground(new Color(133,193,233));
        bookedhotel.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        bookedhotel.addActionListener(this);
        p2.add(bookedhotel);

        payments = new JButton("Payments");
        payments.setBounds(0,405,300,40);
        payments.setForeground(Color.white);
        payments.setBackground(new Color(133,193,233));
        payments.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        payments.addActionListener(this);
        p2.add(payments);

        calculator = new JButton("Calculator");
        calculator.setBounds(0,450,300,40);
        calculator.setForeground(Color.white);
        calculator.setBackground(new Color(133,193,233));
        calculator.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        calculator.addActionListener(this);
        p2.add(calculator);

        about = new JButton("About");
        about.setBounds(0,495,300,40);
        about.setForeground(Color.white);
        about.setBackground(new Color(133,193,233));
        about.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        about.addActionListener(this);
        p2.add(about);

        back = new JButton("Exit");
        back.setBounds(0,540,300,50);
        back.setForeground(Color.white);
        back.setBackground(new Color(133,193,233));
        back.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        back.addActionListener(this);
        p2.add(back);

        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i6 = i5.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i7 = new ImageIcon(i6);
        JLabel image2 = new JLabel(i7);
        image2.setBounds(0,0,1650,1000);
        add(image2);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==addpersonaldetail){
            new AddDetails(username);
        } else if (ae.getSource() == viewpersonaldetails) {
            new ViewCustomer(username);
        } else if (ae.getSource()==updatepersonaldetails){
            new UpdateCustomer(username);
        } else if (ae.getSource() == checkpackage) {
            new CheckPackage1(username);
        } else if (ae.getSource() == bookedpackage) {
            new BookedPackage(username);
        } else if (ae.getSource() == viewhotels) {
            new CheckHotels();
        } else if (ae.getSource() == bookhotels) {
            new BookHotels(username);
        } else if (ae.getSource() == bookedhotel) {
            new BookedHotels(username);
        } else if(ae.getSource() == payments){
            new Payments();
        } else if (ae.getSource() == calculator) {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }  catch (Exception ee){
                ee.printStackTrace();
            }
        } else if (ae.getSource() == deletepersonaldetails ) {
            new DeleteCustomer1(username);
//            setVisible(false);
        } else if (ae.getSource() == about) {
            new About();
        } else {
            setVisible(false);
//            new Login();
        }
    }
    public static void main(String[] args){
        new Dashboard("");
    }
}
