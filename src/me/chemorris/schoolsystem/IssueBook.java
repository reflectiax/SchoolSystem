package me.chemorris.schoolsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;  
import java.util.Date;

public class IssueBook extends javax.swing.JFrame {

    static Connection c;
    static String ISBN, SID;
    
    // Setting up menu and sql connection
    public IssueBook() {
        initComponents();
        setTitle("Georgetown Primary School | Issue Book");
        setResizable(false);
        setLocationRelativeTo(null);
        
        ISBN = "";
        SID = "";
        
        currentDate.setText( new SimpleDateFormat("dd / MM / yyyy").format(new Date()) );
        
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

        issueBookPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        issueBookButton = new javax.swing.JButton();
        bookDetailsPanel = new javax.swing.JPanel();
        priceSearchLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        isbnLabel = new javax.swing.JLabel();
        authorSearchLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        titleSearchLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        isbnField = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        quantitySearchLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        studentDetailsPanel = new javax.swing.JPanel();
        studentIDField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        phoneNumberSearchLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailSearchLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        yearSearchLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        studentIDLabel = new javax.swing.JLabel();
        searchButton2 = new javax.swing.JButton();
        nameSearchLabel = new javax.swing.JLabel();
        currentDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        issueBookPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Issue Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        issueBookButton.setText("ISSUE BOOK");
        issueBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBookButtonActionPerformed(evt);
            }
        });

        bookDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        priceSearchLabel.setText("---");

        authorLabel.setText("Author");

        isbnLabel.setText("ISBN ");

        authorSearchLabel.setText("---");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        titleSearchLabel.setText("---");

        titleLabel.setText("Title");

        quantityLabel.setText("Quantity");

        priceLabel.setText("Price");

        quantitySearchLabel.setText("---");

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
                        .addComponent(searchButton))
                    .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                        .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel)
                            .addComponent(authorLabel)
                            .addComponent(priceLabel)
                            .addComponent(quantityLabel))
                        .addGap(32, 32, 32)
                        .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantitySearchLabel)
                            .addComponent(priceSearchLabel)
                            .addComponent(authorSearchLabel)
                            .addComponent(titleSearchLabel))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        bookDetailsPanelLayout.setVerticalGroup(
            bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnLabel)
                    .addComponent(isbnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(18, 18, 18)
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(titleSearchLabel))
                .addGap(18, 18, 18)
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorLabel)
                    .addComponent(authorSearchLabel))
                .addGap(18, 18, 18)
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceSearchLabel))
                .addGap(18, 18, 18)
                .addGroup(bookDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLabel)
                    .addComponent(quantitySearchLabel))
                .addContainerGap())
        );

        dateLabel.setText("Date");

        studentDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        nameLabel.setText("Name");

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

        nameSearchLabel.setText("---");

        javax.swing.GroupLayout studentDetailsPanelLayout = new javax.swing.GroupLayout(studentDetailsPanel);
        studentDetailsPanel.setLayout(studentDetailsPanelLayout);
        studentDetailsPanelLayout.setHorizontalGroup(
            studentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentIDLabel)
                    .addComponent(nameLabel)
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
                    .addComponent(nameSearchLabel))
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
                        .addComponent(nameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(yearLabel)
                        .addGap(18, 18, 18)
                        .addComponent(phoneNumberLabel)
                        .addGap(18, 18, 18)
                        .addComponent(emailLabel))
                    .addGroup(studentDetailsPanelLayout.createSequentialGroup()
                        .addComponent(nameSearchLabel)
                        .addGap(18, 18, 18)
                        .addComponent(yearSearchLabel)
                        .addGap(18, 18, 18)
                        .addComponent(phoneNumberSearchLabel)
                        .addGap(18, 18, 18)
                        .addComponent(emailSearchLabel)))
                .addContainerGap())
        );

        currentDate.setText("current_date_here");

        javax.swing.GroupLayout issueBookPanelLayout = new javax.swing.GroupLayout(issueBookPanel);
        issueBookPanel.setLayout(issueBookPanelLayout);
        issueBookPanelLayout.setHorizontalGroup(
            issueBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(issueBookPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(bookDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(issueBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(issueBookPanelLayout.createSequentialGroup()
                        .addComponent(studentDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, issueBookPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(issueBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, issueBookPanelLayout.createSequentialGroup()
                                .addComponent(dateLabel)
                                .addGap(56, 56, 56)
                                .addComponent(currentDate)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, issueBookPanelLayout.createSequentialGroup()
                                .addComponent(issueBookButton)
                                .addGap(35, 35, 35)
                                .addComponent(backButton)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        issueBookPanelLayout.setVerticalGroup(
            issueBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(issueBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(issueBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(issueBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(currentDate))
                .addGap(32, 32, 32)
                .addGroup(issueBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(issueBookButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(issueBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(issueBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Pulling results from the students table
    private void searchButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton2ActionPerformed
        
        if ( studentIDField.getText().isEmpty() ){
            nameSearchLabel.setText( "---" );
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
                        nameSearchLabel.setText( rs.getString("Name") );
                        yearSearchLabel.setText( rs.getString("Year") );
                        phoneNumberSearchLabel.setText( rs.getString("PhoneNumber") );
                        emailSearchLabel.setText( rs.getString("EmailAddress") );
                        break;    
                    }
                    else{
                        nameSearchLabel.setText( "---" );
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

    // Writes information about issued book to database
    private void issueBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBookButtonActionPerformed
        
        if ( isbnField.getText().isEmpty() || studentIDField.getText().isEmpty() ){
            JOptionPane.showMessageDialog(new JFrame(), "The fields cannot be left blank.", "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            
            try{
            
                String date = new SimpleDateFormat("yyMMdd").format(new Date());
                
                PreparedStatement ps = c.prepareStatement("insert into issuebook values(?,?,?,null); ");
                ps.setString(1, SID);
                ps.setString(2, ISBN);
                ps.setString(3, date);
                ps.execute();
                
                ps = c.prepareStatement("update books set Quantity = Quantity-1 where ISBN = ?; ");
                ps.setString(1, ISBN);
                ps.execute();
                
                JOptionPane.showMessageDialog(new JFrame(), "Book has been issued successfully!", "Message" , JOptionPane.INFORMATION_MESSAGE);
                
            }
            catch(Exception e) { 
                e.printStackTrace(); 
                JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Message" , JOptionPane.INFORMATION_MESSAGE);
            }
            
            
            
        }
        
    }//GEN-LAST:event_issueBookButtonActionPerformed

    // Returns to home
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    // Pulling results from book table
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        if ( isbnField.getText().isEmpty() ){
            titleSearchLabel.setText( "---" );
            authorSearchLabel.setText( "---" );
            priceSearchLabel.setText( "---" );
            quantitySearchLabel.setText( "---" );
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
                        titleSearchLabel.setText( rs.getString("Title") );
                        authorSearchLabel.setText( rs.getString("Author") );
                        priceSearchLabel.setText( rs.getString("Price") );
                        quantitySearchLabel.setText( rs.getString("Quantity") );
                        break;    
                    }
                    else{
                        titleSearchLabel.setText( "---" );
                        authorSearchLabel.setText( "---" );
                        priceSearchLabel.setText( "---" );
                        quantitySearchLabel.setText( "---" );
                        JOptionPane.showMessageDialog(new JFrame(), "Book was not found in database!", "Message" , JOptionPane.INFORMATION_MESSAGE);
                        isbnField.setText("");
                        break;
                    }
                }
           
            } catch(Exception e) {e.printStackTrace();}
           
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLabel;
    private javax.swing.JLabel authorSearchLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel bookDetailsPanel;
    private javax.swing.JLabel currentDate;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailSearchLabel;
    private javax.swing.JTextField isbnField;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JButton issueBookButton;
    private javax.swing.JPanel issueBookPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameSearchLabel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JLabel phoneNumberSearchLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel priceSearchLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JLabel quantitySearchLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchButton2;
    private javax.swing.JPanel studentDetailsPanel;
    private javax.swing.JTextField studentIDField;
    private javax.swing.JLabel studentIDLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleSearchLabel;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JLabel yearSearchLabel;
    // End of variables declaration//GEN-END:variables
}
