

import mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
package myjtable;

/**
 *
 * @author user
 */

public class My_CNX {

    private static String servername = "DESKTOP-DET3DKG";
   
    private static String dbname  = "testjava";
   
    private static String password = "rana123";
    
    public static Connection getConnection()
    {
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
       
        
        cnx = datasource.getConnection();
        
        return cnx;
    }
    
}


/****************** My_CNX Class End  ******************/
    
/*Now Let's Go To The Login Form and See What We Will Do.

/****************** Register Form Start  ******************/

// create a variable to set the image path in it
   /* String image_path = null;
    
    public Register_Form() {
        initComponents();
        
        // center the form
        this.setLocationRelativeTo(null);
        
        // create a yellow border for the jpanel_title
        // 0 border in the top
        Border jpanel_title_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.yellow);
        // set the border to the jPanel_title
        jPanel_title.setBorder(jpanel_title_border);
        
        // create a black border for the close & minimize jlables
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        jLabel_close.setBorder(label_border);
        
        // create a border for the create acconut jlabel
        Border label_login_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        jLabel_login.setBorder(label_login_border);
        
        
        // create border for the text and password fields
        Border field_border = BorderFactory.createMatteBorder(1, 5, 1, 1, Color.white);
        jTextField_Username.setBorder(field_border);
        jTextField_Fullname.setBorder(field_border);
        jTextField_Phone.setBorder(field_border);
        jPasswordField_1.setBorder(field_border);
        jPasswordField_2.setBorder(field_border);
        
        // create a button group for the radiobuttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton_Male);
        bg.add(jRadioButton_Female);
    }


// jlabel minimize -> mouse click event
private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {                                             
        this.setState(JFrame.ICONIFIED);

    }                                            

// jlabel  minimize -> mouse entered event
    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {                                             
       // change the jlabel border color to white
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_minimize.setBorder(label_border);
       // set the jlabel foreground to white
        jLabel_minimize.setForeground(Color.white);
    }                                            

// jlabel minimize -> mouse exited event
    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {                                            
        // reset the jlabel border color to white
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        // reset the jlabel foreground to white
        jLabel_minimize.setForeground(Color.black);

    }                                           

// jlabel close -> mouse click event
    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {                                          
        System.exit(0);
    }                                         


// jlabel close -> mouse entered event
    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {                                          
        // change the jlabel border color to white
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_close.setBorder(label_border);
        // set the jlabel foreground to white
        jLabel_close.setForeground(Color.white);

    }                                         

// jlabel close -> mouse exited event
    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {                                         
         // reset the jlabel border color to white
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_close.setBorder(label_border);
        // reset the jlabel foreground to black
        jLabel_close.setForeground(Color.black);

    }                                        

// JTextField For The Phone Number -> KeyTyped Event
    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {                                          
       // allow only numbers
       if(!Character.isDigit(evt.getKeyChar())){
           evt.consume();
       }
    }


// button select image
    private void jButton_SelectImageActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // select an image and set the image path into a jlabel
        String path = null;
        
        JFileChooser chooser = new JFileChooser();
        
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        // file extension
        FileNameExtensionFilter extension = new FileNameExtensionFilter("*.Images","jpg","png","jpeg");
        chooser.addChoosableFileFilter(extension);
        
        int filestate = chooser.showSaveDialog(null);
         
        // check if the user select an image
        if(filestate == JFileChooser.APPROVE_OPTION){
            
            File selectedImage = chooser.getSelectedFile();
            path = selectedImage.getAbsolutePath();
            jLabel_imgpath.setText(path);
            
            image_path = path;
        }
        
    }                                                   

// a jlabel to open the login form on Mouse Clicked Event
    private void jLabel_loginMouseClicked(java.awt.event.MouseEvent evt) {                                          
        Login_Form lf = new Login_Form();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }                                         

// change the jlabel border color on mouse entered
    private void jLabel_loginMouseEntered(java.awt.event.MouseEvent evt) {                                          
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(0,204,0));
        jLabel_login.setBorder(label_border);

    }                                         

// reset the jlabel border color on mouse exited
    private void jLabel_loginMouseExited(java.awt.event.MouseEvent evt) {                                         
        Border label_create_accont_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        jLabel_login.setBorder(label_create_accont_border);

    }                                        

// create a function to verify the empty fields  
    public boolean verifyFields()
    {
        String fname = jTextField_Fullname.getText();
        String uname = jTextField_Username.getText();
        String phone = jTextField_Phone.getText();
        String pass1 = String.valueOf(jPasswordField_1.getPassword());
        String pass2 = String.valueOf(jPasswordField_2.getPassword());
        
        // check empty fields
        if(fname.trim().equals("") || uname.trim().equals("") || phone.trim().equals("")
           || pass1.trim().equals("") || pass2.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);
            return false;
        }
        
        // check if the two password are equals or not
        else if(!pass1.equals(pass2))
        {
           JOptionPane.showMessageDialog(null, "Password Doesn't Match","Confirm Password",2); 
           return false;
        }
        
        // if everything is ok
        else{
            return true;
        }
    }
    
    
    // create a function to check if the entered username already exists in the database
    public boolean checkUsername(String username){
        
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `users` WHERE `username` = ?";
        
        try {
            
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
        
            if(rs.next())
            {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another One", "Username Failed", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return username_exist;
    }
    
      
// button register   
private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {                                                 
         // get data from fields
         String fname = jTextField_Fullname.getText();
         String username = jTextField_Username.getText();
         String pass1 = String.valueOf(jPasswordField_1.getPassword());
         String pass2 = String.valueOf(jPasswordField_2.getPassword());
         String phone = jTextField_Phone.getText();
         String gender = "Male";
         
         if(jRadioButton_Female.isSelected()){
             gender = "Female";
         }
        
// check if the data are empty
         if(verifyFields())
         {
// check if the username already exists
             if(!checkUsername(username))
             {
                 PreparedStatement ps;
                 ResultSet rs;
                 String registerUserQuery = "INSERT INTO `users`(`full_name`, `username`, `password`, `phone`, `gender`, `picture`) VALUES (?,?,?,?,?,?)";
                 
                 try {
                     
                     ps = My_CNX.getConnection().prepareStatement(registerUserQuery);
                     ps.setString(1, fname);
                     ps.setString(2, username);
                     ps.setString(3, pass1);
                     ps.setString(4, phone);
                     ps.setString(5, gender);
                     
                     try {
                         
                         // save the image as blob in the database
                         if(image_path != null){
                         
                             InputStream image = new FileInputStream(new File(image_path));
                             ps.setBlob(6, image);
                             
                         }else{
                             ps.setNull(6, java.sql.Types.NULL);
                         }
                         
                         if(ps.executeUpdate() != 0){
                             JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
                         }else{
                             JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                         }
                         
                     } catch (FileNotFoundException ex) {
                         Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
                     }
                     
                 } catch (SQLException ex) {
                     Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 
             }
         }
                 
    }                                                                    


/****************** Register Form End  ******************/

