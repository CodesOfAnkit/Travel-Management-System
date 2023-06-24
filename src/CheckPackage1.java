package Travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckPackage1 extends JFrame implements ActionListener {

    JButton Bk1,Bk2,Bk3;

    String username;

    CheckPackage1(String username){

        this.username = username;

        setBounds(250,100,800,550);

        /*------------------------------------------------------------------*/

        //we created the tab for heading section of package1
        JTabbedPane tab = new JTabbedPane();

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);

        JLabel l1 = new JLabel("Gold Package");
        l1.setBounds(200,15,500,60);
        l1.setForeground(new Color(255,215,0));
        l1.setFont(new Font("Tahoma",Font.BOLD,50));
        p1.add(l1);

        JLabel f1 = new JLabel("1.     ");
        f1.setBounds(70,130,300,35);
        f1.setForeground(Color.black);
        f1.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(f1);

        //add features of gold package
        JLabel l2 = new JLabel("6 Days 7 Nights");
        l2.setBounds(120,130,300,35);
        l2.setForeground(Color.blue);
        l2.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(l2);

        JLabel f2 = new JLabel("2.     ");
        f2.setBounds(70,200,300,35);
        f2.setForeground(Color.black);
        f2.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(f2);


        JLabel l3 = new JLabel("Airport Assistance");
        l3.setBounds(120,200,300,35);
        l3.setForeground(Color.blue);
        l3.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(l3);

        JLabel f3 = new JLabel("3.     ");
        f3.setBounds(70,270,300,35);
        f3.setForeground(Color.black);
        f3.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(f3);

        JLabel l4 = new JLabel("Free Transportation");
        l4.setBounds(120,270,300,35);
        l4.setForeground(Color.blue);
        l4.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(l4);

        JLabel f4 = new JLabel("4.     ");
        f4.setBounds(70,340,300,35);
        f4.setForeground(Color.black);
        f4.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(f4);

        JLabel l5 = new JLabel("Half Day City Tour");
        l5.setBounds(120,340,300,35);
        l5.setForeground(Color.blue);
        l5.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(l5);

        JLabel f5 = new JLabel("5.     ");
        f5.setBounds(450,130,300,35);
        f5.setForeground(Color.black);
        f5.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(f5);

        JLabel l6 = new JLabel("Daily Buffet");
        l6.setBounds(490,130,300,35);
        l6.setForeground(Color.blue);
        l6.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(l6);

        JLabel f6 = new JLabel("6.     ");
        f6.setBounds(450,200,300,35);
        f6.setForeground(Color.black);
        f6.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(f6);

        JLabel l7 = new JLabel("Fun Zone");
        l7.setBounds(490,200,300,35);
        l7.setForeground(Color.blue);
        l7.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(l7);

        JLabel f7 = new JLabel("7.     ");
        f7.setBounds(450,270,300,35);
        f7.setForeground(Color.black);
        f7.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(f7);

        JLabel l8 = new JLabel("Water park");
        l8.setBounds(490,270,300,35);
        l8.setForeground(Color.blue);
        l8.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(l8);

        JLabel f8 = new JLabel("8.     ");
        f8.setBounds(450,340,300,35);
        f8.setForeground(Color.black);
        f8.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(f8);

        JLabel l9 = new JLabel("Dj Night");
        l9.setBounds(490,340,300,35);
        l9.setForeground(Color.blue);
        l9.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(l9);

        JLabel l10 = new JLabel("Rs : 25000/-");
        l10.setBounds(100,430,300,35);
        l10.setForeground(Color.red);
        l10.setFont(new Font("Arial",Font.BOLD,25));
        p1.add(l10);

        Bk1 = new JButton("Book Now");
        Bk1.setBounds(550,430,150,40);
        Bk1.setBackground(new Color(133,193,233));
        Bk1.setForeground(Color.black);
        Bk1.setFont(new Font("SAN_SARIF",Font.BOLD,16));
        Bk1.addActionListener(this);
        p1.add(Bk1);

        tab.addTab("Package 1",null,p1);

        add(tab);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*----------------------------------------------------------------------------------------------*/

        JTabbedPane tab2 = new JTabbedPane();
//
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.white);

        JLabel l20 = new JLabel("Silver Package");
        l20.setBounds(200,15,500,60);
        l20.setForeground(new Color(255,215,0));
        l20.setFont(new Font("Tahoma",Font.BOLD,50));
        p2.add(l20);

        JLabel f20 = new JLabel("1.     ");
        f20.setBounds(70,130,300,35);
        f20.setForeground(Color.black);
        f20.setFont(new Font("Arial",Font.BOLD,25));
        p2.add(f20);

        //add features of gold package
        JLabel l21 = new JLabel("6 Days 7 Nights");
        l21.setBounds(120,130,300,35);
        l21.setForeground(Color.blue);
        l21.setFont(new Font("Arial",Font.BOLD,25));
        p2.add(l21);

        JLabel f21 = new JLabel("2.     ");
        f21.setBounds(70,200,300,35);
        f21.setForeground(Color.black);
        f21.setFont(new Font("Arial",Font.BOLD,25));
        p2.add(f21);

        JLabel l22 = new JLabel("Airport Assistance");
        l22.setBounds(120,200,300,35);
        l22.setForeground(Color.blue);
        l22.setFont(new Font("Arial",Font.BOLD,25));
        p2.add(l22);

        JLabel f23 = new JLabel("3.     ");
        f23.setBounds(70,270,300,35);
        f23.setForeground(Color.black);
        f23.setFont(new Font("Arial",Font.BOLD,25));
        p2.add(f23);

        JLabel l24 = new JLabel("Free Transportation");
        l24.setBounds(120,270,300,35);
        l24.setForeground(Color.blue);
        l24.setFont(new Font("Arial",Font.BOLD,25));
        p2.add(l24);

        JLabel f25 = new JLabel("4.     ");
        f25.setBounds(70,340,300,35);
        f25.setForeground(Color.black);
        f25.setFont(new Font("Arial",Font.BOLD,25));
        p2.add(f25);

        JLabel l26 = new JLabel("Half Day City Tour");
        l26.setBounds(120,340,300,35);
        l26.setForeground(Color.blue);
        l26.setFont(new Font("Arial",Font.BOLD,25));
        p2.add(l26);

        JLabel f27 = new JLabel("5.     ");
        f27.setBounds(450,130,300,35);
        f27.setForeground(Color.black);
        f27.setFont(new Font("Arial",Font.BOLD,25));
        p2.add(f27);

        JLabel l28 = new JLabel("Daily Buffet");
        l28.setBounds(490,130,300,35);
        l28.setForeground(Color.blue);
        l28.setFont(new Font("Arial",Font.BOLD,25));
        p2.add(l28);

        JLabel f29 = new JLabel("6.     ");
        f29.setBounds(450,200,300,35);
        f29.setForeground(Color.black);
        f29.setFont(new Font("Arial",Font.BOLD,25));
        p2.add(f29);

        JLabel l30 = new JLabel("Fun Zone");
        l30.setBounds(490,200,300,35);
        l30.setForeground(Color.blue);
        l30.setFont(new Font("Arial",Font.BOLD,25));
        p2.add(l30);

        JLabel l31 = new JLabel("Rs : 15000/-");
        l31.setBounds(100,430,300,35);
        l31.setForeground(Color.red);
        l31.setFont(new Font("Arial",Font.BOLD,25));
        p2.add(l31);

        Bk2 = new JButton("Book Now");
        Bk2.setBounds(550,430,150,40);
        Bk2.setBackground(new Color(133,193,233));
        Bk2.setForeground(Color.black);
        Bk2.setFont(new Font("SAN_SARIF",Font.BOLD,16));
        Bk2.addActionListener(this);
        p2.add(Bk2);

        tab.addTab("Package 2",null,p2);

        add(tab2);

        /*--------------------------------------------------------------------------------*/

        JTabbedPane tab3 = new JTabbedPane();

        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBackground(Color.white);

        JLabel l40 = new JLabel("Bronze Package");
        l40.setBounds(200,15,500,60);
        l40.setForeground(new Color(255,215,0));
        l40.setFont(new Font("Tahoma",Font.BOLD,50));
        p3.add(l40);

        JLabel f41 = new JLabel("1.     ");
        f41.setBounds(70,130,300,35);
        f41.setForeground(Color.black);
        f41.setFont(new Font("Arial",Font.BOLD,25));
        p3.add(f41);

        //add features of gold package
        JLabel l42 = new JLabel("6 Days 7 Nights");
        l42.setBounds(120,130,300,35);
        l42.setForeground(Color.blue);
        l42.setFont(new Font("Arial",Font.BOLD,25));
        p3.add(l42);

        JLabel f43 = new JLabel("2.     ");
        f43.setBounds(70,200,300,35);
        f43.setForeground(Color.black);
        f43.setFont(new Font("Arial",Font.BOLD,25));
        p3.add(f43);


        JLabel l44 = new JLabel("Airport Assistance");
        l44.setBounds(120,200,300,35);
        l44.setForeground(Color.blue);
        l44.setFont(new Font("Arial",Font.BOLD,25));
        p3.add(l44);

        JLabel f45 = new JLabel("3.     ");
        f45.setBounds(70,270,300,35);
        f45.setForeground(Color.black);
        f45.setFont(new Font("Arial",Font.BOLD,25));
        p3.add(f45);

        JLabel l46 = new JLabel("Free Transportation");
        l46.setBounds(120,270,300,35);
        l46.setForeground(Color.blue);
        l46.setFont(new Font("Arial",Font.BOLD,25));
        p3.add(l46);

        JLabel f47 = new JLabel("4.     ");
        f47.setBounds(70,340,300,35);
        f47.setForeground(Color.black);
        f47.setFont(new Font("Arial",Font.BOLD,25));
        p3.add(f47);

        JLabel l48 = new JLabel("Half Day City Tour");
        l48.setBounds(120,340,300,35);
        l48.setForeground(Color.blue);
        l48.setFont(new Font("Arial",Font.BOLD,25));
        p3.add(l48);

        JLabel f49 = new JLabel("5.     ");
        f49.setBounds(450,130,300,35);
        f49.setForeground(Color.black);
        f49.setFont(new Font("Arial",Font.BOLD,25));
        p3.add(f49);

        JLabel l50 = new JLabel("Daily Buffet");
        l50.setBounds(490,130,300,35);
        l50.setForeground(Color.blue);
        l50.setFont(new Font("Arial",Font.BOLD,25));
        p3.add(l50);

        JLabel l51 = new JLabel("Rs : 10000/-");
        l51.setBounds(100,430,300,35);
        l51.setForeground(Color.red);
        l51.setFont(new Font("Arial",Font.BOLD,25));
        p3.add(l51);

        Bk3 = new JButton("Book Now");
        Bk3.setBounds(550,430,150,40);
        Bk3.setBackground(new Color(133,193,233));
        Bk3.setForeground(Color.black);
        Bk3.setFont(new Font("SAN_SARIF",Font.BOLD,16));
        Bk3.addActionListener(this);
        p3.add(Bk3);

        tab.addTab("Package 3",null,p3);

        add(tab3);

    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==Bk1){
            setVisible(false);
            new BookPackage(username);
        } else if (ae.getSource() == Bk2){
            setVisible( false);
            new BookPackage(username);
        } else {
            setVisible(false);
            new BookPackage(username);
        }
    }

    public static void main(String[] args) {
        new CheckPackage1("");
    }
}
