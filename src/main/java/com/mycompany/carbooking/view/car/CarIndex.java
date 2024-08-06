package com.mycompany.carbooking.view.car;

import TemporalDB.Cars;
import com.mycompany.carbooking.model.Car;
import com.mycompany.carbooking.view.Dashboard;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres Felipe Franco
 */
public class CarIndex extends javax.swing.JPanel {

    public CarIndex() {
        initComponents();
        
        DefaultTableModel model = new DefaultTableModel();
        String columNames[] = {"Id", "Color", "Model", "Brand", "Book Price", "Fuel Porcentage", "Available"};
        model.setColumnIdentifiers(columNames);
        tbCar.setModel(model);
        
        for(Car car : Cars.cars) {
            model.addRow(new Object[]{
                car.getId(),
                car.getColor(),
                car.getModel(),
                car.getBrand(),
                car.getBookPrice(),
                car.getFuelPorcentage(),
                car.isAvailable()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbCar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        tbCar.setModel(new javax.swing.table.DefaultTableModel(
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
        tbCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCar);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Car");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCarMouseClicked
        Dashboard dashboard = new Dashboard();
        CarDetails test = new CarDetails(dashboard, true);
        test.setVisible(true);     
    }//GEN-LAST:event_tbCarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCar;
    // End of variables declaration//GEN-END:variables
}
