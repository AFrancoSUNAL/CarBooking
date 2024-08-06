package com.mycompany.carbooking.view;

import com.mycompany.carbooking.controller.StartDatabase;
import com.mycompany.carbooking.view.agency.AgencyIndex;
import com.mycompany.carbooking.view.car.CarIndex;
import com.mycompany.carbooking.view.car.CarDetails;
import com.mycompany.carbooking.view.client.ClientIndex;
import com.mycompany.carbooking.view.garage.GarageIndex;
import com.mycompany.carbooking.view.reserve.ReserveIndex;
import javax.swing.JPanel;

/**
 *
 * @author Andres Felipe Franco
 */
public class Dashboard extends javax.swing.JFrame {

    private final StartDatabase startDatabase = new StartDatabase();
    
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        ClientIndex clientIndex = new ClientIndex();
        printPanel(clientIndex, this.pnlDisplay);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlButtons = new javax.swing.JPanel();
        btnAgency = new javax.swing.JButton();
        btnGarage = new javax.swing.JButton();
        btnCar = new javax.swing.JButton();
        btnClient = new javax.swing.JButton();
        btnReserve = new javax.swing.JButton();
        pnlDisplay = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlButtons.setBackground(new java.awt.Color(122, 149, 181));

        btnAgency.setText("Agency");
        btnAgency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgencyActionPerformed(evt);
            }
        });

        btnGarage.setText("Garage");
        btnGarage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGarageActionPerformed(evt);
            }
        });

        btnCar.setText("Car");
        btnCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarActionPerformed(evt);
            }
        });

        btnClient.setText("Client");
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        btnReserve.setText("Reserve");
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlButtonsLayout = new javax.swing.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGarage, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgency, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlButtonsLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btnAgency, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnGarage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnCar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        getContentPane().add(pnlButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 560));

        pnlDisplay.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlDisplayLayout = new javax.swing.GroupLayout(pnlDisplay);
        pnlDisplay.setLayout(pnlDisplayLayout);
        pnlDisplayLayout.setHorizontalGroup(
            pnlDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        pnlDisplayLayout.setVerticalGroup(
            pnlDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(pnlDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 790, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgencyActionPerformed
        AgencyIndex agencyIndex = new AgencyIndex();
        printPanel(agencyIndex, this.pnlDisplay);
    }//GEN-LAST:event_btnAgencyActionPerformed

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        ClientIndex clientIndex = new ClientIndex();
        printPanel(clientIndex, this.pnlDisplay);
    }//GEN-LAST:event_btnClientActionPerformed

    private void btnGarageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGarageActionPerformed
        GarageIndex garageIndex = new GarageIndex();
        printPanel(garageIndex, this.pnlDisplay);
    }//GEN-LAST:event_btnGarageActionPerformed

    private void btnCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarActionPerformed
        CarIndex carIndex = new CarIndex();
        printPanel(carIndex, this.pnlDisplay);
    }//GEN-LAST:event_btnCarActionPerformed

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
        ReserveIndex reserveIndex = new ReserveIndex();
        printPanel(reserveIndex, this.pnlDisplay);
    }//GEN-LAST:event_btnReserveActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }
    
    private void printPanel(JPanel panel, JPanel container){
        panel.setSize(this.pnlDisplay.getSize());
        panel.setLocation(0, 0);
        
        container.removeAll();
        container.add(panel);
        container.revalidate();
        container.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgency;
    private javax.swing.JButton btnCar;
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnGarage;
    private javax.swing.JButton btnReserve;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlDisplay;
    // End of variables declaration//GEN-END:variables
}
