package Travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable{

    Thread t;
    JProgressBar bar;

    String username;

    Loading(String username){
        this.username = username;

        t = new Thread(this);

        
        setBounds(300,150,650,400);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel text = new JLabel("Travel and Tourism Application");
        text.setBounds(60,-150,600,400);
        text.setForeground(Color.blue);
        text.setFont(new Font("SAN_SARIF",Font.BOLD,34));
        add(text);

        bar = new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);

        JLabel loading = new JLabel("Loading, please wait...");
        loading.setBounds(210,150,400,30);
        loading.setForeground(Color.red);
        loading.setFont(new Font("SAN_SARIF",Font.BOLD,16));
        add(loading);

        JLabel lblusername = new JLabel("Welcome "+ username);
        lblusername.setBounds(50,310,400,30);
        lblusername.setForeground(Color.red);
        lblusername.setFont(new Font("SAN_SARIF",Font.BOLD,16));
        add(lblusername);

        t.start();

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void run(){
        try{

            for(int i=1; i<=101; i++){
                int max = bar.getMaximum();
                int value = bar.getValue();

                if( value < max){
                    bar.setValue(bar.getValue() + 1);
                }else{
                    setVisible(false);

                    //then through to the dashboard class
                    new Dashboard(username);
                }
                Thread.sleep(5);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new Loading("");
    }
}
