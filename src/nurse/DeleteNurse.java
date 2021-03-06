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
public class DeleteNurse extends javax.swing.JFrame {

    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public DeleteNurse() {
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

        delete_panel = new javax.swing.JPanel();
        phone_txt = new javax.swing.JTextField();
        table = new javax.swing.JScrollPane();
        nurse_table = new javax.swing.JTable();
        bradcum_label = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        logOut_btn = new javax.swing.JButton();
        id_txt = new javax.swing.JTextField();
        name_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        age_txt = new javax.swing.JTextField();
        gender_txt = new javax.swing.JTextField();
        address_txt = new javax.swing.JTextField();
        date_txt = new javax.swing.JTextField();
        blood_txt = new javax.swing.JTextField();
        status_txt = new javax.swing.JTextField();
        add_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        bg_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Window");
        setBounds(new java.awt.Rectangle(150, 50, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 626));

        delete_panel.setPreferredSize(new java.awt.Dimension(1050, 626));
        delete_panel.setLayout(null);
        delete_panel.add(phone_txt);
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

        delete_panel.add(table);
        table.setBounds(10, 130, 1030, 402);

        bradcum_label.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        bradcum_label.setForeground(new java.awt.Color(255, 255, 255));
        bradcum_label.setText("Nurse Panel >> Delete Nurse");
        delete_panel.add(bradcum_label);
        bradcum_label.setBounds(10, 40, 390, 60);

        back_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(102, 102, 102));
        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/arrow-back-icon.png"))); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        delete_panel.add(back_btn);
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
        delete_panel.add(home_btn);
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
        delete_panel.add(logOut_btn);
        logOut_btn.setBounds(880, 40, 160, 60);
        delete_panel.add(id_txt);
        id_txt.setBounds(10, 100, 70, 30);
        delete_panel.add(name_txt);
        name_txt.setBounds(80, 100, 200, 30);

        email_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_txtActionPerformed(evt);
            }
        });
        delete_panel.add(email_txt);
        email_txt.setBounds(280, 100, 160, 30);
        delete_panel.add(age_txt);
        age_txt.setBounds(530, 100, 40, 30);
        delete_panel.add(gender_txt);
        gender_txt.setBounds(570, 100, 53, 30);
        delete_panel.add(address_txt);
        address_txt.setBounds(620, 100, 240, 30);
        delete_panel.add(date_txt);
        date_txt.setBounds(860, 100, 80, 30);
        delete_panel.add(blood_txt);
        blood_txt.setBounds(940, 100, 40, 30);
        delete_panel.add(status_txt);
        status_txt.setBounds(980, 100, 60, 30);

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
        delete_panel.add(add_btn);
        add_btn.setBounds(740, 530, 140, 60);

        delete_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(102, 102, 102));
        delete_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/close-icon (1).png"))); // NOI18N
        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        delete_panel.add(delete_btn);
        delete_btn.setBounds(880, 530, 160, 60);

        bg_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nurse/AllBackGrondPic.jpg"))); // NOI18N
        delete_panel.add(bg_label);
        bg_label.setBounds(0, 0, 1050, 626);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(delete_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(delete_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        nurseHomePage nhp = new nurseHomePage();
        nhp.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
        dispose();
    }//GEN-LAST:event_home_btnActionPerformed

    private void logOut_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOut_btnActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_logOut_btnActionPerformed

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_txtActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        AddNurse an = new AddNurse();
        an.setVisible(true);
        dispose();
    }//GEN-LAST:event_add_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        conn = Connector.ConnectDB();
        String sql = "DELETE FROM nurse WHERE ID =?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, id_txt.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Deleted Successfully");
            pst.close();
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
    }//GEN-LAST:event_delete_btnActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteNurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteNurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteNurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteNurse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteNurse().setVisible(true);
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
    private javax.swing.JButton delete_btn;
    private javax.swing.JPanel delete_panel;
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
    // End of variables declaration//GEN-END:variables
}
