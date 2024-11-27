
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class main extends javax.swing.JFrame {

    private List<Contact> contactsList;  // Store contacts
    private final DefaultTableModel tableModel; // Table model to manage JTable data

    public main() {
        initComponents();
                contactsList = new ArrayList<>();
        tableModel = (DefaultTableModel) contactsTBL.getModel();

        // Add a listener to detect when a row is selected in the JTable
        contactsTBL.getSelectionModel().addListSelectionListener(e -> {
            int selectedRow = contactsTBL.getSelectedRow();
            if (selectedRow != -1) {
                // Get the selected contact from the contactsList
                Contact selectedContact = contactsList.get(selectedRow);

                // Pre-load the fields with the selected contact's details
                nameFIELD.setText(selectedContact.name);
                emailFIELD.setText(selectedContact.email);
                phoneFIELD.setText(selectedContact.phone);
            } else {
                // If no row is selected, clear the input fields for adding a new contact
                nameFIELD.setText("");
                emailFIELD.setText("");
                phoneFIELD.setText("");
            }
        });
    }

    // Contact class to store name, email, phone
    public class Contact {

        String name;
        String email;
        String phone;
        LocalDateTime timestamp;

        public Contact(String name, String email, String phone) {
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.timestamp = LocalDateTime.now();
        }

        public LocalDateTime getTimestamp() {
            return timestamp;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameFIELD = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        emailFIELD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        phoneFIELD = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        editBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contactsTBL = new javax.swing.JTable();
        searchBTN = new javax.swing.JButton();
        sortCBOX = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Name:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, -1));

        nameFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFIELDActionPerformed(evt);
            }
        });
        jPanel2.add(nameFIELD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 350, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Email:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, -1));

        emailFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFIELDActionPerformed(evt);
            }
        });
        jPanel2.add(emailFIELD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 350, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Phone:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        phoneFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFIELDActionPerformed(evt);
            }
        });
        jPanel2.add(phoneFIELD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 350, 30));

        addbtn.setBackground(new java.awt.Color(0, 51, 102));
        addbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel2.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 100, -1));

        editBTN.setBackground(new java.awt.Color(0, 51, 102));
        editBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editBTN.setForeground(new java.awt.Color(255, 255, 255));
        editBTN.setText("EDIT");
        editBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBTNActionPerformed(evt);
            }
        });
        jPanel2.add(editBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 90, -1));

        deleteBTN.setBackground(new java.awt.Color(0, 51, 102));
        deleteBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteBTN.setForeground(new java.awt.Color(255, 0, 0));
        deleteBTN.setText("DELETE");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });
        jPanel2.add(deleteBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 90, -1));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contactsTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Email", "Phone"
            }
        ));
        jScrollPane1.setViewportView(contactsTBL);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, 140));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 420, 160));

        searchBTN.setBackground(new java.awt.Color(0, 51, 102));
        searchBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/magnifying-glass.png"))); // NOI18N
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });
        jPanel2.add(searchBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 50, 40));

        sortCBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALPHABETICAL", "NEWEST", "OLDEST" }));
        sortCBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortCBOXActionPerformed(evt);
            }
        });
        jPanel2.add(sortCBOX, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 190, 130, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 440, 440));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CMS COMPANY");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 200, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/contact-information.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 290));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFIELDActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
       try {
            String name = nameFIELD.getText();
            String email = emailFIELD.getText();
            String phone = phoneFIELD.getText();

            if (name.isEmpty() || email.isEmpty() || phone.isEmpty()) {
                throw new Exception("All fields must be filled.");
            }

            if (!phone.matches("^[0-9+\\-\\(\\)\\s]*$")) {
                throw new Exception("Phone number can only contain numbers, spaces, and characters +, -, (, ).");
            }

            if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                throw new Exception("Invalid email address.");
            }

            // Add new contact to the list
            Contact newContact = new Contact(name, email, phone);
            contactsList.add(newContact);

            // Add the contact to the table
            tableModel.insertRow(0, new Object[]{name, email, phone});

            // Clear the input fields for adding a new contact
            nameFIELD.setText("");
            emailFIELD.setText("");
            phoneFIELD.setText("");

            // Show success message
            JOptionPane.showMessageDialog(this, "Contact added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        try {
            String searchTerm = nameFIELD.getText();
            if (searchTerm.isEmpty()) {
                throw new Exception("Please enter a name to search.");
            }

            // Clear the table before searching
            tableModel.setRowCount(0);

            // Search for contacts that match the search term
            boolean found = false;
            for (Contact contact : contactsList) {
                if (contact.name.toLowerCase().contains(searchTerm.toLowerCase())) {
                    tableModel.addRow(new Object[]{contact.name, contact.email, contact.phone});
                    found = true;
                }
            }

            // If no contacts are found, show an error message
            if (!found) {
                throw new Exception("No contacts found.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Search Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_searchBTNActionPerformed

    private void phoneFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFIELDActionPerformed

    private void emailFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFIELDActionPerformed

    private void editBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTNActionPerformed
try {
            int selectedRow = contactsTBL.getSelectedRow();
            if (selectedRow == -1) {
                throw new Exception("Please select a contact to edit.");
            }

            // Get the updated data from the input fields
            String name = nameFIELD.getText();
            String email = emailFIELD.getText();
            String phone = phoneFIELD.getText();

            // Validate fields
            if (name.isEmpty() || email.isEmpty() || phone.isEmpty()) {
                throw new Exception("All fields must be filled.");
            }

            if (!phone.matches("^[0-9+\\-\\(\\)\\s]*$")) {
                throw new Exception("Phone number can only contain numbers, spaces, and characters +, -, (, ).");
            }

            if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                throw new Exception("Invalid email address.");
            }

            // Update the contact in the contacts list
            Contact contact = contactsList.get(selectedRow);
            contact.name = name;
            contact.email = email;
            contact.phone = phone;

            // Update the table with the new data
            tableModel.setValueAt(name, selectedRow, 0);
            tableModel.setValueAt(email, selectedRow, 1);
            tableModel.setValueAt(phone, selectedRow, 2);

            // Show success message
            JOptionPane.showMessageDialog(this, "Contact updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Optionally, clear the fields after update (if needed)
            nameFIELD.setText("");
            emailFIELD.setText("");
            phoneFIELD.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
               try {
            // Get the selected row in the table
            int selectedRow = contactsTBL.getSelectedRow();
            if (selectedRow == -1) {
                throw new Exception("Please select a contact to delete.");
            }

            // Remove the contact from the contacts list
            contactsList.remove(selectedRow);

            // Remove the selected row from the table
            tableModel.removeRow(selectedRow);

            // Clear the pre-filled fields since the contact is deleted
            nameFIELD.setText("");
            emailFIELD.setText("");
            phoneFIELD.setText("");

            // Show success message
            JOptionPane.showMessageDialog(this, "Contact deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void sortCBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortCBOXActionPerformed
        // Call the sortContacts method to sort based on selected option
        sortContacts();
    }//GEN-LAST:event_sortCBOXActionPerformed

    private void sortContacts() {
        String selectedOption = (String) sortCBOX.getSelectedItem(); // Get selected sorting option

        switch (selectedOption) {
            case "Alphabetical":
                sortContactsByName();
                break;
            case "Newest":
                sortContactsByNewest();
                break;
            case "Oldest":
                sortContactsByOldest();
                break;
            default:
                break;
        }

        // Refresh the table after sorting
        refreshTable();
    }

    private void sortContactsByName() {
        int n = contactsList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (contactsList.get(j).name.compareTo(contactsList.get(j + 1).name) > 0) {
                    Contact temp = contactsList.get(j);
                    contactsList.set(j, contactsList.get(j + 1));
                    contactsList.set(j + 1, temp);
                }
            }
        }
    }

    private void sortContactsByNewest() {
        contactsList.sort((c1, c2) -> c2.getTimestamp().compareTo(c1.getTimestamp())); // Sort by timestamp in descending order
    }

    private void sortContactsByOldest() {
        contactsList.sort((c1, c2) -> c1.getTimestamp().compareTo(c2.getTimestamp())); // Sort by timestamp in ascending order
    }

    private void refreshTable() {
        tableModel.setRowCount(0); // Clear the existing rows

        // Add the sorted contacts back to the table
        for (Contact contact : contactsList) {
            tableModel.addRow(new Object[]{contact.name, contact.email, contact.phone});
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new main().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTable contactsTBL;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton editBTN;
    private javax.swing.JTextField emailFIELD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameFIELD;
    private javax.swing.JTextField phoneFIELD;
    private javax.swing.JButton searchBTN;
    private javax.swing.JComboBox<String> sortCBOX;
    // End of variables declaration//GEN-END:variables
}
