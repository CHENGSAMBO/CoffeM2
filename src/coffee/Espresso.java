package coffee;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Espresso extends JFrame implements ActionListener{
	JTextField mony,Qty;
	JLabel EspressoText;
	String TextSize,Textsuger,TextIce;
	JRadioButton mini,small,medium,large;
	JRadioButton sero,two,five,seven,ten;
	JRadioButton none,inside,outside,little;
	JButton sum,Minus,result,Oder;
	double size=0;
	Espresso(){
		JPanel panel=new JPanel();
		panel.setBackground(Color.gray);
		panel.setBounds(-10, -10,600, 300);
		JLabel Picture=new JLabel();
		panel.add(Picture);
		ImageIcon image=new ImageIcon("espresso1.png");
		Picture.setIcon(image);
		
		EspressoText=new JLabel("Espresso");
		EspressoText.setBounds(100, 290, 200, 50);
		EspressoText.setFont(new Font("Ebrima",Font.BOLD,40));
		add(EspressoText);
		
		JPanel line=new JPanel();
		line.setBounds(0, 340,600 ,1 );
		line.setBackground(Color.gray);
		add(line);
		
		JLabel frome=new JLabel("Payment $"); 
		frome.setBounds(330, 295, 220, 50);
		frome.setFont(new Font("Ebrima",Font.BOLD,20));
		add(frome);
		
		mony=new JTextField();
		mony.setBounds(430, 300,150, 40);
		mony.setFont(new Font("Movie",Font.BOLD,20));
		mony.setEditable(false);
		mony.setBorder(null);
		add(mony);
		
		//Variation
		JPanel panelCheck=new JPanel();
		panelCheck.setBounds(0, 350, 600, 100);
		panelCheck.setLayout(null);
		panelCheck.setBackground(new Color(225,225,225));
		add(panelCheck);
		//Variation
		JLabel Variation=new JLabel("Variation");
		Variation.setBounds(10, -35, 100, 100);
		Variation.setFont(new Font("Ebrima",Font.BOLD,20));
		panelCheck.add(Variation);
		add(panelCheck);
		//mini
		mini=new JRadioButton("Mini");
		mini.setFocusable(false);
		mini.setFont(new Font("Candara",Font.BOLD,20));
		mini.setBackground(new Color(225,225,225));
		mini.setBounds(70,30 , 100,50);
		mini.addActionListener(this);
		panelCheck.add(mini);
		//small
		small=new JRadioButton("Small");
		small.setFocusable(false);
		small.setFont(new Font("Candara",Font.BOLD,20));
		small.setBackground(new Color(225,225,225));
		small.setBounds(170,30 , 100,50);
		small.addActionListener(this);
		panelCheck.add(small);
		//medium
		medium=new JRadioButton("Medium");
		medium.setFocusable(false);
		medium.setFont(new Font("Candara",Font.BOLD,20));
		medium.setBackground(new Color(225,225,225));
		medium.setBounds(270,30 , 100,50);
		medium.addActionListener(this);
		panelCheck.add(medium);
		//large
		large=new JRadioButton("large");
		large.setFocusable(false);
		large.setFont(new Font("Candara",Font.BOLD,20));
		large.setBackground(new Color(225,225,225));
		large.setBounds(400,30 , 100,50);
		large.addActionListener(this);
		panelCheck.add(large);
		
		 ButtonGroup  Gsize=new ButtonGroup();
		 Gsize.add(large);
		 Gsize.add(medium);
		 Gsize.add(mini);
		 Gsize.add(small);
		 
		//suger
		JPanel panelSuger=new JPanel();
		panelSuger.setLayout(null);
		panelSuger.setBounds(0, 470, 600, 100);
		panelSuger.setBackground(new Color(225,225,225));
		add(panelSuger);
		//sero
		sero=new JRadioButton("0 %");
		sero.setFocusable(false);
		sero.setFont(new Font("Candara",Font.BOLD,30));
		sero.setBackground(new Color(225,225,225));
		sero.setBounds(70,30 , 100,50);
		sero.addActionListener(this);
		panelSuger.add(sero);
		//20%
		two=new JRadioButton("20%");
		two.setFocusable(false);
		two.setFont(new Font("Candara",Font.BOLD,30));
		two.setBackground(new Color(225,225,225));
		two.setBounds(170,30 , 100,50);
		two.addActionListener(this);
		panelSuger.add(two);
		
		//50
		five=new JRadioButton("50%");
		five.setFocusable(false);
		five.setFont(new Font("Candara",Font.BOLD,30));
		five.setBackground(new Color(225,225,225));
		five.setBounds(270,30 , 100,50);
		five.addActionListener(this);
		panelSuger.add(five);
		//70
		seven=new JRadioButton("70%");
		seven.setFocusable(false);
		seven.setFont(new Font("Candara",Font.BOLD,30));
		seven.setBackground(new Color(225,225,225));
		seven.setBounds(370,30 , 100,50);
		seven.addActionListener(this);
		panelSuger.add(seven);
		//100
		ten=new JRadioButton("100%");
		ten.setFocusable(false);
		ten.setFont(new Font("Candara",Font.BOLD,30));
		ten.setBackground(new Color(225,225,225));
		ten.setBounds(470,30 , 100,50);
		ten.addActionListener(this);
		panelSuger.add(ten);
		
		 ButtonGroup  Gsuger=new ButtonGroup();
		 Gsuger.add(sero);
		 Gsuger.add(two);
		 Gsuger.add(five);
		 Gsuger.add(seven);
		 Gsuger.add(ten);
		
		//sugertext
		JLabel Suger=new JLabel("Sugar");
		Suger.setBounds(10, -35, 100, 100);
		Suger.setFont(new Font("Ebrima",Font.BOLD,20));
		panelSuger.add(Suger);
		add(panelSuger);
		//ice
		JPanel panelIce=new JPanel();
		panelIce.setBounds(0, 590, 600, 100);
		panelIce.setLayout(null);
		panelIce.setBackground(new Color(225,225,225));
		add(panelIce);
		//ice
		JLabel Ice=new JLabel("Ice");
		Ice.setBounds(10, -35, 100, 100);
		Ice.setFont(new Font("Ebrima",Font.BOLD,30));
		panelIce.add(Ice);
		add(panelIce);
		//none
		//none
		none=new JRadioButton("None");
		none.setFocusable(false);
		none.setFont(new Font("Candara",Font.BOLD,20));
		none.setBackground(new Color(225,225,225));
		none.setBounds(70,30 , 100,50);
		none.addActionListener(this);
		panelIce.add(none);
		//20%
		inside=new JRadioButton("Inside");
		inside.setFocusable(false);
		inside.setFont(new Font("Candara",Font.BOLD,20));
		inside.setBackground(new Color(225,225,225));
		inside.setBounds(170,30 , 100,50);
		inside.addActionListener(this);
		panelIce.add(inside);
		
		//50
		outside=new JRadioButton("Outside");
		outside.setFocusable(false);
		outside.setFont(new Font("Candara",Font.BOLD,20));
		outside.setBackground(new Color(225,225,225));
		outside.setBounds(270,30 , 100,50);
		outside.addActionListener(this);
		panelIce.add(outside);
		//70
		little=new JRadioButton("little");
		little.setFocusable(false);
		little.setFont(new Font("Candara",Font.BOLD,20));
		little.setBackground(new Color(225,225,225));
		little.setBounds(390,30 , 100,50);
		little.addActionListener(this);
		panelIce.add(little);
		
		ButtonGroup  Gice=new ButtonGroup();
		 Gice.add(inside);
		 Gice.add(none);
		 Gice.add(outside);
		 Gice.add(little);
		 
		JPanel panelresult=new JPanel();
		panelresult.setBounds(0,690, 600, 100);
		panelresult.setLayout(null);
		panelresult.setBackground(new Color(89,61,51));
		add(panelresult);
		 
		
		sum=new JButton("+");
		sum.setFocusable(false);
		sum.setBorder(null);
		sum.setBackground(new Color(225,225,225));
		sum.setFont(new Font("Movie",Font.BOLD,20));
		sum.setBounds(150, 30, 50, 20);
		sum.addActionListener(this);
		panelresult.add(sum);
		
		Minus=new JButton("-");
		Minus.setFocusable(false);
		Minus.setBorder(null);
		Minus.setBackground(new Color(225,225,225));
		Minus.setFont(new Font("Movie",Font.BOLD,20));
		Minus.setBounds(10, 30, 50, 20);
		Minus.addActionListener(this);
		panelresult.add(Minus);
		
		Qty=new JTextField();
		Qty.setText("1");
		Qty.setBounds(80, 30,50, 20);
		Qty.setHorizontalAlignment(Qty.CENTER);
		Qty.setFont(new Font("Movie",Font.BOLD,20));
		Qty.setEditable(false);
		Qty.setBorder(null);
		panelresult.add(Qty);
		
		Oder=new JButton("Oder");
		Oder.setFocusable(false);
		Oder.setBorder(null);
		Oder.setBackground(new Color(225,225,225));
		Oder.setFont(new Font("Movie",Font.BOLD,20));
		Oder.setBounds(450, 10, 100, 50);
		Oder.addActionListener(this);
		panelresult.add(Oder);
		
		add(panel);
		
		setLayout(null);
		 setResizable(false);
		setBounds(500, 10, 600, 800);
		setTitle("Espresso");
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Espresso();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mini){
			size=1;
			double B=1*Integer.parseInt(Qty.getText());
			mony.setText(String.valueOf(B));
		}
		if(e.getSource()==small){
			size=1.5;
			double B=1.5*Integer.parseInt(Qty.getText());
			mony.setText(String.valueOf(B));
		}
		if(e.getSource()==medium){
			size=2;
			double B=2*Integer.parseInt(Qty.getText());
			mony.setText(String.valueOf(B));
		}
		if(e.getSource()==large){
			size=2.5;
			double B=2.5*Integer.parseInt(Qty.getText());
			mony.setText(String.valueOf(B));
		}
		if(e.getSource()==sum) {
			double B=size*(Integer.parseInt(Qty.getText())+1);
			mony.setText(String.valueOf(B));
			Qty.setText(String.valueOf((Integer.parseInt(Qty.getText())+1)));
		}
		if(e.getSource()==Minus) {
			double B=size*(Integer.parseInt(Qty.getText())-1);
			mony.setText(String.valueOf(B));
			Qty.setText(String.valueOf((Integer.parseInt(Qty.getText())-1)));
		}
		if(e.getSource()==mini) {
			TextSize=mini.getText();
		}
		if(e.getSource()==small) {
			TextSize=small.getText();
		}
		
		if(e.getSource()==medium) {
			TextSize=medium.getText();
		}
		if(e.getSource()==large) {
			TextSize=large.getText();
		}
		if(e.getSource()==sero) {
			Textsuger=sero.getText();
		}
		if(e.getSource()==two) {
			Textsuger=two.getText();
		}
		if(e.getSource()==five) {
			Textsuger=five.getText();
		}
		if(e.getSource()==seven) {
			Textsuger=seven.getText();
		}
		if(e.getSource()==ten) {
			Textsuger=ten.getText();
		}
		if(e.getSource()==none) {
			TextIce=none.getText();
		}
		if(e.getSource()==inside) {
			TextIce=inside.getText();
		}
		if(e.getSource()==outside) {
			TextIce=outside.getText();
		}
		if(e.getSource()==little) {
			TextIce=little.getText();
		}
               if(e.getSource()==Oder) {
                   System.out.print("Data input in file.");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\netbean\\Coffee\\src\\coffee\\order.txt", true))) {
                writer.write("Order Details:\t");
                writer.write("Drink: " + EspressoText.getText() + "\t");
                writer.write("Size: " + TextSize + "\t");
                writer.write("Sugar: " + Textsuger + "\t");
                writer.write("Ice: " + TextIce + "\t");
                writer.write("Quantity: " + Qty.getText() + "\t");
                writer.write("Total Payment: $" + mony.getText() + "\t");
                writer.write("--------------\n");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            new ABA(mony.getText(),TextSize,Textsuger,TextIce,EspressoText.getText(),String.valueOf(size),Qty.getText());
                        dispose();
               }
	}
}
