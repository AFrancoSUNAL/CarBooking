package com.mycompany.carbooking.view.agency;

import TemporalDB.Agencies;
import com.mycompany.carbooking.model.Agency;
import com.mycompany.carbooking.view.Dashboard;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres Felipe Franco
 */
public class AgencyIndex extends javax.swing.JPanel {

    private DefaultTableModel model;
    
    public AgencyIndex() {
        initComponents();
        
        model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        String columNames[] = {"Id", "Agency Name", "Address", "Price Sevice"};
        model.setColumnIdentifiers(columNames);
        tbAgency.setModel(model);
        
        for(Agency agency : Agencies.agencies) {
            model.addRow(new Object[]{
                agency.getId(),
                agency.getAgencyName(),
                agency.getAddress(),
                agency.getPriceService()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbAgency = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        tbAgency.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbAgency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAgencyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAgency);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agencies");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbAgencyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAgencyMouseClicked
        Dashboard dashboard = new Dashboard();
        AgencyDetails agencyDetails = new AgencyDetails(dashboard, true);
        for(Agency agency : Agencies.agencies) {
            if(tbAgency.getValueAt(tbAgency.getSelectedRow(), 0).equals(agency.getId())) {
                agencyDetails.setInfo(agency);
            }
        }
        agencyDetails.setVisible(true);
    }//GEN-LAST:event_tbAgencyMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAgency;
    // End of variables declaration//GEN-END:variables
}
