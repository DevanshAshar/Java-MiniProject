import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class landingPage extends JFrame implements ActionListener
{
    Container c;
    JTextField txtname,txtadd,txtmobile,txtemail;
    JButton btnorder;
    JLabel lblheader,lblname,lbladd,lblmobile,lblemail;
    landingPage()
    {
        c=getContentPane();
        c.setLayout(new FlowLayout());
        lblheader=new JLabel("Welcome to FoodStation");
        lblname = new JLabel("Name: ");
        txtname=new JTextField(10);
        lbladd = new JLabel("Address: ");
        txtadd=new JTextField(10);
        lblmobile=new JLabel("Mobile Number: ");
        txtmobile = new JTextField(10);
        lblemail = new JLabel("Email ID: ");
        txtemail = new JTextField(10);
        btnorder = new JButton("Order Now");
        c.add(lblheader);
        c.add(lblname);
        c.add(txtname);
        c.add(lbladd);
        c.add(txtadd);
        c.add(lblmobile);
        c.add(txtmobile);
        c.add(lblemail);
        c.add(txtemail);
        c.add(btnorder);
        btnorder.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae)
    {

    }
    public static void main(String args[])
    {
        landingPage lp = new landingPage();
        lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lp.setBounds(300,300,160,300);
	    lp.setVisible(true);
        lp.setTitle("FoodStation");
    }
}