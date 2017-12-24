/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Deliveryman_1;
import Model.FoodMenu;
import Model.Order_1;
import javax.swing.JFrame;
import Control.DeliverymanListInterface;
import Control.JobsListInterface;
import Control.AssignJobListInterface;

/**
 *
 * @author Wee Kian Huat
 */
public class DeliverymanStatusGUI extends javax.swing.JFrame {
    
    public String dManID;
    Deliveryman_1[] dMan;
    Order_1[] Order = new Order_1[10];
    DeliverymanListInterface<String> dManNode;
    AssignJobListInterface<String> jobNode;
    FoodMenu[] menu;
    JobsListInterface<String> jobList;

    public JobsListInterface<String> getJobList() {
        return jobList;
    }

    public void setJobList(JobsListInterface<String> jobList) {
        this.jobList = jobList;
    }

    public void setMenu(FoodMenu[] menu) {
        this.menu = menu;
    }

    public FoodMenu[] getMenu() {
        return menu;
    }
    
    public DeliverymanStatusGUI() {
        initComponents();
    }
    
    public void setdManID(String dManID){
         this.dManID = dManID;
    }
    
    public String getdManID(){
        return this.dManID;
    }

    public Deliveryman_1[] getdMan() {
        return dMan;
    }

    public Order_1[] getOrder() {
        return Order;
    }

    public DeliverymanListInterface<String> getdManNode() {
        return dManNode;
    }

    public AssignJobListInterface<String> getJobNode() {
        return jobNode;
    }

    public void setDeliveryMan(Deliveryman_1[] dMan) {
        this.dMan = dMan;
    }

    public void setOrder(Order_1[] Order) {
        this.Order = Order;
    }

    public void setDeliveryManNode(DeliverymanListInterface<String> dManNode) {
        this.dManNode = dManNode;
    }

    public void setJobNode(AssignJobListInterface<String> jobNode) {
        this.jobNode = jobNode;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelAvailability = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("- Deliveryman Status Screen -");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jLabel2.setText("Deliveryman ID :");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Status :");

        labelAvailability.setText("< Current Status >");

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelAvailability)))
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(searchButton)
                .addGap(18, 18, 18)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelAvailability))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(searchButton)
                    .addComponent(clearButton))
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        JobsListInterface<String> jobOrder = getJobList();
            Deliveryman_1[] deliverymanList = getdMan();
            FoodMenu[] m = getMenu();
            Order_1[] o = getOrder();
            DeliverymanListInterface<String> deliverymanNode = getdManNode();
            
            int totalOrder= getReturnOrder();
            String id = textID.getText();
            int numberOfClockedInMan = getTotalUpdatedDeliveryMan();
            int totalOrderInQueue = jobOrder.getNumberOfNode();
            String status = getStatus(id);
            labelAvailability.setText(status);
            
            if(status == "This delivery job had successfully assigned."){
                
                for(int i=1; i<=totalOrderInQueue; i++){
                    String OrderID = jobOrder.returnNode(i);
                    
                    for(int c=0;c<totalOrder;c++){
                        
                        if(OrderID ==o[c].getoID()){
                            System.out.println(o[c].getdManID());
                            if(o[c].getdManID().equals(id)){
                                
                                FoodMenu menu = getMenu(o[c].getfID());
                                    textArea.setText("Order id : " + OrderID + "\n" + "Had been sucessfully assigned to : " + id + "\n" + "Food Name : " + menu.getFoodName() + "\n" + "Price : " +"RM "+  menu.getPrice() + "0\n" + " _______________________________________________ " + "\n" + "\n" + "Approximately time remaining to reach your location : 15 minutes" );
                            }                            
                        }                        
                    }                                      
                }
                
            }else if(status == "Currently available."){
                
                textArea.setText("Hi, you are enable to assign a delivery job to delivery man.");
                
            }else if(status == "Not available"){
                
                 textArea.setText("Sorry, this delivery man is not available for today.");
                
            }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainMenuGUI main = new MainMenuGUI();
        main.setdMan(getdMan());
        main.setNode(getdManNode());
        main.setOrder(getOrder());
        main.setJobNode(getJobNode());
        main.setJobList(getJobList());
        main.setVisible(true);
        main.setSize (500, 500);
        main.setLocation (200, 100);
        main.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_backButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        textID.setText("");
        labelAvailability.setText("< Current Status >");
    }//GEN-LAST:event_clearButtonActionPerformed

    public FoodMenu getOrderDetail(String OrderID, String dManId){
        
        Order_1[] o = getOrder();
        Deliveryman_1[] d = getdMan();
        int dman = getTotalUpdatedDeliveryMan();
        int totalOrder = getReturnOrder();
        
        FoodMenu m1 = null;
        for(int i =0; i<totalOrder; i++){
             if(OrderID == o[i].getoID()){                
                if(o[i].getdManID() == dManId){
                    return m1 = getMenu(o[i].getfID());
                }                
            } 
        }    
        return m1;
    }
    
    public FoodMenu getMenu(String FoodID){
        FoodMenu m2 = null;
        FoodMenu[]  m = getMenu();
        int totalMenu = getTotalMenu();       
        for(int i=0; i<totalMenu; i++){ 
            if(m[i].getFoodID()==FoodID){
                m2 = new FoodMenu(m[i].getFoodID(), m[i].getFoodName(), m[i].getPrice());
            }         
        }       
        return m2;    
    }
    
    public String getStatus(String id){
        String result = "";
        int totalMan = getTotalUpdatedDeliveryMan();
        Deliveryman_1[] d2 = getdMan();
        
        for(int i=0; i<getTotalUpdatedDeliveryMan();i++){
            
            if(d2[i].getID().equals(id)){
                
                if(d2[i].getClockInTime() != "null"){
                    
                    if(d2[i].status() == false){
                        return result = "This delivery job had successfully assigned.";
                    }else{
                        return result = "Currently available.";
                    }    
                }else{
                    return result = "Not available";
                }     
            }    
        }      
        return result;
    }
    
    public int getTotalUpdatedDeliveryMan(){
        int count = 0;
        Deliveryman_1[] dm = getdMan();
        for(int i =0; i<dm.length; i++){
            
            if(dm[i] != null){
                count++;
            }
        }       
        return count;
    }
    
     public int getReturnOrder(){
        int count=0;
        
        Order_1[] o = getOrder();
        
        for(int i=0; i<o.length;i++){
            
            if(o[i]!= null){
                count++;
            }    
        }    
        return count;
    }
    
    public int getTotalMenu(){
        int count=0;
        FoodMenu[] m = getMenu();
        for(int i=0; i<m.length;i++){
            if(m[i]!= null){
                count++;
            } 
        } 
        return count;
    }
    
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
            java.util.logging.Logger.getLogger(DeliverymanStatusGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeliverymanStatusGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeliverymanStatusGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeliverymanStatusGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DeliverymanStatusGUI status = new DeliverymanStatusGUI ();
                status.setVisible (true);
                status.setSize (500, 500);
                status.setLocation (200, 100);
                status.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelAvailability;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField textID;
    // End of variables declaration//GEN-END:variables
}
