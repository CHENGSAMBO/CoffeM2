
package coffee;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JChkBox extends JFrame implements ActionListener{
    JCheckBox jbx1,jbx2,jbx3;
    JLabel answer1,answer2,answer3;
    boolean select1,select2,select3;
    String selection;
    JButton Icelatte;
    JChkBox(String title){
        super(title);
        addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            System.exit(0);
            }
        });
        setSize(600,600);
        CheckboxGroup g=new CheckboxGroup();
        jbx1=new JCheckBox("China");
        jbx2=new JCheckBox("Japan");
        jbx3=new JCheckBox("Cambodia");
        answer1=new JLabel();
        answer2=new JLabel();
        answer3=new JLabel();
        
//        jbx3.setText("Cambodia");
        jbx1.addActionListener(this);
        jbx2.addActionListener(this);
        jbx3.addActionListener(this);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(jbx1);
        add(jbx2);
        add(jbx3);
        add(answer1);
        add(answer2);
        add(answer3);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        select1=jbx1.isSelected();
        select2=jbx2.isSelected();
        select3=jbx3.isSelected();
        selection="";
        if(select1){
            selection="C:/Users/SAMBO/Pictures/Saved Pictures/sambo.jpg";
            answer1.setIcon(new ImageIcon(selection));
            
        }else{
            selection="";
            answer1.setIcon(new ImageIcon(selection));
        }
        if(select2){
            selection="C:/Users/SAMBO/Pictures/Saved Pictures/chambok_Higthschool.jpg";
            answer2.setIcon(new ImageIcon(selection));
            
        }else {
            selection="";
            answer2.setIcon(new ImageIcon(selection));
        }
        if(select3){
            selection="C:/Users/SAMBO/Pictures/Saved Pictures/Angkor wat temple.jpg";
            answer3.setIcon(new ImageIcon(selection));
            
        }else {
            selection="";
            answer3.setIcon(new ImageIcon(selection));
        }
    }
    public static void main(String args[]){
        UIManager.getSystemLookAndFeelClassName();
        new JChkBox("JChkBox on JFrame");
         
    }
}
//package coffee;
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.ImageIcon;
//public class JChkBox extends JFrame implements ActionListener{
//    Choice ch_name=new Choice();
//    JButton btnshow;
//    public JChkBox(){    
//        ImageIcon img=new ImageIcon("Americano.png");            //create image 
//        
//        JLabel label=new JLabel();
//        label.setText("sambo cheng  19  leader");
//        label.setIcon(img);
//        label.setHorizontalTextPosition(JLabel.RIGHT);
//        label.setVerticalTextPosition(JLabel.CENTER); 
//        label.setIconTextGap(20);
//        
//        JButton btn_show=new JButton();
//        btn_show.setText("Show Information");
//        btn_show.setFont(new Font("Sambo",Font.BOLD,20));
//        btn_show.setForeground(Color.blue);
//        
//        
//        JFrame frame=new JFrame();      // create frame
//        frame.setTitle("Show Information Member");          //set title
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           //event close
//        frame.setResizable(false);      //prevent frame from being resized
//        frame.setSize(420,500);
//        frame.setVisible(true);//make frame visible
////        frame.add(label);
////      \ frame.add(btn_show);
////        frame.setIconImage(img.getImage());         //change icon of frame
////        frame.getContentPane().setBackground(Color.green);          //change color background
//    }
//    public static void main(String args[]){
//        new JChkBox();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String selectedname = ch_name.getSelectedItem();
//          ImageIcon img=new ImageIcon("Americano.png");            //create image 
//        
//        JLabel label=new JLabel();
//        label.setText("sambo cheng  19  leader");
//        label.setIcon(img);
//        label.setHorizontalTextPosition(JLabel.RIGHT);
//        label.setVerticalTextPosition(JLabel.CENTER); 
//        label.setIconTextGap(20);
//        if(e.getSource()==btnshow)
//            if(selectedname.equals("Cheng Sambo")){
//                 JFrame frame=new JFrame();      // create frame
//        frame.setTitle("Show Information Member");          //set title
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           //event close
//        frame.setResizable(false);      //prevent frame from being resized
//        frame.setSize(420,500);
//        frame.setVisible(true);//make frame visible
//        frame.add(label);
////        frame.add(btn_show);
//        frame.setIconImage(img.getImage());         //change icon of frame
//        frame.getContentPane().setBackground(Color.green);          //change color background
//            }    
//    }
//	
//}