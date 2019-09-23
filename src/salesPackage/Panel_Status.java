package salesPackage;

public class Panel_Status extends javax.swing.JPanel {

    /** Creates new form Panel_Main_Menu */
    
    Diagnostic d_ref;
    LogHandler log=new LogHandler();
    boolean readOnly;
    
    public Panel_Status() {
        initComponents();
        btn_exit.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        lbl_format = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_run = new javax.swing.JButton();
        sym_app = new javax.swing.JLabel();
        textA_app = new javax.swing.JTextArea();
        sym_reg = new javax.swing.JLabel();
        textA_reg = new javax.swing.JTextArea();
        sym_db = new javax.swing.JLabel();
        btn_db = new javax.swing.JButton();
        textA_login = new javax.swing.JTextArea();
        sym_bk = new javax.swing.JLabel();
        textA_bk = new javax.swing.JTextArea();
        textA_inbox = new javax.swing.JTextArea();
        lbl_cnt = new javax.swing.JLabel();
        bbl_cnt = new javax.swing.JLabel();
        all_icons = new javax.swing.JLabel();
        login_icon = new javax.swing.JLabel();
        textA_db = new javax.swing.JTextArea();
        bg = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(900, 540));
        setLayout(null);

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/title.png"))); // NOI18N
        add(title);
        title.setBounds(161, 10, 577, 121);

        lbl_format.setForeground(new java.awt.Color(255, 0, 0));
        lbl_format.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_format.setText("UnRecoverable Error: 'format.xls' has been detected missing. This file is a part software installation and is required while creating fresh database file. ");
        add(lbl_format);
        lbl_format.setBounds(120, 458, 720, 14);

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/back_1.png"))); // NOI18N
        btn_back.setBorderPainted(false);
        btn_back.setContentAreaFilled(false);
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/back_4.png"))); // NOI18N
        btn_back.setFocusPainted(false);
        btn_back.setPreferredSize(new java.awt.Dimension(90, 31));
        btn_back.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/back_3.png"))); // NOI18N
        btn_back.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/back_2.png"))); // NOI18N
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        add(btn_back);
        btn_back.setBounds(405, 490, 90, 31);

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Resgistration/exit_1.png"))); // NOI18N
        btn_exit.setBorderPainted(false);
        btn_exit.setContentAreaFilled(false);
        btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Resgistration/exit_3.png"))); // NOI18N
        btn_exit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/Resgistration/exit_2.png"))); // NOI18N
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        add(btn_exit);
        btn_exit.setBounds(405, 490, 90, 31);

