/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salesPackage;

import javax.swing.UIManager;

/**
 *
 * @author Gagandeep
 */
public class Dialog_ClientInfo extends javax.swing.JDialog {

    /**
     * Creates new form Dialog_ClientInfo
     */
    public Dialog_ClientInfo(java.awt.Frame parent, boolean modal) 
    {
        super(parent, modal);     
        
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_cName = new javax.swing.JLabel();
        label_cmpName = new javax.swing.JLabel();
        label_desig = new javax.swing.JLabel();
        label_product = new javax.swing.JLabel();
        label_phNo = new javax.swing.JLabel();
        textF_cName = new javax.swing.JTextField();
        textF_cmpName = new javax.swing.JTextField();
        textF_desig = new javax.swing.JTextField();
        textF_product = new javax.swing.JTextField();
        textF_phNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textF_add = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textF_mob = new javax.swing.JTextField();
        textF_fax = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textF_emailOff = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textF_emailPer = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_ok = new javax.swing.JButton();
        topBar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SPA | Client Information");
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        label_cName.setText("Client Name :");
        getContentPane().add(label_cName);
        label_cName.setBounds(50, 85, 90, 20);

        label_cmpName.setText("Company     :");
        getContentPane().add(label_cmpName);
        label_cmpName.setBounds(50, 149, 90, 20);

        label_desig.setText("Designation :");
        getContentPane().add(label_desig);
        label_desig.setBounds(50, 181, 90, 20);

        label_product.setText("Product        :");
        getContentPane().add(label_product);
        label_product.setBounds(50, 213, 90, 20);

        label_phNo.setText("Phone No.   :");
        getContentPane().add(label_phNo);
        label_phNo.setBounds(50, 245, 90, 20);

        textF_cName.setBackground(new java.awt.Color(255, 255, 255));
        textF_cName.setEditable(false);
        textF_cName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(171, 173, 179)));
        textF_cName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(textF_cName);
        textF_cName.setBounds(150, 85, 190, 20);

        textF_cmpName.setBackground(new java.awt.Color(255, 255, 255));
        textF_cmpName.setEditable(false);
        textF_cmpName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(171, 173, 179)));
        textF_cmpName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(textF_cmpName);
        textF_cmpName.setBounds(150, 149, 190, 20);

        textF_desig.setBackground(new java.awt.Color(255, 255, 255));
        textF_desig.setEditable(false);
        textF_desig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(171, 173, 179)));
        textF_desig.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(textF_desig);
        textF_desig.setBounds(150, 181, 190, 20);

        textF_product.setBackground(new java.awt.Color(255, 255, 255));
        textF_product.setEditable(false);
        textF_product.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(171, 173, 179)));
        textF_product.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(textF_product);
        textF_product.setBounds(150, 213, 190, 20);

        textF_phNo.setBackground(new java.awt.Color(255, 255, 255));
        textF_phNo.setEditable(false);
        textF_phNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(171, 173, 179)));
        textF_phNo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(textF_phNo);
        textF_phNo.setBounds(150, 245, 190, 20);

        jLabel1.setText("Address :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 117, 90, 20);

        textF_add.setBackground(new java.awt.Color(255, 255, 255));
        textF_add.setEditable(false);
        textF_add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(171, 173, 179)));
        textF_add.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(textF_add);
        textF_add.setBounds(150, 117, 190, 20);

        jLabel2.setText("Mobile No. :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 277, 90, 20);

        textF_mob.setBackground(new java.awt.Color(255, 255, 255));
        textF_mob.setEditable(false);
        textF_mob.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(171, 173, 179)));
        textF_mob.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(textF_mob);
        textF_mob.setBounds(150, 277, 190, 20);

        textF_fax.setBackground(new java.awt.Color(255, 255, 255));
        textF_fax.setEditable(false);
        textF_fax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(171, 173, 179)));
        textF_fax.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(textF_fax);
        textF_fax.setBounds(150, 309, 190, 20);

        jLabel3.setText("Fax No. :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 309, 90, 20);

        textF_emailOff.setBackground(new java.awt.Color(255, 255, 255));
        textF_emailOff.setEditable(false);
        textF_emailOff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(171, 173, 179)));
        textF_emailOff.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(textF_emailOff);
        textF_emailOff.setBounds(150, 341, 190, 20);

        jLabel4.setText("Official eMail ID:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 341, 90, 20);

        textF_emailPer.setBackground(new java.awt.Color(255, 255, 255));
        textF_emailPer.setEditable(false);
        textF_emailPer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(171, 173, 179)));
        textF_emailPer.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(textF_emailPer);
        textF_emailPer.setBounds(150, 373, 190, 20);

        jLabel5.setText("Personal eMail ID :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 373, 90, 20);

        btn_ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/ok_1.png"))); // NOI18N
        btn_ok.setBorderPainted(false);
        btn_ok.setContentAreaFilled(false);
        btn_ok.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ok.setFocusPainted(false);
        btn_ok.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/ok_3.png"))); // NOI18N
        btn_ok.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/ok_2.png"))); // NOI18N
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ok);
        btn_ok.setBounds(160, 420, 90, 31);

        topBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Mine/client_info_topBar.png"))); // NOI18N
        getContentPane().add(topBar);
        topBar.setBounds(0, 0, 400, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_okActionPerformed

    
    //--------------MY Methods--------------------
    void showInfo(Record ref)
    {
        textF_cName.setText(ref.clientName);
        textF_add.setText(ref.address);
        textF_cmpName.setText(ref.cmpName);
        textF_desig.setText(ref.desig);
        textF_product.setText(ref.product);
        textF_phNo.setText(String.valueOf(ref.phNo));
        textF_mob.setText(String.valueOf(ref.mobileNo));
        textF_fax.setText(String.valueOf(ref.faxNo));
        textF_emailOff.setText(ref.email_off);
        textF_emailPer.setText(ref.email_per);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dialog_ClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dialog_ClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dialog_ClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dialog_ClientInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Dialog_ClientInfo dialog = new Dialog_ClientInfo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label_cName;
    private javax.swing.JLabel label_cmpName;
    private javax.swing.JLabel label_desig;
    private javax.swing.JLabel label_phNo;
    private javax.swing.JLabel label_product;
    private javax.swing.JTextField textF_add;
    private javax.swing.JTextField textF_cName;
    private javax.swing.JTextField textF_cmpName;
    private javax.swing.JTextField textF_desig;
    private javax.swing.JTextField textF_emailOff;
    private javax.swing.JTextField textF_emailPer;
    private javax.swing.JTextField textF_fax;
    private javax.swing.JTextField textF_mob;
    private javax.swing.JTextField textF_phNo;
    private javax.swing.JTextField textF_product;
    private javax.swing.JLabel topBar;
    // End of variables declaration//GEN-END:variables
}