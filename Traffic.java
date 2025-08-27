import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Traffic extends JFrame implements ActionListener{
    JRadioButton b1,b2,b3;
    JTextField tf1;
    String msg=" ";
    JLabel l;
    Container c;
    ButtonGroup bg;
    Traffic()
    {
        c=getContentPane();
        l=new JLabel("Traffic Stimulation");
        b1=new JRadioButton("RED");
        b2=new JRadioButton("GREEN");
        b3=new JRadioButton("ORANGE");
        tf1=new JTextField();
        bg=new ButtonGroup();
        c.add(l);
        c.add(b1);
        c.add(b2);
        c.add(b3);
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        c.add(tf1);
        b1.setBounds(75, 50, 100,30);
        b2.setBounds(75, 100, 100,30);
        b3.setBounds(75, 150, 100, 30);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setSize(300,300);
        setVisible(true);
        setTitle("Traffic example");
        setLayout(null);

    } 
    public void actionPerformed(ActionEvent ae)
    {
        msg=ae.getActionCommand();
        if(msg=="RED")
        {
            tf1.setBackground(Color.RED);
            tf1.setText("Stop");

        }
        if(msg=="GREEN")
        {
            tf1.setBackground(Color.GREEN);
            tf1.setText("GO");
            
        }
        if(msg=="ORANGE")
        {
            tf1.setBackground(Color.ORANGE);
            tf1.setText("Ready");
            
        }
    }
    public static void main(String[] args) {
        Traffic t=new Traffic();
    }
}