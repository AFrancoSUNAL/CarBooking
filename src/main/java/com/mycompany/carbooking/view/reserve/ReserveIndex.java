package com.mycompany.carbooking.view.reserve;

import TemporalDB.Reserves;
import com.mycompany.carbooking.model.Reserve;
import com.mycompany.carbooking.view.Dashboard;
import com.mycompany.carbooking.view.car.CarDetails;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres Felipe Franco
 */
public class ReserveIndex extends javax.swing.JPanel {

    /**
     * Creates new form ReserveIndex
     */
    public ReserveIndex() {
        initComponents();
        
        DefaultTableModel model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        String columNames[] = {"Id", "Start Date", "End Date", "Agency", "Total Price", "Finished"};
        model.setColumnIdentifiers(columNames);
        tbReserve.setModel(model);
        
        for(Reserve reserve : Reserves.reserves) {
            model.addRow(new Object[]{
                reserve.getId(),
                reserve.getStartDate(),
                reserve.getEndDate(),
                reserve.getAgency().getAgencyName(),
                reserve.getTotalPrice(),
                reserve.isIsFinished()
            });
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbReserve = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        tbReserve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbReserve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbReserveMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbReserve);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reserve");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbReserveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbReserveMouseClicked
        Dashboard dashboard = new Dashboard();
        ReserveDetails reserveDetails = new ReserveDetails(dashboard, true);
        reserveDetails.setVisible(true);
    }//GEN-LAST:event_tbReserveMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbReserve;
    // End of variables declaration//GEN-END:variables
}
