package salesPackage;

import java.io.*;
import java.util.Calendar;

public class Configuration implements Serializable
{    
    
    String firstName;
    String lastName;
    String email;
    long phno;
    String country;
    String company;
    String add;
    String city;
    String state;
    int zipCode;
    
    int activationCode[]=new int[4];
    String activationDate;
    
    String dataSourceName;
    String databaseFilePath;
    String lastBackupDate;
    
    String loginPass;
    
    int errorState;
    int prgCounter;
    int currMaxRID;
    int logStatus;
    boolean badUser; 
    
    //--------METHODS-----------------
    void setDate()
    {
        Calendar cal= Calendar.getInstance();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);                
        activationDate=day+"/"+(month + 1)+"/"+year;
    }
    
    void setBackUpDate()
    {
        Calendar cal= Calendar.getInstance();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);                
        lastBackupDate=day+"/"+(month + 1)+"/"+year;
    }
    
        
    int readConfigFile(boolean dispDiag)
    {        
        String winPath=System.getenv("windir");
        Configuration ref=null;
        
        FileInputStream fin=null;    
        
        try
        {
            fin = new FileInputStream(winPath+"\\SPAconfig.cfg");
            ObjectInputStream ois = new ObjectInputStream(fin);
            ref=(Configuration)ois.readObject();              
            
            firstName=ref.firstName;
            lastName=ref.lastName;
            email=ref.email;
            phno=ref.phno;
            country=ref.country;
            company=ref.company;
            add=ref.add;
            city=ref.city;
            state=ref.state;
            zipCode=ref.zipCode;
            
            for(int i=0;i<4;i++)
            { activationCode[i]=ref.activationCode[i]; }
            activationDate=ref.activationDate;
            
            dataSourceName=ref.dataSourceName;
            databaseFilePath=ref.databaseFilePath;
            lastBackupDate=ref.lastBackupDate;
            
            loginPass=ref.loginPass;
            
            errorState=ref.errorState;
            prgCounter=ref.prgCounter;
            currMaxRID=ref.currMaxRID;
            logStatus=ref.logStatus;
            badUser=ref.badUser;                        
            
                        
        }catch(FileNotFoundException e)
        { 
           //System.out.println("File Not Found!");
           if(dispDiag==true)
           {  Dialog_reg_child d=new Dialog_reg_child(null, true);
              d.getMessage("Registry not Found!\nPlease restart the application!",-1);
              d.setVisible(true); 
           }
           return(-1);
        }
        catch(Exception e)
        {  
            //System.out.println("ERROR! cannot read config file :\n"+e);   
            if(dispDiag==true)
            {  Dialog_reg_child d=new Dialog_reg_child(null, true); 
               d.getMessage("Error reading registry!\nPlease restart the application!",-1);
               d.setVisible(true);            
            }
            return(0);
        }finally{
             try{ fin.close();}
             catch(Exception e)
             { System.out.println("Error Closing File"); }
         }
        
        return(1);
        
        
        
    }
    
    void writeConfigFile()
    {      
        String winPath=System.getenv("windir");        
        
        Configuration ref=new Configuration();
            ref.firstName=firstName;
            ref.lastName=lastName;
            ref.email=email;
            ref.phno=phno;
            ref.country=country;
            ref.company=company;
            ref.add=add;
            ref.city=city;
            ref.state=state;
            ref.zipCode=zipCode;
            
            for(int i=0;i<4;i++)
            { ref.activationCode[i]=activationCode[i]; }
            ref.activationDate=activationDate;
            
            ref.dataSourceName=dataSourceName;
            ref.databaseFilePath=databaseFilePath;
            ref.lastBackupDate=lastBackupDate;
            
            ref.loginPass=loginPass;
            
            ref.errorState=errorState;
            ref.prgCounter=prgCounter;
            ref.currMaxRID=currMaxRID;
            ref.logStatus=logStatus;
            ref.badUser=badUser;          
        
        try
        {        
            FileOutputStream fout = new FileOutputStream(winPath+"\\SPAconfig.cfg");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(ref);
            fout.close();
        }catch(Exception e)
        {  
            //System.out.println("ERROR! cannot write to config file :\n"+e);           
            Dialog_reg_child d=new Dialog_reg_child(null, true);
            d.getMessage("An error occured while registering!\nPlease make sure you are logged\nin as an administrator!",-1);
            d.setVisible(true);
        }
                
    } 
    
    
}
