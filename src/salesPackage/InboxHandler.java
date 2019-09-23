package salesPackage;

import java.io.*;
import java.util.StringTokenizer;

public class InboxHandler 
{
    
    int NoOfRecords;
    private int currMaxNo;
    private String list[];
    File dirPath=new File("Data\\VDB");
    
    void scanFiles()
    {
                   
        //Make directories if not present
        if(dirPath.exists()==false)
        {        
                dirPath.mkdirs();
        }
                
        //San all bin files
        FilenameFilter only= new OnlyExt("spa");
        list=dirPath.list(only);
        
        //get total no of records
        if(list!=null && list.length>=1)
        {   NoOfRecords=list.length; }
        else
        {   NoOfRecords=0;  }          
        
        
        //get maxNO
        if(NoOfRecords!=0)
        {   
            currMaxNo=0;        
            
            StringTokenizer st;
            String name=null,num=null,ext=null;
            int tmp;
            
            for(int i=0;i<list.length;i++)
            {
                st=new StringTokenizer(list[i],"$.");            
                
                while(st.hasMoreTokens())
                {
                    name=st.nextToken();
                    num=st.nextToken();
                    ext=st.nextToken();
                    //System.out.println(name+" "+num+" "+ext);                    
                }
                
                try{
                    tmp=Integer.parseInt(num);
                }catch(NumberFormatException e)
                {  tmp=0; }
                
                if(tmp>currMaxNo)                
                { currMaxNo=tmp; }
            }
            
            //System.out.println("Maximum no : "+currMaxNo);
        } 
        
        
        
        //-----------------------------------
        
        /*
        System.out.println(NoOfRecords);
        
        for(int i=0;i<list.length;i++)
        {  System.out.println(list[i]); }       
        */
        
    }
    
    String[] getList()
    {
        scanFiles();
        return(list);
    }
    
    void saveToInbox(Record r)
    {
        scanFiles();
        String fName="Inbox$"+(currMaxNo+1)+".spa";
        File saveFile=new File(dirPath,fName);
        
        LogHandler log=new LogHandler();       
                
        Record ref=r;
        ref.recordID=0;
        try
        {
            log.writeToLog(19);            
            FileOutputStream fout = new FileOutputStream(saveFile);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(r);            
            oos.close();
            log.writeToLog(31);
            fout.close();
            
        }catch(Exception e)
        {  System.out.println("ERROR! cannot write to file :\n"+e);           
           log.writeToLog(33);
        }                
    }
    
    
    Record getFromInbox(String fN)
    {
        File readFile=new File(dirPath,fN);
        FileInputStream fin=null;
        ObjectInputStream ois=null;
        
        LogHandler log=new LogHandler();
        boolean del=false;
        
        Record ref = null;
        try
        {
            log.writeToLog(20);
            fin = new FileInputStream(readFile);            
            ois = new ObjectInputStream(fin);
            ref=(Record)ois.readObject();                        
            log.writeToLog(31);
            
            
        }catch(Exception e)
        {  
            log.writeToLog(33);
            System.out.println("ERROR! cannot read file :\n"+e);                       
            del=true;
        }finally
        {
            try
            {                
                fin.close();         
            }catch(Exception e)
            { System.out.println("Error Closing streams"); }
            
        }
        
               
        if(del==true)
        {
            readFile.delete();
            System.out.println("File dleted");
            return(null);
        }
        
        
        return(ref);
    }
    
    boolean delRecord(String fN)
    {
        boolean done;
        File readFile=new File(dirPath,fN);
        done=readFile.delete();        
        return(done);
    }
    
}

