package me.chemorris.schoolsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;  
import java.util.Date; 

public class ReturnBook extends javax.swing.JFrame {

    static Connection c;
    static String ISBN, SID;
    
    // Menu code and SQL connection
    public ReturnBook() {
        initComponents();
        setTitle("Georgetown Primary School | Return Book");
        setResizable(false);
        setLocationRelativeTo(null);
        
        currentDateLabel.setText( new SimpleDateFormat("dd / MM / yyyy").format(new Date()) );
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");	   
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolsystem", "root", "root");   
        }
        catch(Exception e){e.printStackTrace();}
    }

    // GUI Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnBookPanel = new javax.swing.JPanel();
        studentDetailsPanel = new javax.swing.JPanel();
        studentIDField = new javax.swing.JTextField();
        yearLabel = new javax.swing.JLabel();
        nameSearchField = new javax.swing.JLabel();
        yearSearchLabel = new javax.swing.JLabel();
        phoneNumberSearchLabel = new javax.swing.JLabel();
        emailSearchLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JLabel();
        studentIDLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        bookDetailsPanel = new javax.swing.JPanel();
        authorNameField = new javax.swing.JLabel();
        quantityField = new javax.swing.JLabel();
        searchButton2 = new javax.swing.JButton();
        priceSearchField = new javax.swing.JLabel();
        authorField = new javax.swing.JLabel();
        quantitySearchField = new javax.swing.JLabel();
        bookNameSearchField = new javax.swing.JLabel();
        isbnLabel = new javax.swing.JLabel();
        isbnField = new javax.swing.JTextField();
        bookNameField = new javax.swing.JLabel();
        priceField = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        returnBookButton = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        currentDateLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        returnBookPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Return Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        studentDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        yearLabel.setText("Year");

        nameSearchField.setText("---");

        yearSearchLabel.setText("---");

        phoneNumberSearchLabel.setText("---");

        emailSearchLabel.setText("---");

        phoneNumberLabel.setText("Phone Number");

        nameField.setText("Name");

        studentIDLabel.setText("Student ID");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        emailLabel.setText("Email");

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
                        .addComponent(searchButton))
                    .addComponent(emailSearchLabel)
                    .addComponent(phoneNumberSearchLabel)
                    .addComponent(yearSearchLabel)
                    .addComponent(nameSearchField))
                .addGap(34, 34, 34))
        );
        studentDetailsPanelLayout.setVerticalGroup(
            studentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIDLabel)
                    .addComponent(studentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
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

        bookDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        authorNameField.setText("---");

        quantityField.setText("Quantity");

        searchButton2.setText("Search");
        searchButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton2ActionPerformed(evt);
            }
        });

        priceSearchField.setText("---");

        authorField.setText("Author");

        quantitySearchField.setText("---");

        bookNameSearchField.setText("---");

        isbnLabel.setText("ISBN ");

        bookNameField.setText("Name");

        priceField.setText("Price");

        javax.swing.GroupLayout bookDetailsPanelLayout = new javax.swing.GroupLayout(bookDetailsPanel);
        bookDetailsPanel.setLayout(bookDetailsPanelLayout);
        bookDetailsPanelLayout.setHorizontalGroup(
            bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                        .addComponent(isbnLabel)
                        .addGap(18, 18, 18)
                        .addComponent(isbnField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton2))
                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                        .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookNameField)
                            .addComponent(authorField)
                            .addComponent(priceField)
                            .addComponent(quantityField))
                        .addGap(32, 32, 32)
                        .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantitySearchField)
                            .addComponent(priceSearchField)
                            .addComponent(authorNameField)
                            .addComponent(bookNameSearchField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bookDetailsPanelLayout.setVerticalGroup(
            bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnLabel)
                    .addComponent(isbnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton2))
                .addGap(18, 18, 18)
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookNameField)
                    .addComponent(bookNameSearchField))
                .addGap(18, 18, 18)
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorField)
                    .addComponent(authorNameField))
                .addGap(18, 18, 18)
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceField)
                    .addComponent(priceSearchField))
                .addGap(18, 18, 18)
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityField)
                    .addComponent(quantitySearchField))
                .addContainerGap())
        );

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        returnBookButton.setText("RETURN BOOK");
        returnBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookButtonActionPerformed(evt);
            }
        });

        dateLabel.setText("Date");

        currentDateLabel.setText("current_date_here");

        javax.swing.GroupLayout returnBookPanelLayout = new javax.swing.GroupLayout(returnBookPanel);
        returnBookPanel.setLayout(returnBookPanelLayout);
        returnBookPanelLayout.setHorizontalGroup(
            returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnBookPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnBookPanelLayout.createSequentialGroup()
                        .addComponent(dateLabel)
                        .addGap(41, 41, 41)
                        .addComponent(currentDateLabel)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, returnBookPanelLayout.createSequentialGroup()
                        .addComponent(studentDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(returnBookPanelLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(returnBookButton)
                                .addGap(23, 23, 23)
                                .addComponent(backButton))
                            .addComponent(bookDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))))
        );
        returnBookPanelLayout.setVerticalGroup(
            returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(returnBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(currentDateLabel))
                .addGap(28, 28, 28)
                .addGroup(returnBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(returnBookButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(returnBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(returnBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Writes the return book information to the database
    private void returnBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookButtonActionPerformed
        
        if ( isbnField.getText().isEmpty() || studentIDField.getText().isEmpty() ){
            JOptionPane.showMessageDialog(new JFrame(), "The fields cannot be left blank.", "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            
            try{
            
                String date = new SimpleDateFormat("yyMMdd").format(new Date());
                
                PreparedStatement ps = c.prepareStatement("update issuebook set ReturnDate=? where SID=? and ISBN=?; ");
                ps.setString(1, date);
                ps.setString(2, SID);
                ps.setString(3, ISBN);
                ps.execute();
                
                ps = c.prepareStatement("update books set Quantity = Quantity+1 where ISBN = ?; ");
                ps.setString(1, ISBN);
                ps.execute();
                
                JOptionPane.showMessageDialog(new JFrame(), "Book has been returned successfully!", "Message" , JOptionPane.INFORMATION_MESSAGE); 
            }
            catch(Exception e) { 
                e.printStackTrace();
                JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Message" , JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_returnBookButtonActionPerformed

    // Returns to home
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    // Searches the 'books' table for the book
    private void searchButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton2ActionPerformed
        
        if ( isbnField.getText().isEmpty() ){
            bookNameSearchField.setText( "---" );
            authorNameField.setText( "---" );
            priceSearchField.setText( "---" );
            quantitySearchField.setText( "---" );
            JOptionPane.showMessageDialog(new JFrame(), "The fields cannot be left blank.", "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            
            try{
                ResultSet rs;
                PreparedStatement ps = c.prepareStatement("select * from books where ISBN = ?; ");
                ps.setString(1,isbnField.getText());
                rs = ps.executeQuery();

                while(true){
                    if (rs.next()){
                        ISBN = rs.getString("ISBN");
                        bookNameSearchField.setText( rs.getString("Title") );
                        authorNameField.setText( rs.getString("Author") );
                        priceSearchField.setText( rs.getString("Price") );
                        quantitySearchField.setText( rs.getString("Quantity") );
                        break;    
                    }
                    else{
                        bookNameSearchField.setText( "---" );
                        authorNameField.setText( "---" );
                        priceSearchField.setText( "---" );
                        quantitySearchField.setText( "---" );
                        JOptionPane.showMessageDialog(new JFrame(), "Book was not found in the database.", "Message" , JOptionPane.INFORMATION_MESSAGE);
                        isbnField.setText("");
                        break;
                    }
                }
           
            } catch(Exception e) {e.printStackTrace();}
           
        }
        
    }//GEN-LAST:event_searchButton2ActionPerformed

    // Searches the 'students' table for the student.
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
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
    }//GEN-LAST:event_searchButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorField;
    private javax.swing.JLabel authorNameField;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bookDetailsPanel;
    private javax.swing.JLabel bookNameField;
    private javax.swing.JLabel bookNameSearchField;
    private javax.swing.JLabel currentDateLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailSearchLabel;
    private javax.swing.JTextField isbnField;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JLabel nameField;
    private javax.swing.JLabel nameSearchField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JLabel phoneNumberSearchLabel;
    private javax.swing.JLabel priceField;
    private javax.swing.JLabel priceSearchField;
    private javax.swing.JLabel quantityField;
    private javax.swing.JLabel quantitySearchField;
    private javax.swing.JButton returnBookButton;
    private javax.swing.JPanel returnBookPanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchButton2;
    private javax.swing.JPanel studentDetailsPanel;
    private javax.swing.JTextField studentIDField;
    private javax.swing.JLabel studentIDLabel;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JLabel yearSearchLabel;
    // End of variables declaration//GEN-END:variables
}
