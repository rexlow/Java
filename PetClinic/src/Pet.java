import java.sql.*;
import javax.swing.*;

public class Pet extends javax.swing.JFrame {
    
    Connection connection = null;
    
    private static String petName;
    private static String petOwner;
    private static String petAge;
    private static String petBreed;
    private static String petGender;
    private static String petNote;

    public Pet(String petName, String petOwner, String petAge, String petBreed, String petGender, String petNote) {
        initComponents();
        connection = SQLiteConnection.dbConnector();
        petSetter(petName, petOwner, petAge, petBreed, petGender, petNote);
        petFieldSetter(petName, petOwner, petAge, petBreed, petGender, petNote);
    }
    
    private void petSetter(String petName, String petOwner, String petAge, String petBreed, String petGender, String petNote) {
        Pet.petName = petName;
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
        petNoteField.setText(petNote);
        
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
        petNoteField = new javax.swing.JTextField();
        closeButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Pet");
        setResizable(false);

        jLabel1.setText("Pet Name");

        jLabel2.setText("Pet Owner");

        jLabel3.setText("Pet Age");

        jLabel4.setText("Pet Breed");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(maleRadioButton)
                                .addGap(36, 36, 36)
                                .addComponent(femaleRadioButton))
                            .addComponent(petNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(petOwnerField)
                            .addComponent(petAgeField)
                            .addComponent(petBreedField)
                            .addComponent(petNoteField))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(closeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(updateButton)
                        .addGap(58, 58, 58))))
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
                    .addComponent(petNoteField, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(closeButton))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Pet(petName, petOwner, petAge, petBreed, petGender, petNote).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField petAgeField;
    private javax.swing.JTextField petBreedField;
    private javax.swing.JTextField petNameField;
    private javax.swing.JTextField petNoteField;
    private javax.swing.JTextField petOwnerField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
