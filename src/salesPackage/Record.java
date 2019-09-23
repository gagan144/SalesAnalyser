package salesPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;


public class Record implements Serializable
{
   //------Inputs---------------------
    int recordID;
    String clientName;    
    String cmpName;
    String desig;
    String product;
    long phNo;
    String date;
    
    int phase2a[][]=new int[3][5];
    int phase2b[][]=new int[3][5];
    
    int phase3[]=new int[3];
    int phase4[]=new int[5];
    int phase5[]=new int[4];               
    
    String address;
    long mobileNo;
    long faxNo;
    String email_off;
    String email_per;
    
   //------------Methods---------------- 

    public Record() 
    {
        //setDate
        setDate();
    }
    
    void setDate()
    {
        Calendar cal= Calendar.getInstance();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);        
        //System.out.println(day+"/"+(month + 1)+"/"+year);
        date=day+"/"+(month + 1)+"/"+year;
    }
    
    
    boolean checkAllData()
    {        
                        
        for(int i=0;i<3;i++)
        {
            if( phase3[i]==0 )
            { return(false); }
        }
        
        for(int i=0;i<5;i++)
        {
            if( phase4[i]==0 )
            { return(false); }
        }
        
        for(int i=0;i<4;i++)
        {
            if( phase5[i]==0 )
            { return(false); }
        }
        
        return(true);
    }  
    
       
    void saveToVirtualDb(Record r,File f)
    {
        LogHandler log=new LogHandler();
        
        Record ref=r;
        ref.recordID=0;
        try
        {
            log.writeToLog(19);
            //FileOutputStream fout = new FileOutputStream("VirtualDB.bin");
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(r);            
            oos.close();
            log.writeToLog(31);
        }catch(Exception e)
        {  System.out.println("ERROR! cannot write to file :\n"+e);           
           log.writeToLog(33);
        }
                
    }
    
    Record getFromVirtalDb(File f)
    {
        LogHandler log=new LogHandler();
        
        Record ref = null;
        try
        {
            log.writeToLog(20);
            FileInputStream fin = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fin);
            ref=(Record)ois.readObject();            
            ois.close();
            log.writeToLog(31);
            
        }catch(Exception e)
        {  
            log.writeToLog(33);
            System.out.println("ERROR! cannot read file :\n"+e);           
        }
        return(ref);
    }
    
    
    String[] createInsertIntoQuery()
    {
        String qry[]=new String[7];
        
        qry[0]="insert into [Data$] values ("+recordID+",'"+clientName+"','"+address+"','"+cmpName+"','"+desig+"','"+product+"',"+phNo+","+mobileNo+","+faxNo+",'"+email_off+"','"+email_per+"','"+date+"',"+phase3[0]+","+phase3[1]+","+phase3[2]+","+phase4[0]+","+phase4[1]+","+phase4[2]+","+phase4[3]+","+phase4[4]+","+phase5[0]+","+phase5[1]+","+phase5[2]+","+phase5[3]+")";
//        System.out.println("************"+qry[0]);
        //qry[0]="insert into [PerInfo$] values ("+recordID+",'"+clientName+"','"+cmpName+"','"+desig+"','"+product+"',"+phNo+",'"+date+"',"+phase3[0]+","+ +")";
        for(int i=0;i<3;i++)            
        { qry[i+1]="insert into [SaleProd$] values ("+recordID+","+phase2a[i][0]+","+phase2a[i][1]+","+phase2a[i][2]+","+phase2a[i][3]+","+phase2a[i][4]+")";   }
        
        for(int i=0;i<3;i++)            
        { qry[i+4]="insert into [SalePipeH$] values ("+recordID+","+phase2b[i][0]+","+phase2b[i][1]+","+phase2b[i][2]+","+phase2b[i][3]+","+phase2b[i][4]+")";   }
        
        
        return(qry);
    }
        
}
