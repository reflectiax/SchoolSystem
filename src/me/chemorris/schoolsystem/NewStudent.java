package me.chemorris.schoolsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class NewStudent extends javax.swing.JFrame {

    static Connection c;
    
    public NewStudent() {
        initComponents();
        setTitle("Georgetown Primary School - New Student");
        setResizable(false);
        setLocationRelativeTo(null);
        studentTable.setEnabled(false);
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");	   
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management_system", "root", "root");
        
            displaytable();
        }
        catch(Exception e){e.printStackTrace();}
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newStudentPanel = new javax.swing.JPanel();
        phoneNumberLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        studentIDField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        yearComboBox = new javax.swing.JComboBox<>();
        addStudentButton = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        studentIDLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        newStudentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "New Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        phoneNumberLabel.setText("Phone Number");

        yearLabel.setText("Year");

        emailLabel.setText("Email");

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nursery", "Reception", "Year 1", "Year 2", "Year 3", "Year 4", "Year 5", "Year 6" }));
        yearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboBoxActionPerformed(evt);
            }
        });

        addStudentButton.setText("ADD STUDENT");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });

        studentIDLabel.setText("Student ID");

        nameLabel.setText("Name");

        addressLabel.setText("Address");

        javax.swing.GroupLayout newStudentPanelLayout = new javax.swing.GroupLayout(newStudentPanel);
        newStudentPanel.setLayout(newStudentPanelLayout);
        newStudentPanelLayout.setHorizontalGroup(
            newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(studentIDLabel)
                    .addComponent(yearLabel)
                    .addComponent(phoneNumberLabel)
                    .addComponent(emailLabel)
                    .addComponent(addressLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(phoneNumberField)
                    .addComponent(studentIDField)
                    .addComponent(nameField)
                    .addComponent(yearComboBox, 0, 197, Short.MAX_VALUE)
                    .addComponent(emailField)
                    .addComponent(addressField))
                .addGap(30, 30, 30))
            .addGroup(newStudentPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(addStudentButton)
                .addGap(52, 52, 52)
                .addComponent(backButton)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        newStudentPanelLayout.setVerticalGroup(
            newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newStudentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIDLabel)
                    .addComponent(studentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearLabel)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberLabel)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newStudentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStudentButton)
                    .addComponent(backButton))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true)));

        studentTable.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(studentTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(newStudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newStudentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displaytable(){
        
        try{
            PreparedStatement ps = c.prepareStatement("select * from students;");
            ResultSet set = ps.executeQuery();
            
            studentTable.setModel(DbUtils.resultSetToTableModel(set));
        }
        catch(Exception e){e.printStackTrace();}
        
    }
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        
        if ( studentIDField.getText().isEmpty() || nameField.getText().isEmpty() || addressField.getText().isEmpty() || phoneNumberField.getText().isEmpty() || emailField.getText().isEmpty() ){
            JOptionPane.showMessageDialog(new JFrame(), "The fields cannot be left blank.", "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            try{
                int SID = Integer.parseInt( studentIDField.getText() );
                String Name = nameField.getText();
                String Address = addressField.getText();
                String Year = yearComboBox.getSelectedItem().toString();
                String PhoneNumber = phoneNumberField.getText();
                String Email = emailField.getText();
                              
                PreparedStatement stmt = c.prepareStatement("insert into students values('"+SID+"','"+Name+"','"+Address+"','"+Year+"','"+PhoneNumber+"','"+Email+"') ");
                stmt.execute();
                displaytable();
                JOptionPane.showMessageDialog(new JFrame(), "Student Added Successfully !", "Message" , JOptionPane.INFORMATION_MESSAGE);
                
                studentIDField.setText("");
                nameField.setText("");
                addressField.setText("");
                yearComboBox.setSelectedIndex(0);
                phoneNumberField.setText("");
                emailField.setText("");
            }
            catch(Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Message" , JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void yearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel newStudentPanel;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField studentIDField;
    private javax.swing.JLabel studentIDLabel;
    private javax.swing.JTable studentTable;
    private javax.swing.JComboBox<String> yearComboBox;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
