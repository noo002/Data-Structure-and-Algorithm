package View;


import Control.CustInterface;
import Control.CustList;
import Model.customer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gan
 */
public class SelectRest extends javax.swing.JFrame {
    
    
    public static String selectedResName;
    public static int selectedResIndex;


    public SelectRest( ) {
        initComponents();
        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    /*customer cust1 = new customer("C001","Leong ","950330-14-2569","017-6762311","leong@gmail.com","123,Jalan GK ,53300 KL");
    customer cust2 = new customer("C002","AAA ","951221-14-7889","012-3456789","AAA@gmail.com","123,Jalan K ,53300 KL");
    customer cust3 = new customer("C003","BBB ","020330-14-1234","019-8765432","BBB@gmail.com","3-2, blok b, Taman LOL, 53300 KL");
    customer.add(cust1);
    customer.add(cust2);
    customer.add(cust3);*/
    DefaultComboBoxModel dcb = new DefaultComboBoxModel();
        /*String[] text = new String[RegisterRestaurant.list.size()];
          for(int i=0;i<text.length;i++){
              text[i] = RegisterRestaurant.list.getEntry(i+1).getResName();
          }*/
        for(int i=0;i<HomePage.listR.getNumberOfEntries();i++){
            dcb.addElement(HomePage.listR.getEntry(i+1).getResName());
        }

         jComboBox1.setModel(dcb);

    }

   
    
 private boolean checkIndentification() {
        boolean result = false;
        String userName = txt1.getText();
        
        
         for(int i=0;i<Home.list.getNumberOfEntries();i++){
               if(userName.equals(Home.list.getEntry(i+1).getCustomerId())){
                   result = true;
                   break;
               }
           }
         return result;
    }









    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Fastest Deliveryman");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Customer Id:");

        txt1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButton1)
                        .addGap(92, 92, 92)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     selectedResName =(String)jComboBox1.getSelectedItem();
     selectedResIndex = jComboBox1.getSelectedIndex();
     String customerId = txt1.getText();
     
     
     if(txt1.getText().equals(null)){
         JOptionPane.showMessageDialog(this, "Please Enter your Customer ID");
         
     }
     
     else{
         
     
          boolean checkIdentification = checkIndentification();
            if(checkIdentification){
               new CDisplayResMenu(customerId).setVisible(true);

                     dispose();
     }
        
    }  
     
               
     
         /*if((String)jComboBox1.getSelectedItem()=="LOL Western Food"){

             NewJFrame west = new NewJFrame();

             if(txt1.getText().isEmpty() ){
             JOptionPane.showMessageDialog(this, "Enter your customer ID !!! ");
             west.setVisible(false);

        }
             else{
                 west.jTextField1.setText(this.txt1.getText());
                west.setVisible(true);
             }
         }

         else if((String)jComboBox1.getSelectedItem()=="123 Restaurant"){
            rest123 rest = new rest123();
             if(txt1.getText().isEmpty() ){
             JOptionPane.showMessageDialog(this, "Enter your customer ID !!! ");
             rest.setVisible(false);

        }

           else  {
               rest.jTextField1.setText(this.txt1.getText());
             rest.setVisible(true);
             }
         }

         else if((String)jComboBox1.getSelectedItem()=="MID Fast Food"){
             MIDFastfood mid = new MIDFastfood();
             if(txt1.getText().isEmpty() ){
             JOptionPane.showMessageDialog(this, "Enter your customer ID !!! ");
             mid.setVisible(false);

        }
          else  {

             mid.jTextField1.setText(this.txt1.getText());
             mid.setVisible(true);
             }
         }
         else
             JOptionPane.showMessageDialog(this, "You Must Select A restaurant and customer ID !!! ");
        */

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Home().setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {



        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectRest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables

}
