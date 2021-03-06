/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import main.Connector;
import main.DoctorMainPage;
import main.Login;
import main.ViewAppointment;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author mahad
 */
public class ViewPn extends javax.swing.JFrame {

    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    Timer timer;
    
    public ViewPn() {
        initComponents();
        fetch_table();
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date date = new Date();
                DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss aa");
                String time = timeFormat.format(date);
                curr_time_label.setText(time);
            }
        };
        timer = new Timer(1000, actionListener);
        timer.setInitialDelay(0);
        timer.start();
        setIconImage();
    }
    
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
    private void fetch_table(){
        try{
            conn = Connector.ConnectDB();
            String sql = "SELECT * FROM patient";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            patient_table.setModel(DbUtils.resultSetToTableModel(rs));
            patient_table.setAutoResizeMode(patient_table.AUTO_RESIZE_OFF);
            patient_table.getColumnModel().getColumn(0).setPreferredWidth(58);
            patient_table.getColumnModel().getColumn(1).setPreferredWidth(58);
            patient_table.getColumnModel().getColumn(2).setPreferredWidth(80);
            patient_table.getColumnModel().getColumn(3).setPreferredWidth(170);
            patient_table.getColumnModel().getColumn(4).setPreferredWidth(33);
            patient_table.getColumnModel().getColumn(5).setPreferredWidth(110);
            patient_table.getColumnModel().getColumn(6).setPreferredWidth(80);
            patient_table.getColumnModel().getColumn(7).setPreferredWidth(110);
            patient_table.getColumnModel().getColumn(8).setPreferredWidth(160);
            patient_table.getColumnModel().getColumn(9).setPreferredWidth(53);
            patient_table.getColumnModel().getColumn(10).setPreferredWidth(50);
            patient_table.getColumnModel().getColumn(11).setPreferredWidth(30);
            patient_table.getColumnModel().getColumn(12).setPreferredWidth(60);
            
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

        jPanel1 = new javax.swing.JPanel();
        back_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        logOut_btn = new javax.swing.JButton();
        time_label = new javax.swing.JLabel();
        curr_time_label = new javax.swing.JLabel();
        table = new javax.swing.JScrollPane();
        patient_table = new javax.swing.JTable();
        bradcum_label = new javax.swing.JLabel();
        search_label1 = new javax.swing.JLabel();
        search_txt = new javax.swing.JTextField();
        bg_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(150, 50, 0, 0));
        setPreferredSize(new java.awt.Dimension(1050, 626));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 626));
        jPanel1.setLayout(null);

        back_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(102, 102, 102));
        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/arrow-back-icon.png"))); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn);
        back_btn.setBounds(560, 20, 160, 60);

        home_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home_btn.setForeground(new java.awt.Color(102, 102, 102));
        home_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/Home-icon (1).png"))); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        jPanel1.add(home_btn);
        home_btn.setBounds(720, 20, 160, 60);

        logOut_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logOut_btn.setForeground(new java.awt.Color(102, 102, 102));
        logOut_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/switch-turn-off-icon.png"))); // NOI18N
        logOut_btn.setText("Log Out");
        logOut_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOut_btnActionPerformed(evt);
            }
        });
        jPanel1.add(logOut_btn);
        logOut_btn.setBounds(880, 20, 160, 60);

        time_label.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        time_label.setForeground(new java.awt.Color(102, 102, 102));
        time_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/Clock-Forward-icon.png"))); // NOI18N
        jPanel1.add(time_label);
        time_label.setBounds(10, 90, 60, 50);

        curr_time_label.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        curr_time_label.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(curr_time_label);
        curr_time_label.setBounds(70, 100, 170, 40);

        patient_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13"
            }
        ));
        patient_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patient_tableMouseClicked(evt);
            }
        });
        table.setViewportView(patient_table);

        jPanel1.add(table);
        table.setBounds(0, 140, 1050, 470);

        bradcum_label.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        bradcum_label.setForeground(new java.awt.Color(255, 255, 255));
        bradcum_label.setText("View Appiontment >> View Patient");
        jPanel1.add(bradcum_label);
        bradcum_label.setBounds(10, 20, 510, 60);

        search_label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/search-icon (1).png"))); // NOI18N
        jPanel1.add(search_label1);
        search_label1.setBounds(330, 90, 50, 50);

        search_txt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        search_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_txtActionPerformed(evt);
            }
        });
        search_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_txtKeyReleased(evt);
            }
        });
        jPanel1.add(search_txt);
        search_txt.setBounds(390, 90, 650, 50);

        bg_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reception/AllBackGrondPic - Copy.jpg"))); // NOI18N
        jPanel1.add(bg_label);
        bg_label.setBounds(0, 0, 1050, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        ViewAppointment php = new ViewAppointment();
        php.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        DoctorMainPage homePage = new DoctorMainPage();
        homePage.setVisible(true);
        dispose();
    }//GEN-LAST:event_home_btnActionPerformed

    private void logOut_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOut_btnActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_logOut_btnActionPerformed

    private void patient_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patient_tableMouseClicked
        
    }//GEN-LAST:event_patient_tableMouseClicked

    private void search_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_txtActionPerformed

    private void search_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_txtKeyReleased
        conn = Connector.ConnectDB();
        try{
            String sql = "SELECT * FROM patient WHERE Name = ? OR ID = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt.getText());
            pst.setString(2, search_txt.getText());
            rs = pst.executeQuery();
            patient_table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        patient_table.setAutoResizeMode(patient_table.AUTO_RESIZE_OFF);
        patient_table.getColumnModel().getColumn(0).setPreferredWidth(58);
        patient_table.getColumnModel().getColumn(1).setPreferredWidth(58);
        patient_table.getColumnModel().getColumn(2).setPreferredWidth(80);
        patient_table.getColumnModel().getColumn(3).setPreferredWidth(170);
        patient_table.getColumnModel().getColumn(4).setPreferredWidth(33);
        patient_table.getColumnModel().getColumn(5).setPreferredWidth(110);
        patient_table.getColumnModel().getColumn(6).setPreferredWidth(80);
        patient_table.getColumnModel().getColumn(7).setPreferredWidth(110);
        patient_table.getColumnModel().getColumn(8).setPreferredWidth(160);
        patient_table.getColumnModel().getColumn(9).setPreferredWidth(53);
        patient_table.getColumnModel().getColumn(10).setPreferredWidth(50);
        patient_table.getColumnModel().getColumn(11).setPreferredWidth(30);
        patient_table.getColumnModel().getColumn(12).setPreferredWidth(60);
    }//GEN-LAST:event_search_txtKeyReleased

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
            java.util.logging.Logger.getLogger(ViewPn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bg_label;
    private javax.swing.JLabel bradcum_label;
    private javax.swing.JLabel curr_time_label;
    private javax.swing.JButton home_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logOut_btn;
    private javax.swing.JTable patient_table;
    private javax.swing.JLabel search_label1;
    private javax.swing.JTextField search_txt;
    private javax.swing.JScrollPane table;
    private javax.swing.JLabel time_label;
    // End of variables declaration//GEN-END:variables
}
