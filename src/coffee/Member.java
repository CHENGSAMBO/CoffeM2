
package coffee;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.border.AbstractBorder;
import java.awt.geom.RoundRectangle2D;
import java.util.Random;

public class Member extends JFrame implements ActionListener,MouseListener{
 
    JLabel picture,Text;
    ButtonGroup group;
    String selection,text;
    JButton randomButton;
    Random random;
    JRadioButton sambo,sovanet,vichhia,pordin,vangtong,meyseang,mengchou,mengseang;
    public Member(){
    ImageIcon img=new ImageIcon("A Little Coffee.jpeg"); 
    this.setTitle("Information of Member");
    this.setSize(770, 400);
    this.setLayout(null);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);          //close form 
    this.setVisible(true); 
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.setIconImage(img.getImage());
    
    random = new Random();

    //title
    JLabel logo=new JLabel("Information of Member");
    logo.setBounds(200,10 , 500, 50);
    logo.setFont(new Font("sambo",Font.BOLD,30));
    this.add(logo);

    
    //Panel Name
    JPanel panelName=new JPanel();
    panelName.setBounds(0, 70, 770, 150);
    panelName.setLayout(null);
    panelName.setBackground(new Color(225,225,225));
    this.add(panelName);
    
    JLabel Variation=new JLabel("Member");
    Variation.setBounds(10, -35, 100, 100);
    Variation.setFont(new Font("Ebrima",Font.BOLD,20));
    panelName.add(Variation);
    this.add(panelName);
        
    //sambo
    sambo=new JRadioButton("Cheng Sambo");
    sambo.setFocusable(false);
    sambo.setFont(new Font("Candara",Font.BOLD,20));
    sambo.setBackground(new Color(225,225,225));		
    sambo.setBounds(10,30 , 170,50);
    sambo.addActionListener(this);
    
    //sovanet
    sovanet=new JRadioButton("Hout Sovanet");
    sovanet.setFocusable(false);
    sovanet.setFont(new Font("Candara",Font.BOLD,20));
    sovanet.setBackground(new Color(225,225,225));
    sovanet.setBounds(190,30 , 170,50);
    sovanet.addActionListener(this);
    
    //vicchey
    vichhia=new JRadioButton("Chhorn  Vichhey");
    vichhia.setFocusable(false);
    vichhia.setFont(new Font("Candara",Font.BOLD,20));
    vichhia.setBackground(new Color(225,225,225));
    vichhia.setBounds(370,30 , 170,50);
    vichhia.addActionListener(this);
    
    //pordin
    pordin=new JRadioButton("Chheap Pordin");
    pordin.setFocusable(false);
    pordin.setFont(new Font("Candara",Font.BOLD,20));
    pordin.setBackground(new Color(225,225,225));
    pordin.setBounds(570,30 , 170,50);
    pordin.addActionListener(this);
    
    //vantong
    vangtong=new JRadioButton("Chav Vangtong");
    vangtong.setFocusable(false);
    vangtong.setFont(new Font("Candara",Font.BOLD,20));
    vangtong.setBackground(new Color(225,225,225));		
    vangtong.setBounds(10,90 , 170,50);
    vangtong.addActionListener(this);
    
    //mengchou
    mengchou=new JRadioButton("Chhun Mengchou");
    mengchou.setFocusable(false);
    mengchou.setFont(new Font("Candara",Font.BOLD,20));
    mengchou.setBackground(new Color(225,225,225));		
    mengchou.setBounds(190,90 , 180,50);
    mengchou.addActionListener(this);
    
    //mengseang
    mengseang=new JRadioButton("Souy Mengseang");
    mengseang.setFocusable(false);
    mengseang.setFont(new Font("Candara",Font.BOLD,20));
    mengseang.setBackground(new Color(225,225,225));		
    mengseang.setBounds(370,90 , 170,50);
    mengseang.addActionListener(this);
    
    //meyseang
    meyseang=new JRadioButton("Chea Meyseang");
    meyseang.setFocusable(false);
    meyseang.setFont(new Font("Candara",Font.BOLD,20));
    meyseang.setBackground(new Color(225,225,225));		
    meyseang.setBounds(570,90 , 170,50);
    meyseang.addActionListener(this);
    
