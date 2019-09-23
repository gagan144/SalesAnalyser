package salesPackage;

import javax.swing.table.DefaultTableModel;

public class PanelMineData extends javax.swing.JPanel {

    /**
     * Creates new form PanelMineData
     */
    
    DatabaseHandler d= new DatabaseHandler();
    Record r=new Record();
    
    
    public PanelMineData() 
    {
        initComponents();
               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home_icon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        btn_open = new javax.swing.JButton();
        btn_view = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbl_totRecord = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(900, 540));
        setLayout(null);

        home_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Mine/dataMineIcon.png"))); // NOI18N
        add(home_icon);
        home_icon.setBounds(251, 10, 83, 80);

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Mine/mine_title.png"))); // NOI18N
        add(title);
        title.setBounds(349, 10, 302, 80);

        btn_open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Mine/open_1.png"))); // NOI18N
        btn_open.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 170, 73)));
        btn_open.setContentAreaFilled(false);
        btn_open.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_open.setFocusPainted(false);
        btn_open.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Mine/open_3.png"))); // NOI18N
        btn_open.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Mine/open_2.png"))); // NOI18N
        btn_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_openActionPerformed(evt);
            }
        });
        add(btn_open);
        btn_open.setBounds(760, 100, 110, 38);

        btn_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Mine/view_1.png"))); // NOI18N
        btn_view.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 170, 73)));
        btn_view.setContentAreaFilled(false);
        btn_view.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_view.setFocusPainted(false);
        btn_view.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Mine/view_3.png"))); // NOI18N
        btn_view.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Mine/view_2.png"))); // NOI18N
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });
        add(btn_view);
        btn_view.setBounds(760, 150, 110, 38);

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Mine/back_1.png"))); // NOI18N
        btn_back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 170, 73)));
        btn_back.setContentAreaFilled(false);
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.setFocusPainted(false);
        btn_back.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Mine/back_3.png"))); // NOI18N
        btn_back.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Mine/back_2.png"))); // NOI18N
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        add(btn_back);
        btn_back.setBounds(760, 210, 110, 38);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12, 120, 73), 2));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Record ID", "Client Name", "Company Name", "Product", "Mobile No.", "EMail (Official)", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(32, 100, 700, 380);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(12, 120, 73));
        jLabel2.setText("Total Records Found : ");
        add(jLabel2);
        jLabel2.setBounds(32, 490, 150, 33);

        lbl_totRecord.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lbl_totRecord.setForeground(new java.awt.Color(12, 120, 73));
        lbl_totRecord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_totRecord.setText("0");
        add(lbl_totRecord);
        lbl_totRecord.setBounds(190, 490, 112, 33);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Mine/textF.gif"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(190, 490, 112, 33);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/panel_bg_trans.png"))); // NOI18N
        bg.setFocusable(false);
        add(bg);
        bg.setBounds(0, 0, 900, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_openActionPerformed
        // TODO add your handling code here:
        int row,rid;
        
        try
        {
            row=jTable1.getSelectedRow();
            rid=(Integer)jTable1.getModel().getValueAt(row,0);
            System.out.println("loading data of : "+rid);
            
            SPA.userData.r=SPA.DB.mineDataFromDB(rid);    
            SPA.mine=true;
            SPA.panelSet_Ques.loadAllPanels(SPA.userData.r);
            SPA.panelController(null, new int[]{0,0,0,3,1,0});
            
            //Remove all rows
            DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            for( int i = model.getRowCount() - 1; i >= 0; i-- )
            {   
                 model.removeRow(i);
            }
            
        }catch(Exception e)
        { System.out.println("Please Select a Record");  
          SPA.panelBubble.getState("Please Select a Record!", new int[]{2,0,4,3,2,0});          
        }        
       
    }//GEN-LAST:event_btn_openActionPerformed

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        // TODO add your handling code here:
        int row,rid;
        
        try
        {
            row=jTable1.getSelectedRow();            
            
            rid=(Integer)jTable1.getModel().getValueAt(row,0);
            Record r=d.mineDataFromDB(rid);
            //System.out.println(r.clientName);
            
            Dialog_ClientInfo d=new Dialog_ClientInfo(null, true);
            d.showInfo(r);
            d.setVisible(true);
            
            
        }catch(Exception e)
        { System.out.println("Please Select a Record"); 
          SPA.panelBubble.getState("Please Select a Record!", new int[]{2,0,4,3,2,0}); 
        }
    }//GEN-LAST:event_btn_viewActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        
        SPA.panelController(null, new int[]{0,0,0,3,0,0});        
                
        //Remove all rows
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        for( int i = model.getRowCount() - 1; i >= 0; i-- )
        {   
            model.removeRow(i);
        }
        
    }//GEN-LAST:event_btn_backActionPerformed

    
    //---------------MY Method----------------------
    void getReferences(DatabaseHandler d)
    {
        this.d=d;        
        int totRec=d.showAllRecord(jTable1);
        lbl_totRecord.setText(String.valueOf(totRec));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_open;
    private javax.swing.JButton btn_view;
    private javax.swing.JLabel home_icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_totRecord;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
