/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Panel_Main_Menu.java
 *
 * Created on Mar 3, 2012, 2:21:02 PM
 */
package salesPackage;

/**
 *
 * @author user
 */
public class Panel_Main_Menu extends javax.swing.JPanel {

    /** Creates new form Panel_Main_Menu */
    public Panel_Main_Menu() {
        initComponents();                
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home_icon = new javax.swing.JLabel();
        label_main = new javax.swing.JLabel();
        lbl_welcome = new javax.swing.JLabel();
        btn_settings = new javax.swing.JButton();
        Btn_add = new javax.swing.JButton();
        Btn_mine_data = new javax.swing.JButton();
        Btn_status = new javax.swing.JButton();
        lbl_cnt = new javax.swing.JLabel();
        bbl_cnt = new javax.swing.JLabel();
        Btn_inbox = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(900, 540));
        setLayout(null);

        home_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/Home_icon.png"))); // NOI18N
        add(home_icon);
        home_icon.setBounds(220, 37, 100, 100);

        label_main.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_main.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/main_menu_title.gif"))); // NOI18N
        add(label_main);
        label_main.setBounds(220, 37, 502, 100);

        lbl_welcome.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        lbl_welcome.setForeground(new java.awt.Color(0, 102, 0));
        lbl_welcome.setText("Welcome Gagandeep! What would you like to do ? ");
        add(lbl_welcome);
        lbl_welcome.setBounds(46, 175, 800, 30);

        btn_settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/settings_1.png"))); // NOI18N
        btn_settings.setBorderPainted(false);
        btn_settings.setContentAreaFilled(false);
        btn_settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_settings.setFocusPainted(false);
        btn_settings.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/settings_3.png"))); // NOI18N
        btn_settings.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/settings_2.png"))); // NOI18N
        btn_settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_settingsActionPerformed(evt);
            }
        });
        add(btn_settings);
        btn_settings.setBounds(20, 480, 123, 43);

        Btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/add_1.gif"))); // NOI18N
        Btn_add.setBorderPainted(false);
        Btn_add.setContentAreaFilled(false);
        Btn_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_add.setFocusPainted(false);
        Btn_add.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/add_3.gif"))); // NOI18N
        Btn_add.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/add_2.gif"))); // NOI18N
        Btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_addActionPerformed(evt);
            }
        });
        add(Btn_add);
        Btn_add.setBounds(46, 236, 177, 157);

        Btn_mine_data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/mine_1.gif"))); // NOI18N
        Btn_mine_data.setBorderPainted(false);
        Btn_mine_data.setContentAreaFilled(false);
        Btn_mine_data.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_mine_data.setFocusPainted(false);
        Btn_mine_data.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/mine_3.gif"))); // NOI18N
        Btn_mine_data.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/mine_2.gif"))); // NOI18N
        Btn_mine_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_mine_dataActionPerformed(evt);
            }
        });
        add(Btn_mine_data);
        Btn_mine_data.setBounds(255, 236, 177, 157);

        Btn_status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/status_1.gif"))); // NOI18N
        Btn_status.setBorderPainted(false);
        Btn_status.setContentAreaFilled(false);
        Btn_status.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_status.setFocusPainted(false);
        Btn_status.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/status_3.gif"))); // NOI18N
        Btn_status.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/status_2.gif"))); // NOI18N
        Btn_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_statusActionPerformed(evt);
            }
        });
        add(Btn_status);
        Btn_status.setBounds(673, 236, 177, 157);

        lbl_cnt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lbl_cnt.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cnt.setText("0");
        add(lbl_cnt);
        lbl_cnt.setBounds(580, 220, 30, 27);

        bbl_cnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/counter_bubble.png"))); // NOI18N
        add(bbl_cnt);
        bbl_cnt.setBounds(580, 220, 30, 32);

        Btn_inbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/inbox_1.gif"))); // NOI18N
        Btn_inbox.setBorderPainted(false);
        Btn_inbox.setContentAreaFilled(false);
        Btn_inbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_inbox.setFocusPainted(false);
        Btn_inbox.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/inbox_3.gif"))); // NOI18N
        Btn_inbox.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Main_Menu/inbox_2.gif"))); // NOI18N
        Btn_inbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_inboxActionPerformed(evt);
            }
        });
        add(Btn_inbox);
        Btn_inbox.setBounds(464, 236, 177, 157);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/panel_bg_trans.png"))); // NOI18N
        bg.setFocusable(false);
        add(bg);
        bg.setBounds(0, 0, 900, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_addActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        SPA.panelController(null, new int[]{0,0,0,3,1,0});
    }//GEN-LAST:event_Btn_addActionPerformed

    private void Btn_mine_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_mine_dataActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        SPA.panelController(null, new int[]{0,0,0,3,2,0});
    }//GEN-LAST:event_Btn_mine_dataActionPerformed

    private void Btn_inboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_inboxActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        SPA.panelController(null, new int[]{0,0,0,3,5,0});
    }//GEN-LAST:event_Btn_inboxActionPerformed

    private void Btn_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_statusActionPerformed
        // TODO add your handling code here:
        
        //SPA.DIAGNOSE.identifyProblem();
        //SPA.DIAGNOSE.showFlags();
        //setVisible(false);        
        SPA.panelController(null, new int[]{0,0,0,3,3,0});
    }//GEN-LAST:event_Btn_statusActionPerformed

    private void btn_settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_settingsActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        SPA.panelController(null, new int[]{0,0,0,3,4,0});
    }//GEN-LAST:event_btn_settingsActionPerformed

    void openPanel()
    {
        lbl_welcome.setText("Welcome "+SPA.CNF.firstName+" ! What would you like to do ? ");
        if(SPA.DIAGNOSE.virtualFlag>0)
        {
            bbl_cnt.setVisible(true);            
            bbl_cnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/counter_bubble.png")));
            lbl_cnt.setVisible(true);
            lbl_cnt.setText(String.valueOf(SPA.DIAGNOSE.virtualFlag));            
        }else
        {
            bbl_cnt.setVisible(false);
            lbl_cnt.setVisible(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_add;
    private javax.swing.JButton Btn_inbox;
    private javax.swing.JButton Btn_mine_data;
    private javax.swing.JButton Btn_status;
    private javax.swing.JLabel bbl_cnt;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btn_settings;
    private javax.swing.JLabel home_icon;
    private javax.swing.JLabel label_main;
    private javax.swing.JLabel lbl_cnt;
    private javax.swing.JLabel lbl_welcome;
    // End of variables declaration//GEN-END:variables
}