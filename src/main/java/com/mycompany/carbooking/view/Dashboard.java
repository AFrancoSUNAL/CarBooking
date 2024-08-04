package com.mycompany.carbooking.view;

import TemporalDB.Agencies;
import TemporalDB.Cars;
import TemporalDB.Clients;
import TemporalDB.Garages;
import TemporalDB.Reserves;
import com.mycompany.carbooking.controller.CarBooking;
import com.mycompany.carbooking.model.Agency;
import com.mycompany.carbooking.model.Car;
import com.mycompany.carbooking.model.Client;
import com.mycompany.carbooking.model.Garage;
import com.mycompany.carbooking.model.Reserve;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        
        startDB();
        
        DefaultTableModel model = new DefaultTableModel();
        
        String[] columnNames = {"Id", "Name", "Client Code", "Address", "Phone number"};
        model.setColumnIdentifiers(columnNames);
        
        jTable1.setModel(model);
        
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    private static void startDB(){
        Cars.cars.add(new Car("ASJ-051", "Red", "Toyota Corolla", "Toyota", 120.4f));
        Cars.cars.add(new Car("IJE-877", "Blue", "Honda Civic", "Honda", 200.0f));
        Cars.cars.add(new Car("WRJ-998", "Black", "Ford Mustang", "Ford", 280.5f));
        Cars.cars.add(new Car("DVN-569", "White", "Chevrolet Silverado", "Chevrolet", 150.9f));
        Cars.cars.add(new Car("IEI-514", "Gray", "Tesla Model 3", "Tesla", 305.5f));
        Cars.cars.add(new Car("APS-588", "Dark Green", "Mercedez Benz", "Mercedez", 300.8f));
        
        HashMap<String, Car> carListGarage1 = new HashMap<>();
        carListGarage1.put(Cars.cars.get(0).getId(), Cars.cars.get(0));
        carListGarage1.put(Cars.cars.get(1).getId(), Cars.cars.get(1));
        carListGarage1.put(Cars.cars.get(2).getId(), Cars.cars.get(2));
        
        HashMap<String, Car> carListGarage2 = new HashMap<>();
        carListGarage2.put(Cars.cars.get(3).getId(), Cars.cars.get(3));
        carListGarage2.put(Cars.cars.get(4).getId(), Cars.cars.get(4));
        carListGarage2.put(Cars.cars.get(5).getId(), Cars.cars.get(5));
        
        Garages.garages.add(new Garage(1, "Block A", carListGarage1));
        Garages.garages.add(new Garage(2, "Block B", carListGarage2));
        
        Agencies.agencies.add(new Agency(1, "Agency A", "Addres 1", 49.9f));
        Agencies.agencies.add(new Agency(2, "Agency B", "Addres 2", 29.9f));
        Agencies.agencies.add(new Agency(3, "Agency C", "Addres 3", 89.9f));
        Agencies.agencies.add(new Agency(4, "Agency D", "Addres 4", 39.9f));
        Agencies.agencies.add(new Agency(5, "Agency E", "Addres 5", 79.9f));
        
        Reserves.reserves.add(new Reserve(1, "04/08/2024", "05/08/2024", Agencies.agencies.get(0)));
        Reserves.reserves.add(new Reserve(2, "20/09/2024", "30/09/2024", Agencies.agencies.get(4)));
        ArrayList<Car> carList1 = new ArrayList<>();
        carList1.add(Cars.cars.get(0));
        carList1.add(Cars.cars.get(1));
        carList1.add(Cars.cars.get(2));
        ArrayList<Car> carList2 = new ArrayList<>();
        carList2.add(Cars.cars.get(3));
        carList2.add(Cars.cars.get(4));
        carList2.add(Cars.cars.get(5));
        Reserves.reserves.get(0).addCars(carList1);
        Reserves.reserves.get(1).addCars(carList2);
        
        Clients.clients.add(new Client(1, "Andres", "AS156", "Address 1", "3115060287"));
        Clients.clients.add(new Client(2, "Sofia", "SF585", "Address 2", "3121881865"));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
