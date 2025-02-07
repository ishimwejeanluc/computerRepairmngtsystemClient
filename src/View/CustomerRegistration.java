/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Customer;
import Service.CustomerService;
import Service.EmployeeService;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.MessageFormat;
import java.util.List;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amanda Marley
 */
public class CustomerRegistration extends javax.swing.JFrame {
DefaultTableModel Model;
    /**
     * Creates new form CustomerRegistration
     */
    public CustomerRegistration() {
        initComponents();
          addTableRows();
        
       }
     private void addTableRows() {
       try {
            // Fetch inventory data from the service
            Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
            CustomerService service = (CustomerService) theRegistry.lookup("Customer");
            List<Customer> customerList = service.customerlldata();
        
            DefaultTableModel Model = (DefaultTableModel) CustomerTable.getModel();
            Model.setRowCount(0);
            for (Customer Customer : customerList) {
                Object row[] = {
                    Customer.getCustomerId(),
                    Customer.getNames(),
                   Customer.getPhoneNumber(),
                   Customer.getRepairJobs(),
                 
                };
                Model.addRow(row);
            }
            
            CustomerTable.setModel(Model);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NamesTxt = new javax.swing.JTextField();
        PhoneTxt = new javax.swing.JTextField();
        Reg = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        back = new javax.swing.JButton();
        customerIdTxt = new javax.swing.JTextField();
        Printing = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Wallpaper/Background 2.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("Customer Registration");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Names:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Phone N:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));
        getContentPane().add(NamesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 140, -1));
        getContentPane().add(PhoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 140, -1));

        Reg.setBackground(new java.awt.Color(255, 255, 255));
        Reg.setText("Save");
        Reg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegActionPerformed(evt);
            }
        });
        getContentPane().add(Reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));

        Search.setBackground(new java.awt.Color(255, 255, 255));
        Search.setText("Search");
        Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, -1, -1));

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, -1, -1));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, -1, -1));

        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer ID", "Names", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(CustomerTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 440, 280));

        back.setBackground(new java.awt.Color(255, 102, 0));
        back.setText("Back");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, -1, -1));
        getContentPane().add(customerIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 140, 30));

        Printing.setBackground(new java.awt.Color(255, 102, 0));
        Printing.setText("PRINT");
        Printing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintingActionPerformed(evt);
            }
        });
        getContentPane().add(Printing, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegActionPerformed

       
  try{
            
             Registry theRegistry=LocateRegistry.getRegistry("127.0.0.1", 6000);
             
             CustomerService Service=(CustomerService) theRegistry.lookup("Customer");
             Customer theCustomer = new Customer();
             theCustomer.setNames(NamesTxt.getText());
             theCustomer.setPhoneNumber(PhoneTxt.getText());
             Customer thecus = Service.RegisterCustomer(theCustomer);
             if(thecus!=null){
                 
                 JOptionPane.showMessageDialog(this, "Data Saved successfully");
             }else{
                   JOptionPane.showMessageDialog(this, "Data not Saved");
                 
             }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        

    }//GEN-LAST:event_RegActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
      try {
    // Get the input string from your text field (replace with your actual JTextField variable)
    String customerIdText = customerIdTxt.getText();

    // Check if the input string is not empty before parsing
    if (!customerIdText.isEmpty()) {
        int customerIdValue = Integer.parseInt(customerIdText);

        // Create a Customer object and set its ID
        Customer searchCustomerObj = new Customer();
        searchCustomerObj.setCustomerId(customerIdValue);

        // Locate the RMI registry and lookup the CustomerService
        Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
        CustomerService service = (CustomerService) theRegistry.lookup("Customer");

        // Call the service to search for the customer by ID
        Customer custObj = service.searching(searchCustomerObj);

        // If the customer object is found, populate the text fields
        if (custObj != null) {
            NamesTxt.setText(custObj.getNames());
            PhoneTxt.setText(custObj.getPhoneNumber());
            
            
            // Assuming customerId is a JTextField, you might want to set it to String.valueOf(custObj.getCustomerId()) or handle it differently.
        } else {
            // If customer is not found, display a message
            JOptionPane.showMessageDialog(this, "Customer not found for the entered ID");
        }
    } else {
        // Handle the case where the input is empty
        JOptionPane.showMessageDialog(this, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (NumberFormatException ex) {
    // Handle the case where the input is not a valid integer
    JOptionPane.showMessageDialog(this, "Invalid number format", "Error", JOptionPane.ERROR_MESSAGE);
} catch (Exception ex) {
    // Handle any other exceptions
    ex.printStackTrace();
}
    }//GEN-LAST:event_SearchActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
         HomePage hm=new HomePage();
        hm.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
  try {
    // Parse the customer ID from the text field
    int CustomerIdValue = Integer.parseInt(customerIdTxt.getText());
    
    // Create a Customer object and set its properties
    Customer cusobj = new Customer();
   cusobj.setCustomerId(CustomerIdValue);
    
    // Lookup the CustomerService from the RMI registry
    Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
    CustomerService service = (CustomerService ) theRegistry.lookup("Customer");
    
    // Call the DeleteCustomer method of the service by passing the Customer object
    Customer isDeleted = service.DeleteCustomer(cusobj);
    
    // Check the result and display a message accordingly
    if (isDeleted != null) {
        // Refresh the table or update any other UI elements if needed
        addTableRows();  // Assuming this method adds rows to your table
        JOptionPane.showMessageDialog(this, "Customer deleted successfully");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to delete Customer");
    }
} catch (NumberFormatException ex) {
    // Handle NumberFormatException
    JOptionPane.showMessageDialog(this, "Invalid number format", "Error", JOptionPane.ERROR_MESSAGE);
} catch (Exception ex) {
    // Handle other exceptions
    JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    ex.printStackTrace();
}
        
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
    int CustomerIdValue = Integer.parseInt(customerIdTxt.getText());
    Customer updatedCustomerObj = new  Customer();
    
    updatedCustomerObj.setCustomerId(CustomerIdValue);
    updatedCustomerObj.setNames(NamesTxt.getText());
    updatedCustomerObj.setPhoneNumber(PhoneTxt.getText());
    
    Registry theRegistry = LocateRegistry.getRegistry("127.0.0.1", 6000);
    
    // Use the remote interface type instead of the implementation type
    CustomerService Service = (CustomerService) theRegistry.lookup("Customer");
    
    // Perform the update using the remote service
    Customer cusObj = Service.UpdateCustomer(updatedCustomerObj);
    
    if (cusObj != null) {
        addTableRows();
        JOptionPane.showMessageDialog(this, "Customer updated successfully");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to update Customer");
    }
} catch (NumberFormatException ex) {
    // Handle NumberFormatException
    JOptionPane.showMessageDialog(this, "Invalid number format", "Error", JOptionPane.ERROR_MESSAGE);
} catch (Exception ex) {
    // Handle other exceptions
    JOptionPane.showMessageDialog(this, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    ex.printStackTrace();
}

    }//GEN-LAST:event_updateActionPerformed

    private void PrintingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintingActionPerformed

        MessageFormat header = new MessageFormat("Employee management List");
        MessageFormat footer = new MessageFormat("Footer");
        try {
            PrintRequestAttributeSet set = new HashPrintRequestAttributeSet();
            set.add(OrientationRequested.PORTRAIT);
           CustomerTable.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, set, true);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_PrintingActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CustomerTable;
    private javax.swing.JTextField NamesTxt;
    private javax.swing.JTextField PhoneTxt;
    private javax.swing.JButton Printing;
    private javax.swing.JButton Reg;
    private javax.swing.JButton Search;
    private javax.swing.JButton back;
    private javax.swing.JTextField customerIdTxt;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
