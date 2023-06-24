package Travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BookHotels extends JFrame implements ActionListener {

    JLabel lblusername,  lblusername1, lblid, lblid1, lblnumber, lblnumber1, lblname,lblprice,lblprice1,
            lblname1, lblnumber2, lbldays, lblhotels,lblphone,lblphone1,FoodFacility,acrooms ;

    JTextField tfnumber2, tfdays;

    JComboBox ComHotels, rooms, FoodAns;

    JButton Price, Close,Book;

//    String username;

    BookHotels(String username){

//        this.username = username;

        setBounds(230,150,800,500);
        setLayout(null);

        JLabel heading = new JLabel("BOOK HOTELS");
        heading.setBounds(300,5,200,25);
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

        lblhotels = new JLabel("Select Hotels");
        lblhotels.setBounds(50,250,150,25);
        lblhotels.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblhotels);

        ComHotels = new JComboBox(new String[]{"Hilton Hotel","Jalsa Hotel" ,"Radisson Hotel","Marriot Hotel","Ramada Hotel"," Rambagh Hotel","Vijan Palace","Culchuri Hotel","Guljar Hotel","Robert view Hotel"});
        ComHotels.setBounds(230,250,150,25);
        ComHotels.setBackground(Color.white);
        add(ComHotels);

        lblnumber2 = new JLabel("Total Persons");
        lblnumber2.setBounds(50,300,125,25);
        lblnumber2.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lblnumber2);

        tfnumber2 = new JTextField();
        tfnumber2.setBounds(230,300,150,25);
        add(tfnumber2);

        lbldays = new JLabel("No. of Days");
        lbldays.setBounds(450,50,150,25);
        lbldays.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(lbldays);

        tfdays = new JTextField("1");
        tfdays.setBounds(600,50,150,25);
        add(tfdays);

        acrooms = new JLabel("AC/Non-Ac Room");
        acrooms.setBounds(450,100,120,25);
        acrooms.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(acrooms);

        rooms = new JComboBox(new String[]{"AC","Non-AC"});
        rooms.setBounds(600,100,150,25);
        rooms.setBackground(Color.white);
        add(rooms);

        FoodFacility = new JLabel("Food Included");
        FoodFacility.setBounds(450,150,120,25);
        FoodFacility.setFont(new Font("SAN_SARIF",Font.BOLD,14));
        add(FoodFacility);

        FoodAns = new JComboBox(new String[]{"Yes","No"});
        FoodAns.setBounds(600,150,150,25);
        FoodAns.setBackground(Color.white);
        add(FoodAns);

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

        lblphone = new JLabel("Phone");
        lblphone.setBounds(450,250,150,25);
        lblphone.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblphone);

        lblphone1 = new JLabel();
        lblphone1.setBounds(600,250,150,25);
        lblphone.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(lblphone1);

        JLabel booknow = new JLabel("Book Now");
        booknow.setBounds(450,300,150,25);
        booknow.setFont(new Font("SAN_SARIF",Font.BOLD,15));
        add(booknow);

        Book = new JButton("Book");
        Book.setBounds(600,300,80,25);
        Book.setBackground(new Color(133,193,233));
        Book.setForeground(Color.black);
        Book.addActionListener(this);
        add(Book);

        Close = new JButton("Close");
        Close.setBounds(300,400,100,30);
        Close.setBackground(new Color(133,193,233));
        Close.setForeground(Color.black);
        Close.addActionListener(this);
        add(Close);

// /*-------------------------------------------------------------------------------------------------*/
//        // now fetch data from customer table from customer database.

        try {
            Conn c = new Conn();
            String query = "select * from customer where username = '"+username+"' ";
            ResultSet rs = c.s.executeQuery(query);

            while (rs.next()){

                lblusername1.setText(rs.getString("username"));
                lblname1.setText(rs.getString("name"));
                lblid1.setText(rs.getString("id"));
                lblnumber1.setText(rs.getString("number"));
                lblphone1.setText(rs.getString("phone"));
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    /*----------------------------------------------------------------------------------------------------------------*/

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==Price){
            String pack = (String) ComHotels.getSelectedItem();
            int cost =0;
            if (pack.equals("Hilton Hotel")){
                cost += 1100;
            } else if (pack.equals("Jalsa Hotel")) {
                cost += 1300;
            }  else if (pack.equals("Radisson Hotel")) {
                cost += 1200;
            } else if (pack.equals("Marriot Hotel")) {
                cost += 1000;
            } else if (pack.equals("Ramada Hotel")) {
                cost += 1500;
            }else if (pack.equals("Rambagh Hotel")) {
                cost += 1400;
            } else if (pack.equals("Vijan Palace")) {
                cost += 2500;
            } else if (pack.equals("Culchuri Hotel")) {
                cost += 2000;
            } else if (pack.equals("Guljar Hotel")) {
                cost += 1550;
            }else {
                cost += 1299;
            }

            int person = Integer.parseInt(tfnumber2.getText());
            int Days = Integer.parseInt(tfdays.getText());
            cost = cost*person*Days;
            lblprice1.setText("Rs "+cost);


 /*----------------------------------------------------------------------------------------------------------------*/


        } else if (e.getSource()==Book) {

            String username = lblusername1.getText();
            String name = lblname1.getText();
            String id = lblid1.getText();
            String number = lblnumber1.getText();
            String Hotels = (String) ComHotels.getSelectedItem();
            String person = tfnumber2.getText();
            String Days = tfdays.getText();
            String Rooms = (String) rooms.getSelectedItem();
            String Food = (String) FoodAns.getSelectedItem();
            String price = lblprice1.getText();
            String phone = lblphone1.getText();


            try {
                Conn c = new Conn();
                String query = "insert into bookhotel values('"+username+"', '"+name+"', '"+id+"', '"+number+"', '"+Hotels+"', '"+person+"', '"+Days+"', '"+Rooms+"', '"+Food+"','"+price+"', '"+phone+"' ) ";

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
        new BookHotels("");
    }
}
