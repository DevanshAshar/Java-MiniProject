import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class restaurantsPage extends JFrame 
{
    Container cResto;
    JLabel lblRestaurants,lblResto1,lblResto2,lblResto3,lblResto4,lblResto5;
    JButton btnView1,btnView2,btnView3,btnView4,btnView5;


restaurantsPage()
{
    cResto=getContentPane();
    cResto.setLayout(new FlowLayout());
    lblRestaurants=new JLabel("RESTAURANTS", SwingConstants.CENTER);
    lblRestaurants. setFont(new Font("Serif", Font. BOLD,15));
    lblResto1=new JLabel("Prithvi Cafe");
    lblResto2=new JLabel("Anand        ");
    lblResto3=new JLabel("Amar          ");
    lblResto4=new JLabel("DJ Canteen  ");
    lblResto5=new JLabel("McDonalds   ");
    btnView1=new JButton("View");
    btnView2=new JButton("View");
    btnView3=new JButton("View");
    btnView4=new JButton("View");
    btnView5=new JButton("View");
    /*lblResto1.setBounds(50,150,250,20);
    lblResto2.setBounds(50, 200, 250, 20);
    lblResto3.setBounds(50, 250, 250, 20);
    lblResto4.setBounds(50, 300, 250, 20);
    lblResto5.setBounds(50, 350, 250, 20);*/
    cResto.add(lblRestaurants);
    cResto.add(lblResto1);
    cResto.add(btnView1);
    cResto.add(lblResto2);
    cResto.add(btnView2);
    cResto.add(lblResto3);
    cResto.add(btnView3);
    cResto.add(lblResto4);
    cResto.add(btnView4);
    cResto.add(lblResto5);
    cResto.add(btnView5);
}
    public static void main(String args[]) 
    {
        restaurantsPage frm=new restaurantsPage();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setBounds(300,300,170,240);
        frm.setVisible(true);
    }
}