/*Now We Will Make The Login Form To Allow The User Enter To The Application

/****************** Login Form Start  ******************/

/*public Login_Form() {
        initComponents();
        
        /* - Download The Connector For JAVA & MYSQL database */
        /* LINK -> https://dev.mysql.com/downloads/connector/j/5.1.html */
        /* OPEN XAMPP and Strat Apache & Mysql */
        /* Go to -> http://localhost/phpmyadmin and create a new database */
        /* Create a Connection with the database */
        
        // center the form
      /*  this.setLocationRelativeTo(null);
        
        // create a yellow border for the jpanel_title
        // 0 border in the top
        Border jpanel_title_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.yellow);
        // set the border to the jPanel_title
        jPanel_title.setBorder(jpanel_title_border);
        
        // create an orange border for the global panel
        Border glob_panel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.orange);
        jPanel1.setBorder(glob_panel_border);
        
        // create a black border for the close & minimize jlables
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        jLabel_close.setBorder(label_border);
        
        // create a border for the create acconut jlabel
        Border label_create_accont_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        jLabel_Create_Account.setBorder(label_create_accont_border);
        
        // create a border with the color of the parent jpanel for the icons label to remove the move
        Border label_icons_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153));
        jLabel_username.setBorder(label_icons_border);
        jLabel_password.setBorder(label_icons_border);
        
        // create border for the username and password field
        Border field_border = BorderFactory.createMatteBorder(1, 5, 1, 1, Color.white);
        jTextField_Username.setBorder(field_border);
        jPasswordField.setBorder(field_border);
        
    }


// jlabel minimize -> mouse entered
  private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {                                             
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.white);
    }                                            

// jlabel minimize -> mouse exited
    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {                                            
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.black);
        
    }                                           

// jlabel close -> mouse entered
    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {                                          
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.white);
        
    }                                         

// jlabel close -> mouse exited
    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {                                         
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.black);
        
    }                                        

// jtextfield username -> focus gained
    private void jTextField_UsernameFocusGained(java.awt.event.FocusEvent evt) {                                                
        // clear the textfield on focus if the text is "username"
        if(jTextField_Username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_Username.setText("");
            jTextField_Username.setForeground(Color.black);
        }
        
        // set a yellow border to the jlabel icon
        Border jlabel_icon = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.yellow);
        jLabel_username.setBorder(jlabel_icon);
        
    }                                               

// jtextfield username -> focus lost
    private void jTextField_UsernameFocusLost(java.awt.event.FocusEvent evt) {                                              
        // if the text field is equal to username or empty
        // we will set the "username" text in the field 
        // on focus lost event
        
        if(jTextField_Username.getText().trim().equals("") || 
           jTextField_Username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_Username.setText("username");
            jTextField_Username.setForeground(new Color(153,153,153));
        }
        
        // create a border with the color of the parent jpanel for the icons label to remove the move
        Border label_icons_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153));
        jLabel_username.setBorder(label_icons_border);
        
    }                                             

// password field -> focus gained
    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {                                           
        // clear the password field on focus if the text is "password"
        
        // get the password text
        String pass = String.valueOf(jPasswordField.getPassword());
        
        if(pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField.setText("");
            jPasswordField.setForeground(Color.black);
        }
        
        // set a yellow border to the jlabel icon
        Border jlabel_icon = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.yellow);
        jLabel_password.setBorder(jlabel_icon);
        
        
    }                                          

// password field -> focus lost
    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {                                         
        // if the password field is equal to password or empty
        // we will set the "password" text in the field 
        // on focus lost event
        
        // get the password text
        String pass = String.valueOf(jPasswordField.getPassword());
        
        if(pass.trim().equals("") || 
           pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField.setText("password");
            jPasswordField.setForeground(new Color(153,153,153));
        }
        
        // create a border with the color of the parent jpanel for the icons label to remove the move
        Border label_icons_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153));
        jLabel_password.setBorder(label_icons_border);
        
    }                                        

// login button -> mouse entered
    private void jButton_LoginMouseEntered(java.awt.event.MouseEvent evt) {                                           
       // set jbutton background
        jButton_Login.setBackground(new Color(0,101,183));
        
    }                                          

// login button -> mouse exited
    private void jButton_LoginMouseExited(java.awt.event.MouseEvent evt) {                                          
        // set jbutton background
        jButton_Login.setBackground(new Color(0,84,104));
        
    }                                         

// jlabel minimize -> mouse clicked
    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {                                             
        this.setState(JFrame.ICONIFIED);
        
    }                                            

// jlabel close -> mouse clicked
    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {                                          
        System.exit(0);
    }                                         

// button login
    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {                                              
        PreparedStatement st;
        ResultSet rs;
        
        // get the username & password
        String username = jTextField_Username.getText();
        String password = String.valueOf(jPasswordField.getPassword());
        
        //create a select query to check if the username and the password exist in the database
        String query = "SELECT * FROM `users` WHERE `username` = ? AND `password` = ?";
        
        // show a message if the username or the password fields are empty
        if(username.trim().equals("username"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Username", "Empty Username", 2);
        }
        else if(password.trim().equals("password"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Password", "Empty Password", 2);
        }
        else{
            
            try {
            st = My_CNX.getConnection().prepareStatement(query);
            
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                // show a new form
                Menu_Form form = new Menu_Form();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                // close the current form(login form)
                this.dispose();
                
            }else{
                // error message
                JOptionPane.showMessageDialog(null, "Invalid Username / Password","Login Error",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        
    }                                             

// jlabel create account -> mouse entered
    private void jLabel_Create_AccountMouseEntered(java.awt.event.MouseEvent evt) {                                                   
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red);
        jLabel_Create_Account.setBorder(label_border);
        
    }                                                  

// jlabel create account -> mouse exited
    private void jLabel_Create_AccountMouseExited(java.awt.event.MouseEvent evt) {                                                  
       Border label_create_accont_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        jLabel_Create_Account.setBorder(label_create_accont_border);
        
    }                                                 

// open the register form when the user click on this jlabel with the mouse
    private void jLabel_Create_AccountMouseClicked(java.awt.event.MouseEvent evt) {                                                   
        Register_Form rf = new Register_Form();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }                                                  

/****************** Login Form End  ******************/

    

