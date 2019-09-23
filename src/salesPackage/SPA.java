/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package salesPackage;

import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

/**
 *
 * @author Gagandeep
 */
public class SPA extends javax.swing.JFrame {

    /**
     * Creates new form Tool
     */
    
    static boolean loggedIn=false;
    static int MAXRID=0;
    static boolean mine=false;
    
    static int stateWORD[]=new int[6];
    
    static LogHandler log = new LogHandler();
    static Diagnostic DIAGNOSE =new Diagnostic();   
    static Configuration CNF = new Configuration();
    static DatabaseHandler DB = new DatabaseHandler();
    static StrageticData userData;
    
    
    public SPA() 
    { 
        //A. Initialize Variables
        userData=new StrageticData();        
        //userData.r.recordID=MAXRID;//-------------------------DELETE
        
        stateWORD[0]=0;
        stateWORD[1]=0;
        stateWORD[2]=0;
        stateWORD[3]=2;
        stateWORD[4]=0;
        stateWORD[5]=0;                
        
        
        //B. Initialize graphics
          //(1)Set defualt look n feel
          try{
              UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
          }catch(Exception e)
          {  System.out.println("Windows isn't available"); }
        
          initComponents();         
          
          this.setLocationRelativeTo(null);  //Open at center of screen
          
          //Adding Scrollbars
          Container c= getContentPane();        
          JScrollPane scroll = new JScrollPane(c );  
          setContentPane( scroll );
          
          
          //Set Maximum screen size
          /*
          this.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                // This is only called when the user releases the mouse button.
                Dimension d= getSize();
                if (d.width> 1042 || d.height> 720)
                     setSize(1042,720);
              }
          });
          */
          
          
        //C. Send Reference to all Panels
          panel_login.getReference(CNF);          
      
        
        //D. Hide all panels and their components
          hideAllPanels();
          
          
        //E. activate first panel 
          panelController(null, stateWORD);
          
        //GUI Update
          //bgImage.setSize(getSize());
          
          setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/salesPackage/Images/SPA_icon.png")));                 
          
          jTextArea1.setVisible(false);
      
        
        ///----DELETE          
        //tempBtn_save.setVisible(false); 
        //DB.dataSourceName="SalesToolDB";           

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        btn_abt = new javax.swing.JButton();
        jTextArea1 = new javax.swing.JTextArea();
        panelBubble = new salesPackage.PanelBubble();
        panelMascot = new salesPackage.PanelMascot();
        panel_login = new salesPackage.Panel_login();
        panel_Main_Menu = new salesPackage.Panel_Main_Menu();
        panelMineData = new salesPackage.PanelMineData();
        panelInbox = new salesPackage.PanelInbox();
        panel_Status = new salesPackage.Panel_Status();
        panel_Admin_Tool = new salesPackage.Panel_Admin_Tool();
        btn_back = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_cancel_add = new javax.swing.JButton();
        btn_process = new javax.swing.JButton();
        panelSet_Ques = new salesPackage.PanelSet_Ques();
        bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales Process Analyser");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setFocusCycleRoot(false);
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1042, 720));
        setMinimumSize(new java.awt.Dimension(580, 380));
        setPreferredSize(new java.awt.Dimension(1042, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closingSPA(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/UAE_Logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 10, 186, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/SPA_logo.png"))); // NOI18N
        logo.setText("jLabel1");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 8, 354, -1));

        btn_abt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/about_1.png"))); // NOI18N
        btn_abt.setBorderPainted(false);
        btn_abt.setContentAreaFilled(false);
        btn_abt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_abt.setFocusPainted(false);
        btn_abt.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/about_3.png"))); // NOI18N
        btn_abt.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/about_2.png"))); // NOI18N
        btn_abt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abtActionPerformed(evt);
            }
        });
        getContentPane().add(btn_abt, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 95, 91, 24));

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 153));
        jTextArea1.setRows(5);
        jTextArea1.setText("Based on Sales Analysis\nTechnique formulated by\nHarmeet Singh Bahra.");
        jTextArea1.setOpaque(false);
        getContentPane().add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 160, 60));
        getContentPane().add(panelBubble, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 455, -1, -1));
        getContentPane().add(panelMascot, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 540, -1, -1));
        getContentPane().add(panel_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 130, -1, -1));
        getContentPane().add(panel_Main_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 130, -1, -1));
        getContentPane().add(panelMineData, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 130, -1, -1));
        getContentPane().add(panelInbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 130, -1, -1));
        getContentPane().add(panel_Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        getContentPane().add(panel_Admin_Tool, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 130, -1, -1));

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/back_1.png"))); // NOI18N
        btn_back.setBorderPainted(false);
        btn_back.setContentAreaFilled(false);
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/back_4.png"))); // NOI18N
        btn_back.setEnabled(false);
        btn_back.setFocusPainted(false);
        btn_back.setPreferredSize(new java.awt.Dimension(90, 31));
        btn_back.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/back_3.png"))); // NOI18N
        btn_back.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/back_2.png"))); // NOI18N
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 628, -1, -1));

        btn_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/next_1.png"))); // NOI18N
        btn_next.setBorderPainted(false);
        btn_next.setContentAreaFilled(false);
        btn_next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_next.setFocusPainted(false);
        btn_next.setPreferredSize(new java.awt.Dimension(90, 31));
        btn_next.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/next_3.png"))); // NOI18N
        btn_next.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/next_2.png"))); // NOI18N
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });
        getContentPane().add(btn_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 628, -1, -1));

        btn_cancel_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/cancel_1.png"))); // NOI18N
        btn_cancel_add.setBorderPainted(false);
        btn_cancel_add.setContentAreaFilled(false);
        btn_cancel_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancel_add.setFocusPainted(false);
        btn_cancel_add.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/cancel_3.png"))); // NOI18N
        btn_cancel_add.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/cancel_2.png"))); // NOI18N
        btn_cancel_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 635, 76, 25));

        btn_process.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/genReport_1.png"))); // NOI18N
        btn_process.setBorderPainted(false);
        btn_process.setContentAreaFilled(false);
        btn_process.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_process.setFocusPainted(false);
        btn_process.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/genReport_3.png"))); // NOI18N
        btn_process.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/genReport_2.png"))); // NOI18N
        btn_process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_processActionPerformed(evt);
            }
        });
        getContentPane().add(btn_process, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 520, 270, 50));
        getContentPane().add(panelSet_Ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 130, -1, 540));

        bgImage.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/BG.jpg"))); // NOI18N
        bgImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bgImage.setMaximumSize(null);
        bgImage.setMinimumSize(new java.awt.Dimension(1024, 680));
        bgImage.setPreferredSize(new java.awt.Dimension(1024, 680));
        getContentPane().add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(panelSet_Ques.getLayout());    
                     
        System.out.println("DSN : "+DB.dataSourceName+"\n LoggedIn : "+loggedIn);
        
        int tmpRID=MAXRID;
        if(mine==true)
        { tmpRID=userData.r.recordID; }
        else
        { tmpRID=MAXRID+1; }
        if(getCurrentCard(panelSet_Ques).equals("phase1") && !panelSet_Ques.panelPhase1.assignAllData(userData.r,tmpRID))
        { return;   }
        
        if(getCurrentCard(panelSet_Ques).equals("phase2") && !panelSet_Ques.panelPhase2.assignAllData(userData.r))
        { return;   }
        else if(getCurrentCard(panelSet_Ques).equals("phase2"))
        { userData.processTableData();   
          userData.showData();
          panelSet_Ques.panelOutput_graph1.showOutput(userData);
        }
        
        if(getCurrentCard(panelSet_Ques).equals("phase3a") && !panelSet_Ques.panelPhase3a.assignAllData(userData.r))
        { return;   }
        
        if(getCurrentCard(panelSet_Ques).equals("phase3b") && !panelSet_Ques.panelPhase3b.assignAllData(userData.r))
        { return;   }
        
        if(getCurrentCard(panelSet_Ques).equals("phase3c") && !panelSet_Ques.panelPhase3c.assignAllData(userData.r))
        { return;   }
        
        if(getCurrentCard(panelSet_Ques).equals("phase4") && !panelSet_Ques.panelPhase4.assignAllData(userData.r))
        { return;   }
        
        if(getCurrentCard(panelSet_Ques).equals("phase4b") && !panelSet_Ques.panelPhase4b.assignAllData(userData.r))
        { return;   }
        
        if(getCurrentCard(panelSet_Ques).equals("phase4c") && !panelSet_Ques.panelPhase4c.assignAllData(userData.r))
        { return;   }
        
        if(getCurrentCard(panelSet_Ques).equals("phase4d") && !panelSet_Ques.panelPhase4d.assignAllData(userData.r))
        { return;   }
        
        if(getCurrentCard(panelSet_Ques).equals("phase4e") && !panelSet_Ques.panelPhase4e.assignAllData(userData.r))
        { return;   }
        
        if(getCurrentCard(panelSet_Ques).equals("phase5") && !panelSet_Ques.panelPhase5.assignAllData(userData.r))
        { return;   }                
        
        if(getCurrentCard(panelSet_Ques).equals("phase5b") && !panelSet_Ques.panelPhase5b.assignAllData(userData.r))
        { return;   }                
        
        if(getCurrentCard(panelSet_Ques).equals("phase5c") && !panelSet_Ques.panelPhase5c.assignAllData(userData.r))
        { return;   }                
        
        if(getCurrentCard(panelSet_Ques).equals("phase5d") && !panelSet_Ques.panelPhase5d.assignAllData(userData.r))
        { return;   }           
        
        /*
        if(getCurrentCard(panelSet_Ques).equals("output_graph1"))
        {
            btn_back.setVisible(true);
        }
        * 
        */


        cl.next(panelSet_Ques);
        System.out.println(getCurrentCard(panelSet_Ques));
        
        
        if(getCurrentCard(panelSet_Ques).equals("output_graph2"))
        {
            panelSet_Ques.panelOutput_graph2.showOutput(userData);
        } 
        
        if(getCurrentCard(panelSet_Ques).equals("save"))
        {
            panelSet_Ques.panel_Save.openPanel(DB,CNF,userData,panelSet_Ques);
            btn_next.setVisible(false);
            btn_back.setVisible(true);
        } 
        
        
         
        
       
        
        
        //----------To be deleted------------------
