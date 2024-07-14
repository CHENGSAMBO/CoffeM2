package coffee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {
    private final JFrame frame;
    private final JPanel mainPanel;
    private final CardLayout cardLayout;
    private JPanel loginPanel, registerPanel;
    private String LoginName;

    // In-memory user storage
    private final String USERS_FILE = "D:\\netbean\\Coffee\\src\\coffee\\user_data.txt";
    private final Map<String, String> users = new HashMap<>();

    public Login() {
        frame = new JFrame("Login or Register account");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1540, 820);
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        frame.add(mainPanel);
        loadUsersFromFile(USERS_FILE);
        createLoginPanel();
        createRegisterPanel();
        mainPanel.add(loginPanel, "Login");
        mainPanel.add(registerPanel, "Register");
        cardLayout.show(mainPanel, "Login");
        frame.setVisible(true);

    }


    private void createLoginPanel() {
        loginPanel = new JPanel(null);

        ImageIcon originalImg = new ImageIcon("6 Reasons To Add Coffee To Your Haircare Routine - Beauty Epic.png");
        Image img = originalImg.getImage();
        Image resizedImg = img.getScaledInstance(400, 600, Image.SCALE_SMOOTH); // Resize to 200x200 pixels
        ImageIcon resizedIcon = new ImageIcon(resizedImg);
        JLabel imageLabel = new JLabel(resizedIcon);
        imageLabel.setBounds(200,100, resizedIcon.getIconWidth(), resizedIcon.getIconHeight());
        
        
	ImageIcon originalImg1 = new ImageIcon("Premium Photo _ Cup of coffee and scoop on brown background_ Top view copy space .png");
        Image img1 = originalImg1.getImage();
        Image resizedImg1 = img1.getScaledInstance(1540, 820, Image.SCALE_SMOOTH); // Resize to 200x200 pixels
        ImageIcon resizedIcon1 = new ImageIcon(resizedImg1);
        JLabel imageLabel1 = new JLabel(resizedIcon1);
        imageLabel1.setBounds(0, 0, resizedIcon1.getIconWidth(), resizedIcon1.getIconHeight());
        
        JButton google=new JButton("  Login with Google");
	google.setBackground(Color.white);
	google.setFocusable(false);
	google.setForeground(new Color(102,51,0));
	google.setBorder(null);
	google.setBounds(750, 525, 450, 50);
	ImageIcon googlepic=new ImageIcon("Google.png");
	google.setIcon(googlepic);
	loginPanel.add(google);
        JButton feackbook=new JButton("Login with Facekbook");
	feackbook.setBackground(Color.white);
	feackbook.setBorder(null);
	feackbook.setForeground(new Color(102,51,0));
	feackbook.setFocusable(false);
	feackbook.setBounds(750, 600, 450, 50);
	ImageIcon Feackbookpic=new ImageIcon("feck book.png");
	feackbook.setIcon(Feackbookpic);
	loginPanel.add(feackbook);
        
        JLabel nameStor = new JLabel("Welcome to M2 Coffee");
        JPanel navigationPanel = new JPanel();
        JLabel lblTitle = new JLabel("Login your Account");
        JLabel lblUsername = new JLabel("Username:");
        JTextField txtUsername = new JTextField();
        JLabel lblPassword = new JLabel("Password:");
        JPasswordField txtPassword = new JPasswordField();

        // Load and resize the eye icons
        ImageIcon viewIcon = new ImageIcon("D:\\Database\\Phone-Shop-Management-master\\src\\rupp\\icon\\hide.png");                                                                                                  // // here
        Image viewImg = viewIcon.getImage();
        Image resizedViewImg = viewImg.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon resizedViewIcon = new ImageIcon(resizedViewImg);
        ImageIcon hideIcon = new ImageIcon("D:\\Database\\Phone-Shop-Management-master\\src\\rupp\\icon\\view.png");
        Image hideImg = hideIcon.getImage();
        Image resizedHideImg = hideImg.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon resizedHideIcon = new ImageIcon(resizedHideImg);

        // Eye icon button to toggle password visibility
        JButton btnTogglePassword = new JButton(resizedViewIcon); // Start with the view icon
        btnTogglePassword.setBounds(1150, 350, 45, 45); // Adjust position as needed
        btnTogglePassword.setOpaque(false);
        btnTogglePassword.setContentAreaFilled(false);
        btnTogglePassword.setBorderPainted(false);
        btnTogglePassword.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnTogglePassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtPassword.getEchoChar() != '\u0000') {
                    txtPassword.setEchoChar((char) 0);
                    btnTogglePassword.setIcon(resizedHideIcon); // Switch to hide icon
                } else {
                    txtPassword.setEchoChar('•');
                    btnTogglePassword.setIcon(resizedViewIcon); // Switch to view icon
                }
            }
        });

        JButton btnLogin = new JButton("Login");
        JButton btnRegister = new JButton("Register");
        // Set cursor to hand pointer when hovering over the button
        btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));

        Font labelFont1 = new Font("Arial", Font.PLAIN, 40);
        Font labelFont2 = new Font("Arial", Font.PLAIN, 30);

        nameStor.setBounds(600, 50, 500, 50);
        nameStor.setFont(labelFont1);
        nameStor.setForeground(Color.white);
        navigationPanel.setBounds(0, 0, 1920, 150);
        navigationPanel.setBackground(Color.white);
        lblTitle.setBounds(775, 150, 500, 50);
        lblTitle.setFont(labelFont1);
        lblTitle.setForeground(Color.white);
        lblUsername.setBounds(750, 270, 300, 45);
        lblUsername.setFont(labelFont2);
        lblUsername.setForeground(Color.white);
        txtUsername.setBounds(900, 270, 300, 45);
        txtUsername.setFont(labelFont2);
        lblPassword.setBounds(750, 350, 300, 45);
        lblPassword.setFont(labelFont2);
        lblPassword.setForeground(Color.white);
        txtPassword.setBounds(900, 350, 300, 45);
        txtPassword.setFont(labelFont2);
        btnLogin.setBounds(750, 450, 150, 40);
        btnLogin.setFont(labelFont2);
        btnRegister.setBounds(1050, 450, 150, 40);
        btnRegister.setFont(labelFont2);
