/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nurse;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.Connector;
import main.HomePage;
import main.Login;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author mahad
 */
public class UpdateNurse extends javax.swing.JFrame {

    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public UpdateNurse() {
        initComponents();
        fetch_table();
        setIconImage();
    }

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
    private void fetch_table(){
        try{
            conn = Connector.ConnectDB();
            String sql = "SELECT * FROM nurse";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            nurse_table.setModel(DbUtils.resultSetToTableModel(rs));
            nurse_table.setAutoResizeMode(nurse_table.AUTO_RESIZE_OFF);
            nurse_table.getColumnModel().getColumn(0).setPreferredWidth(70);
            nurse_table.getColumnModel().getColumn(1).setPreferredWidth(200);
            nurse_table.getColumnModel().getColumn(2).setPreferredWidth(160);
            nurse_table.getColumnModel().getColumn(3).setPreferredWidth(90);
            nurse_table.getColumnModel().getColumn(4).setPreferredWidth(40);
            nurse_table.getColumnModel().getColumn(5).setPreferredWidth(53);
            nurse_table.getColumnModel().getColumn(6).setPreferredWidth(231);
            nurse_table.getColumnModel().getColumn(7).setPreferredWidth(80);
            nurse_table.getColumnModel().getColumn(8).setPreferredWidth(40);
            nurse_table.getColumnModel().getColumn(9).setPreferredWidth(60);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
    private void update_table(){
        try{
            String sql = "SELECT * FROM nurse";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            nurse_table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        update_panel = new javax.swing.JPanel();
        phone_txt = new javax.swing.JTextField();
        table = new javax.swing.JScrollPane();
        nurse_table = new javax.swing.JTable();
        add_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        bradcum_label = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        logOut_btn = new javax.swing.JButton();
        status_txt = new javax.swing.JTextField();
        blood_txt = new javax.swing.JTextField();
        date_txt = new javax.swing.JTextField();
        address_txt = new javax.swing.JTextField();
        gender_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        age_txt = new javax.swing.JTextField();
        name_txt = new javax.swing.JTextField();
        id_txt = new javax.swing.JTextField();
        bg_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Window");
        setBounds(new java.awt.Rectangle(150, 50, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 626));

        update_panel.setPreferredSize(new java.awt.Dimension(1050, 626));
        update_panel.setLayout(null);
        update_panel.add(phone_txt);
        phone_txt.setBounds(440, 100, 90, 30);

        nurse_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        nurse_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nurse_tableMouseClicked(evt);
            }
        });
        table.setViewportView(nurse_table);

        update_panel.add(table);
        table.setBounds(10, 130, 1030, 402);

        add_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_btn.setForeground(new java.awt.Color(102, 102, 102));
        add_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/Actions-contact-new-icon.png"))); // NOI18N
        add_btn.setText("Add");
        add_btn.setToolTipText("");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        update_panel.add(add_btn);
        add_btn.setBounds(740, 530, 140, 60);

        update_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update_btn.setForeground(new java.awt.Color(51, 51, 51));
        update_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/document-edit-icon (1).png"))); // NOI18N
        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });
        update_panel.add(update_btn);
        update_btn.setBounds(880, 530, 160, 60);

        bradcum_label.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        bradcum_label.setForeground(new java.awt.Color(255, 255, 255));
        bradcum_label.setText("Nurse Panel >> Update Nurse");
        update_panel.add(bradcum_label);
        bradcum_label.setBounds(20, 30, 540, 60);

        back_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(102, 102, 102));
        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/arrow-back-icon.png"))); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        update_panel.add(back_btn);
        back_btn.setBounds(560, 40, 160, 60);

        home_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home_btn.setForeground(new java.awt.Color(102, 102, 102));
        home_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/Home-icon (1).png"))); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        update_panel.add(home_btn);
        home_btn.setBounds(720, 40, 160, 60);

        logOut_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logOut_btn.setForeground(new java.awt.Color(102, 102, 102));
        logOut_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/switch-turn-off-icon.png"))); // NOI18N
        logOut_btn.setText("Log Out");
        logOut_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOut_btnActionPerformed(evt);
            }
        });
        update_panel.add(logOut_btn);
        logOut_btn.setBounds(880, 40, 160, 60);
        update_panel.add(status_txt);
        status_txt.setBounds(980, 100, 60, 30);
        update_panel.add(blood_txt);
        blood_txt.setBounds(940, 100, 40, 30);
        update_panel.add(date_txt);
        date_txt.setBounds(860, 100, 80, 30);
        update_panel.add(address_txt);
        address_txt.setBounds(620, 100, 240, 30);
        update_panel.add(gender_txt);
        gender_txt.setBounds(570, 100, 53, 30);

        email_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_txtActionPerformed(evt);
            }
        });
        update_panel.add(email_txt);
        email_txt.setBounds(280, 100, 160, 30);
        update_panel.add(age_txt);
        age_txt.setBounds(530, 100, 40, 30);
        update_panel.add(name_txt);
        name_txt.setBounds(80, 100, 200, 30);
        update_panel.add(id_txt);
        id_txt.setBounds(10, 100, 70, 30);

        bg_label.setIcon(new javax.swing.ImageIcon("H:\\My_Project\\Hospital_Mangement_System_NetBeans_With_MySql_DataBase\\src\\nurse\\AllBackGrondPic.jpg")); // NOI18N
        bg_label.setPreferredSize(new java.awt.Dimension(1050, 626));
        update_panel.add(bg_label);
        bg_label.setBounds(0, 0, 1050, 626);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(update_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(update_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        nurseHomePage nhp = new nurseHomePage();
        nhp.setVisible(true);
    }//GEN-LAST:event_back_btnActionPerformed

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
    }//GEN-LAST:event_home_btnActionPerformed

    private void logOut_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOut_btnActionPerformed
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_logOut_btnActionPerformed

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_txtActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        AddNurse an = new AddNurse();
        an.setVisible(true);
    }//GEN-LAST:event_add_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        try{
            conn = Connector.ConnectDB();
            String id = id_txt.getText();
            String name = name_txt.getText();
            String email = email_txt.getText();
            String age = age_txt.getText();
            String gender = gender_txt.getText();
            String address = address_txt.getText();
            String phone = phone_txt.getText();
            String date = date_txt.getText();
            String blood = blood_txt.getText();
            String status = status_txt.getText();

            String sql = "UPDATE `nurse` SET `ID` = '"+id+"', `Name` = '"+name+"', `Email` = '"+email+"', `Age` = '"+age+"', `Gender` = '"+gender+"', `Address` = '"+address+"', `Phone` = '"+phone+"', `Join Date` = '"+date+"', `BG` = '"+blood+"', `Status` = '"+status+"' WHERE `nurse`.`ID` = '"+id+"'";

            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated Successfully");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        update_table();
        nurse_table.setAutoResizeMode(nurse_table.AUTO_RESIZE_OFF);
        nurse_table.getColumnModel().getColumn(0).setPreferredWidth(70);
            nurse_table.getColumnModel().getColumn(1).setPreferredWidth(200);
            nurse_table.getColumnModel().getColumn(2).setPreferredWidth(160);
            nurse_table.getColumnModel().getColumn(3).setPreferredWidth(90);
            nurse_table.getColumnModel().getColumn(4).setPreferredWidth(40);
            nurse_table.getColumnModel().getColumn(5).setPreferredWidth(53);
            nurse_table.getColumnModel().getColumn(6).setPreferredWidth(231);
            nurse_table.getColumnModel().getColumn(7).setPreferredWidth(80);
            nurse_table.getColumnModel().getColumn(8).setPreferredWidth(40);
            nurse_table.getColumnModel().getColumn(9).setPreferredWidth(60);
    }//GEN-LAST:event_update_btnActionPerformed

    private void nurse_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nurse_tableMouseClicked
        try{
            int row = nurse_table.getSelectedRow();
            String tableClick = (nurse_table.getModel().getValueAt(row, 0).toString());
            String sql = "SELECT * FROM nurse WHERE ID = '" + tableClick + "' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                String id = rs.getString("ID");
                id_txt.setText(id);
                String name = rs.getString("Name");
                name_txt.setText(name);
                String email = rs.getString("Email");
                email_txt.setText(email);
                String phone = rs.getString("Phone");
                phone_txt.setText(phone);
                String age = rs.getString("Age");
                age_txt.setText(age);
                String gender = rs.getString("Gender");
                gender_txt.setText(gender);
                String adderss = rs.getString("Address");
                address_txt.setText(adderss);
                String date = rs.getString("Join Date");
                date_txt.setText(date);
                String blood = rs.getString("BG");
                blood_txt.setText(blood);
                String status = rs.getString("Status");
                status_txt.setText(status);
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_nurse_tableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateNurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateNurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateNurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateNurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateNurse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTextField address_txt;
    private javax.swing.JTextField age_txt;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bg_label;
    private javax.swing.JTextField blood_txt;
    private javax.swing.JLabel bradcum_label;
    private javax.swing.JTextField date_txt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField gender_txt;
    private javax.swing.JButton home_btn;
    private javax.swing.JTextField id_txt;
    private javax.swing.JButton logOut_btn;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTable nurse_table;
    private javax.swing.JTextField phone_txt;
    private javax.swing.JTextField status_txt;
    private javax.swing.JScrollPane table;
    private javax.swing.JButton update_btn;
    private javax.swing.JPanel update_panel;
    // End of variables declaration//GEN-END:variables
}
