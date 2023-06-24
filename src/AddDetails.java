package Travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class AddDetails extends JFrame implements ActionListener{

    JLabel lblusername,lblid,lblnumber,lblname,lblaname,lblgend,lblcountry,lbladdress,lblphone,lblemail,lblanswer;
    JTextField tfnumber,tfcountry,tfaddress,tfphone,tfemail;

    JButton add;
    JButton Bk;
    JComboBox comboid,gend;
    AddDetails(String username){

        setBounds(250,100,800,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading = new JLabel("Add Details");
        heading.setBounds(310,5,200,20);
        heading.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        add(heading);

        lblusername = new JLabel("Username");
        lblusername.setBounds(50,50,125,25);
        lblusername.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblusername);

        //we are taking this as a Jlabel , so that it can be uneditable field
        lblanswer = new JLabel();
        lblanswer.setBounds(200,50,150,25);
        lblanswer.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblanswer);

        lblid = new JLabel("ID");
        lblid.setBounds(50,90,125,25);
        lblid.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblid);

        // we can create it with choice bar also inplace of combox
        comboid = new JComboBox(new String[] {"Select","Passport", "Adhar Card", "Pan Card", "Ration Card", "Driving Licence"});
        comboid.setBounds(200,90,150,25);
        comboid.setBackground(Color.white);
        add(comboid);

        lblnumber = new JLabel("ID Number");
        lblnumber.setBounds(50,130,125,25);
        lblnumber.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblnumber);

        tfnumber = new JTextField();
        tfnumber.setBounds(200,130,150,25);
        add(tfnumber);

        lblname = new JLabel("Name");
        lblname.setBounds(50,170,125,25);
        lblname.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblname);

        // this will also be a uneditable value
        lblaname = new JLabel();
        lblaname.setBounds(200,170,125,25);
        lblaname.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblaname);

        lblgend = new JLabel("Gender");
        lblgend.setBounds(50,210,125,25);
        lblgend.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblgend);

        gend = new JComboBox(new String[] {"Male", "Female"});
        gend.setBounds(200,210,150,25);
        gend.setBackground(Color.white);
        add(gend);

        lblcountry = new JLabel("Country");
        lblcountry.setBounds(50,250,125,25);
        lblcountry.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblcountry);

        tfcountry = new JTextField();
        tfcountry.setBounds(200,250,150,25);
        add(tfcountry);

        lbladdress = new JLabel("Address");
        lbladdress.setBounds(50,290,125,25);
        lbladdress.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lbladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(200,290,150,25);
        add(tfaddress);

        lblphone = new JLabel("Phone");
        lblphone.setBounds(50,330,125,25);
        lblphone.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(200,330,150,25);
        add(tfphone);

        lblemail = new JLabel("Mail Id");
        lblemail.setBounds(50,370,125,25);
        lblemail.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblemail);

        tfemail = new JTextField();
        tfemail.setBounds(200,370,150,25);
        add(tfemail);

        add = new JButton("Add");
        add.setBounds(60,450,100,30);
        add.setForeground(Color.black);
        add.setBackground(new Color(133,193,233));
        add.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        //to perform actionEvent
        add.addActionListener(this);
        add(add);

        Bk = new JButton("Close");
        Bk.setBounds(180,450,100,30);
        Bk.setBackground(new Color(133,193,233));
        Bk.setForeground(Color.black);
        Bk.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        Bk.addActionListener(this);
        add(Bk);

        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i3 = i2.getImage().getScaledInstance(450,550,Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel image = new JLabel(i4);
        image.setBounds(350,20,450,550);
        add(image);

// -------------------fetching data from login table for details completion-----------------------
        try {

            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from login where username = '"+username+"'");
            while (rs.next()){
                lblanswer.setText(rs.getString("username"));
                lblaname.setText(rs.getString("name"));
            }

        } catch (Exception e){
            e.printStackTrace();
        }
// -------------------------------------------------------------------------------------------------

        setVisible(true);
    }


    public void actionPerformed(ActionEvent e){
        if (e.getSource()==add)
        {

            String username = lblanswer.getText();
            String id = (String) comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = lblaname.getText();
            String gender = (String) gend.getSelectedItem();
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();

            try {
                Conn c = new Conn();
                String query = "insert into customer values('"+username+"', '"+id+"', '"+number+"', '"+name+"', '"+gender+"', '"+country+"', '"+address+"', '"+phone+"', '"+email+"' ) ";

                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"Details Added Successfully");

            }catch (Exception ae){
                ae.printStackTrace();
            }
        }
        else{
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new AddDetails("");
    }
}
