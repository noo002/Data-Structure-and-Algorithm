/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.DeliverymanInformationInterface;
import Model.deliveryMan;

/**
 *
 * @author Asus
 */
public class DeliveryInformation extends javax.swing.JFrame {

    DeliverymanInformationInterface d = new Control.DeliverymanInformation();
    deliveryMan man = new deliveryMan();
    int position ;
    public DeliveryInformation(int position) {
        initComponents();
        this.position = position;
        getInitiateDetails();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfName = new javax.swing.JTextField();
        jtfIcNo = new javax.swing.JTextField();
        jtfContactNo = new javax.swing.JTextField();
        jtfAddress = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtfDeliverymanId = new javax.swing.JTextField();
        jtfStatus = new javax.swing.JTextField();
        jtfEmergencyContactNo = new javax.swing.JTextField();
        jtfLevel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Deliveryman Information");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/backbutton.jpg"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Show the Personal Information of the Deliveryman");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Personal Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12)))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Contact No:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Address:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Ic No:");

        jtfName.setEditable(false);

        jtfIcNo.setEditable(false);

        jtfContactNo.setEditable(false);

        jtfAddress.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfContactNo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtfName)
                        .addComponent(jtfIcNo, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                    .addComponent(jtfAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfIcNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Working Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 12)))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Deliveryman Id:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Status:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Emergency Contact No:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Level:");

        jtfDeliverymanId.setEditable(false);

        jtfStatus.setEditable(false);

        jtfEmergencyContactNo.setEditable(false);

        jtfLevel.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDeliverymanId)
                    .addComponent(jtfStatus)
                    .addComponent(jtfLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(jtfEmergencyContactNo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfDeliverymanId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfEmergencyContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtfLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(85, 85, 85))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jtfAddress;
    private javax.swing.JTextField jtfContactNo;
    private javax.swing.JTextField jtfDeliverymanId;
    private javax.swing.JTextField jtfEmergencyContactNo;
    private javax.swing.JTextField jtfIcNo;
    private javax.swing.JTextField jtfLevel;
    private javax.swing.JTextField jtfName;
    private javax.swing.JTextField jtfStatus;
    // End of variables declaration//GEN-END:variables

    private void getInitiateDetails() {
      man = HomePage.d.get(position);
      setLocationRelativeTo(null);
      
      jtfAddress.setText(man.getAddress());
       jtfContactNo.setText(man.getContactNo());
        jtfDeliverymanId.setText(man.getDeliveryManId());
         jtfEmergencyContactNo.setText(man.getEmergencyContactNo());
          jtfIcNo.setText(man.getIcNo());
           jtfLevel.setText(man.getLevel());
            jtfName.setText(man.getName());
             jtfStatus.setText(man.getStatus());
             setTitle("Show deliveryman Details");
    }
}
