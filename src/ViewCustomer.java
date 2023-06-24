package Travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewCustomer extends JFrame implements ActionListener {
    JLabel lblusername,  lblusername1, lblid, lblid1, lblnumber, lblnumber1, lblname,
            lblname1, lblgender, lblgender1,lblcountry, lblcountry1, lbladdress,
            lbladdress1, lblphone, lblphone1;
    JButton back;

    ViewCustomer(String username){

        setBounds(220,100,870,400);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        lblusername = new JLabel("Username         :");
        lblusername.setBounds(50,50,150,25);
        lblusername.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblusername);

        lblusername1 = new JLabel();
        lblusername1.setBounds(200,50,150,25);
        lblusername1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblusername1);

        lblname = new JLabel("Name                 :");
        lblname.setBounds(50,100,150,25);
        lblname.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblname);

        lblname1 = new JLabel();
        lblname1.setBounds(200,100,150,25);
        lblname1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblname1);

        lblid = new JLabel("Id                        :");
        lblid.setBounds(50,150,150,25);
        lblid.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblid);

        lblid1 = new JLabel();
        lblid1.setBounds(200,150,150,25);
        lblid1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblid1);

        lblnumber = new JLabel("Id Number        :");
        lblnumber.setBounds(50,200,150,25);
        lblnumber.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblnumber);

        lblnumber1 = new JLabel();
        lblnumber1.setBounds(200,200,150,25);
        lblnumber1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblnumber1);

        lblgender = new JLabel("Gender           :");
        lblgender.setBounds(500,50,150,25);
        lblgender.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblgender);

        lblgender1 = new JLabel();
        lblgender1.setBounds(650,50,150,25);
        lblgender1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblgender1);

        lbladdress = new JLabel("Address         :");
        lbladdress.setBounds(500,100,150,25);
        lbladdress.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lbladdress);

        lbladdress1 = new JLabel();
        lbladdress1.setBounds(650,100,150,25);
        lbladdress1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lbladdress1);

        lblphone = new JLabel("Phone            :");
        lblphone.setBounds(500,150,150,25);
        lblphone.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblphone);

        lblphone1 = new JLabel();
        lblphone1.setBounds(650,150,150,25);
        lblphone1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblphone1);


        lblcountry = new JLabel("Country         :");
        lblcountry.setBounds(500,200,150,25);
        lblcountry.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblcountry);

        lblcountry1 = new JLabel();
        lblcountry1.setBounds(650,200,150,25);
        lblcountry1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblcountry1);

        back = new JButton("Close");
        back.setBounds(330,300,100,30);
        back.setBackground(new Color(133,193,233));
        back.setForeground(Color.black);
        back.addActionListener(this);
        add(back);

        /*--------------------------------------------------------------------------------*/
        // now fetch data from customer table from database.

        try {
            Conn c = new Conn();
            String query = "select * from customer where username = '"+username+"' ";
            ResultSet rs = c.s.executeQuery(query);

            while (rs.next()){

                lblusername1.setText(rs.getString("username"));
                lblname1.setText(rs.getString("name"));
                lblid1.setText(rs.getString("id"));
                lblnumber1.setText(rs.getString("number"));
                lblgender1.setText(rs.getString("gender"));
                lbladdress1.setText(rs.getString("address"));
                lblphone1.setText(rs.getString("phone"));
                lblcountry1.setText(rs.getString("country"));

            }

        } catch (Exception e){
            e.printStackTrace();
        }

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==back){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new ViewCustomer("");
    }
}
