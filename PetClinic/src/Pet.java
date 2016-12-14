//commented code below are due to the double trigger nature of event listener
//gonna ignore them for now due to time constraint

import java.awt.event.ActionEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Pet extends javax.swing.JFrame {
    
    Connection connection = null;
    
    private static int petID;
    private static String petName;
    private static int petOwnerID;
    private static String petOwner;
    private static String petAge;
    private static String petBreed;
    private static String petGender;
    private static String petNote;
    
    private static String procedureAName;
    private static String procedureBName;
    private static String procedureCName;
    
    private static double totalProcedurePrice;
    ArrayList<String> procedureList = new ArrayList<>();
//    ArrayList<String> subscribedProcedureList = new ArrayList<>();
    ArrayList<Double> procedurePriceList = new ArrayList<>();

    public Pet(int petID, String petName, int petOwnerID, String petOwner, String petAge, String petBreed, String petGender, String petNote) {
        initComponents();
        connection = SQLiteConnection.dbConnector();
        petSetter(petID, petName, petOwnerID, petOwner, petAge, petBreed, petGender, petNote);
        petFieldSetter(petName, petOwner, petAge, petBreed, petGender, petNote);
        procedureComboBox();
        resetTotalPrice();
    }
    
    private void petSetter(int petID, String petName, int petOwnerID, String petOwner, String petAge, String petBreed, String petGender, String petNote) {
        Pet.petID = petID;
        Pet.petName = petName;
        Pet.petOwnerID = petOwnerID;
        Pet.petOwner = petOwner;
        Pet.petAge = petAge;
        Pet.petBreed = petBreed;
        Pet.petGender = petGender;
        Pet.petNote = petNote;
    }
    
    private void petFieldSetter(String petName, String petOwner, String petAge, String petBreed, String petGender, String petNote) {
        petNameField.setText(petName);
        petOwnerField.setText(petOwner);
        petAgeField.setText(petAge);
        petBreedField.setText(petBreed);
        medicalNoteArea.setText(petNote);
        
        if ("male".equals(petGender)) {
            maleRadioButton.setSelected(true);
        } else if ("female".equals(petGender)) {
            femaleRadioButton.setSelected(true);
        }
    }
    
    private void resetTotalPrice() {
        totalProcedurePrice = 0.0;
        totalPrice.setText("0.0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        petNameField = new javax.swing.JTextField();
        petOwnerField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        petAgeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        petBreedField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicalNoteArea = new javax.swing.JTextArea();
        checkOutButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        procedureA = new javax.swing.JComboBox<>();
        procedureB = new javax.swing.JComboBox<>();
        procedureC = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        rmLabel = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        resetProperties = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Pet");
        setResizable(false);

        jLabel1.setText("Pet Name");

        jLabel2.setText("Pet Owner");

        petOwnerField.setEditable(false);

        jLabel3.setText("Pet Age");

        jLabel4.setText("Pet Breed");

        petBreedField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                petBreedFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Pet Gender");

        genderButtonGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");

        genderButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");

        jLabel6.setText("Medical Note");

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        medicalNoteArea.setColumns(20);
        medicalNoteArea.setRows(5);
        jScrollPane1.setViewportView(medicalNoteArea);

        checkOutButton.setText("Check out");
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Select Procedure");

        jLabel8.setText("Procedure A");

        jLabel9.setText("Procedure B");

        jLabel10.setText("Procedure C");

        procedureA.setMaximumRowCount(10);
        procedureA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procedureAActionPerformed(evt);
            }
        });

        procedureB.setSelectedItem(procedureB);
        procedureB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procedureBActionPerformed(evt);
            }
        });

        procedureC.setSelectedItem(procedureC);
        procedureC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procedureCActionPerformed(evt);
            }
        });

        jLabel11.setText("Total Price");

        rmLabel.setText("RM");

        totalPrice.setText("0");

        resetProperties.setText("Reset to default");
        resetProperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetPropertiesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel11))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(jLabel10)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resetProperties, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(petNameField)
                    .addComponent(petOwnerField)
                    .addComponent(petAgeField)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(maleRadioButton)
                        .addGap(36, 36, 36)
                        .addComponent(femaleRadioButton))
                    .addComponent(procedureA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rmLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(procedureC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(procedureB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(petBreedField))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(petNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(petOwnerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(petAgeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(petBreedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(maleRadioButton)
                    .addComponent(femaleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(procedureA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(procedureB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(procedureC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(rmLabel)
                    .addComponent(totalPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkOutButton)
                    .addComponent(updateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(resetProperties))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void petBreedFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_petBreedFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_petBreedFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        //get latest data
        String newPetName = petNameField.getText();
        String newPetOwner = petOwnerField.getText();
        String newPetAge = petAgeField.getText();
        String newPetBreed = petBreedField.getText();
        String newPetNote = medicalNoteArea.getText();
        
        String newPetGender;
        if(maleRadioButton.isSelected()) {
            newPetGender = "male";
        } else {
            newPetGender = "female";
        }

        //update database particulars
        String updatePet = "UPDATE Pet SET petName=?, petBreed=?, petGender=?, petAge=?, petOwner=?, petNote=?, procedureA=?, procedureB=?, procedureC=? WHERE petID=" + petID;
        try (PreparedStatement prepareStatement = connection.prepareStatement(updatePet)) {
            prepareStatement.setString(1, newPetName);
            prepareStatement.setString(2, newPetBreed);
            prepareStatement.setString(3, newPetGender);
            prepareStatement.setString(4, newPetAge);
            prepareStatement.setInt(5, petOwnerID);
            prepareStatement.setString(6, newPetNote);
            prepareStatement.setString(7, procedureAName);
            prepareStatement.setString(8, procedureBName);
            prepareStatement.setString(9, procedureCName);
            
            prepareStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Pet.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Update Pet information successful");
        dispose();
        
    }//GEN-LAST:event_updateButtonActionPerformed

    
    //procedure A
    private void procedureAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procedureAActionPerformed
        
        procedureA.addActionListener((ActionEvent e) -> {
            int indexA = procedureA.getSelectedIndex();
            if (indexA != -1) {
                procedureAName = procedureA.getSelectedItem().toString();
                totalProcedurePrice = totalProcedurePrice + procedurePriceList.get(indexA)*0.5;
                totalPrice.setText(String.valueOf(totalProcedurePrice));
//                subscribedProcedureList.add(selectedProcedure);
            }
        });
        
    }//GEN-LAST:event_procedureAActionPerformed

    private void procedureBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procedureBActionPerformed
        
        procedureB.addActionListener((ActionEvent e) -> {
            int indexB = procedureB.getSelectedIndex();
            if (indexB != -1) {
                procedureBName = procedureB.getSelectedItem().toString();
                totalProcedurePrice = totalProcedurePrice + procedurePriceList.get(indexB)*0.5;
                totalPrice.setText(String.valueOf(totalProcedurePrice));
//                subscribedProcedureList.add(selectedProcedure);
            }
        });
        
    }//GEN-LAST:event_procedureBActionPerformed

    private void procedureCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procedureCActionPerformed
        
        procedureC.addActionListener((ActionEvent e) -> {
            int indexC = procedureC.getSelectedIndex();
            if (indexC != -1) {
                procedureCName = procedureC.getSelectedItem().toString();
                totalProcedurePrice = totalProcedurePrice + procedurePriceList.get(indexC)*0.5;
                totalPrice.setText(String.valueOf(totalProcedurePrice));
//                subscribedProcedureList.add(selectedProcedure);
            }
        });
        
    }//GEN-LAST:event_procedureCActionPerformed

    private void resetPropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPropertiesActionPerformed
        procedureA.setSelectedIndex(-1);
        procedureB.setSelectedIndex(-1);
        procedureC.setSelectedIndex(-1);
        medicalNoteArea.setText("");
        resetTotalPrice();
    }//GEN-LAST:event_resetPropertiesActionPerformed

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
        String updateProcedure = "UPDATE Pet SET procedureA=?, procedureB=?, procedureC=? WHERE petID=" + petID;
        String moveToArchieve = "INSERT INTO Archieve SELECT * FROM Pet WHERE petID=" + petID;
        try (PreparedStatement prepareStatement = connection.prepareStatement(updateProcedure)) {
            PreparedStatement moveToArchieveTable = connection.prepareStatement(moveToArchieve);
            prepareStatement.setString(1, procedureAName);
            prepareStatement.setString(2, procedureBName);
            prepareStatement.setString(3, procedureCName);
            
            prepareStatement.executeUpdate();
            moveToArchieveTable.executeUpdate();
            
            PDF invoice = new PDF(petName, petOwner, totalProcedurePrice);
            invoice.printPDF();
            JOptionPane.showMessageDialog(null, "Invoice created!");
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Pet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_checkOutButtonActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Pet(petID, petName, petOwnerID, petOwner, petAge, petBreed, petGender, petNote).setVisible(true);
        });
    }
    
    private void procedureComboBox() {
        String petProcedure = "SELECT procedureName, cost from Procedures";
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(petProcedure);
            ResultSet resultSet = prepareStatement.executeQuery();
            
            MutableComboBoxModel procedureModelA = (DefaultComboBoxModel)procedureA.getModel();
            MutableComboBoxModel procedureModelB = (DefaultComboBoxModel)procedureB.getModel();
            MutableComboBoxModel procedureModelC = (DefaultComboBoxModel)procedureC.getModel();
            
            while(resultSet.next()) {
                procedureModelA.addElement(resultSet.getString("procedureName"));
                procedureModelB.addElement(resultSet.getString("procedureName"));
                procedureModelC.addElement(resultSet.getString("procedureName"));
                procedureList.add(resultSet.getString("procedureName"));
                procedurePriceList.add(resultSet.getDouble("cost"));
            }
            
            procedureA.setSelectedIndex(-1);
            procedureB.setSelectedIndex(-1);
            procedureC.setSelectedIndex(-1);
        } catch (SQLException ex) {
            Logger.getLogger(Pet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkOutButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.ButtonGroup genderButtonGroup;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextArea medicalNoteArea;
    private javax.swing.JTextField petAgeField;
    private javax.swing.JTextField petBreedField;
    private javax.swing.JTextField petNameField;
    private javax.swing.JTextField petOwnerField;
    private javax.swing.JComboBox<String> procedureA;
    private javax.swing.JComboBox<String> procedureB;
    private javax.swing.JComboBox<String> procedureC;
    private javax.swing.JButton resetProperties;
    private javax.swing.JLabel rmLabel;
    private javax.swing.JLabel totalPrice;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
