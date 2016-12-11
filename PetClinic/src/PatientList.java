import java.awt.event.MouseAdapter;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import net.proteanit.sql.DbUtils;

public class PatientList extends javax.swing.JFrame implements TableListener {
    
    private int ownerID;

    Connection connection = null;
    
    public PatientList() {
        initComponents();
        connection = SQLiteConnection.dbConnector();
        pullPatientList();
        listenToUserEvent();
    }
    
    private void ownerIDSetter(int ownerID) {
        this.ownerID = ownerID;
    }
    
    private int ownerIDGetter() {
        return ownerID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        goBackButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addPetButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        petTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        viewPetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(patientTable);

        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel1.setText("Select patient from the table below to do operation");

        addPetButton.setText("Add Patient's Pet");
        addPetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPetButtonActionPerformed(evt);
            }
        });

        petTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(petTable);

        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel2.setText("Select patient from the table above and click 'View Patient's Pet' to view patient's pet");

        viewPetButton.setText("View Patient's Pet");
        viewPetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(0, 8, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(goBackButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewPetButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addPetButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewPetButton)
                    .addComponent(addPetButton))
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(goBackButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        dispose();
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void addPetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPetButtonActionPerformed
        
        //get ownerID for validation
        int localOwnerID = ownerIDGetter();
        
        if (localOwnerID <= 0) {
            JOptionPane.showMessageDialog(null, "Please select a patient from the table");
        } else {
            AddPatient addPatient = new AddPatient(localOwnerID);
            addPatient.setVisible(true);
        }
        
    }//GEN-LAST:event_addPetButtonActionPerformed

    private void viewPetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPetButtonActionPerformed
       //get ownerID for validation
       int localOwnerID = ownerIDGetter();
       
       //join operation
       if (localOwnerID <= 0) {
            JOptionPane.showMessageDialog(null, "Please select a patient from the table");
        } else {
            String joinPatientAndPet = "SELECT petID, petName, petBreed, petGender, petAge FROM Pet INNER JOIN Patient ON Pet.petOwner = Patient.patientID WHERE Pet.petOwner =  " + localOwnerID;
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(joinPatientAndPet);
                ResultSet resultSet = preparedStatement.executeQuery();
                petTable.setModel(DbUtils.resultSetToTableModel(resultSet));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_viewPetButtonActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PatientList().setVisible(true);
        });
    }
    
    private void pullPatientList() {
        String pullPatientList = "SELECT * FROM Patient";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(pullPatientList);
            ResultSet resultSet = preparedStatement.executeQuery();
            patientTable.setModel(DbUtils.resultSetToTableModel(resultSet));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPetButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable patientTable;
    private javax.swing.JTable petTable;
    private javax.swing.JButton viewPetButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void listenToUserEvent() {
//        patientTable.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
//            System.out.println(patientTable.getValueAt(patientTable.getSelectedRow(), 0).toString());
//        });
        patientTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = patientTable.rowAtPoint(evt.getPoint());
                int col = patientTable.columnAtPoint(evt.getPoint());
                
                if (row >= 0 && col >= 0) {
                    ownerIDSetter(row+1);
                }
            }
        });
    }
}
