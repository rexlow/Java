import java.sql.*;
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

    public Pet(int petID, String petName, int petOwnerID, String petOwner, String petAge, String petBreed, String petGender, String petNote) {
        initComponents();
        connection = SQLiteConnection.dbConnector();
        petSetter(petID, petName, petOwnerID, petOwner, petAge, petBreed, petGender, petNote);
        petFieldSetter(petName, petOwner, petAge, petBreed, petGender, petNote);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(closeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkOutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(petNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(petOwnerField)
                            .addComponent(petAgeField)
                            .addComponent(petBreedField)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(maleRadioButton)
                                .addGap(36, 36, 36)
                                .addComponent(femaleRadioButton)
                                .addGap(71, 71, 71)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(closeButton)
                    .addComponent(checkOutButton))
                .addGap(30, 30, 30))
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
        String updatePet = "UPDATE Pet SET petName=?, petBreed=?, petGender=?, petAge=?, petOwner=?, petNote=? WHERE petID=" + petID;
        try {
            PreparedStatement prepareStatement = connection.prepareStatement(updatePet);
            prepareStatement.setString(1, newPetName);
            prepareStatement.setString(2, newPetBreed);
            prepareStatement.setString(3, newPetGender);
            prepareStatement.setString(4, newPetAge);
            prepareStatement.setInt(5, petOwnerID);
            prepareStatement.setString(6, newPetNote);
            
            prepareStatement.executeUpdate();
            prepareStatement.close();
            JOptionPane.showMessageDialog(null, "Update Pet information successful");
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Pet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_updateButtonActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Pet(petID, petName, petOwnerID, petOwner, petAge, petBreed, petGender, petNote).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkOutButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextArea medicalNoteArea;
    private javax.swing.JTextField petAgeField;
    private javax.swing.JTextField petBreedField;
    private javax.swing.JTextField petNameField;
    private javax.swing.JTextField petOwnerField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
