package me.chemorris.schoolsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;  
import java.util.Date;

public class IssueMeal extends javax.swing.JFrame {

    static Connection c;
    static String MID, SID;
    
    // Menu stuff and SQL connection
    public IssueMeal() {
        initComponents();
        setTitle("Georgetown Primary School | Issue Meal");
        setResizable(false);
        setLocationRelativeTo(null);
        
        MID = "";
        SID = "";
         
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");	   
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolsystem", "root", "root");
        }
        catch(Exception e){e.printStackTrace();}
    }

    // GUI code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        issueMealPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        issueMealButton = new javax.swing.JButton();
        mealDetailsPanel = new javax.swing.JPanel();
        mealPriceLabel = new javax.swing.JLabel();
        mealIDPanel = new javax.swing.JLabel();
        mealPriceSearchLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        mealNameSearchField = new javax.swing.JLabel();
        mealNameField = new javax.swing.JLabel();
        mealFieldPanel = new javax.swing.JTextField();
        studentDetailsPanel = new javax.swing.JPanel();
        studentIDField = new javax.swing.JTextField();
        nameField = new javax.swing.JLabel();
        phoneNumberSearchLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailSearchLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        yearSearchLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        studentIDLabel = new javax.swing.JLabel();
        searchButton2 = new javax.swing.JButton();
        nameSearchField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        issueMealPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Issue Meal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        issueMealButton.setText("ISSUE MEAL");
        issueMealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueMealButtonActionPerformed(evt);
            }
        });

        mealDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Meal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        mealPriceLabel.setText("Meal Price");

        mealIDPanel.setText("Meal ID");

        mealPriceSearchLabel.setText("---");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        mealNameSearchField.setText("---");

        mealNameField.setText("Meal Name");

        javax.swing.GroupLayout mealDetailsPanelLayout = new javax.swing.GroupLayout(mealDetailsPanel);
        mealDetailsPanel.setLayout(mealDetailsPanelLayout);
        mealDetailsPanelLayout.setHorizontalGroup(
            mealDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mealDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mealDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mealDetailsPanelLayout.createSequentialGroup()
                        .addComponent(mealIDPanel)
                        .addGap(18, 18, 18)
                        .addComponent(mealFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton))
                    .addGroup(mealDetailsPanelLayout.createSequentialGroup()
                        .addGroup(mealDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mealNameField)
                            .addComponent(mealPriceLabel))
                        .addGap(32, 32, 32)
                        .addGroup(mealDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mealPriceSearchLabel)
                            .addComponent(mealNameSearchField))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        mealDetailsPanelLayout.setVerticalGroup(
            mealDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mealDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mealDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mealIDPanel)
                    .addComponent(mealFieldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(18, 18, 18)
                .addGroup(mealDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mealNameField)
                    .addComponent(mealNameSearchField))
                .addGap(18, 18, 18)
                .addGroup(mealDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mealPriceLabel)
                    .addComponent(mealPriceSearchLabel))
                .addGap(74, 74, 74))
        );

        studentDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        nameField.setText("Name");

        phoneNumberSearchLabel.setText("---");

        emailLabel.setText("Email");

        emailSearchLabel.setText("---");

        phoneNumberLabel.setText("PhoneNumber");

        yearSearchLabel.setText("---");

        yearLabel.setText("Year");

        studentIDLabel.setText("Student ID");

        searchButton2.setText("Search");
        searchButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton2ActionPerformed(evt);
            }
        });

        nameSearchField.setText("---");

        javax.swing.GroupLayout studentDetailsPanelLayout = new javax.swing.GroupLayout(studentDetailsPanel);
        studentDetailsPanel.setLayout(studentDetailsPanelLayout);
        studentDetailsPanelLayout.setHorizontalGroup(
            studentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentIDLabel)
                    .addComponent(nameField)
                    .addComponent(yearLabel)
                    .addComponent(phoneNumberLabel)
                    .addComponent(emailLabel))
                .addGap(18, 18, 18)
                .addGroup(studentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentDetailsPanelLayout.createSequentialGroup()
                        .addComponent(studentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton2))
                    .addComponent(emailSearchLabel)
                    .addComponent(phoneNumberSearchLabel)
                    .addComponent(yearSearchLabel)
                    .addComponent(nameSearchField))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        studentDetailsPanelLayout.setVerticalGroup(
            studentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIDLabel)
                    .addComponent(studentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton2))
                .addGap(18, 18, 18)
                .addGroup(studentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentDetailsPanelLayout.createSequentialGroup()
                        .addComponent(nameField)
                        .addGap(18, 18, 18)
                        .addComponent(yearLabel)
                        .addGap(18, 18, 18)
                        .addComponent(phoneNumberLabel)
                        .addGap(18, 18, 18)
                        .addComponent(emailLabel))
                    .addGroup(studentDetailsPanelLayout.createSequentialGroup()
                        .addComponent(nameSearchField)
                        .addGap(18, 18, 18)
                        .addComponent(yearSearchLabel)
                        .addGap(18, 18, 18)
                        .addComponent(phoneNumberSearchLabel)
                        .addGap(18, 18, 18)
                        .addComponent(emailSearchLabel)))
                .addContainerGap())
        );

        javax.swing.GroupLayout issueMealPanelLayout = new javax.swing.GroupLayout(issueMealPanel);
        issueMealPanel.setLayout(issueMealPanelLayout);
        issueMealPanelLayout.setHorizontalGroup(
            issueMealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(issueMealPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(mealDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(issueMealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(issueMealPanelLayout.createSequentialGroup()
                        .addComponent(studentDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, issueMealPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(issueMealButton)
                        .addGap(35, 35, 35)
                        .addComponent(backButton)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        issueMealPanelLayout.setVerticalGroup(
            issueMealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(issueMealPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(issueMealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mealDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(issueMealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(issueMealButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(issueMealPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(issueMealPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Searches the 'students' table for the student information
    private void searchButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton2ActionPerformed
        
        if ( studentIDField.getText().isEmpty() ){
            nameSearchField.setText( "---" );
            yearSearchLabel.setText( "---" );
            phoneNumberSearchLabel.setText( "---" );
            emailSearchLabel.setText( "---" );
            JOptionPane.showMessageDialog(new JFrame(), "The fields cannot be left blank.", "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            
            try{
                ResultSet rs;
                PreparedStatement ps = c.prepareStatement("select * from students where SID = ?; ");
                ps.setString(1,studentIDField.getText());
                rs = ps.executeQuery();
                
                while(true){
                    if (rs.next()){
                        SID = rs.getString("SID");
                        nameSearchField.setText( rs.getString("Name") );
                        yearSearchLabel.setText( rs.getString("Year") );
                        phoneNumberSearchLabel.setText( rs.getString("PhoneNumber") );
                        emailSearchLabel.setText( rs.getString("EmailAddress") );
                        break;    
                    }
                    else{
                        nameSearchField.setText( "---" );
                        yearSearchLabel.setText( "---" );
                        phoneNumberSearchLabel.setText( "---" );
                        emailSearchLabel.setText( "---" );
                        JOptionPane.showMessageDialog(new JFrame(), "Student was not found in database!", "Message" , JOptionPane.INFORMATION_MESSAGE);
                        studentIDField.setText("");
                        break;
                    }
                }
           
            } catch(Exception e) {e.printStackTrace();}
            
        }
    }//GEN-LAST:event_searchButton2ActionPerformed

    // Writes the new issued meal information to the 'issuemeals' table.
    private void issueMealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueMealButtonActionPerformed
        
        if ( mealFieldPanel.getText().isEmpty() || studentIDField.getText().isEmpty() ){
            JOptionPane.showMessageDialog(new JFrame(), "The fields cannot be left blank.", "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            
            try{
            
                String date = new SimpleDateFormat("yyMMdd").format(new Date());
                
                PreparedStatement ps = c.prepareStatement("insert into issuemeal values(?,?,?); ");
                ps.setString(1, SID);
                ps.setString(2, MID);
                ps.setString(3, date);
                ps.execute();
                                
                JOptionPane.showMessageDialog(new JFrame(), "Meal has been issued!", "Message" , JOptionPane.INFORMATION_MESSAGE);
                
            }
            catch(Exception e) { 
                e.printStackTrace(); 
                JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Message" , JOptionPane.INFORMATION_MESSAGE);
            }
            
            
            
        }
        
    }//GEN-LAST:event_issueMealButtonActionPerformed

    // Returns to home
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    // Searches the 'meals' table for the meal information.
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        if ( mealFieldPanel.getText().isEmpty() ){
            mealNameSearchField.setText( "---" );
            mealPriceSearchLabel.setText( "---" );
            JOptionPane.showMessageDialog(new JFrame(), "The fields cannot be left blank.", "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            
            try{
                ResultSet rs;
                PreparedStatement ps = c.prepareStatement("select * from meals where MID = ?; ");
                ps.setString(1,mealFieldPanel.getText());
                rs = ps.executeQuery();

                while(true){
                    if (rs.next()){
                        MID = rs.getString("MID");
                        mealNameSearchField.setText( rs.getString("Name") );
                        mealPriceSearchLabel.setText( rs.getString("MPrice") );
                        break;    
                    }
                    else{
                        mealNameSearchField.setText( "---" );
                        mealPriceSearchLabel.setText( "---" );
                        JOptionPane.showMessageDialog(new JFrame(), "Meal not found in database!", "Message" , JOptionPane.INFORMATION_MESSAGE);
                        mealFieldPanel.setText("");
                        break;
                    }
                }
           
            } catch(Exception e) {e.printStackTrace();}
           
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailSearchLabel;
    private javax.swing.JButton issueMealButton;
    private javax.swing.JPanel issueMealPanel;
    private javax.swing.JPanel mealDetailsPanel;
    private javax.swing.JTextField mealFieldPanel;
    private javax.swing.JLabel mealIDPanel;
    private javax.swing.JLabel mealNameField;
    private javax.swing.JLabel mealNameSearchField;
    private javax.swing.JLabel mealPriceLabel;
    private javax.swing.JLabel mealPriceSearchLabel;
    private javax.swing.JLabel nameField;
    private javax.swing.JLabel nameSearchField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JLabel phoneNumberSearchLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchButton2;
    private javax.swing.JPanel studentDetailsPanel;
    private javax.swing.JTextField studentIDField;
    private javax.swing.JLabel studentIDLabel;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JLabel yearSearchLabel;
    // End of variables declaration//GEN-END:variables
}
