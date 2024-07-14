package coffee;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Coffee extends JFrame implements ActionListener,MouseListener{
	JButton Icelatte,Mocha,Amaricano,Espresso,Capucino,Strawbery,show;
	Coffee(){
		this.setTitle("Coffee");
		this.setSize(1700, 900);
		this.setLayout(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);          //close form 
		this.setVisible(true);
		
		//logo
		JLabel logo=new JLabel("Java Coffee");
		logo.setBounds(900,10 , 500, 100);
		logo.setFont(new Font("Ink free",Font.BOLD,70));
		this.add(logo);
		//Icelatte
		JLabel LatteText=new JLabel("Ice Latte");
		LatteText.setBounds(840, 430, 200, 30);
		LatteText.setFont(new Font("Candara",Font.BOLD,20));
		this.add(LatteText);
		//Mocha
		JLabel MochaText=new JLabel("Mocha");
		MochaText.setBounds(1090, 430, 200, 30);
		MochaText.setFont(new Font("Candara",Font.BOLD,20));
		this.add(MochaText);
		//Amaricano
		JLabel AmaricanoText=new JLabel("Amaricano");
		AmaricanoText.setBounds(1340, 430, 200, 30);
		AmaricanoText.setFont(new Font("Candara",Font.BOLD,20));
		this.add(AmaricanoText);
		//Espresso
		JLabel EspressoText=new JLabel("Espresso");
		EspressoText.setBounds(840, 750, 200, 30);
		EspressoText.setFont(new Font("Candara",Font.BOLD,20));
		this.add(EspressoText);
		//
		JLabel CapucinoText=new JLabel("Capucino");
		CapucinoText.setBounds(1090, 750, 200, 30);
		CapucinoText.setFont(new Font("Candara",Font.BOLD,20));
		this.add(CapucinoText);
		
		JLabel StrawberyText=new JLabel("Strawbery Latte");
		StrawberyText.setBounds(1310, 750, 200, 30);
		StrawberyText.setFont(new Font("Candara",Font.BOLD,20));
		this.add(StrawberyText);
                
                JLabel lbshow=new JLabel("Show Information Member");
                lbshow.setBounds(1000,800,250,30);
                lbshow.setBackground(new Color(225,225,225));
                lbshow.setFont(new Font("Sambo",Font.BOLD,20));
                this.add(lbshow);
                
                show=new JButton();
		show.setBounds(800, 150, 170, 270);
		show.setBackground(Color.gray);
		show.setBorderPainted(false);
                show.addActionListener(this); 
		show.setBorder(null);
		
		//buttonlatte
		Icelatte=new JButton();
		Icelatte.setBounds(800, 150, 170, 270);
		Icelatte.setBackground(Color.gray);
		Icelatte.setBorderPainted(false);
		Icelatte.setBorder(null);
		JLabel lablelatte=new JLabel();
		Icelatte.add(lablelatte);
		lablelatte.setSize(250, 250);
		ImageIcon piclatte=new ImageIcon("Icelatte.png");
		lablelatte.setIcon(piclatte);
		this.add(Icelatte);
		Icelatte.addActionListener(this);
		Icelatte.addMouseListener(this);
		
		
		//Mocha
		
		//label
		
		Mocha=new JButton();                                        //make button
		Mocha.setBounds(1050, 150, 170, 270);
		Mocha.setBackground(Color.gray);
		Mocha.setBorderPainted(false);
		Mocha.setBorder(null);
		JLabel labelMocha=new JLabel();                         //make label
		Mocha.add(labelMocha);
		labelMocha.setSize(250, 250);
		ImageIcon picMocha=new ImageIcon("Mocha.png");  //add icon
		labelMocha.setIcon(picMocha);
		this.add(Mocha);                               // add button
		Mocha.addActionListener(this);                   // event click
		Mocha.addMouseListener(this);                   // made animation
		
		//Americano
		Amaricano=new JButton();
		Amaricano.setBounds(1300, 150, 170, 270);
		Amaricano.setBackground(Color.gray);
		Amaricano.setBorderPainted(false);
		Amaricano.setBorder(null);
		JLabel labelAmaricano=new JLabel();
		Amaricano.add(labelAmaricano);
		labelAmaricano.setSize(250, 250);
		ImageIcon picAmaricano=new ImageIcon("Americano.png");
		labelAmaricano.setIcon(picAmaricano);
		this.add(Amaricano);
		Amaricano.addActionListener(this);
		Amaricano.addMouseListener(this);
		//espresso
		Espresso=new JButton();
		Espresso.setBounds(800, 470, 170, 270);
		Espresso.setBackground(Color.gray);
		Espresso.setBorderPainted(false);
		Espresso.setBorder(null);
		JLabel lableEspresso=new JLabel();
		Espresso.add(lableEspresso);
		lableEspresso.setSize(250, 250);
		ImageIcon picEspresso=new ImageIcon("espresso.png");
		lableEspresso.setIcon(picEspresso);
		this.add(Espresso);
		Espresso.addActionListener(this);
		Espresso.addMouseListener(this);
		//Capucino
		Capucino=new JButton();
		Capucino.setBounds(1050, 470, 170, 270);
		Capucino.setBackground(Color.gray);
		Capucino.setBorderPainted(false);
		Capucino.setBorder(null);
		JLabel labelCapucino=new JLabel();
                Capucino.add(labelCapucino);
                labelCapucino.setSize(250, 250);
		ImageIcon picCapucino=new ImageIcon("capucino.png");
		labelCapucino.setIcon(picCapucino);
		this.add(Capucino);
		Capucino.addActionListener(this);
		Capucino.addMouseListener(this);
		//Strawbery
		Strawbery=new JButton();
		Strawbery.setBounds(1300, 470, 170, 270);
		Strawbery.setBackground(Color.gray);
		Strawbery.setBorderPainted(false);
		Strawbery.setBorder(null);
		JLabel labelStrawbery=new JLabel();
		Strawbery.add(labelStrawbery);
		labelStrawbery.setSize(250, 250);
		ImageIcon picStrawbery=new ImageIcon("Strawbery.png");
		labelStrawbery.setIcon(picStrawbery);
		this.add(Strawbery);
		Strawbery.addActionListener(this);
		Strawbery.addMouseListener(this);
		
		//imge
		JPanel panel=new JPanel();
		panel.setBackground(Color.white);
		panel.setBounds(0,0,700,800);
		JLabel label=new JLabel();
		panel.add(label);
		ImageIcon ShowPF=new ImageIcon("A Little Coffee.jpeg");
		label.setIcon(ShowPF);
		
		//Top
		
		this.add(panel);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Coffee();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==Icelatte) {
			IceLatte il=new IceLatte();
                        il.show();
		}else if(ae.getSource()==Mocha) {
			Mocha mc=new Mocha();
                        mc.show();
		}else if(ae.getSource()==Amaricano) {
			Americano am=new Americano();
                        am.show();
		}else if(ae.getSource()==Espresso) {
			Espresso ep=new Espresso();
                        ep.show();
		}else if(ae.getSource()==Capucino) {
			Capucino cp=new Capucino();
                        cp.show();
		}else if(ae.getSource()==Strawbery) {
			Strawberry sb=new Strawberry();
                        sb.show();
		}else if(ae.getSource()==show){
                        Member data=new Member();
                        data.show();
            }
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==Icelatte) {
			Icelatte.setBounds(798, 148, 180, 280);
			JLabel lablelatte=new JLabel();
			Icelatte.add(lablelatte);
			lablelatte.setSize(250, 250);
			ImageIcon piclatte=new ImageIcon("Icelatte.png");
			lablelatte.setIcon(piclatte);
			this.add(Icelatte);
		}
		if(e.getSource()==Mocha) {
			Mocha.setBounds(1048, 147, 180, 280);
			JLabel labelMocha=new JLabel();
			Mocha.add(labelMocha);
			labelMocha.setSize(250, 250);
			ImageIcon picMocha=new ImageIcon("Mocha.png");
			labelMocha.setIcon(picMocha);
			this.add(Mocha);
		}
		if(e.getSource()==Strawbery) {
			Strawbery.setBounds(1298, 468, 180, 280);
			JLabel labelStrawbery=new JLabel();
			Strawbery.add(labelStrawbery);
			labelStrawbery.setSize(250, 250);
			ImageIcon picStrawbery=new ImageIcon("Strawbery.png");
			labelStrawbery.setIcon(picStrawbery);
			this.add(Strawbery);
		}
		if(e.getSource()==Espresso) {
			Espresso.setBounds(798, 468, 180, 280);
			JLabel lableEspresso=new JLabel();
			Espresso.add(lableEspresso);
			lableEspresso.setSize(250, 250);
			ImageIcon picEspresso=new ImageIcon("espresso.png");
			lableEspresso.setIcon(picEspresso);
			this.add(Espresso);
		}
		if(e.getSource()==Capucino) {
			Capucino.setBounds(1048, 468, 180, 280);
			JLabel labelCapucino=new JLabel();
			Capucino.add(labelCapucino);
			labelCapucino.setSize(250, 250);
			ImageIcon picCapucino=new ImageIcon("capucino.png");
			labelCapucino.setIcon(picCapucino);
			this.add(Capucino);
		}
		if(e.getSource()==Amaricano) {
			Amaricano.setBounds(1298, 148, 180, 280);
			JLabel labelAmaricano=new JLabel();
			Amaricano.add(labelAmaricano);
			labelAmaricano.setSize(250, 250);
			ImageIcon picAmaricano=new ImageIcon("Americano.png");
			labelAmaricano.setIcon(picAmaricano);
			this.add(Amaricano);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==Icelatte) {
			Icelatte.setBounds(800, 150, 170, 270);
			JLabel lablelatte=new JLabel();
			Icelatte.add(lablelatte);
			lablelatte.setSize(250, 250);
			ImageIcon piclatte=new ImageIcon("Icelatte.png");
			lablelatte.setIcon(piclatte);
			this.add(Icelatte);
		}
		if(e.getSource()==Mocha) {
			Mocha.setBounds(1050, 150, 170, 270);
			JLabel labelMocha=new JLabel();
			Mocha.add(labelMocha);
			labelMocha.setSize(250, 250);
			ImageIcon picMocha=new ImageIcon("Mocha.png");
			labelMocha.setIcon(picMocha);
			this.add(Mocha);
		}
		if(e.getSource()==Strawbery) {
			Strawbery.setBounds(1300, 470, 170, 270);
			JLabel labelStrawbery=new JLabel();
			Strawbery.add(labelStrawbery);
			labelStrawbery.setSize(250, 250);
			ImageIcon picStrawbery=new ImageIcon("Strawbery.png");
			labelStrawbery.setIcon(picStrawbery);
			this.add(Strawbery);
		}
		if(e.getSource()==Espresso) {
			Espresso.setBounds(800, 470, 170, 270);
			JLabel lableEspresso=new JLabel();
			Espresso.add(lableEspresso);
			lableEspresso.setSize(250, 250);
			ImageIcon picEspresso=new ImageIcon("espresso.png");
			lableEspresso.setIcon(picEspresso);
			this.add(Espresso);
		}
		if(e.getSource()==Capucino) {
			Capucino.setBounds(1050, 470, 170, 270);
			JLabel labelCapucino=new JLabel();
			Capucino.add(labelCapucino);
			labelCapucino.setSize(250, 250);
			ImageIcon picCapucino=new ImageIcon("capucino.png");
			labelCapucino.setIcon(picCapucino);
			this.add(Capucino);
		}
		if(e.getSource()==Amaricano) {
			Amaricano.setBounds(1300, 150, 170, 270);
			JLabel labelAmaricano=new JLabel();
			Amaricano.add(labelAmaricano);
			labelAmaricano.setSize(250, 250);
			ImageIcon picAmaricano=new ImageIcon("Americano.png");
			labelAmaricano.setIcon(picAmaricano);
			this.add(Amaricano);
		}
		
	}

}
