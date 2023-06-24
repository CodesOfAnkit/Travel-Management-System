package Travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BookPackage extends JFrame implements ActionListener {

    JLabel lblusername,  lblusername1, lblid, lblid1, lblnumber, lblnumber1, lblname,lblprice,lblprice1,
            lblname1, lblnumber2,lblphone,lblpack,lbladdress,lbladdress1,lblcountry,lblcountry1,lblmail,lblmail1;

    JTextField tfnumber2,tfphone;

    JComboBox ComPack;

    JButton Price, Close,Book;
    BookPackage(String username){

        setBounds(230,150,800,500);
        setLayout(null);

        JLabel heading = new JLabel("BOOK PACKAGE");
        heading.setBounds(280,5,200,25);
        heading.setFont(new Font("SAN_SARIF",Font.BOLD,20));
        add(heading);

        lblusername = new JLabel("Username");
        lblusername.setBounds(50,50,150,25);
        lblusername.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblusername);

        lblusername1 = new JLabel();
        lblusername1.setBounds(230,50,150,25);
        lblusername1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblusername1);

        lblname = new JLabel("Name");
        lblname.setBounds(50,100,150,25);
        lblname.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblname);

        lblname1 = new JLabel();
        lblname1.setBounds(230,100,150,25);
        lblname1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblname1);

        lblid = new JLabel("Id");
        lblid.setBounds(50,150,150,25);
        lblid.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblid);

        lblid1 = new JLabel();
        lblid1.setBounds(230,150,150,25);
        lblid1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblid1);

        lblnumber = new JLabel("Id Number");
        lblnumber.setBounds(50,200,150,25);
        lblnumber.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblnumber);

        lblnumber1 = new JLabel();
        lblnumber1.setBounds(230,200,150,25);
        lblnumber1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblnumber1);

        lblpack = new JLabel("Select Package");
        lblpack.setBounds(50,250,200,25);
        lblpack.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblpack);

        ComPack = new JComboBox(new String[] {"Select","Gold Package","Silver Package","Bronze Package"});
        ComPack.setBounds(230,250,150,25);
        ComPack.setBackground(Color.white);
        add(ComPack);

        lblnumber2 = new JLabel("Total Persons");
        lblnumber2.setBounds(50,300,125,25);
        lblnumber2.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblnumber2);

        tfnumber2 = new JTextField();
        tfnumber2.setBounds(230,300,150,25);
        add(tfnumber2);

        lblphone = new JLabel("Phone");
        lblphone.setBounds(50,350,125,25);
        lblphone.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblphone);

        tfphone = new JTextField();
        tfphone.setBounds(230,350,150,25);
        add(tfphone);

        lblmail = new JLabel("Mail ID");
        lblmail.setBounds(450,50,150,25);
        lblmail.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblmail);

        lblmail1 = new JLabel();
        lblmail1.setBounds(600,50,150,25);
        lblmail1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblmail1);

        lbladdress = new JLabel("Address");
        lbladdress.setBounds(450,100,150,25);
        lbladdress.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lbladdress);

        lbladdress1 = new JLabel();
        lbladdress1.setBounds(600,100,150,25);
        lbladdress1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lbladdress1);

        lblcountry = new JLabel("Country");
        lblcountry.setBounds(450,150,150,25);
        lblcountry.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblcountry);

        lblcountry1 = new JLabel();
        lblcountry1.setBounds(600,150,150,25);
        lblcountry1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblcountry1);

        lblprice = new JLabel("Price");
        lblprice.setBounds(450,200,150,25);
        lblprice.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblprice);

        lblprice1 = new JLabel();
        lblprice1.setBounds(600,200,150,25);
        lblprice1.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblprice1);

        Price = new JButton("Total");
        Price.setBounds(690,200,80,25);
        Price.setBackground(new Color(133,193,233));
        Price.setForeground(Color.black);
        Price.addActionListener(this);
        add(Price);

        JLabel booknow = new JLabel("Book Now");
        booknow.setBounds(450,250,150,25);
        booknow.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(booknow);

        Book = new JButton("Book");
        Book.setBounds(600,250,80,25);
        Book.setBackground(new Color(133,193,233));
        Book.setForeground(Color.black);
        Book.addActionListener(this);
        add(Book);

        Close = new JButton("Close");
        Close.setBounds(400,400,100,30);
        Close.setBackground(new Color(133,193,233));
        Close.setForeground(Color.black);
        Close.addActionListener(this);
        add(Close);

// /*-------------------------------------------------------------------------------------------------*/
//        // now fetch data from customer table from database.

        try {
            Conn c = new Conn();
            String query = "select * from customer where username = '"+username+"' ";
            ResultSet rs = c.s.executeQuery(query);

            while (rs.next()){

                lblusername1.setText(rs.getString("username"));
                lblname1.setText(rs.getString("name"));
                lblid1.setText(rs.getString("id"));
                lblnumber1.setText(rs.getString("number"));
                lblmail1.setText(rs.getString("email"));
                lbladdress1.setText(rs.getString("address"));
                lblcountry1.setText(rs.getString("country"));

            }

        } catch (Exception e){
            e.printStackTrace();
        }

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

/*----------------------------------------------------------------------------------------------------------------*/

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==Price){
            String pack = (String) ComPack.getSelectedItem();
            int cost =0;
            if (pack.equals("Gold Package")){
                cost += 12000;
            } else if (pack.equals("Silver package")) {
                cost += 25000;
            } else {
                cost += 32000;
            }

            int person = Integer.parseInt(tfnumber2.getText());
            cost *= person;
            lblprice1.setText("Rs "+cost);


            /*---------------------------------------------------------------------------*/


        } else if (e.getSource()==Book) {

            String username = lblusername1.getText();
            String id = lblid1.getText();
            String number = lblnumber1.getText();
            String name = lblname1.getText();
            String country = lblcountry1.getText();
            String address = lbladdress1.getText();
            String phone = tfphone.getText();
            String email = lblmail1.getText();
            String packg = (String) ComPack.getSelectedItem();
            String price = lblprice1.getText();
            String person = tfnumber2.getText();

            try {
                Conn c = new Conn();
                String query = "insert into bookpackage values('"+username+"', '"+id+"', '"+number+"', '"+name+"', '"+country+"', '"+address+"', '"+phone+"', '"+email+"', '"+packg+"','"+person+"', '"+price+"' ) ";

                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"Details Added Successfully");
                setVisible(false);
                new Dashboard(username);

            } catch (Exception aee){
                aee.printStackTrace();
            }

            /*----------------------------------------------------------------------*/

        }else {
            setVisible(false);
        }
    }


    public static void main(String[] args) {
        new BookPackage("");
    }
}
