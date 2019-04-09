/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reception;


import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import main.Connector;
import main.HomePage;
import main.Login;

/**
 *
 * @author mahad
 */
public class AddReceptionPage extends javax.swing.JFrame {

    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    public AddReceptionPage() {
        initComponents();
        setIconImage();
    }
    
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
    
    public void clear(){
        id_txt.setText("");
        name_txt.setText("");
        phone_txt.setText("");
        email_txt.setText("");
        age_txt.setText("");
        address_txt.setText("");
        joinDate_date.setCalendar(null);
        gender_combox.setSelectedIndex(0);
        blood_combox.setSelectedIndex(0);
        status_combox.setSelectedIndex(0);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add_panel = new javax.swing.JPanel();
        id_txt = new javax.swing.JTextField();
        name_txt = new javax.swing.JTextField();
        phone_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        address_txt = new javax.swing.JTextField();
        age_txt = new javax.swing.JTextField();
        age_label = new javax.swing.JLabel();
        address_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        phone_label = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        joinDate_date = new com.toedter.calendar.JDateChooser();
        gender_combox = new javax.swing.JComboBox<>();
        blood_combox = new javax.swing.JComboBox<>();
        status_combox = new javax.swing.JComboBox<>();
        clear_btn = new javax.swing.JButton();
        save_btn = new javax.swing.JButton();
        status_label = new javax.swing.JLabel();
        blood_label = new javax.swing.JLabel();
        gender_label = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        bradcum_label = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        logOut_btn = new javax.swing.JButton();
        bg_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insert Window");
        setBounds(new java.awt.Rectangle(150, 50, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 626));

        add_panel.setPreferredSize(new java.awt.Dimension(1050, 626));
        add_panel.setLayout(null);

        id_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id_txt.setForeground(new java.awt.Color(51, 51, 51));
        id_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_txtKeyPressed(evt);
            }
        });
        add_panel.add(id_txt);
        id_txt.setBounds(150, 210, 310, 40);

        name_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name_txt.setForeground(new java.awt.Color(51, 51, 51));
        name_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                name_txtKeyPressed(evt);
            }
        });
        add_panel.add(name_txt);
        name_txt.setBounds(150, 260, 310, 40);

        phone_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phone_txt.setForeground(new java.awt.Color(51, 51, 51));
        phone_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phone_txtKeyPressed(evt);
            }
        });
        add_panel.add(phone_txt);
        phone_txt.setBounds(150, 310, 310, 40);

        email_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email_txt.setForeground(new java.awt.Color(51, 51, 51));
        email_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                email_txtKeyPressed(evt);
            }
        });
        add_panel.add(email_txt);
        email_txt.setBounds(150, 360, 310, 40);

        address_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        address_txt.setForeground(new java.awt.Color(51, 51, 51));
        address_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                address_txtKeyPressed(evt);
            }
        });
        add_panel.add(address_txt);
        address_txt.setBounds(150, 410, 310, 40);

        age_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        age_txt.setForeground(new java.awt.Color(51, 51, 51));
        age_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                age_txtKeyPressed(evt);
            }
        });
        add_panel.add(age_txt);
        age_txt.setBounds(670, 210, 150, 40);

        age_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        age_label.setForeground(new java.awt.Color(0, 51, 51));
        age_label.setText("Age :");
        add_panel.add(age_label);
        age_label.setBounds(600, 210, 70, 40);

        address_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        address_label.setForeground(new java.awt.Color(0, 51, 51));
        address_label.setText("Address :");
        add_panel.add(address_label);
        address_label.setBounds(30, 410, 110, 40);

        email_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        email_label.setForeground(new java.awt.Color(0, 51, 51));
        email_label.setText("Email :");
        add_panel.add(email_label);
        email_label.setBounds(60, 360, 90, 40);

        phone_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        phone_label.setForeground(new java.awt.Color(0, 51, 51));
        phone_label.setText("Phone :");
        add_panel.add(phone_label);
        phone_label.setBounds(50, 310, 100, 40);

        name_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        name_label.setForeground(new java.awt.Color(0, 51, 51));
        name_label.setText("Name :");
        add_panel.add(name_label);
        name_label.setBounds(60, 260, 90, 40);

        id_label.setBackground(new java.awt.Color(255, 255, 255));
        id_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        id_label.setForeground(new java.awt.Color(0, 51, 51));
        id_label.setText("ID :");
        add_panel.add(id_label);
        id_label.setBounds(100, 210, 50, 40);

        joinDate_date.setForeground(new java.awt.Color(51, 51, 51));
        joinDate_date.setDateFormatString("yyyy-MM-dd");
        joinDate_date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add_panel.add(joinDate_date);
        joinDate_date.setBounds(670, 260, 180, 40);

        gender_combox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gender_combox.setForeground(new java.awt.Color(102, 102, 102));
        gender_combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "FeMale", "Common", " " }));
        add_panel.add(gender_combox);
        gender_combox.setBounds(670, 310, 155, 40);

        blood_combox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        blood_combox.setForeground(new java.awt.Color(102, 102, 102));
        blood_combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-", " ", " " }));
        add_panel.add(blood_combox);
        blood_combox.setBounds(670, 360, 155, 40);

        status_combox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        status_combox.setForeground(new java.awt.Color(102, 102, 102));
        status_combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced", " " }));
        add_panel.add(status_combox);
        status_combox.setBounds(670, 410, 155, 40);

        clear_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear_btn.setForeground(new java.awt.Color(102, 102, 102));
        clear_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/Cancel button.png"))); // NOI18N
        clear_btn.setText("Clear");
        clear_btn.setToolTipText("Clear");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });
        add_panel.add(clear_btn);
        clear_btn.setBounds(520, 460, 150, 60);

        save_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        save_btn.setForeground(new java.awt.Color(102, 102, 102));
        save_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/Telegram-icon.png"))); // NOI18N
        save_btn.setText("Save");
        save_btn.setToolTipText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });
        add_panel.add(save_btn);
        save_btn.setBounds(680, 460, 150, 60);

        status_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        status_label.setForeground(new java.awt.Color(0, 51, 51));
        status_label.setText("Maritial Status :");
        add_panel.add(status_label);
        status_label.setBounds(470, 410, 190, 40);

        blood_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        blood_label.setForeground(new java.awt.Color(204, 0, 0));
        blood_label.setText("Blood Group :");
        add_panel.add(blood_label);
        blood_label.setBounds(500, 360, 164, 40);

        gender_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gender_label.setForeground(new java.awt.Color(0, 51, 51));
        gender_label.setText("Gender :");
        add_panel.add(gender_label);
        gender_label.setBounds(560, 310, 102, 40);

        date_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        date_label.setForeground(new java.awt.Color(0, 51, 51));
        date_label.setText("Join Date :");
        add_panel.add(date_label);
        date_label.setBounds(530, 260, 140, 40);

        bradcum_label.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        bradcum_label.setForeground(new java.awt.Color(255, 255, 255));
        bradcum_label.setText("Reception Panel >> Add Receptionist");
        add_panel.add(bradcum_label);
        bradcum_label.setBounds(10, 30, 490, 70);

        back_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(102, 102, 102));
        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/arrow-back-icon.png"))); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        add_panel.add(back_btn);
        back_btn.setBounds(560, 100, 160, 60);

        home_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home_btn.setForeground(new java.awt.Color(102, 102, 102));
        home_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/Home-icon (1).png"))); // NOI18N
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        add_panel.add(home_btn);
        home_btn.setBounds(720, 100, 160, 60);

        logOut_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logOut_btn.setForeground(new java.awt.Color(102, 102, 102));
        logOut_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/switch-turn-off-icon.png"))); // NOI18N
        logOut_btn.setText("Log Out");
        logOut_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOut_btnActionPerformed(evt);
            }
        });
        add_panel.add(logOut_btn);
        logOut_btn.setBounds(880, 100, 160, 60);

        bg_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reception/AllBackGrondPic.jpg"))); // NOI18N
        add_panel.add(bg_label);
        bg_label.setBounds(0, 0, 1050, 626);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(add_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        receptionHomePage rhp = new receptionHomePage();
        rhp.setVisible(true);
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

    private void id_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_txtKeyPressed
        int key = evt.getKeyCode();
        if(key ==  10){
            name_txt.requestFocus();
        }
    }//GEN-LAST:event_id_txtKeyPressed

    private void name_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_txtKeyPressed
        int key = evt.getKeyCode();
        if(key ==  10){
            phone_txt.requestFocus();
        }
    }//GEN-LAST:event_name_txtKeyPressed

    private void phone_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone_txtKeyPressed
        int key = evt.getKeyCode();
        if(key ==  10){
            email_txt.requestFocus();
        }
    }//GEN-LAST:event_phone_txtKeyPressed

    private void email_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_txtKeyPressed
        int key = evt.getKeyCode();
        if(key ==  10){
            address_txt.requestFocus();
        }
    }//GEN-LAST:event_email_txtKeyPressed

    private void address_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_address_txtKeyPressed
        int key = evt.getKeyCode();
        if(key ==  10){
            age_txt.requestFocus();
        }
    }//GEN-LAST:event_address_txtKeyPressed

    private void age_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_age_txtKeyPressed
        /*int key = evt.getKeyCode();
        if(key ==  10){
            department_combox.requestFocus();
        }*/
    }//GEN-LAST:event_age_txtKeyPressed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        id_txt.setText("");
        name_txt.setText("");
        phone_txt.setText("");
        email_txt.setText("");
        age_txt.setText("");
        address_txt.setText("");
        joinDate_date.setCalendar(null);
        gender_combox.setSelectedIndex(0);
        blood_combox.setSelectedIndex(0);
        status_combox.setSelectedIndex(0);
    }//GEN-LAST:event_clear_btnActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        conn = Connector.ConnectDB();
        if(conn != null){
            String id = id_txt.getText();
            String name = name_txt.getText();
            String phone = phone_txt.getText();
            String email = email_txt.getText();
            String address = address_txt.getText();
            int age = Integer.parseInt(age_txt.getText());
            String date = ((JTextField)joinDate_date.getDateEditor().getUiComponent()).getText();
            String gender = (String) gender_combox.getSelectedItem();
            String blood = (String) blood_combox.getSelectedItem();
            String status = (String) status_combox.getSelectedItem();
            String sql = "INSERT INTO `reception` (`ID`, `Name`,`Email`,  `Phone`, `Address`, `Age`, `Gender`, `Join Date`, `Blood Group`, `Status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try{
                pst = conn.prepareStatement(sql);
                pst.setString(1, id);
                pst.setString(2, name);
                pst.setString(3, email);
                pst.setString(4, phone);
                pst.setString(5, address);
                pst.setInt(6, age);
                pst.setString(7, gender);
                pst.setString(8, date);
                pst.setString(9, blood);
                pst.setString(10, status);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data Saved Successfully");

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
        clear();
        ViewReceptionPage vrp = new ViewReceptionPage();
        vrp.setVisible(true);
        dispose();
    }//GEN-LAST:event_save_btnActionPerformed

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
            java.util.logging.Logger.getLogger(AddReceptionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddReceptionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddReceptionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddReceptionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddReceptionPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add_panel;
    private javax.swing.JLabel address_label;
    private javax.swing.JTextField address_txt;
    private javax.swing.JLabel age_label;
    private javax.swing.JTextField age_txt;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bg_label;
    private javax.swing.JComboBox<String> blood_combox;
    private javax.swing.JLabel blood_label;
    private javax.swing.JLabel bradcum_label;
    private javax.swing.JButton clear_btn;
    private javax.swing.JLabel date_label;
    private javax.swing.JLabel email_label;
    private javax.swing.JTextField email_txt;
    private javax.swing.JComboBox<String> gender_combox;
    private javax.swing.JLabel gender_label;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel id_label;
    private javax.swing.JTextField id_txt;
    private com.toedter.calendar.JDateChooser joinDate_date;
    private javax.swing.JButton logOut_btn;
    private javax.swing.JLabel name_label;
    private javax.swing.JTextField name_txt;
    private javax.swing.JLabel phone_label;
    private javax.swing.JTextField phone_txt;
    private javax.swing.JButton save_btn;
    private javax.swing.JComboBox<String> status_combox;
    private javax.swing.JLabel status_label;
    // End of variables declaration//GEN-END:variables

    
}
