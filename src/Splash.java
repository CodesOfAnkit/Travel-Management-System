package Travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {

    Thread t;
    Splash(){

        setSize(1200,600);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons//splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        setLocation(50,60);

        int x = 1;
        for(int i=1; i<=500; x=x+7, i=i+6){
            setLocation(630 - (x+i)/2, 350-(i/2)); // the value of x and y can bw change as per frame view
            setSize(x+i,i);
            try{
                Thread.sleep(10);
            }catch (Exception e){}
        }

        t = new Thread(this);
        t.start();
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            new Login();
        }catch (Exception e){}

    }


    public static void main(String[] args){
        new Splash();
    }
}
