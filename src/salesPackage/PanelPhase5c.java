/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelPhase5b.java
 *
 * Created on Mar 1, 2012, 3:20:48 PM
 */
package salesPackage;

/**
 *
 * @author user
 */
public class PanelPhase5c extends javax.swing.JPanel {

    /** Creates new form PanelPhase5b */
    public PanelPhase5c() {
        initComponents();
    }
    public int p5_r3;
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Gp_p5_q3 = new javax.swing.ButtonGroup();
        label_p5_q3 = new javax.swing.JLabel();
        radio_p5_q3_1 = new javax.swing.JRadioButton();
        radio_p5_q3_2 = new javax.swing.JRadioButton();
        diagram = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(900, 540));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(900, 540));
        setLayout(null);

        label_p5_q3.setFont(new java.awt.Font("Tahoma", 1, 12));
        label_p5_q3.setText("Q3) Do you gauge your sales forecast based on above 02 questions?");
        add(label_p5_q3);
        label_p5_q3.setBounds(170, 300, 460, 15);

        btn_Gp_p5_q3.add(radio_p5_q3_1);
        radio_p5_q3_1.setFont(new java.awt.Font("Tahoma", 0, 12));
        radio_p5_q3_1.setText("Yes we do our sales forecasting based on above 2 questions. ");
        radio_p5_q3_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radio_p5_q3_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Radio_button_1.gif"))); // NOI18N
        radio_p5_q3_1.setOpaque(false);
        radio_p5_q3_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Radio_button_2.gif"))); // NOI18N
        radio_p5_q3_1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Radio_button_4.gif"))); // NOI18N
        radio_p5_q3_1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Radio_button_3.gif"))); // NOI18N
        radio_p5_q3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_p5_q3_1ActionPerformed(evt);
            }
        });
        add(radio_p5_q3_1);
        radio_p5_q3_1.setBounds(245, 405, 410, 20);

        btn_Gp_p5_q3.add(radio_p5_q3_2);
        radio_p5_q3_2.setFont(new java.awt.Font("Tahoma", 0, 12));
        radio_p5_q3_2.setText("No we do not do our sales forecasting based on above 2 questions.");
        radio_p5_q3_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radio_p5_q3_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Radio_button_1.gif"))); // NOI18N
        radio_p5_q3_2.setOpaque(false);
        radio_p5_q3_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Radio_button_2.gif"))); // NOI18N
        radio_p5_q3_2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Radio_button_4.gif"))); // NOI18N
        radio_p5_q3_2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Radio_button_3.gif"))); // NOI18N
        radio_p5_q3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_p5_q3_2ActionPerformed(evt);
            }
        });
        add(radio_p5_q3_2);
        radio_p5_q3_2.setBounds(245, 430, 410, 27);

        diagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/SPDiag_5_3.gif"))); // NOI18N
        add(diagram);
        diagram.setBounds(155, 20, 590, 170);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/panel_bg_trans.png"))); // NOI18N
        bg.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(bg);
        bg.setBounds(0, 0, 900, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void radio_p5_q3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_p5_q3_1ActionPerformed
        // TODO add your handling code here:
        p5_r3=1;
}//GEN-LAST:event_radio_p5_q3_1ActionPerformed

    private void radio_p5_q3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_p5_q3_2ActionPerformed
        // TODO add your handling code here:
        p5_r3=2;
}//GEN-LAST:event_radio_p5_q3_2ActionPerformed

    //----------------------- MyMethods-----------------------
    public boolean assignAllData(Record ref)
    {
        String errMsg="Please select an option!";                      
                
        try
        {
            if(p5_r3==0)
                { throw new Exception(errMsg); }
            else
                { 
                    ref.phase5[2]=p5_r3;
                }                                      
        }catch(Exception e)
        {
            //System.out.println(e.getMessage());
            SPA.panelController(e.getMessage(), new int[]{2,0,1,3,1,0});
            return(false);
        }
        
        SPA.panelController(null, new int[]{0,0,0,3,1,0});
        return(true);
    }
    
    void resetPanel()
    {
        p5_r3=0;
        btn_Gp_p5_q3.clearSelection();      
    }
    
    void loadPanel(Record r)
    {           
        p5_r3=r.phase5[2];        
        
        switch(r.phase5[2]) 
        {
            case 1 : radio_p5_q3_1.setSelected(true); break;
            case 2 : radio_p5_q3_2.setSelected(true); break;            
        }       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.ButtonGroup btn_Gp_p5_q3;
    private javax.swing.JLabel diagram;
    private javax.swing.JLabel label_p5_q3;
    private javax.swing.JRadioButton radio_p5_q3_1;
    private javax.swing.JRadioButton radio_p5_q3_2;
    // End of variables declaration//GEN-END:variables
}
