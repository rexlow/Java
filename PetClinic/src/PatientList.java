import java.awt.event.MouseAdapter;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class PatientList extends javax.swing.JFrame implements TableListener {
    
    private int ownerID;
    private int petID;

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
    
    private void petIDSetter(int petID) {
        this.petID = petID;
    }
    
    private int petIDGetter() {
        return petID;
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
        checkPetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        jLabel1.setText("Select a patient from the table below to do operation");

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
        petTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                petTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(petTable);

        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        jLabel2.setText("Select patient from the table above and click 'View Patient's Pet' to view patient's pet");

        viewPetButton.setText("View Patient's Pet");
        viewPetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPetButtonActionPerformed(evt);
            }
        });

        checkPetButton.setText("Check Pet");
        checkPetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(checkPetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 636, Short.MAX_VALUE)
                                    .addComponent(goBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 8, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewPetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addPetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPetButton)
                    .addComponent(goBackButton)))
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
    
    //display pet on table from JOIN QUERY
    private void viewPetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPetButtonActionPerformed
       //get ownerID for validation
       int localOwnerID = ownerIDGetter();
       
       //join operation
       if (localOwnerID <= 0) {
            JOptionPane.showMessageDialog(null, "Please select a patient from the Patient Table");
        } else {
            String joinPatientAndPet = "SELECT petID, petName, petBreed, petGender, petAge, petNote FROM Pet INNER JOIN Patient ON Pet.petOwner = Patient.patientID WHERE Pet.petOwner =  " + localOwnerID;
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(joinPatientAndPet);
                ResultSet resultSet = preparedStatement.executeQuery();
                petTable.setModel(DbUtils.resultSetToTableModel(resultSet));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_viewPetButtonActionPerformed

    private void petTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_petTableMouseClicked

    private void checkPetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPetButtonActionPerformed
        int localPetID = petIDGetter();
        
        if (localPetID <= 0) {
            JOptionPane.showMessageDialog(null, "Please select a pet from the Pet Table");
        } else {
            //create an object from Pet Class
            String checkPetQuery = "SELECT petID, petName, petBreed, petGender, petAge, petNote, patientID, patientName FROM Pet INNER JOIN Patient ON Pet.petOwner = Patient.patientID WHERE Pet.petID = " + localPetID;
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(checkPetQuery);
                ResultSet resultSet = preparedStatement.executeQuery();
                while(resultSet.next()) {
                    String petName = resultSet.getString("petName");
                    String petBreed = resultSet.getString("petBreed");
                    String petGender = resultSet.getString("petGender");
                    String petAge = resultSet.getString("petAge");
                    String petNote = resultSet.getString("petNote");
                    int patientID = resultSet.getInt("patientID");
                    String patientName = resultSet.getString("patientName");
                    Pet checkPetObject = new Pet(localPetID, petName, patientID, patientName, petAge, petBreed, petGender, petNote);
                    checkPetObject.setVisible(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_checkPetButtonActionPerformed

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
    private javax.swing.JButton checkPetButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable patientTable;
    private javax.swing.JTable petTable;
    private javax.swing.JButton viewPetButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void listenToUserEvent() {
        patientTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int patientRow = patientTable.rowAtPoint(evt.getPoint());
                int patientCol = patientTable.columnAtPoint(evt.getPoint());
                
                if (patientRow >= 0 && patientCol >= 0) {
                    ownerIDSetter(patientRow+1);
                }
            }
        });
        
        petTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int petIndex = petTable.getSelectedRow();
                TableModel petModel = petTable.getModel();
                
                String petIDString = petModel.getValueAt(petIndex, 0).toString();
                int petID = Integer.valueOf(petIDString);
                
                //petID from database is always greater than 0
                if (petID >= 0) {
                    petIDSetter(petID);
                }
            }
        });
    }
}
