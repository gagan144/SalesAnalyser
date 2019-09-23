package salesPackage;

public class PanelOutput_report extends javax.swing.JPanel {
    
    
    public PanelOutput_report() {
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

        noAtt_Leads = new javax.swing.JLabel();
        noAtt_Sales = new javax.swing.JLabel();
        textA_prosp = new javax.swing.JTextArea();
        textA_lead = new javax.swing.JTextArea();
        textA_sales = new javax.swing.JTextArea();
        lbl_score = new javax.swing.JLabel();
        allImages = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(900, 460));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(900, 540));
        setLayout(null);

        noAtt_Leads.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/no_attention.png"))); // NOI18N
        add(noAtt_Leads);
        noAtt_Leads.setBounds(326, 250, 247, 35);

        noAtt_Sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/no_attention.png"))); // NOI18N
        add(noAtt_Sales);
        noAtt_Sales.setBounds(326, 380, 247, 35);

        textA_prosp.setColumns(20);
        textA_prosp.setEditable(false);
        textA_prosp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textA_prosp.setRows(5);
        textA_prosp.setText("• You need a dedicated data mining process to supply qualified accounts for sales enablement. We can help you with the same.\n• You need to have a precise qualifying account definition for enabling sales.\n• We strongly recommend that you should convert your sales presentations addressing the Strategic, Technical and Economic aspects, separately.");
        textA_prosp.setOpaque(false);
        add(textA_prosp);
        textA_prosp.setBounds(46, 110, 807, 50);

        textA_lead.setColumns(20);
        textA_lead.setEditable(false);
        textA_lead.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textA_lead.setRows(5);
        textA_lead.setText("• You need a dedicated data mining process to supply qualified accounts for sales enablement. We can help you with the same.\n• You need to have a precise qualifying account definition for enabling sales.\n• We strongly recommend that you should convert your sales presentations addressing the Strategic, Technical and Economic aspects, separately.\n• You need to study the profile of each account and draw an annual sales strategy plan to engage with these accounts.\n• We strongly recommend that you should convert your sales presentations addressing the Strategic, Technical and Economic aspects, separately.");
        textA_lead.setOpaque(false);
        add(textA_lead);
        textA_lead.setBounds(46, 230, 807, 79);

        textA_sales.setColumns(20);
        textA_sales.setEditable(false);
        textA_sales.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textA_sales.setRows(5);
        textA_sales.setText("• You need a dedicated data mining process to supply qualified accounts for sales enablement. We can help you with the same.\n• You need to have a precise qualifying account definition for enabling sales.\n• We strongly recommend that you should convert your sales presentations addressing the Strategic, Technical and Economic aspects, separately.\n• You need to study the profile of each account and draw an annual sales strategy plan to engage with these accounts.");
        textA_sales.setOpaque(false);
        add(textA_sales);
        textA_sales.setBounds(46, 368, 807, 65);

        lbl_score.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lbl_score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_score.setText("100");
        add(lbl_score);
        lbl_score.setBounds(708, 490, 50, 15);

        allImages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/reprt_bg.png"))); // NOI18N
        add(allImages);
        allImages.setBounds(0, 0, 900, 540);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salesPackage/Images/panel_bg_trans.png"))); // NOI18N
        bg.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        add(bg);
        bg.setBounds(0, 0, 900, 540);
    }// </editor-fold>//GEN-END:initComponents
 
   
    void openPanel(StrageticData sdata)
    {
        lbl_score.setText(String.valueOf(sdata.totalScore)); 
        displaycomments(sdata);
    }
    
    private void displaycomments(StrageticData sd)
    {
        boolean disp=false;
        String prospects="",leads="",sales="";
        
        
        //PROSPECTS
        if(sd.r.phase3[0]==1 || sd.r.phase3[0]==2)
        { prospects+="• You may wish to discuss with us the data mining process to check if there are areas for improvement."; }
        else
        { prospects+="• You need a dedicated data mining process to supply qualified accounts for sales enablement. We can help you with the same."; }
        
        if(sd.r.phase3[1]==1)
        { prospects+="\n• You may wish to discuss with us the definition of qualified accounts and seek expertise opinion is improving the definition."; }
        else
        { prospects+="\n• You need to have a precise qualifying account definition for enabling sales."; }
        
        if(sd.r.phase3[2]==3 || sd.r.phase3[2]==4 )
        { prospects+="\n• You need to study the profile of each account and draw an annual sales strategy plan to engage with these accounts."; }
        
        textA_prosp.setText(prospects);
        //System.out.println(prospects);
        
        //LEADS
        if(sd.r.phase4[0]>=3)
        { leads+="• You need to have STE calling scripts with a dedicated inside sales team to generate qualified leads.\n"; }
                
        if(sd.r.phase4[1]>=3)
        { leads+="• We recommend you to have a trained inside sale team that has a forward looking RTC Calendar in place to generate qualified leads.\n"; }
        
        
        if(sd.r.phase4[2]>=2)
        { leads+="• We strongly recommend you to have regular EDM/DM communication for customer activation.\n"; }
        
        if(sd.r.phase4[3]==3)
        { leads+="• Your sales team needs to send the EDMs to the customers and then engage with them in discussions.\n"; }
        
        if(sd.r.phase4[4]>=3)
        { leads+="• The 6 aspects need to be answered else they will come up as sales objections at the time of closure."; }
        
        if(leads.equals(""))
        { 
            //System.out.println("No Attention Required!"); 
            noAtt_Leads.setVisible(true);
            textA_lead.setVisible(false);
        }
        else
        { //System.out.println("\nLEADS\n"+leads); 
            noAtt_Leads.setVisible(false);
            textA_lead.setVisible(true);
            textA_lead.setText(leads);
        }
        
        
        //SALES
        if(sd.r.phase5[0]>=3)
        { sales+="• We strongly recommend that you should convert your sales presentations addressing the Strategic, Technical and Economic aspects, separately.\n"; }
                
        if(sd.r.phase5[1]>=2)
        { sales+="• We strongly recommend you to have a sales query form that covers all aspects of Strategic, Technical and Economic Buying.\n"; }
        
        if(sd.r.phase5[2]==2)
        { sales+="• We strongly recommend that sales forecasting should be done through STE qualification success rate.\n"; }
        
        if(sd.r.phase5[3]>=2)
        { sales+="• You need to use the CRM tool aggressively to manage sales and sales projections.\n"; }
        
        
        if(sales.equals(""))
        { 
            //System.out.println("No Attention Required!"); 
            noAtt_Sales.setVisible(true);
            textA_sales.setVisible(false);
        }
        else
        { 
            //System.out.println("\nsales\n"+sales); 
            noAtt_Sales.setVisible(false);
            textA_sales.setVisible(true);
            textA_sales.setText(sales);
        }
            
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allImages;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel lbl_score;
    private javax.swing.JLabel noAtt_Leads;
    private javax.swing.JLabel noAtt_Sales;
    private javax.swing.JTextArea textA_lead;
    private javax.swing.JTextArea textA_prosp;
    private javax.swing.JTextArea textA_sales;
    // End of variables declaration//GEN-END:variables
}