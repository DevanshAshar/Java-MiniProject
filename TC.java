import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class TC extends JFrame
{
	Container c;
    JLabel l1,l2,l3,l4;
	JComboBox tc1, tc2;
	JTextField t1,t2;
	JButton b,dot,ac,bs,pm;
	JButton n0,n1,n2,n3,n4,n5,n6,n7,n8,n9;
	
	public TC(String s)
	{
		super(s);
	}
	
	public void setComp()
	{
		c= getContentPane(); 
        String arr1[] = {"Celsius","Fahrenheit","Kelvin"};
		String arr2[] = {"Celsius","Fahrenheit","Kelvin"};
		l1 = new JLabel("To");
        l1.setFont(new Font("Tahoma", Font.BOLD, 10));
		l2 = new JLabel("Enter the Value:");
        l2.setFont(new Font("Tahoma", Font.BOLD, 10));
		l3 = new JLabel("Converted Value:");
        l3.setFont(new Font("Tahoma", Font.BOLD, 10));
		l4 = new JLabel("From");
        l4.setFont(new Font("Tahoma", Font.BOLD, 10));
		tc1 = new JComboBox(arr1);
		tc2 = new JComboBox(arr2);
		t1 = new JTextField();
		t2 = new JTextField();
		b = new JButton("Convert");
        b.setBackground(Color.GREEN);
		dot = new JButton(".");
		pm = new JButton("±");
		bs = new JButton("<--");
		ac = new JButton("C");
        ac.setBackground(Color.DARK_GRAY);
        ac.setForeground(Color.white);
		n0 = new JButton("0");
		n1 = new JButton("1");
		n2 = new JButton("2");
		n3 = new JButton("3");
		n4 = new JButton("4");
		n5 = new JButton("5");
		n6 = new JButton("6");
		n7 = new JButton("7");
		n8 = new JButton("8");
		n9 = new JButton("9");
		setLayout(null);
		tc1.setBounds(75,50,100,20);
		t1.setBounds(200,50,100,20);
		l1.setBounds(100,75,50,20);
		l4.setBounds(90,25,50,20);
		l2.setBounds(200,25,100,20);
		l3.setBounds(200,75,100,20);
		tc2.setBounds(75,100,100,20);
		t2.setBounds(200,100,100,20);
		b.setBounds(138,150,100,20);
		ac.setBounds(238,200,50,100);
		pm.setBounds(238,350,50,50);
		bs.setBounds(238,300,50,50);
		dot.setBounds(188,350,50,50);
		n0.setBounds(88,350,100,50);
		n1.setBounds(88,200,50,50);
		n2.setBounds(138,200,50,50);
		n3.setBounds(188,200,50,50);
		n4.setBounds(88,250,50,50);
		n5.setBounds(138,250,50,50);
		n6.setBounds(188,250,50,50);
		n7.setBounds(88,300,50,50);
		n8.setBounds(138,300,50,50);
		n9.setBounds(188,300,50,50);
		b.addActionListener(new Handler());
		ac.addActionListener(new Handler());
		pm.addActionListener(new Handler());
		bs.addActionListener(new Handler());
		dot.addActionListener(new Handler());
		n0.addActionListener(new Handler());
		n1.addActionListener(new Handler());
		n2.addActionListener(new Handler());
		n3.addActionListener(new Handler());
		n4.addActionListener(new Handler());
		n5.addActionListener(new Handler());
		n6.addActionListener(new Handler());
		n7.addActionListener(new Handler());
		n8.addActionListener(new Handler());
		n9.addActionListener(new Handler());
		c.add(tc1);
		c.add(tc2);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(t1);
		c.add(t2);
		c.add(b);
		c.add(ac);
		c.add(dot);
		c.add(pm);
		c.add(bs);
		c.add(n0);
		c.add(n1);
		c.add(n2);
		c.add(n3);
		c.add(n4);
		c.add(n5);
		c.add(n6);
		c.add(n7);
		c.add(n8);
		c.add(n9);
		t2.setEditable(false);
	}
	
    
	class Handler extends Exception implements ActionListener 
	{
        
        public void actionPerformed(ActionEvent e)
		{
			try{String x,y;
                x = (String)tc1.getSelectedItem();
                y = (String)tc2.getSelectedItem();
                
                if(e.getSource()==n0)
                    t1.setText(t1.getText() + "0");
                if(e.getSource()==n1)
                    t1.setText(t1.getText() + "1");
                if(e.getSource()==n2)
                    t1.setText(t1.getText() + "2");
                if(e.getSource()==n3)
                    t1.setText(t1.getText() + "3");
                if(e.getSource()==n4)
                    t1.setText(t1.getText() + "4");
                if(e.getSource()==n5)
                    t1.setText(t1.getText() + "5");
                if(e.getSource()==n6)
                    t1.setText(t1.getText() + "6");
                if(e.getSource()==n7)
                    t1.setText(t1.getText() + "7");
                if(e.getSource()==n8)
                    t1.setText(t1.getText() + "8");
                if(e.getSource()==n9)
                    t1.setText(t1.getText() + "9");
                if(e.getSource()==dot)
                    t1.setText(t1.getText() + ".");
                if(e.getSource()==ac)
                {
                    t1.setText("");
                    t2.setText("");
                }
                if(e.getSource()==pm)
                {
                    String spm = new String();
                    spm = t1.getText();
                    if(spm.length() == 0)
                        t1.setText("-");
                    else if(spm.charAt(0)!='-')
                        t1.setText("-" + t1.getText());
                    else
                        t1.setText("" + spm.substring(1));
                }
                if(e.getSource()==bs)
                {
                    int n;
                    String bsp = new String();
                    bsp = t1.getText();
                    n = bsp.length();
                    t1.setText("" + bsp.substring(0,n-1));
                }
                if(e.getSource()==b)
                {
                    if(x=="Celsius" && y=="Celsius")
                    {
                        t2.setText(""+t1.getText());
                    }
                    else if(x=="Fahrenheit" && y=="Fahrenheit")
                    {
                        t2.setText(""+t1.getText());
                    }
                    else if(x=="Kelvin" && y=="Kelvin")
                    {
                        t2.setText(""+t1.getText());
                    }
                    
                    else if(x=="Celsius" && y=="Fahrenheit")
                    {
                        String s = t1.getText();
                        float a = Float.parseFloat(s);
                        float b = (float)((a * 9/5)+32);
                        t2.setText(""+b);
                    }
                    else if(x=="Celsius" && y=="Kelvin")
                    {
                        String s = t1.getText();
                        float a = Float.parseFloat(s);
                        float b = (float)(a + 273.15);
                        t2.setText(""+b);
                    }
                    
                    else if(x=="Fahrenheit" && y=="Celsius")
                    {
                        String s = t1.getText();
                        float a = Float.parseFloat(s);
                        float b = (float)((a - 32) * 5/9);
                        t2.setText(""+b);
                    }
                    else if(x=="Fahrenheit" && y=="Kelvin")
                    {
                        String s = t1.getText();
                        float a = Float.parseFloat(s);
                        float b = (float)((a - 32) * 5/9 + 273.15);
                        t2.setText(""+b);
                    }
                    
                    else if(x=="Kelvin" && y=="Celsius")
                    {
                        String s = t1.getText();
                        float a = Float.parseFloat(s);
                        float b = (float)(a - 273.15);
                        t2.setText(""+b);
                    }
                    else if(x=="Kelvin" && y=="Fahrenheit")
                    {
                        String s = t1.getText();
                        float a = Float.parseFloat(s);
                        float b = (float)((a - 273.15) * 9/5 + 32);
                        t2.setText(""+b);
                    }
                    
                    
                }
            }catch(Exception err){
                System.out.println("Error"+" "+err);
                JOptionPane.showMessageDialog(c,"Invalid Input");
            }
            
        }

    
	}
	
	public static void main(String[] args)
	{
		TC jf = new TC("Temperature Converter");
		jf.setComp();
        jf.getContentPane().setBackground(Color.CYAN);
		jf.setSize(400,500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
