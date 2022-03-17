package me.chemorris.schoolsystem;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        setTitle("Georgetown Primary School | Home");
        setResizable(false);
        setLocationRelativeTo(null);
    }

    // Components for GUI
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headingLabel = new javax.swing.JLabel();
        newBookButton = new javax.swing.JButton();
        newStudentButton = new javax.swing.JButton();
        tablesButton = new javax.swing.JButton();
        issueBookButton = new javax.swing.JButton();
        returnBookButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        newMealButton = new javax.swing.JButton();
        newTeacherButton = new javax.swing.JButton();
        issueMealButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headingLabel.setFont(new java.awt.Font("Myanmar Text", 1, 30)); // NOI18N
        headingLabel.setText("Georgetown Primary School - DBMS");

        newBookButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        newBookButton.setText("New Book");
        newBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBookButtonActionPerformed(evt);
            }
        });

        newStudentButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        newStudentButton.setText("New Student");
        newStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentButtonActionPerformed(evt);
            }
        });

        tablesButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tablesButton.setText("Tables");
        tablesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablesButtonActionPerformed(evt);
            }
        });

        issueBookButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        issueBookButton.setText("Issue Book");
        issueBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBookButtonActionPerformed(evt);
            }
        });

        returnBookButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        returnBookButton.setText("Return Book");
        returnBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBookButtonActionPerformed(evt);
            }
        });

        logoutButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        newMealButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        newMealButton.setText("New Meal");
        newMealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMealButtonActionPerformed(evt);
            }
        });

        newTeacherButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        newTeacherButton.setText("New Teacher");
        newTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTeacherButtonActionPerformed(evt);
            }
        });

        issueMealButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        issueMealButton.setText("Issue Meal");
        issueMealButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueMealButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(issueBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(returnBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(newStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tablesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(newTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newMealButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(headingLabel)
                    .addComponent(issueMealButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(headingLabel)
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newTeacherButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newMealButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issueBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issueMealButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tablesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Opens new book menu
    private void newBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBookButtonActionPerformed
        
        NewBook newBook = new NewBook();
        newBook.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newBookButtonActionPerformed

    // Opens tables menu
    private void tablesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablesButtonActionPerformed

        Tables record = new Tables();
        record.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tablesButtonActionPerformed

    // Opens issue book menu
    private void issueBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBookButtonActionPerformed
        
        IssueBook issueBook = new IssueBook();
        issueBook.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_issueBookButtonActionPerformed

    // Opens return book menu
    private void returnBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBookButtonActionPerformed
        
        ReturnBook returnBook = new ReturnBook();
        returnBook.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnBookButtonActionPerformed

    // Logout button
    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed

        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    // Opens new student menu
    private void newStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentButtonActionPerformed
        
        NewStudent newStudent = new NewStudent();
        newStudent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newStudentButtonActionPerformed

    // Opens new meal menu
    private void newMealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMealButtonActionPerformed
        NewMeal newMeal = new NewMeal();
        newMeal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newMealButtonActionPerformed

    // Opens new teacher menu
    private void newTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTeacherButtonActionPerformed
        NewTeacher newTeacher = new NewTeacher();
        newTeacher.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newTeacherButtonActionPerformed

    // Opens issue meal menu
    private void issueMealButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueMealButtonActionPerformed
        IssueMeal issueMeal = new IssueMeal();
        issueMeal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_issueMealButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headingLabel;
    private javax.swing.JButton issueBookButton;
    private javax.swing.JButton issueMealButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton newBookButton;
    private javax.swing.JButton newMealButton;
    private javax.swing.JButton newStudentButton;
    private javax.swing.JButton newTeacherButton;
    private javax.swing.JButton returnBookButton;
    private javax.swing.JButton tablesButton;
    // End of variables declaration//GEN-END:variables
}
