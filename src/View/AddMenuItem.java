package View;


import Model.MenuItem;
import Model.menu;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Control.LListR;
import Control.LStackR;
import Control.ListInterfaceR;
import Model.Restaurant;
import Model.food;


public class AddMenuItem extends javax.swing.JFrame {
    ListInterfaceR<menu> listMenu = new LListR<>();
    ListInterfaceR<food> listFood = new LListR<>();
    String name,category,description;
    double price;

    public AddMenuItem() {
        initComponents();
        setTitle("Add Menu");
        setSize(800,500);
        Restaurant res = new Restaurant();
        //jlblResName.setText(ExistingRestaurant.name);
        setLocationRelativeTo(null);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescription = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jbtAdd = new javax.swing.JButton();
        jbtReset = new javax.swing.JButton();
        jlblName = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jlblPrice = new javax.swing.JLabel();
        jtfPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jlblCategory = new javax.swing.JLabel();
        jcbCategory = new javax.swing.JComboBox<>();
        jlblDescription = new javax.swing.JLabel();
        jlblTitle = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtEdit = new javax.swing.JButton();
        jbtConfirm = new javax.swing.JButton();
        jbtHome = new javax.swing.JButton();
        jlblResName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtaDescription.setColumns(20);
        jtaDescription.setRows(5);
        jScrollPane1.setViewportView(jtaDescription);

        jLabel2.setText("Menu that is going to be added :");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jbtAdd.setText("Add Item");
        jbtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddActionPerformed(evt);
            }
        });

        jbtReset.setText("Reset");
        jbtReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtResetActionPerformed(evt);
            }
        });

        jlblName.setText("Name : ");

        jlblPrice.setText("Price : ");

        jLabel4.setText("RM");

        jlblCategory.setText("Category : ");

        jcbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Appetizer", "Vegetable\t", "Pork", "Fish", "Chicken", "Beef", "Drinks", "Desserts" }));

        jlblDescription.setText("Description : ");

        jlblTitle.setText("Add Menu Item");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Category", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jbtEdit.setText("Edit");
        jbtEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEditActionPerformed(evt);
            }
        });

        jbtConfirm.setText("Confirm Add Item");
        jbtConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtConfirmActionPerformed(evt);
            }
        });

        jbtHome.setText("Back To Previous page");
        jbtHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jlblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblResName)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlblName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlblCategory)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jcbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jlblPrice)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jlblDescription)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jbtAdd)
                        .addGap(18, 18, 18)
                        .addComponent(jbtReset)))
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jbtEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jbtConfirm)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jbtHome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTitle)
                    .addComponent(jlblResName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlblName)
                                .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtEdit)
                                    .addComponent(jbtConfirm)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlblPrice)
                                    .addComponent(jtfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlblCategory)
                                    .addComponent(jcbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addComponent(jlblDescription)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtAdd)
                                    .addComponent(jbtReset))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jbtHome, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddActionPerformed
        //retrieve items from GUI
         name = jtfName.getText();
         category = jcbCategory.getSelectedItem().toString();
        description = jtaDescription.getText();
        if(name.equals("") || category.equals("") || description.equals("") || jtfPrice.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Please fill in the required details");
        }
        else{
        price = Double.parseDouble(jtfPrice.getText());
        menu me = new menu(); 
        me.setCategory(category);
        food food = new food();
        food.setFoodName(name);
        food.setPrice(price);
        food.setDescription(description);
        //add to linked list first and display in JTable
        listMenu.add(me);
        listFood.add(food);
        addRowToJTable();
        }
    }//GEN-LAST:event_jbtAddActionPerformed

    private void jbtResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtResetActionPerformed
        jtfName.setText("");
        jtfPrice.setText("");
        jtaDescription.setText("");
        jcbCategory.setSelectedIndex(0);
    }//GEN-LAST:event_jbtResetActionPerformed

    private void jbtEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEditActionPerformed
        /* This function to edit the items in jtable */
        if(jTable1.getSelectedRow() >=0){
        String menuName = JOptionPane.showInputDialog("Enter the food name : ");
            String price = JOptionPane.showInputDialog("Enter the price : ");
            double price1 = Double.parseDouble(price);
         int categoryIndex = JOptionPane.showConfirmDialog(null, jcbCategory, "Category ", JOptionPane.OK_CANCEL_OPTION);
         String category = jcbCategory.getSelectedItem().toString();
         String description = JOptionPane.showInputDialog("Enter the description : ");
         //change data on the JTable
         jTable1.getModel().setValueAt(menuName, jTable1.getSelectedRow(), 0);
         jTable1.getModel().setValueAt(price1, jTable1.getSelectedRow(), 1);
        jTable1.getModel().setValueAt(category, jTable1.getSelectedRow(),2);
         jTable1.getModel().setValueAt(description, jTable1.getSelectedRow(), 3);
         }
         else{
             JOptionPane.showMessageDialog(null, "Select an item which you want to edit");
         }
    }//GEN-LAST:event_jbtEditActionPerformed

    private void jbtConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConfirmActionPerformed
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        //get value from jtable
         for(int i=0;i<model.getRowCount();i++){
             String name = (String) jTable1.getModel().getValueAt(i,0);
             double price = (double) jTable1.getModel().getValueAt(i,1);
             String category = (String) jTable1.getModel().getValueAt(i,2);
             String description = (String) jTable1.getModel().getValueAt(i,3);
             // add to model
             menu me = new menu(); 
            me.setCategory(category);
            food food = new food();
            food.setFoodName(name);
            food.setPrice(price);
            food.setDescription(description);
            food.setResName(ExistingRestaurant.name);
            //push to stack
              RestaurantHome.stackFood.push(food);
              RestaurantHome.stackMenu.push(me);
         }
         //show how many menu items added
       JOptionPane.showMessageDialog(null,"You added "+ model.getRowCount()+ " menu items");
        //remove or refresh all the data of the jtable
       if (model.getRowCount() > 0) {
    for (int i = model.getRowCount() - 1; i > -1; i--) {
        model.removeRow(i);
    }
       }
    }//GEN-LAST:event_jbtConfirmActionPerformed

    private void jbtHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtHomeActionPerformed
        // TODO add your handling code here:
        dispose();
        new RestaurantHome().setVisible(true);
    }//GEN-LAST:event_jbtHomeActionPerformed
public void addRowToJTable(){
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    Object rowData[] = new Object[4];

    //retrieve details from linked list to jtable
   for(int i=0;i<listFood.getNumberOfEntries();i++){
       rowData[0] = listFood.getEntry(i+1).getFoodName();
       rowData[1] = listFood.getEntry(i+1).getPrice();
       rowData[2] = listMenu.getEntry(i+1).getCategory();
       rowData[3] = listFood.getEntry(i+1).getDescription();
   }
   model.addRow(rowData);
}
    

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
            java.util.logging.Logger.getLogger(AddMenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMenuItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtAdd;
    private javax.swing.JButton jbtConfirm;
    private javax.swing.JButton jbtEdit;
    private javax.swing.JButton jbtHome;
    private javax.swing.JButton jbtReset;
    private javax.swing.JComboBox<String> jcbCategory;
    private javax.swing.JLabel jlblCategory;
    private javax.swing.JLabel jlblDescription;
    private javax.swing.JLabel jlblName;
    private javax.swing.JLabel jlblPrice;
    private javax.swing.JLabel jlblResName;
    private javax.swing.JLabel jlblTitle;
    private javax.swing.JTextArea jtaDescription;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfPrice;
    // End of variables declaration//GEN-END:variables
}