//        if(getCurrentCard(panelSet_Ques).equals("output_gen"))
//        { tempBtn_save.setVisible(true);  userData.showData(); }
        //-----------------------------------------
      
        //Button enable/disable
        if(getCurrentCard(panelSet_Ques).equals("phase2_0"))
        {
            btn_back.setEnabled(true);
        }
        if(getCurrentCard(panelSet_Ques).equals("output_gen"))
        {
            btn_next.setVisible(false);
            btn_process.setVisible(true);
        }        
              
        //userData.showData();
                        
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(panelSet_Ques.getLayout());               
        cl.previous(panelSet_Ques);
        

        if(getCurrentCard(panelSet_Ques).equals("output_gen"))
        {
            btn_next.setVisible(false);
            btn_process.setVisible(true);
        }         
        if(getCurrentCard(panelSet_Ques).equals("output_report"))
        {
            btn_next.setVisible(true);
            btn_back.setVisible(false);
            btn_process.setVisible(false);
        } 
        if(getCurrentCard(panelSet_Ques).equals("phase5d"))
        {
            btn_next.setVisible(true);
            btn_process.setVisible(false);
        } 
        if(getCurrentCard(panelSet_Ques).equals("phase1"))
        {
            btn_back.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_processActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_processActionPerformed
        // TODO add your handling code here:
        userData.processScores();
        
        CardLayout cl = (CardLayout)(panelSet_Ques.getLayout()); 
        cl.next(panelSet_Ques);
        SPA.panelController(null, new int[]{0,0,0,3,1,1});
        panelSet_Ques.panelOutput_report.openPanel(userData);
         
        
        btn_back.setVisible(false);
        btn_next.setVisible(true);
        btn_process.setVisible(false);
    }//GEN-LAST:event_btn_processActionPerformed

    private void btn_cancel_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancel_addActionPerformed
        // TODO add your handling code here:
        
        SPA.mine=false;
        panelSet_Ques.ResetAllPanels();
        CardLayout cl = (CardLayout)(panelSet_Ques.getLayout()); 
        cl.first(panelSet_Ques);
        btn_back.setEnabled(false);
        
        userData.ResetAllData();
        userData.showData();

        if(loggedIn==false)
        { SPA.panelController(null, new int[]{0, 0, 0, 2, 0, 0}); }
        else
        { SPA.panelController(null, new int[]{0, 0, 0, 3, 0, 0}); }

    }//GEN-LAST:event_btn_cancel_addActionPerformed

    private void closingSPA(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closingSPA
        // TODO add your handling code here:
        LogHandler log=new LogHandler();
        log.writeToLog(34);
        //System.out.println("Byeee");
    }//GEN-LAST:event_closingSPA

    private void btn_abtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abtActionPerformed
        // TODO add your handling code here:
        Dialog_About d=new Dialog_About(this, true);
        d.getData(CNF.firstName+" "+CNF.lastName, CNF.company);
        d.setVisible(true);
    }//GEN-LAST:event_btn_abtActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        
        //System.out.println("Resized to "+getSize());
        //bgImage.setSize(getSize());
        /*
        Dimension d= getSize();
        if (d.width> 1042 || d.height> 720)
        { setSize(1042,720); }
        
        //this.setLocationRelativeTo(null);
        * 
        */
        
    }//GEN-LAST:event_formComponentResized
    
    
    //---------------------------- MT METHOD -------------------------
    
    static void panelController(String m, int s[])
    {
        stateWORD[0]=s[0];
        stateWORD[1]=s[1];
        stateWORD[2]=s[2];
        stateWORD[3]=s[3];
        stateWORD[4]=s[4];
        stateWORD[5]=s[5];
        
        //set Visible current panel        
        setVisibleCurrentPanel();
                
        //update mascot
        panelMascot.changeImage();
        
        //update bubble Bubble
        if(stateWORD[0]==0)
        {
            panelBubble.setVisible(false);
        }
        else if(m!=null)
        { panelBubble.getState(m, s);       }
        
        System.out.println("State Word : "+stateWORD[0]+stateWORD[1]+stateWORD[2]+stateWORD[3]+stateWORD[4]+stateWORD[5]);
    }       
    
    private static void setVisibleCurrentPanel()
    {
        hideAllPanels();
        
        if(stateWORD[3]==2 && stateWORD[4]==0 && stateWORD[5]==0 )
        {
            if(stateWORD[0]==0 && stateWORD[1]==0 && stateWORD[2]==0 )
            {  log.writeToLog(16); }
            panel_login.setVisible(true); 
            btn_back.setEnabled(false);
        }
        else if(stateWORD[3]==3 && stateWORD[4]==0 && stateWORD[5]==0 )
        {
            panel_Main_Menu.openPanel();
            panel_Main_Menu.setVisible(true);            
        }
        else if( (stateWORD[3]==3 && stateWORD[4]==1 && stateWORD[5]==0 ) || (stateWORD[3]==3 && stateWORD[4]==1 && stateWORD[5]==1 ) || (stateWORD[3]==3 && stateWORD[4]==1 && stateWORD[5]==2 ))
        {               
            panelSet_Ques.setVisible(true);
            btn_back.setVisible(true);
            btn_next.setVisible(true);
            btn_cancel_add.setVisible(true);
        }
        else if(stateWORD[3]==3 && stateWORD[4]==2 && stateWORD[5]==0 )
        {   
            panelMineData.getReferences(DB);
            panelMineData.setVisible(true);
        }
        else if(stateWORD[3]==3 && stateWORD[4]==3 && stateWORD[5]==0 )
        {   
            panel_Status.openPanel(DIAGNOSE);
            panel_Status.setVisible(true);
        }
        else if(stateWORD[3]==3 && stateWORD[4]==4 && stateWORD[5]==0 )
        {   
            panel_Admin_Tool.openPanel(DB,CNF);
            panel_Admin_Tool.setVisible(true);
        }
        else if(stateWORD[3]==3 && stateWORD[4]==5 && stateWORD[5]==0 )
        {   
            panelInbox.getReference(DB);
            panelInbox.setVisible(true);
        }
    }
        
    private static void hideAllPanels()
    {
        //Login (200)
          panel_login.setVisible(false);
          
        //Main Menu (300)
          panel_Main_Menu.setVisible(false);
          
        //New Data (310)
          panelSet_Ques.setVisible(false);
          btn_back.setVisible(false);
          btn_next.setVisible(false);
          btn_cancel_add.setVisible(false);
          btn_process.setVisible(false); 
        
        //settings (330)
          panel_Status.setVisible(false);  
          
        //settings (340)
          panel_Admin_Tool.setVisible(false);
          
        //Mine Data (320)
          panelMineData.setVisible(false);
          
        //Inbox (350)
          panelInbox.setVisible(false);
          
        // others
          panelBubble.setVisible(false);
    }

    public String getCurrentCard(JPanel parent)
    {
         JPanel card = null;
         String name="";

         for (Component comp : parent.getComponents() ) 
         {
            if (comp.isVisible() == true) 
            {
                card = (JPanel)comp;
                name=card.getName();
                //System.out.println(card.getName() );
            }
         }   
    
         return(name);
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
            java.util.logging.Logger.getLogger(SPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SPA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SPA().setVisible(true);
            }
        });
     
    
        
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgImage;
    private javax.swing.JButton btn_abt;
    private static javax.swing.JButton btn_back;
    private static javax.swing.JButton btn_cancel_add;
    private static javax.swing.JButton btn_next;
    private static javax.swing.JButton btn_process;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel logo;
    public static salesPackage.PanelBubble panelBubble;
    private static salesPackage.PanelInbox panelInbox;
    private static salesPackage.PanelMascot panelMascot;
    private static salesPackage.PanelMineData panelMineData;
    public static salesPackage.PanelSet_Ques panelSet_Ques;
    private static salesPackage.Panel_Admin_Tool panel_Admin_Tool;
    private static salesPackage.Panel_Main_Menu panel_Main_Menu;
    private static salesPackage.Panel_Status panel_Status;
    private static salesPackage.Panel_login panel_login;
    // End of variables declaration//GEN-END:variables
}

