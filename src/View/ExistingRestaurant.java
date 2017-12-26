/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.LListR;
import Model.MenuItem;
import Model.Restaurant;
import Model.food;
import Model.menu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wei Kit
 */
public class ExistingRestaurant extends javax.swing.JFrame {
    public static String name;
    public ExistingRestaurant() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Login");
        initializeRestaurantDetails();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jtfResName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbtReset = new javax.swing.JButton();
        jpfPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtLogin.setText("Login");
        jbtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLoginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Login");

        jLabel1.setText("Restaurant Name : ");

        jLabel3.setText("Password             :");

        jbtReset.setText("Reset");
        jbtReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jpfPass, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(jtfResName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jbtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jbtReset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfResName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jpfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtLogin)
                    .addComponent(jbtReset))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLoginActionPerformed
        /* Login but do not know how to do */;
         boolean checkUserName = checkUserName();
        boolean checkPassword = checkPassword();
        if(checkUserName&&checkPassword){
            JOptionPane.showMessageDialog(this, "Please Enter your Username and Password");
            jtfResName.requestFocus();
        }
        else if(checkUserName){
            JOptionPane.showMessageDialog(this, "Please Enter your Username");
            jtfResName.requestFocus();
        }
        else if(checkPassword){
            JOptionPane.showMessageDialog(this, "Enter your Password");
            jpfPass.requestFocus();
        }
        else{
            
            boolean checkValidation = checkValidation();
            if(checkValidation){
                new RestaurantHome().setVisible(true);
                dispose();
            }
            else
                JOptionPane.showMessageDialog(this, "Incorrect password or username");
        }
                     /*//hard code some data to the menu
                // MenuItem menu = new MenuItem("Chicken Chop",12.0,"Chicken","Fresh and delicious",name);
                 food food = new food();
                 menu menu = new menu();
                 food.setFoodName("Chicken Chop");
                 food.setPrice(12.0);
                 menu.setCategory("Chicken");
                 food.setDescription("Fresh");
                 food.setResName(name);
                 RestaurantHome.stackMenu.push(menu);
                 RestaurantHome.stackFood.push(food);
                 // after successful verification then display message and go to next page
                 JOptionPane.showMessageDialog(null,"Welcome to Fastest DeliveryMan, "+ HomePage.listR.getEntry(i+1).getOwnerName());
                 dispose();
                 new RestaurantHome().setVisible(true);
             }
                 else{
                     JOptionPane.showMessageDialog(null,"Invalid password");
                 }
             }
             else{
                 JOptionPane.showMessageDialog(null,"Invalid username");
             }*/
          
    }//GEN-LAST:event_jbtLoginActionPerformed

    private void jbtResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtResetActionPerformed
        jtfResName.setText("");
        jpfPass.setText("");
    }//GEN-LAST:event_jbtResetActionPerformed

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
            java.util.logging.Logger.getLogger(ExistingRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExistingRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExistingRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExistingRestaurant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExistingRestaurant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtLogin;
    private javax.swing.JButton jbtReset;
    private javax.swing.JPasswordField jpfPass;
    private javax.swing.JTextField jtfResName;
    // End of variables declaration//GEN-END:variables

    private void initializeRestaurantDetails() {
        //if didn't register then add a data first
        if(HomePage.listR.getNumberOfEntries() == 0){
        Restaurant res = new Restaurant("Professional Restaurant","Taman Bagan","Ah Beng","good@gmail.com",0161234567,04234123,"abcd1234","Wangsa Maju");
        name = "Professional Restaurant";
        //Restaurant res1 = new Restaurant("Delicious Restaurant","Taman Bant","Ah Kang","fgtr@gmail.com",0161234512,04234324);
        HomePage.listR.add(res);
        }
       // list.add(res1);
        
    }
    private boolean checkUserName() {
       boolean result = false;
       if(jtfResName.getText().equals("")){
          result = true; 
       } 
       return result;
    }

    private boolean checkPassword() {
       boolean result = false;
       String password = new String(jpfPass.getPassword());
       if(password.equals("")){
           result = true;
       }
       return result;
    }

    private boolean checkValidation() {
        boolean result = false;
        String userName = jtfResName.getText();
        String password = new String(jpfPass.getPassword());
        
         for(int i=0;i<HomePage.listR.getNumberOfEntries();i++){
               if(userName.equals(HomePage.listR.getEntry(i+1).getResName())&&password.equals(HomePage.listR.getEntry(i+1).getPassword())){
                   result = true;
                   break;
               }
           }
         return result;
    }
}
