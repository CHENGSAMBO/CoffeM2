package coffee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ABA extends JFrame implements ActionListener{
//        float p;String v;String s;String i;String pro;float pri;int q;
	JTextField showPay,showsize,showice,showsugar,showProduct,showQty,showPrice;
	ABA(String Pay,String Size,String Suger,String Ice,String Name,String Price,String Qty){
//            pay=p;variation=v;sugar=s;ice=i;price=pri;qty=q;product=pro;
            
		JPanel panelABA=new JPanel();
		panelABA.setBounds(-10, -10, 600, 400);
		panelABA.setBackground(Color.gray);
		JLabel LabelABA=new JLabel();
		panelABA.add(LabelABA);
		ImageIcon imageABA=new ImageIcon("ABA.png");
		LabelABA.setIcon(imageABA);
		
		JPanel PanelPay=new JPanel();
		PanelPay.setLayout(null);
		PanelPay.setBounds(0,400,290, 300);
		PanelPay.setBackground(new Color(225,225,225));
		add(PanelPay);
		
		JPanel Panelogo=new JPanel();
		Panelogo.setBounds(300,560,290, 140);
		Panelogo.setBackground(new Color(225,225,225));
		add(Panelogo);
		
		
		
		JPanel buttom=new JPanel();
		buttom.setLayout(null);
		buttom.setBounds(0, 700, 600, 100);
		buttom.setBackground(new Color(0,115,150));
		add(buttom);
		
		JLabel TextPay=new JLabel("Pay");
		TextPay.setFont(new Font("Ebrima",Font.BOLD,17));
		TextPay.setBounds(10, 10, 100, 50);
		PanelPay.add(TextPay);
		
		JLabel TextVariation=new JLabel("Variation");
		TextVariation.setFont(new Font("Ebrima",Font.BOLD,17));
		TextVariation.setBounds(10, 90, 100, 50);
		PanelPay.add(TextVariation);
		
		JLabel TextSugar=new JLabel("Sugar");
		TextSugar.setFont(new Font("Ebrima",Font.BOLD,17));
		TextSugar.setBounds(10, 170,100,50);
		PanelPay.add(TextSugar);
		
		JLabel TextIce=new JLabel("Ice");
		TextIce.setFont(new Font("Ebrima",Font.BOLD,17));
		TextIce.setBounds(10, 250,100,50);
		PanelPay.add(TextIce);
		
		JLabel Textmony=new JLabel("$");
		Textmony.setForeground(Color.red);
		Textmony.setFont(new Font("Ebrima",Font.BOLD,17));
		Textmony.setBounds(250, 10, 100, 50);
		PanelPay.add(Textmony);
		
		JLabel TextSize=new JLabel("Size");
		TextSize.setForeground(Color.red);
		TextSize.setFont(new Font("Ebrima",Font.BOLD,17));
		TextSize.setBounds(250, 90, 100, 50);
		PanelPay.add(TextSize);
		
		JLabel Free1=new JLabel("Free");
		Free1.setForeground(Color.red);
		Free1.setFont(new Font("Ebrima",Font.BOLD,17));
		Free1.setBounds(250, 170,100,50);
		PanelPay.add(Free1);
		
		JLabel Free2=new JLabel("Free");
		Free2.setForeground(Color.red);
		Free2.setFont(new Font("Ebrima",Font.BOLD,17));
		Free2.setBounds(250, 250,100,50);
		PanelPay.add(Free2);
		
		showPay=new JTextField("");
		showPay.setText(Pay);
		showPay.setBounds(120, 10,100,50);
		showPay.setFont(new Font("Movie",Font.BOLD,20));
		showPay.setEditable(false);
		showPay.setBorder(null);
		showPay.setBackground(new Color(225,225,225));
		PanelPay.add(showPay);
		
		showsize=new JTextField();
		showsize.setText(Size);
		showsize.setBounds(120, 90,100,50);
		showsize.setFont(new Font("Movie",Font.BOLD,20));
		showsize.setEditable(false);
		showsize.setBorder(null);
		showsize.setBackground(new Color(225,225,225));
		PanelPay.add(showsize);
		
		showsugar=new JTextField("");
		showsugar.setText(Suger);
		showsugar.setBounds(120, 170,100,50);
		showsugar.setFont(new Font("Movie",Font.BOLD,20));
		showsugar.setEditable(false);
		showsugar.setBorder(null);
		showsugar.setBackground(new Color(225,225,225));
		PanelPay.add(showsugar);
		
		showice=new JTextField("");
		showice.setText(Ice);
		showice.setBounds(120, 250,100,50);
		showice.setFont(new Font("Movie",Font.BOLD,20));
		showice.setEditable(false);
		showice.setBorder(null);
		showice.setBackground(new Color(225,225,225));
		PanelPay.add(showice);
		
		JPanel PanelProduct=new JPanel();
		PanelProduct.setLayout(null);
		PanelProduct.setBounds(300,400,290, 150);
		PanelProduct.setBackground(new Color(225,225,225));
		add(PanelProduct);
		
		JLabel TextProduct=new JLabel("Product");
		TextProduct.setBounds(10,0, 100, 50);
		TextProduct.setFont(new Font("Ebrima",Font.BOLD,17));
		PanelProduct.add(TextProduct);
		add(panelABA);
		
		JLabel TextPrice=new JLabel("Price ($)");
		TextPrice.setBounds(10,50, 100, 50);
		TextPrice.setFont(new Font("Ebrima",Font.BOLD,17));
		PanelProduct.add(TextPrice);
		add(panelABA);
		
		JLabel TextQty=new JLabel("Qty");
		TextQty.setBounds(10,100, 100, 50);
		TextQty.setFont(new Font("Ebrima",Font.BOLD,17));
		PanelProduct.add(TextQty);
		
		showProduct=new JTextField("");
		showProduct.setText(Name);
		showProduct.setBounds(100,0, 200, 50);
		showProduct.setFont(new Font("Movie",Font.BOLD,20));
		showProduct.setEditable(false);
		showProduct.setBorder(null);
		showProduct.setBackground(new Color(225,225,225));
		PanelProduct.add(showProduct);
		
		showPrice=new JTextField("");
		showPrice.setText(Price);
		showPrice.setBounds(100,50, 100, 50);
		showPrice.setFont(new Font("Movie",Font.BOLD,20));
		showPrice.setEditable(false);
		showPrice.setBorder(null);
		showPrice.setBackground(new Color(225,225,225));
		PanelProduct.add(showPrice);
		
		showQty=new JTextField("");
		showQty.setText(Qty);
		showQty.setBounds(100,100, 100, 50);
		showQty.setFont(new Font("Movie",Font.BOLD,20));
		showQty.setEditable(false);
		showQty.setBorder(null);
		showQty.setBackground(new Color(225,225,225));
		PanelProduct.add(showQty);
		
		JLabel TextABA=new JLabel("ABA BANK");
		TextABA.setForeground(Color.white);
		TextABA.setBounds(230, 10, 200, 50);
		TextABA.setFont(new Font("Movie",Font.BOLD,20));
		buttom.add(TextABA);
		
		add(panelABA);
		setResizable(false);
		setLayout(null);
		setBounds(500, 10, 600, 800);
		setTitle("ABA");
		this.setVisible(true);
	}
	public static void main(String[] args) {
            
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

    }


