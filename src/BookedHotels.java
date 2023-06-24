package Travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BookedHotels extends JFrame implements ActionListener {

    JLabel lblusername,  lblusername1, lblid, lblid1, lblnumber, lblnumber1, lblname,
            lblname1, lblperson, lblperson1,lblprice, lblprice1, lblhotels,
            lblhotels1, lbldays, lbldays1;

    JButton back;

    String username;

    BookedHotels(String username){

        this.username = username;

        setBounds(220,100,870,400);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        lblusername = new JLabel("Username         :");
        lblusername.setBounds(80,50,150,25);
        lblusername.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblusername);

        lblusername1 = new JLabel();
        lblusername1.setBounds(230,50,150,25);
        lblusername1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblusername1);

        lblname = new JLabel("Name                 :");
        lblname.setBounds(80,100,150,25);
        lblname.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblname);

        lblname1 = new JLabel();
        lblname1.setBounds(230,100,150,25);
        lblname1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblname1);

        lblid = new JLabel("Id                        :");
        lblid.setBounds(80,150,150,25);
        lblid.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblid);

        lblid1 = new JLabel();
        lblid1.setBounds(230,150,150,25);
        lblid1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblid1);

        lblnumber = new JLabel("Id Number        :");
        lblnumber.setBounds(80,200,150,25);
        lblnumber.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblnumber);

        lblnumber1 = new JLabel();
        lblnumber1.setBounds(230,200,150,25);
        lblnumber1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblnumber1);

        lblhotels = new JLabel("Hotel                  :");
        lblhotels.setBounds(500,50,150,25);
        lblhotels.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblhotels);

        lblhotels1 = new JLabel();
        lblhotels1.setBounds(650,50,150,25);
        lblhotels.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblhotels1);

        lblperson = new JLabel("Persons             :");
        lblperson.setBounds(500,100,150,25);
        lblperson.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblperson);

        lblperson1 = new JLabel();
        lblperson1.setBounds(650,100,150,25);
        lblperson1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblperson1);

        lbldays = new JLabel("No. of days        :");
        lbldays.setBounds(500,150,150,25);
        lbldays.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lbldays);

        lbldays1 = new JLabel();
        lbldays1.setBounds(650,150,150,25);
        lbldays1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lbldays1);

        lblprice = new JLabel("Paid Amount     :");
        lblprice.setBounds(500,200,150,25);
        lblprice.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblprice);

        lblprice1 = new JLabel();
        lblprice1.setBounds(650,200,150,25);
        lblprice1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblprice1);

        back = new JButton("Close");
        back.setBounds(330,300,100,30);
        back.setBackground(new Color(133,193,233));
        back.setForeground(Color.black);
        back.addActionListener(this);
        add(back);

        setVisible(true);

        /*--------------------------------------------------------------------------------*/
        // now fetch data from bookhotel table from database.

        try {
            Conn c = new Conn();
            String query = "select * from bookhotel where username = '"+username+"' ";
            ResultSet rs = c.s.executeQuery(query);

            while (rs.next()){

                lblusername1.setText(rs.getString("username"));
                lblname1.setText(rs.getString("name"));
                lblid1.setText(rs.getString("id"));
                lblnumber1.setText(rs.getString("number"));
                lblprice1.setText(rs.getString("price"));
                lblperson1.setText(rs.getString("person"));
                lbldays1.setText(rs.getString("Days"));
                lblhotels1.setText(rs.getString("Hotels"));

            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent e){
        try{
            setVisible(false);
        } catch (Exception ee){
            ee.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new BookedHotels("");
    }
}
