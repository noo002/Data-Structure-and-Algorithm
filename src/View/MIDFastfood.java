package View;


import Control.LinkedQueue;
import Control.QueueInterface;
import Model.food;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gan
 */
public class MIDFastfood extends javax.swing.JFrame {

    List<food> menuItem = new ArrayList<>();
    
    public MIDFastfood() {
        initComponents();
        populateTable();
        jTextField1.setEditable(false);
    }
    
     public void populateTable(){
    // This function to insert data into table first
    food menu = new food("MidBurget Set",10,0);
    food menu1 = new food("Fish Burger Set",9,0);
    food menu2 = new food("Beef Burger Set",10,0);
    food menu3 = new food("Fried Chicken Set",10,0);
    menuItem.add(menu);
    menuItem.add(menu1);
    menuItem.add(menu2);
    menuItem.add(menu3);
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    Object rowData[] = new Object[3];
    for(int i=0;i<menuItem.size();i++){
        rowData[0] = menuItem.get(i).getFoodName();
        rowData[1] = menuItem.get(i).getPrice();
        rowData[2] = menuItem.get(i).getQuantity();
        
        model.addRow(rowData);
    }
    menuItem.clear();
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
        cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MID FAST FOOD");

        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(jButton1))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        new SelectRest().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //display the selected item on nxt jFrame 
        TableModel model = jTable1.getModel();
        int indexs[] = jTable1.getSelectedRows();
       
        
        Object[] Row = new Object[4];
        
        PlaceOrder pOder = new PlaceOrder();
        DefaultTableModel model2 = (DefaultTableModel)pOder.jTable1.getModel();
        
        for(int i =0; i<indexs.length; i++){
            
            
          Row[0] = model.getValueAt(indexs[i],0); 
          Row[1] = model.getValueAt(indexs[i],1); 
          double a = (double) model.getValueAt(indexs[i],1);
          Row[2] = model.getValueAt(indexs[i],2);
          double b =(double) model.getValueAt(indexs[i],2);
          Row[3] = a*b; //subtotal
          
          
          model2.addRow(Row);
        
          
        }
               pOder.jTextField5.setText(this.jTextField1.getText());
               pOder.setVisible(true);
                                            

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MIDFastfood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MIDFastfood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MIDFastfood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MIDFastfood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MIDFastfood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