//
        loginPanel.add(nameStor);
        loginPanel.add(imageLabel);
        loginPanel.add(lblTitle);
        loginPanel.add(lblPassword);
        loginPanel.add(lblUsername);
        loginPanel.add(txtUsername);
        loginPanel.add(btnTogglePassword);
        loginPanel.add(txtPassword);
        loginPanel.add(btnLogin);
        loginPanel.add(btnRegister);
        loginPanel.add(imageLabel1);
        loginPanel.add(navigationPanel);
//        loginPanel.setBackground(Color.cyan);
        

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());
                if (users.containsKey(username) && users.get(username).equals(password)) {
                    frame.dispose(); // Close the login window
                    new Coffee(); // Go to Fram Dashboard
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                if(txtUsername.getText()==null || txtPassword.getPassword()==null)
//                      JOptionPane.showMessageDialog(null,"Check agian!");
//                else
                    cardLayout.show(mainPanel, "Register");
            }
        });
    }
    
    private void createRegisterPanel() {
        registerPanel = new JPanel(null);
        
        JLabel nameStor = new JLabel("Welcome to M2 coffee");
        JPanel navigationPanel = new JPanel();
        JLabel lblTitle = new JLabel("Register your Account");
        JLabel lblNewUsername = new JLabel("New Username:");
        JTextField txtNewUsername = new JTextField();
        JLabel lblNewPassword = new JLabel("New Password:");
        JPasswordField txtNewPassword = new JPasswordField();
        JLabel lblConfirmPassword = new JLabel("Confirm Password:");
        JPasswordField txtConfirmPassword = new JPasswordField();
        JButton btnRegister = new JButton("Register");
        JButton btnBack = new JButton("Back");
        
        ImageIcon originalImg = new ImageIcon("6 Reasons To Add Coffee To Your Haircare Routine - Beauty Epic.png");
        Image img = originalImg.getImage();
        Image resizedImg = img.getScaledInstance(400, 600, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);
        JLabel imageLabel = new JLabel(resizedIcon);
        imageLabel.setBounds(200, 100, resizedIcon.getIconWidth(), resizedIcon.getIconHeight());
        ImageIcon originalImg1 = new ImageIcon("Premium Photo _ Cup of coffee and scoop on brown background_ Top view copy space .png");
        Image img1 = originalImg1.getImage();
        Image resizedImg1 = img1.getScaledInstance(1540, 820, Image.SCALE_SMOOTH); // Resize to 200x200 pixels
        ImageIcon resizedIcon1 = new ImageIcon(resizedImg1);
        JLabel imageLabel1 = new JLabel(resizedIcon1);
        imageLabel1.setBounds(0, 0, resizedIcon1.getIconWidth(), resizedIcon1.getIconHeight());
     
        JButton google=new JButton("  Login with Google");
	google.setBackground(Color.white);
	google.setFocusable(false);
	google.setForeground(new Color(102,51,0));
	google.setBorder(null);
	google.setBounds(700, 525, 600, 50);
	ImageIcon googlepic=new ImageIcon("Google.png");
	google.setIcon(googlepic);
	registerPanel.add(google);
        JButton feackbook=new JButton("Login with Facekbook");
	feackbook.setBackground(Color.white);
	feackbook.setBorder(null);
	feackbook.setForeground(new Color(102,51,0));
	feackbook.setFocusable(false);
	feackbook.setBounds(700, 600, 600, 50);
	ImageIcon Feackbookpic=new ImageIcon("feck book.png");
	feackbook.setIcon(Feackbookpic);
	registerPanel.add(feackbook);

        Font labelFont1 = new Font("Arial", Font.PLAIN, 40);
        Font labelFont2 = new Font("Arial", Font.PLAIN, 30);

        nameStor.setBounds(600, 50, 500, 50);
        nameStor.setFont(labelFont1);
        nameStor.setForeground(Color.white);
        navigationPanel.setBounds(0, 0, 1920, 150);
        navigationPanel.setBackground(Color.white);
        lblTitle.setBounds(775, 150, 500, 50);
        lblTitle.setFont(labelFont1);
        lblTitle.setForeground(Color.white);
        lblNewUsername.setBounds(700, 225, 300, 45);
        lblNewUsername.setFont(labelFont2);
        lblNewUsername.setForeground(Color.white);
        txtNewUsername.setBounds(1000, 225, 300, 45);
        txtNewUsername.setFont(labelFont2);
        lblNewPassword.setBounds(700, 295, 300, 45);
        lblNewPassword.setFont(labelFont2);
        lblNewPassword.setForeground(Color.white);
        txtNewPassword.setBounds(1000, 295, 300, 45);
        txtNewPassword.setFont(labelFont2);
        lblConfirmPassword.setBounds(700, 365, 300, 45);
        lblConfirmPassword.setFont(labelFont2);
        lblConfirmPassword.setForeground(Color.white);
        txtConfirmPassword.setBounds(1000, 365, 300, 45);
        txtConfirmPassword.setFont(labelFont2);
        btnRegister.setBounds(700, 430, 150, 40);
        btnRegister.setFont(labelFont2);
        btnBack.setBounds(1150, 430, 150, 40);
        btnBack.setFont(labelFont2);

        // Load and resize the eye icons
        ImageIcon viewIcon = new ImageIcon("D:\\Database\\Phone-Shop-Management-master\\src\\rupp\\icon\\hide.png");                                                                                              // icon
        Image viewImg = viewIcon.getImage();
        Image resizedViewImg = viewImg.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon resizedViewIcon = new ImageIcon(resizedViewImg);
        ImageIcon hideIcon = new ImageIcon("D:\\Database\\Phone-Shop-Management-master\\src\\rupp\\icon\\view.png"); 
        Image hideImg = hideIcon.getImage();
        Image resizedHideImg = hideImg.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon resizedHideIcon = new ImageIcon(resizedHideImg);

        // Eye icon button for New Password field
        JButton btnToggleNewPassword = new JButton(resizedViewIcon); // Start with the view icon
        btnToggleNewPassword.setBounds(1250, 295, 45, 45); // Adjust position as needed
        btnToggleNewPassword.setOpaque(false);
        btnToggleNewPassword.setContentAreaFilled(false);
        btnToggleNewPassword.setBorderPainted(false);
        btnToggleNewPassword.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnToggleNewPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtNewPassword.getEchoChar() != '\u0000') {
                    txtNewPassword.setEchoChar((char) 0);
                    btnToggleNewPassword.setIcon(resizedHideIcon); // Switch to hide icon
                } else {
                    txtNewPassword.setEchoChar('•');
                    btnToggleNewPassword.setIcon(resizedViewIcon); // Switch to view icon
                }
            }
        });

        // Eye icon button for Confirm Password field
        JButton btnToggleConfirmPassword = new JButton(resizedViewIcon); // Start with the view icon
        btnToggleConfirmPassword.setBounds(1250, 365, 45, 45); // Adjust position as needed
        btnToggleConfirmPassword.setOpaque(false);
        btnToggleConfirmPassword.setContentAreaFilled(false);
        btnToggleConfirmPassword.setBorderPainted(false);
        btnToggleConfirmPassword.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnToggleConfirmPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtConfirmPassword.getEchoChar() != '\u0000') {
                    txtConfirmPassword.setEchoChar((char) 0);
                    btnToggleConfirmPassword.setIcon(resizedHideIcon); // Switch to hide icon
                } else {
                    txtConfirmPassword.setEchoChar('•');
                    btnToggleConfirmPassword.setIcon(resizedViewIcon); // Switch to view icon
                }
            }
        });

        // Set cursor to hand pointer when hovering over the button
        btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));

        registerPanel.add(nameStor);
        registerPanel.add(imageLabel);
        registerPanel.add(lblTitle);
        registerPanel.add(lblNewUsername);
        registerPanel.add(lblConfirmPassword);
        registerPanel.add(lblNewPassword);
        registerPanel.add(btnRegister);
        registerPanel.add(btnBack);
        registerPanel.add(btnToggleNewPassword);
        registerPanel.add(btnToggleConfirmPassword);
        registerPanel.add(txtNewUsername);
        registerPanel.add(txtNewPassword);
        registerPanel.add(txtConfirmPassword);
        registerPanel.add(imageLabel1);
        registerPanel.add(navigationPanel);
        
//        registerPanel.setBackground(Color.cyan);

        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newUsername = txtNewUsername.getText();
                String newPassword = new String(txtNewPassword.getPassword());
                String confirmPassword = new String(txtConfirmPassword.getPassword());
                if (!newPassword.equals(confirmPassword)) {
                    JOptionPane.showMessageDialog(frame, "Passwords do not match", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (users.containsKey(newUsername)) {
                    JOptionPane.showMessageDialog(frame, "Username already exists", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    users.put(newUsername, newPassword);
                    saveUserToFile(newUsername, newPassword);
                    JOptionPane.showMessageDialog(frame, "Registration successful", "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                    cardLayout.show(mainPanel, "Login");
                }
            }
        });

        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Login");
            }
        });
    }

    private void saveUserToFile(String username, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USERS_FILE, true))) {
            writer.write(username + ":" + password);
            writer.newLine();
            System.out.println("User data saved to: " + USERS_FILE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame, "Error saving user data", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void loadUsersFromFile(String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String username = parts[0];
                    String password = parts[1];
                    users.put(username, password);
                }
            }
            System.out.println("Users loaded from file: " + filePath); // Optional log
        } catch (FileNotFoundException e) {
            System.err.println("Users file not found: " + filePath);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
