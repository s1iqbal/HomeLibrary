//Coded by Saad Iqbal
//Username for application is : admin
//password for application is  : password

//imports for the library that will be used
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.Timer;
import java.awt.Button;
import java.awt.List;




public class HomeLibrary extends Database {
	
//declares the major variables for the GUI and JFields
 private JFrame frmLibraryManagingSystem;
 private JPasswordField passwordField;
 private JTextField textField;
 private JTextField textField_2;
 private JTextField textField_3;
 private JTextField textField_1;

 /**
  * Launch the application.
  */
 public static void main(String[] args) {		
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     HomeLibrary window = new HomeLibrary();
     window.frmLibraryManagingSystem.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 /**
  * Create the application.
  */
 public HomeLibrary() {
  initialize();
 }

 public void AccessFile() {
   
 }

 /**
  * Initialize the contents of the home library frame.
  */
 private void initialize() {
  
  //initializes and specifies the JFrame and its properties for the window.
  frmLibraryManagingSystem = new JFrame();
  frmLibraryManagingSystem.setResizable(false);
  frmLibraryManagingSystem.setTitle("Library Managing System");
  frmLibraryManagingSystem.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
  frmLibraryManagingSystem.setBounds(100, 100, 349, 544);
  frmLibraryManagingSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frmLibraryManagingSystem.getContentPane().setLayout(null);
  
  JPanel GuestPanel = new JPanel();
  JPanel LoginPanel = new JPanel();
  JPanel AdminPanel = new JPanel();
  JPanel personsearchpanel = new JPanel();
  JPanel itemsearchpanel = new JPanel();
                
//ADMIN PANEL    
  			   //Defines the JPanel for the adminpanel
                    AdminPanel.setBounds(0, 0, 343, 515);
                    frmLibraryManagingSystem.getContentPane().add(AdminPanel);
                    AdminPanel.setLayout(null);
                    AdminPanel.setVisible(false);
                       
                       JPanel loanItemPanel = new JPanel();
                       loanItemPanel.setBounds(0, 67, 337, 412);
                       AdminPanel.add(loanItemPanel);
                       loanItemPanel.setLayout(null);
                       loanItemPanel.setVisible(false);
                       
                       JLabel lblSoonToBe = new JLabel("SOON TO BE IMPLEMENTED");
                       lblSoonToBe.setFont(new Font("Arial", Font.BOLD, 19));
                       lblSoonToBe.setHorizontalAlignment(SwingConstants.CENTER);
                       lblSoonToBe.setBounds(22, 33, 291, 270);
                       loanItemPanel.add(lblSoonToBe);
                    
                       //Defines the JPanel for the personSearchPanel 
                       personsearchpanel.setBounds(0, 60, 343, 419);
                       AdminPanel.add(personsearchpanel);
                       personsearchpanel.setLayout(null);
                       personsearchpanel.setVisible(false);
                       
                                //initializes the label for Jlabel "Enter a name" for personSearchPanel
                                JLabel lblEnterAName = new JLabel("Enter a Name:");
                                lblEnterAName.setBounds(10, 27, 88, 14);
                                personsearchpanel.add(lblEnterAName);
                                
              //initializes the textfield for the personSearchPanel
                                textField_3 = new JTextField();
                                textField_3.setColumns(10);
                                textField_3.setBounds(108, 24, 225, 20);
                                personsearchpanel.add(textField_3);
                                
                                //initializes the Jlist for the personSearchPanel
                                List list = new List();
                                list.setBounds(10, 117, 323, 292);
                                personsearchpanel.add(list);
                                
                                //initializes the Jbutton for the Search Button that the user will press
                                JButton btnNewButton = new JButton("SEARCH");
                                btnNewButton.addActionListener(new ActionListener() {
                                	public void actionPerformed(ActionEvent e) {
                                		String name = textField_3.getText();
                                		String borrowedItems[] = new String[getSize()];
                                		borrowedItems = findBorrowedItems(name); 
                                		//Clears the current Jlist and then uses a forloop to add the items that the person is borrowing
                                		list.clear();
                                		for (int i =0; i < borrowedItems.length; i++) {
                                		list.add(borrowedItems[i]);
                                		}
                                	}
                                });
                                btnNewButton.setBounds(6, 63, 327, 48);
                                personsearchpanel.add(btnNewButton);
                                
                                        
                                        //JPanel itemsearchpanel = new JPanel();
                                        itemsearchpanel.setBounds(0, 60, 343, 419);
                                        AdminPanel.add(itemsearchpanel);
                                        itemsearchpanel.setLayout(null);
                                        itemsearchpanel.setVisible(false);
                                        
                                        JLabel label = new JLabel("Enter an item:");
                                        label.setBounds(10, 24, 88, 14);
                                        itemsearchpanel.add(label);
                                        
                                        textField_2 = new JTextField();
                                        textField_2.setBounds(108, 21, 198, 20);
                                        itemsearchpanel.add(textField_2);
                                        textField_2.setColumns(10);
                                        
                                        JLabel lblItemLocation = new JLabel("Item Location");
                                        lblItemLocation.setBounds(10, 165, 99, 14);
                                        itemsearchpanel.add(lblItemLocation);
                                        
                                        JLabel lblBorrowerName = new JLabel("Borrower Name:");
                                        lblBorrowerName.setBounds(10, 139, 99, 14);
                                        itemsearchpanel.add(lblBorrowerName);
                                        
                                        JLabel itemlocation = new JLabel("");
                                        itemlocation.setBounds(135, 165, 171, 14);
                                        itemsearchpanel.add(itemlocation);
                                        
                                        JLabel borrowername = new JLabel("");
                                        borrowername.setBounds(135, 139, 170, 14);
                                        itemsearchpanel.add(borrowername);
                                        
                                        Button button = new Button("SEARCH");
                                        button.setBounds(10, 67, 323, 48);
                                        itemsearchpanel.add(button);
                                        button.setFont(new Font("Dialog", Font.BOLD, 12));
                                        button.addActionListener(new ActionListener() {
                                         public void actionPerformed(ActionEvent e) {
                                          //search for person 
                                         	String name = textField_2.getText();
                                         	borrowername.setText(findBorrowerName(name));
                                         	itemlocation.setText(findLocation(name));
                                         	
                                         }
                                        });
                                        
                                        //Button for Item Search panel, makes the item search visible and rest invisible (except the parent panel)
                                        Button itemsearch = new Button("Item Search");
                                        itemsearch.addActionListener(new ActionListener() {
                                         public void actionPerformed(ActionEvent e) {
                                          itemsearchpanel.setVisible(true);
                                          personsearchpanel.setVisible(false);
                                          loanItemPanel.setVisible(false);
                                         }
                                        });
                                        itemsearch.setBounds(10, 10, 94, 44);
                                        
                                        AdminPanel.add(itemsearch);
                                        
                                        //Person search button to make the person search panel visible and rest invisible. (except the parent panel)
                                        Button personsearch = new Button("Person Search");
                                        personsearch.addActionListener(new ActionListener() {
                                         public void actionPerformed(ActionEvent e) {
                                          personsearchpanel.setVisible(true);
                                          itemsearchpanel.setVisible(false);
                                          loanItemPanel.setVisible(false);
                                         }
                                        });
                                        personsearch.setBounds(127, 10, 106, 44);
                                        AdminPanel.add(personsearch);
                                        
                                        //LoananItem button to make the panel visible for it and rest invisible (except for the parent panel)
                                        
                                        Button loananitem = new Button("Loan an Item");
                                        loananitem.addActionListener(new ActionListener() {
                                        	public void actionPerformed(ActionEvent e) {
                                        	  loanItemPanel.setVisible(true);
                                        	  personsearchpanel.setVisible(false);;
                                       		  itemsearchpanel.setVisible(false);
                                       		
                                       		  
                                        	}
                                        });
                                        loananitem.setBounds(239, 10, 94, 44);
                                        AdminPanel.add(loananitem);
                                        
                                        
                                        //Button for logout, sets all panels to invisible except the login one (need a way to reset all the information modified)
                                        JButton btnNewButton_2 = new JButton("LOGOUT");
                                        btnNewButton_2.addActionListener(new ActionListener() {
                                        	public void actionPerformed(ActionEvent e) {                                        		  
                                        		  personsearchpanel.setVisible(false);;
                                        		  itemsearchpanel.setVisible(false);
                                        		  AdminPanel.setVisible(false);
                                        		  LoginPanel.setVisible(true);
                                        		  loanItemPanel.setVisible(false);
                                        	}
                                        });
                                        btnNewButton_2.setBounds(10, 480, 327, 29);
                                        AdminPanel.add(btnNewButton_2);
//GUEST PANEL
                //JPanel GuestPanel = new JPanel();
                GuestPanel.setBounds(0, 0, 343, 515);
                frmLibraryManagingSystem.getContentPane().add(GuestPanel);
                GuestPanel.setLayout(null);
                
                JLabel label_3 = new JLabel("Enter an item:");
                label_3.setBounds(6, 32, 88, 14);
                GuestPanel.add(label_3);
                
                textField_1 = new JTextField();
                textField_1.setBounds(108, 29, 198, 20);
                GuestPanel.add(textField_1);
                textField_1.setColumns(10);
                
                JLabel label_4 = new JLabel("Item Location:");
                label_4.setBounds(6, 138, 112, 14);
                GuestPanel.add(label_4);
                
                JLabel label_5 = new JLabel("Borrower Name:");
                label_5.setBounds(6, 193, 119, 14);
                GuestPanel.add(label_5);
                
                JLabel label_6 = new JLabel("");
                label_6.setBounds(135, 193, 198, 14);
                GuestPanel.add(label_6);
                
                JLabel label_7 = new JLabel("");
                label_7.setBounds(135, 139, 198, 14);
                GuestPanel.add(label_7);
                
                Button button_1 = new Button("SEARCH");
                button_1.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		String name = textField_1.getText();
                    	label_6.setText(findBorrowerName(name));
                    	label_7.setText(findLocation(name));
                		
                	}
                });
                button_1.setBounds(10, 71, 323, 48);
                GuestPanel.add(button_1);
                button_1.setFont(new Font("Dialog", Font.BOLD, 12));
                
                JLabel lblYouAreLogged = new JLabel("You are logged in as Guest");
                lblYouAreLogged.setBounds(98, 480, 179, 14);
                GuestPanel.add(lblYouAreLogged);
                
                JButton btnNewButton_1 = new JButton("LOGOUT");
                btnNewButton_1.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		GuestPanel.setVisible(false);
                		LoginPanel.setVisible(true);
                	}
                });
                btnNewButton_1.setBounds(6, 403, 331, 65);
                GuestPanel.add(btnNewButton_1);
                GuestPanel.setVisible(false);
            
                        
