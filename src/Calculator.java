import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Calculator extends Applet implements ActionListener {
	JTextField screen;
	JButton calcs;
	int total = 0;
	char sign = '+';

	public void init () {
		resize (220, 340);
		setBackground(new Color(42, 45, 55));
		
		JLabel title = new JLabel ("Calculator");
		title.setFont (new Font ("Calibri", Font.BOLD, 30));
		title.setForeground (Color.white);
		add (title);

		screen = new JTextField (10);
		screen.setFont (new Font ("Calibri", Font.BOLD, 26));
		screen.setForeground (Color.white);
		screen.setBackground (new Color(40, 43, 51));

		Panel grid = new Panel (new GridLayout (4, 4));

		JButton b7 = new JButton ("7");
		b7.setActionCommand ("7");
		b7.addActionListener (this);
		b7.setPreferredSize (new Dimension (56, 60));
		b7.setFont (new Font ("Calibri", Font.BOLD, 22));
		b7.setBackground (new Color(40, 43, 51));
		b7.setForeground (new Color(255, 255, 255));

		grid.add (b7);

		JButton b8 = new JButton ("8");
		b8.setActionCommand ("8");
		b8.addActionListener (this);
		b8.setFont (new Font ("Calibri", Font.BOLD, 22));
		b8.setBackground (new Color(40, 43, 51));
		b8.setForeground (new Color(255, 255, 255));

		grid.add (b8);

		JButton b9 = new JButton ("9");
		b9.setActionCommand ("9");
		b9.addActionListener (this);
		b9.setFont (new Font ("Calibri", Font.BOLD, 22));
		b9.setBackground (new Color(40, 43, 51));
		b9.setForeground (new Color(255, 255, 255));

		grid.add (b9);

		JButton bSlash = new JButton ("/");
		bSlash.setActionCommand ("/");
		bSlash.addActionListener (this);
		bSlash.setBackground (new Color(40, 43, 51));
		bSlash.setForeground (new Color(203, 106, 108));
		bSlash.setFont (new Font ("Calibri", Font.BOLD, 22));

		grid.add (bSlash);

		JButton b4 = new JButton ("4");
		b4.setActionCommand ("4");
		b4.addActionListener (this);
		b4.setFont (new Font ("Calibri", Font.BOLD, 22));
		b4.setBackground (new Color(40, 43, 51));
		b4.setForeground (new Color(255, 255, 255));

		grid.add (b4);

		JButton b5 = new JButton ("5");
		b5.setActionCommand ("5");
		b5.addActionListener (this);
		b5.setFont (new Font ("Calibri", Font.BOLD, 22));
		b5.setBackground (new Color(40, 43, 51));
		b5.setForeground (new Color(255, 255, 255));

		grid.add (b5);

		JButton b6 = new JButton ("6");
		b6.setActionCommand ("6");
		b6.addActionListener (this);
		b6.setFont (new Font ("Calibri", Font.BOLD, 22));
		b6.setBackground (new Color(40, 43, 51));
		b6.setForeground (new Color(255, 255, 255));

		grid.add (b6);

		JButton bMult = new JButton ("X");
		bMult.setActionCommand ("X");
		bMult.addActionListener (this);
		bMult.setBackground (new Color(40, 43, 51));
		bMult.setForeground (new Color(203, 106, 108));
		bMult.setFont (new Font ("Calibri", Font.BOLD, 22));

		grid.add (bMult);

		JButton b1 = new JButton ("1");
		b1.setActionCommand ("1");
		b1.addActionListener (this);
		b1.setFont (new Font ("Calibri", Font.BOLD, 22));
		b1.setBackground (new Color(40, 43, 51));
		b1.setForeground (new Color(255, 255, 255));

		grid.add (b1);

		JButton b2 = new JButton ("2");
		b2.setActionCommand ("2");
		b2.addActionListener (this);
		b2.setFont (new Font ("Calibri", Font.BOLD, 22));
		b2.setBackground (new Color(40, 43, 51));
		b2.setForeground (new Color(255, 255, 255));

		grid.add (b2);

		JButton b3 = new JButton ("3");
		b3.setActionCommand ("3");
		b3.addActionListener (this);
		b3.setFont (new Font ("Calibri", Font.BOLD, 22));
		b3.setBackground (new Color(40, 43, 51));
		b3.setForeground (new Color(255, 255, 255));

		grid.add (b3);

		JButton bSub = new JButton ("-");
		bSub.setActionCommand ("-");
		bSub.addActionListener (this);
		bSub.setBackground (new Color(40, 43, 51));
		bSub.setForeground (new Color(203, 106, 108));
		bSub.setFont (new Font ("Calibri", Font.BOLD, 22));

		grid.add (bSub);

		JButton bClr = new JButton ("CE");
		bClr.setActionCommand ("CE");
		bClr.addActionListener (this);
		bClr.setBackground (new Color(40, 43, 51));
		bClr.setForeground (new Color(70, 206, 183));
		bClr.setFont (new Font ("Calibri", Font.BOLD, 22));

		grid.add (bClr);

		JButton b0 = new JButton ("0");
		b0.setActionCommand ("0");
		b0.addActionListener (this);
		b0.setFont (new Font ("Calibri", Font.BOLD, 22));
		b0.setBackground (new Color(40, 43, 51));
		b0.setForeground (new Color(255, 255, 255));

		grid.add (b0);

		JButton bEqu = new JButton ("=");
		bEqu.setActionCommand ("=");
		bEqu.addActionListener (this);
		bEqu.setBackground (new Color(40, 43, 51));
		bEqu.setForeground (new Color(70, 206, 183));
		bEqu.setFont (new Font ("Calibri", Font.BOLD, 22));

		grid.add (bEqu);

		JButton bAdd = new JButton ("+");
		bAdd.setActionCommand ("+");
		bAdd.addActionListener (this);
		bAdd.setBackground (new Color(40, 43, 51));
		bAdd.setForeground (new Color(203, 106, 108));
		bAdd.setFont (new Font ("Calibri", Font.BOLD, 22));

		grid.add (bAdd);

		add (screen);
		add (grid);
	}


	public void actionPerformed (ActionEvent e) {
		if (e.getActionCommand ().equals ("CE"))
		{
			screen.setText ("");
			total = 0;
		}
		else if (e.getActionCommand ().equals ("/"))
		{
			signUpdate ();
			sign = '/';
		}
		else if (e.getActionCommand ().equals ("X"))
		{
			signUpdate ();
			sign = '*';
		}
		else if (e.getActionCommand ().equals ("-"))
		{
			signUpdate ();
			sign = '-';
		}
		else if (e.getActionCommand ().equals ("+"))
		{
			signUpdate ();
			sign = '+';
		}
		else if (e.getActionCommand ().equals ("="))
		{
			calculate ();
			screen.setText (total + "");
			total = -1;
		}
		else
			screen.setText (screen.getText () + e.getActionCommand ());
	}

	public void signUpdate () {
		if (total == 0)
			total = Integer.parseInt (screen.getText ());
		else
			calculate ();
		screen.setText ("");
	}

	public void calculate () {
		if (sign == '+')
			total = total + Integer.parseInt (screen.getText ());
		else if (sign == '-')
			total = total - Integer.parseInt (screen.getText ());
		else if (sign == '*')
			total = total * Integer.parseInt (screen.getText ());
		else if (sign == '/')
			total = total / Integer.parseInt (screen.getText ());
	}
}