        btn_run.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/run_Diagnose.png"))); // NOI18N
        btn_run.setBorderPainted(false);
        btn_run.setContentAreaFilled(false);
        btn_run.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_run.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/run_Diagnose_4.png"))); // NOI18N
        btn_run.setFocusPainted(false);
        btn_run.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/run_Diagnose_3.png"))); // NOI18N
        btn_run.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/run_Diagnose_2.png"))); // NOI18N
        btn_run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_runActionPerformed(evt);
            }
        });
        add(btn_run);
        btn_run.setBounds(25, 420, 80, 103);

        sym_app.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Alert.png"))); // NOI18N
        add(sym_app);
        sym_app.setBounds(140, 140, 28, 28);

        textA_app.setColumns(20);
        textA_app.setEditable(false);
        textA_app.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textA_app.setRows(5);
        textA_app.setText("The Application was not \nclosed properly during \nlast run. Please avoid\nsuch termination and close\napplication properly by\nclicking close button.");
        textA_app.setOpaque(false);
        add(textA_app);
        textA_app.setBounds(30, 284, 150, 160);

        sym_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Alert.png"))); // NOI18N
        add(sym_reg);
        sym_reg.setBounds(300, 140, 28, 28);

        textA_reg.setColumns(20);
        textA_reg.setEditable(false);
        textA_reg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textA_reg.setRows(5);
        textA_reg.setText("Previous registration\nhas been found corrupted.\nSomeone has intentionally\ntempered the \nconfiguration settings. \nPlease restart the \napplication and register \nagain.");
        textA_reg.setOpaque(false);
        add(textA_reg);
        textA_reg.setBounds(205, 284, 150, 160);

        sym_db.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Alert.png"))); // NOI18N
        add(sym_db);
        sym_db.setBounds(480, 140, 28, 28);

        btn_db.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/db_1.png"))); // NOI18N
        btn_db.setBorderPainted(false);
        btn_db.setContentAreaFilled(false);
        btn_db.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_db.setDefaultCapable(false);
        btn_db.setFocusPainted(false);
        btn_db.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/db_3.png"))); // NOI18N
        btn_db.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/db_2.png"))); // NOI18N
        btn_db.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dbActionPerformed(evt);
            }
        });
        add(btn_db);
        btn_db.setBounds(379, 142, 129, 115);

        textA_login.setColumns(20);
        textA_login.setEditable(false);
        textA_login.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        textA_login.setForeground(new java.awt.Color(255, 0, 0));
        textA_login.setRows(5);
        textA_login.setText("You are not Logged in \n  as an administrator!\n        Please login !\n");
        textA_login.setOpaque(false);
        add(textA_login);
        textA_login.setBounds(780, 70, 110, 45);

        sym_bk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Alert.png"))); // NOI18N
        add(sym_bk);
        sym_bk.setBounds(640, 140, 28, 28);

        textA_bk.setColumns(20);
        textA_bk.setEditable(false);
        textA_bk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textA_bk.setRows(5);
        textA_bk.setText("Database Backup file \nmissing or No backup has \nbeen created yet. Please \nmake sure that the backup\nfile has not been deleted \nexplicitly. Always create \nbackup timely or whenever \nprompt. You may create \nbackup from 'Settings' \noption in Menu Menu.");
        textA_bk.setOpaque(false);
        add(textA_bk);
        textA_bk.setBounds(540, 284, 150, 160);

        textA_inbox.setColumns(20);
        textA_inbox.setEditable(false);
        textA_inbox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textA_inbox.setRows(5);
        textA_inbox.setText("Records found in \nInbox. Please save them \nto database immediately. \nThese records does not \nbelong to database records, \nrather are temporarly\nstored in files possibly \nbecause user did not logged\nin or database was out of\nconnection while saving.");
        textA_inbox.setOpaque(false);
        add(textA_inbox);
        textA_inbox.setBounds(710, 284, 157, 160);

        lbl_cnt.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lbl_cnt.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cnt.setText("0");
        add(lbl_cnt);
        lbl_cnt.setBounds(805, 140, 30, 27);

        bbl_cnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/counter_bubble.png"))); // NOI18N
        add(bbl_cnt);
        bbl_cnt.setBounds(805, 140, 30, 32);

        all_icons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/all_icons.png"))); // NOI18N
        add(all_icons);
        all_icons.setBounds(40, 149, 796, 128);

        login_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/login.png"))); // NOI18N
        add(login_icon);
        login_icon.setBounds(780, 10, 110, 55);

        textA_db.setColumns(20);
        textA_db.setEditable(false);
        textA_db.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textA_db.setRows(5);
        textA_db.setText("Database is connected! \nNo errors Found! \nCurrently connected to\nDSN :\n");
        textA_db.setOpaque(false);
        add(textA_db);
        textA_db.setBounds(370, 284, 150, 160);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/panel_bg_trans.png"))); // NOI18N
        bg.setFocusable(false);
        add(bg);
        bg.setBounds(0, 0, 900, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        if(SPA.loggedIn==false)
        { SPA.panelController(null, new int[]{0, 0, 0, 2, 0, 0}); }
        else
        { SPA.panelController(null, new int[]{0, 0, 0, 3, 0, 0}); }        
        
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_runActionPerformed
        // TODO add your handling code here:
        d_ref.identifyProblem();        
        
        setAllSymbols();
        btn_run.setEnabled(false);
    }//GEN-LAST:event_btn_runActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        LogHandler log = new LogHandler();
        log.writeToLog(32);
        log.writeToLog(34);
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_dbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dbActionPerformed
        // TODO add your handling code here:
        Dialog_ErrorHandler derr=new Dialog_ErrorHandler(null, true);
        
        
        if(d_ref.dbFlag==0)
        { derr.recieveInfo("Invalid Data Source Name (DSN).", new int[]{2,0,7,3,3,0}); }
        else if(d_ref.dbFlag==-1)
        { derr.recieveInfo("Incompatible or Missing File.", new int[]{2,0,8,3,3,0}); }
        else if(readOnly)
        { derr.recieveInfo("The Database is set 'Read Only'.", new int[]{2,0,6,3,3,0}); }
        
        derr.setVisible(true); 
    }//GEN-LAST:event_btn_dbActionPerformed

    void openPanel(Diagnostic d)
    {
        d_ref=d;
        //d_ref.showFlags();        
        d_ref.identifyProblem();  
        
        
        setAllSymbols();
        btn_run.setEnabled(true);
    }
    
    private void setAllSymbols()
    {
        /*
        if(d_ref.logFlag==1)
        { sym_app.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Alert.png"))); }
        else if(d_ref.logFlag==0)
        { sym_app.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Alert.png"))); }
        * 
        */
        
        //LOGIN
        if(SPA.loggedIn==false)
        {
            login_icon.setVisible(true);
            textA_login.setVisible(true);
        }else
        {
            login_icon.setVisible(false);
            textA_login.setVisible(false);
        }
        
        //LOG - APPLICATION STATUS
        if(d_ref.logFlag==-1)
        {
            sym_app.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Error.png")));
            textA_app.setText("The log file used by this \napplication has been found\ncorrupted. The file has\nbeen either damaged by \nsome external application\nor has been intentionally \nedited by someone.");            
        }else if(d_ref.logFlag==32 || d_ref.logFlag==33)
        {
            sym_app.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Alert.png")));
            textA_app.setText("One of the process was\nnot completed during last \nrun. This may be possiblily \ndue to some kind of \ninterruption while the \nprocess was executing.");
        }else if(d_ref.logFlag==31 || d_ref.logFlag==0)
        {
            sym_app.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Alert.png")));
            textA_app.setText("The Application was not \nclosed properly during \nlast run. Please avoid\nsuch termination and close\napplication properly by\nclicking close button.");
        }     
        else
        {
            sym_app.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Ok.png")));
            textA_app.setText("No errors founds!\nJust make sure you always\nclose the application \nproperly. Avoid disturing \nany kind of critical files\nthat may trigger master \nreset.");
        }
        
        //CONF - REGISTRATION 
        if(d_ref.configFlag==-1)
        {
            sym_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Error.png")));
            textA_reg.setText("Someone has illegally \ndeleted the configuration\nsettings from your\ncomputer. This act is \nagains the rights to use \nthis software. The \napplication will remain in \nreset state untill you \nregister yourself again.");
            btn_exit.setVisible(true);
            btn_back.setVisible(false);
        }else if(d_ref.configFlag==0)
        {
            sym_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Alert.png")));
            textA_reg.setText("Previous registration\nhas been found corrupted.\nSomeone has intentionally\ntempered the \nconfiguration settings. \nPlease restart the \napplication and register \nagain.");
            btn_exit.setVisible(true);
            btn_back.setVisible(false);
        }else
        {
            sym_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Ok.png")));
            textA_reg.setText("No errors found in \nregistration and \nconfiguration settings.");
        }
        
        //DB - DATABASE   
        readOnly=d_ref.db.checkReadOnly(false);
        if(d_ref.dbFlag==0)
        {
            sym_db.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Error.png")));
            textA_db.setText("Database NOT connected!\nPossibly an invalid Data \nSource Name (DSN). Go\nto 'Control Panel' -> \n'Administrative Tools' ->\n'Data Sources (ODBC)' ,\nselect 'System DSN' tab,\nand verify your DSN name. \nCreate new if necessary, \nby clicking 'Add' .\n");            
            btn_db.setVisible(true);
        }
        else if(d_ref.dbFlag==-1)
        {
            sym_db.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Error.png")));
            textA_db.setText("Error connecting to \nDatabase! \nIncompatible workbook \nor workbook not found!");            
            btn_db.setVisible(true);
        }else if(readOnly)
        {
            sym_db.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Alert.png")));
            textA_db.setText("The Database has been \nset as 'Read Only'. Please\nremove this constraint,\notherwise you will not\nbe able to add new \nrecords to the database.");
            btn_db.setVisible(true);
        }   
        else
        {
            sym_db.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Ok.png")));
            textA_db.setText("Database is connected! \nNo errors Found! \nCurrently connected to\nDSN : "+SPA.DB.dataSourceName);
            btn_db.setVisible(false);
        }
        
        //Backup - BACKUP
        if(d_ref.backupFlag==0)
        {
            sym_bk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Alert.png")));
            textA_bk.setText("Database Backup file \nmissing or No backup has \nbeen created yet. Please \nmake sure that the backup\nfile has not been deleted \nexplicitly. Always create \nbackup timely or whenever \nprompt. You may create \nbackup from 'Settings' \noption in Menu Menu.");            
        }else
        {
            sym_bk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/Ok.png")));
            textA_bk.setText("Database Backup Found!\nLast backup was created\non "+SPA.CNF.lastBackupDate);
        }
        
        //FORMATE
        if(d_ref.formateFlag==0)
        {  lbl_format.setVisible(true); }
        else
        {  lbl_format.setVisible(false); }
        
        //VDB - Inbox
        if(d_ref.virtualFlag>0)
        {
            bbl_cnt.setVisible(true);            
            bbl_cnt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/System_Status/counter_bubble.png")));
            lbl_cnt.setVisible(true);
            lbl_cnt.setText(String.valueOf(d_ref.virtualFlag));
            textA_inbox.setText(d_ref.virtualFlag+" Records found in \nInbox. Please save them \nto database immediately. \nThese records does not \nbelong to database records, \nrather are temporarily\nstored in files possibly \nbecause user did not logged\nin or database was out of\nconnection while saving.");
            
        }else
        {
            bbl_cnt.setVisible(false);
            lbl_cnt.setVisible(false);
            textA_inbox.setText("No records found in Inbox.");            
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel all_icons;
    private javax.swing.JLabel bbl_cnt;
    private javax.swing.JLabel bg;
    private static javax.swing.JButton btn_back;
    private javax.swing.JButton btn_db;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_run;
    private javax.swing.JLabel lbl_cnt;
    private javax.swing.JLabel lbl_format;
    private javax.swing.JLabel login_icon;
    private javax.swing.JLabel sym_app;
    private javax.swing.JLabel sym_bk;
    private javax.swing.JLabel sym_db;
    private javax.swing.JLabel sym_reg;
    private javax.swing.JTextArea textA_app;
    private javax.swing.JTextArea textA_bk;
    private javax.swing.JTextArea textA_db;
    private javax.swing.JTextArea textA_inbox;
    private javax.swing.JTextArea textA_login;
    private javax.swing.JTextArea textA_reg;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
