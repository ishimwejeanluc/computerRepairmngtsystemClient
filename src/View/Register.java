
package View;
import Model.SignUp;
import Service.SignUpService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
;
/**
 *
 * @author bluer
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SignupBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("USERNAME:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("PASSWORD:");

        SignupBtn.setBackground(new java.awt.Color(130, 41, 41));
        SignupBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SignupBtn.setForeground(new java.awt.Color(102, 0, 51));
        SignupBtn.setText("Register");
        SignupBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ALREADY HAVE AN ACCOUNT?");

        btnLogin.setBackground(new java.awt.Color(124, 50, 50));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(102, 0, 0));
        btnLogin.setText("SIGN IN ");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("EMAIL:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("TELEPHONE:");

        usernameTxt.setBackground(new java.awt.Color(0, 0, 0));
        usernameTxt.setForeground(new java.awt.Color(255, 255, 255));
        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });

        emailTxt.setBackground(new java.awt.Color(0, 0, 0));
        emailTxt.setForeground(new java.awt.Color(255, 255, 255));

        phoneNumber.setBackground(new java.awt.Color(0, 0, 0));
        phoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberActionPerformed(evt);
            }
        });

        pass.setBackground(new java.awt.Color(0, 0, 0));
        pass.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneNumber))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(SignupBtn))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(usernameTxt))))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(SignupBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin))
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 330, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Wallpaper/Background 2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 730, 490));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 730, 60));

        panel2.setBackground(new java.awt.Color(51, 0, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REGISTER");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(302, 302, 302))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 60));

        setSize(new java.awt.Dimension(744, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    LoginForm reg = new LoginForm();
        reg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtActionPerformed

    private void phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberActionPerformed

    private void SignupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupBtnActionPerformed
 String Username = usernameTxt.getText();
        String Email = emailTxt.getText();
        String Telephone = phoneNumber.getText();
        String Password = new String(pass.getPassword());
       // 1. Empty Field Checks
if (Username.trim().isEmpty() || Email.trim().isEmpty() || Telephone.trim().isEmpty() || Password.trim().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please fill in all the fields.");
    return; // Stop further execution
}

// 2. Email Format Validation
if (!Email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
    JOptionPane.showMessageDialog(this, "Please enter a valid email address.");
    return; // Stop further execution
}

// 3. Telephone Number Format Validation
if (!Telephone.matches("\\d{10}")) { // Validates 10-digit number
    JOptionPane.showMessageDialog(this, "Please enter a 10-digit phone number.");
    return; // Stop further execution
}

// 4. Password Strength (You can adjust the criteria as per your requirement)
if (Password.length() < 8 || !Password.matches(".*\\d.*")) {
    JOptionPane.showMessageDialog(this, "Password should be at least 8 characters long and contain at least one digit.");
    return; // Stop further execution
}

// 5. Username Length Validation
if (Username.length() < 5 || Username.length() > 20) {
    JOptionPane.showMessageDialog(this, "Username should be between 5 to 20 characters.");
    return; // Stop further execution
}
        
       
             
    
        try {
            // create registry
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            SignUpService service = (SignUpService) theRegistry.lookup("SignUpcall");
            SignUp theuser = new SignUp();
            theuser.setUsername(usernameTxt.getText());
            theuser.setEmail(emailTxt.getText());
            theuser.setTelephone( phoneNumber.getText());
            theuser.setPassword( pass.getText());

          
            
            
            SignUp userObj = service.RegisterUser(theuser);
            if(userObj!= null){
                JOptionPane.showMessageDialog(this, "Data Saved Successfully");
            }else {
               JOptionPane.showMessageDialog(this, "Data not Saved ");  
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        
    }//GEN-LAST:event_SignupBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignupBtn;
    private javax.swing.JButton btnLogin;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