    panelName.add(sambo);
    panelName.add(sovanet);
    panelName.add(vichhia);
    panelName.add(pordin);
    panelName.add(vangtong);
    panelName.add(mengchou);
    panelName.add(mengseang);
    panelName.add(meyseang);
    
    
    // Group the radio buttons.
        group = new ButtonGroup();
        group.add(sambo);
        group.add(sovanet);
        group.add(vichhia);
        group.add(pordin);
        group.add(vangtong);
        group.add(mengchou);
        group.add(mengseang);
        group.add(meyseang);
    // Image Label
        picture = new JLabel();
        picture.setBounds(70, 250, 80, 80);
        this.add(picture);
    // text label
        Text = new JLabel();
        Text.setBounds(170, 260, 600, 50);
        this.add(Text);
        Text.setFont(new Font("sambo",Font.BOLD,30));
        // Random Button
        randomButton = new JButton("Random Member");
        randomButton.setFocusable(false);
        randomButton.setBounds(300, 320, 170, 30);
        randomButton.setFont(new Font("Candara", Font.BOLD, 15));
        randomButton.addActionListener(this);
        this.add(randomButton);
        
        
    }
    public static void main(String args[]){
        new Member();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == randomButton) {
            randomSelection();
        } else {
            if(sambo.isSelected()){
            selection="C:/Users/SAMBO/Pictures/Saved Pictures/sambo-1.jpg";
            text="Chneg Sambo   19    Male  leader";
            }else if(sovanet.isSelected()){
               selection="C:/Users/SAMBO/Pictures/Saved Pictures/sovanet.jpg";
               text="Hout Sovanet   20  Male    Member";
            }else if(vichhia.isSelected()){
               selection="C:/Users/SAMBO/Pictures/Saved Pictures/vichhia.jpg";
               text="Chhorn Vichhia 19  Male    Member";
            }else if(pordin.isSelected()){
               selection="C:/Users/SAMBO/Pictures/Saved Pictures/pordin.jpg";
               text="Chheap Pordin     20  Male    Member";
            }else if(vangtong.isSelected()){
               selection="C:/Users/SAMBO/Pictures/Saved Pictures/vanthong.jpg";  
               text="Chav Vanthong   20  Male    Member";
            }else if(mengchou.isSelected()){
               selection="C:/Users/SAMBO/Pictures/Saved Pictures/mengchou.jpg";  
               text="Chhun Mengchou 20  Male    Member";
            }else if(mengseang.isSelected()){
               selection="C:/Users/SAMBO/Pictures/Saved Pictures/mengseang.jpg"; 
               text="Souy Mengseang 20  Male    Member";
            }else if(meyseang.isSelected()){
               selection="C:/Users/SAMBO/Pictures/Saved Pictures/meyseang.jpg"; 
               text="Chea Meyseang  20  Male    Memeber";
            }else{
               selection="";
               text="";
            }
            picture.setIcon(new ImageIcon(selection));
            Text.setText(text);
            }
        }
    private void randomSelection() {
        int rand = random.nextInt(8); // There are 8 members
        switch (rand) {
            case 0:
                selection = "C:/Users/SAMBO/Pictures/Saved Pictures/sambo-1.jpg";
                text = "Chneg Sambo   19    Male  leader";
                break;
            case 1:
                selection = "C:/Users/SAMBO/Pictures/Saved Pictures/sovanet.jpg";
                text = "Hout Sovanet   20  Male    Member";
                break;
            case 2:
                selection = "C:/Users/SAMBO/Pictures/Saved Pictures/vichhia.jpg";
                text = "Chhorn Vichhia 19  Male    Member";
                break;
            case 3:
                selection = "C:/Users/SAMBO/Pictures/Saved Pictures/pordin.jpg";
                text = "Chheap Pordin     20  Male    Member";
                break;
            case 4:
                selection = "C:/Users/SAMBO/Pictures/Saved Pictures/vanthong.jpg";
                text = "Chav Vanthong   20  Male    Member";
                break;
            case 5:
                selection = "C:/Users/SAMBO/Pictures/Saved Pictures/mengchou.jpg";
                text = "Chhun Mengchou 20  Male    Member";
                break;
            case 6:
                selection = "C:/Users/SAMBO/Pictures/Saved Pictures/mengseang.jpg";
                text = "Souy Mengseang 20  Male    Member";
                break;
            case 7:
                selection = "C:/Users/SAMBO/Pictures/Saved Pictures/meyseang.jpg";
                text = "Chea Meyseang  20  Male    Member";
                break;
            default:
                selection = "";
                text = "";
                break;
        }
        picture.setIcon(new ImageIcon(selection));
        Text.setText(text);
        }
    @Override
    public void mouseExited(MouseEvent e) {
            
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
            
    }
}

