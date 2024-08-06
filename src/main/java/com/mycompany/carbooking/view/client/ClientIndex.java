package com.mycompany.carbooking.view.client;

import TemporalDB.Clients;
import com.mycompany.carbooking.model.Client;
import com.mycompany.carbooking.view.Dashboard;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres Felipe Franco
 */
public class ClientIndex extends javax.swing.JPanel {

    public ClientIndex() {
        initComponents();
        
        DefaultTableModel model = new DefaultTableModel();
        String columNames[] = {"Id", "Client Name", "Client Code", "Address", "Phone number"};
        model.setColumnIdentifiers(columNames);
        tbClient.setModel(model);
        
        for(Client client : Clients.clients) {
            model.addRow(new Object[]{
                client.getId(),
                client.getName(),
                client.getClientCode(),
                client.getAddress(),
                client.getPhoneNumber()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbClient = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        tbClient.setModel(new javax.swing.table.DefaultTableModel(
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
        tbClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClient);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Client");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientMouseClicked
        Dashboard dashboard = new Dashboard();
        ClientDetails test = new ClientDetails(dashboard, true);
        test.setVisible(true); 
    }//GEN-LAST:event_tbClientMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbClient;
    // End of variables declaration//GEN-END:variables
}
