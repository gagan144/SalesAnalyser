package salesPackage;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Calendar;
import java.util.Locale;
import java.util.StringTokenizer;

class OnlyExt implements FilenameFilter
{
    String e;
    
    public OnlyExt(String e)
    { this.e="."+e; }
    
    @Override
    public boolean accept(File dir, String name)
    {
        return name.endsWith(e);
    }
}

public class Diagnostic 
{
    int configFlag=1;
    int dbFlag=1;
    int logFlag=1;
    int backupFlag=0;
    int formateFlag=1;
    int virtualFlag=0;
    
    Configuration cnf=new Configuration();
    DatabaseHandler db=new DatabaseHandler();
    LogHandler log =new LogHandler();
    
    static boolean trial=true;
    
    void identifyProblem()
    {       
        
        
        log.writeToLog(14);
        //Check SPAconfig.cfg
        configFlag=cnf.readConfigFile(false);             SPALoader.bar(9);
        
        
        if(configFlag==-1 || configFlag==0)
        {  dbFlag=0;  }        
        else
        {   
            if(chk_serialKey()==false)
            { 
               Dialog_reg_child d=new Dialog_reg_child(null, true);
               d.getMessage("Invalid or Obsolete Serial Key!\nPlease register again!", 0);
               d.setVisible(true);
               configFlag=-1; 
            }
            SPALoader.lbl_name.setText(cnf.firstName+" "+cnf.lastName);
            SPALoader.lbl_cmp.setText(cnf.company);
            
            //Check Database
            db.dataSourceName=cnf.dataSourceName;
            System.out.println("Max curr record in config file : "+cnf.currMaxRID);
            dbFlag=db.checkConnection();            SPALoader.bar(16);
            
        }
        
        //Check Log file
        logFlag=log.checkLogFile();            
        SPALoader.bar(23);
        
        //Check Backup Database
        File file=new File("Data\\Backup\\backup.xls");
        if(file.exists())
        {  backupFlag=1;  }
        else
        {  backupFlag=0;  }                         SPALoader.bar(30);
        
        //Check format file
        file=new File("Data\\format.xls");
        if(file.exists())
        {  formateFlag=1;  }
        else
        {  formateFlag=0;  }                        SPALoader.bar(37);
        
        
        //Ckeck virtual Data
        file=new File("Data\\VDB");
                
        FilenameFilter only= new OnlyExt("spa");
        String list[]=file.list(only);
        
        if(list!=null && list.length>=1)
        {   virtualFlag=list.length;  }
        else
        {   virtualFlag=0;  }                       SPALoader.bar(44);
        
        log.writeToLog(31);
        
        /*
        if( (configFlag==1 || configFlag==0) && (dbFlag<1 || logFlag!=34 || formateFlag!=1))
        { Dialog_diagnosResult d =new Dialog_diagnosResult(null, true);
          d.getStates(this);
          d.setVisible(true);
        }
        */
        showFlags();
    }
    
    boolean chk_serialKey()
    {
        //System.out.println(cnf.activationCode[0]+"-"+cnf.activationCode[1]+"-"+cnf.activationCode[2]+"-"+cnf.activationCode[3]);
        
        
        if(cnf.activationCode[0]==9553 && cnf.activationCode[1]==8011 && cnf.activationCode[2]==7591 && cnf.activationCode[3]==9717)
        {
            return(true);
        }else if(cnf.activationCode[0]==5112 && cnf.activationCode[1]==1801 && cnf.activationCode[2]==7591 && cnf.activationCode[3]==9350)
        {
            return(true);
        }else if(cnf.activationCode[0]==4949 && cnf.activationCode[1]==3091 && cnf.activationCode[2]==7591 && cnf.activationCode[3]==9910)
        {
            return(true);
        }else if(cnf.activationCode[0]==4546 && cnf.activationCode[1]==4011 && cnf.activationCode[2]==7591 && cnf.activationCode[3]==2913)
        {   
            Calendar todayDate= Calendar.getInstance();            
            Calendar actvtnDate=Calendar.getInstance();
            StringTokenizer st=new StringTokenizer(cnf.activationDate, "/");
            int temp[]=new int[3];
            int i=0;
            while(st.hasMoreTokens())
            {
                temp[i]=Integer.parseInt(st.nextToken()); 
                //System.out.print(temp[i]+" ");
                i++;
            }            
            actvtnDate.set(temp[2], temp[1]-1, temp[0]);            
                        
            if(actvtnDate.compareTo(todayDate)<0)
            {             
                trial=false;
                return(false);
            } 
            
            return(true);
        }else if(cnf.activationCode[0]==6511 && cnf.activationCode[1]==5201 && cnf.activationCode[2]==7591 && cnf.activationCode[3]==9113)
        {               
            
            
            return(true);
        }
        else
        {            
            return(false);
        }
               
               
    }
    
    void resolveProblems()
    {
        log.writeToLog(15);        
        
        if(configFlag==0 || configFlag==-1)
        {
            Dialog_Registration d_reg =new Dialog_Registration(null, true);
            //d_reg.panel_GettingStarted1.getReferences(db, cnf);
            //d_reg.panel_GettingStarted1.getReferences(new DatabaseHandler(), new Configuration());
            d_reg.setVisible(true);
            
        }
        
        log.writeToLog(31);
    }
    
    
    //-----------TO BE DELETED------------------
    void showFlags()
    {
        System.out.println("configFlag : "+configFlag);
        System.out.println("dbFlag : "+dbFlag);
        System.out.println("logFlag : "+logFlag);
        System.out.println("backupFlag : "+backupFlag);
        System.out.println("formatFlag : "+formateFlag);
        System.out.println("virtualFlag : "+virtualFlag);
    }
            
    
}