//LOGIN PANEL
                       //JPanel LoginPanel = new JPanel();
                       LoginPanel.setBounds(0, 0, 343, 515);
                       frmLibraryManagingSystem.getContentPane().add(LoginPanel);
                       LoginPanel.setLayout(null);
                       LoginPanel.setVisible(true);
                       
                       JLabel label_1 = new JLabel("Username:");
                       label_1.setHorizontalAlignment(SwingConstants.LEFT);
                       
                        label_1.setBounds(22, 186, 84, 14);
                        LoginPanel.add(label_1);
                        
                        JLabel label_2 = new JLabel("Password:");
                        label_2.setBounds(22, 229, 84, 14);
                        LoginPanel.add(label_2);
                        
                        passwordField = new JPasswordField();
                        passwordField.setBounds(116, 226, 109, 20);
                        LoginPanel.add(passwordField);
                        
                        textField = new JTextField();
                        textField.setBounds(116, 183, 109, 20);
                        textField.setColumns(10);
                        LoginPanel.add(textField);
                        
                        JLabel lblNewLabel = new JLabel("Smaug's Home Library");
                        lblNewLabel.setBounds(108, 11, 162, 25);
                        LoginPanel.add(lblNewLabel);
                        lblNewLabel.setFont(new Font("Yu Gothic Light", Font.PLAIN, 15));
                        
                        JButton guestbutton = new JButton("Login as Guest");
                        guestbutton.addActionListener(new ActionListener() {
                         public void actionPerformed(ActionEvent e) {
                          GuestPanel.setVisible(true);
                          LoginPanel.setVisible(false);
                         }
                        });
                        guestbutton.setBounds(92, 336, 162, 61);
                        LoginPanel.add(guestbutton);
                        
                        
                        JLabel lblNewLabel_1 = new JLabel("");
                        lblNewLabel_1.setBounds(22, 286, 311, 20);
                        LoginPanel.add(lblNewLabel_1);
                        
                        JLabel errormessage = new JLabel("");
                        errormessage.setBounds(22, 286, 311, 20);
                        LoginPanel.add(errormessage);
                        
                        //LOGIN INFORMATION FOR ADMIN STORED HERE
                             JButton EnterLogin = new JButton("Login");
                             
                             JCheckBox chckbxRememberMe = new JCheckBox("Remember Me");
                             chckbxRememberMe.setBounds(22, 250, 265, 23);
                             LoginPanel.add(chckbxRememberMe);
                 
                             EnterLogin.addActionListener(new ActionListener() {
                              public void actionPerformed(ActionEvent e) {
                            //gets values from textfield and key/key2 are the assigned user and password currently.
                              String key = "admin";
                              String key2 = "password";
                              String username = textField.getText();
                              //Suppresses warning so IDE wont throw a warning for the password field. for getText()
                              @SuppressWarnings("deprecation")
                              //assigns the text in the password field to a variable called password
							  String pass = passwordField.getText(); //hidden for security reasons
                             //Credential authentication. Takes to next frame if credentials are correct.
                             
                              if (username.equals(key) && pass.equals(key2) ) {
                            	  if (!chckbxRememberMe.isSelected()) {
                                	  textField.setText("");
                                	  passwordField.setText("");
                                  }
                               AdminPanel.setVisible(true);
                               LoginPanel.setVisible(false);
                              }
                              else {
                               //A way of authenticating the user. If credentials are wrong, displays an error message.
                               errormessage.setText("Please Enter the correct login information");
                               ActionListener taskPerformer = new ActionListener() {
                                      public void actionPerformed(ActionEvent evt) {
                                       errormessage.setText("");
                                      }
                                  };
                                //timer for the error message to display
                                new Timer(2000, taskPerformer).start();
                               errormessage.setText("Please Enter the correct login information");
                               
                               
                               }
                              }
                             });
                             EnterLogin.setBounds(235, 182, 98, 64);
                             LoginPanel.add(EnterLogin);
                        
                 
 }
}
//Coded by Saad Iqbal
