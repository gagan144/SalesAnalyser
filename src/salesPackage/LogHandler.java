package salesPackage;

import java.io.*;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class LogHandler 
{
    private String filePath="log.txt";
    private String s;
    private String n;
    private String field;
    private FileWriter fw;
    private PrintWriter pw;
    private FileReader fr;
    private BufferedReader br;
    private StringTokenizer st;
    
    private void setField(int no) throws Exception
    {
        switch(no)
        {
            case 11 : field ="<START>";   break;
            case 12 : field="<Loading>";    break;
            case 13 : field="<Registration>";    break;
            case 14 : field="<Diagnosis>";    break;
            case 15 : field="<Recovery>";    break;
            case 16 : field ="<Login>";   break;
            case 17 : field="<WriteDB>";    break;
            case 18 : field="<ReadDB>";    break;
            case 19 : field="<WriteVirDB>";    break;
            case 20 : field="<ReadVirDB>";    break;
            case 21 : field ="<GenPDF>";   break;
            case 22 : field="<UpdateSPAconfig>";    break;
            case 23 : field="<CreateBackup>";    break;
            case 24 : field="<RestoreFrmBackup>";    break;
            
                
            case 31 : field ="<Done>";   break;
            case 32 : field="<Aborted>";    break;
            case 33 : field="<Failed>";    break;
            case 34 : field="<STOP>";    break;
                
            default : { throw new Exception("Unknown Field!"); }
        }
    }
    //------------------------------------------
    
    private boolean resetLog(String name,int x)
    {
        FileInputStream fis; 
        int size;
        boolean b=true;
        
        if(x!=11)
        {  
            return(true);            
        }
        
        try{
             fis= new FileInputStream(name);
             size= fis.available();
             if(size>= 102400)
             {
                 b=false;
                 System.out.println("log reseted!");
             }
             fis.close();
        }catch(FileNotFoundException fnfe)
        { System.out.println(fnfe);  }        
        catch(IOException ioe)
        {  System.out.println(ioe);  }
        
        
        return(b);
    }
    //--------------------------------------------------
    
    void writeToLog(int x)
    {
        try{ 
            setField(x); 
        }catch(Exception e)
        { System.out.println(e); System.exit(0); return; }
        
        Calendar cal= Calendar.getInstance();
        int month= cal.get(Calendar.MONTH);
        int year= cal.get(Calendar.YEAR);
        int day= cal.get(Calendar.DAY_OF_MONTH);
        int hour= cal.get(Calendar.HOUR);
        int min= cal.get(Calendar.MINUTE);
        int sec= cal.get(Calendar.SECOND);
                
        s= day+"/"+(month+1)+"/"+year+","+hour+":"+min+":"+sec+"|"+field;
                
        try{            
            //check for writable
            File f=new File(filePath);
            if(f.canWrite()==false)
            { f.setWritable(true); }            
            
            fw= new FileWriter(filePath,resetLog(filePath,x));            
            pw= new PrintWriter(fw);
            pw.println(s);
            fw.close();
            pw.close();
        }catch(IOException oe)
        {
            System.out.println("Error writing to log File!");
        }
        
    }
    //----------------------------------------------------
    
    int checkLogFile()
    {
        String key=null,val=null;
        String lastK="",lastV="",tK="",tV="";
        try{
            fr= new FileReader(filePath);
            br= new BufferedReader(fr);
                        
            
            while((n=br.readLine())!= null)
            {
                st= new StringTokenizer(n,"|");
                            
                while(st.hasMoreTokens())
                {
                    tK= st.nextToken();
                    tV= st.nextToken();
                    
                                       
                    if(tV.equals("<START>"))
                    {  
                        lastK=key;
                        lastV=val;
                        //System.out.println("LAST KEY : "+lastV);
                    }
                    key=tK;
                    val=tV; 
                                       
                    
                    //System.out.println("date:"+key+"\nfield:"+val);
                    //System.out.println(key+" | "+val);
                }
            } 
            
        }catch(IOException ie)
        {
            System.out.println("Input Exception");
        }catch(NoSuchElementException no)
        {  
            System.out.println("incompatible File!"); 
            return(-1); 
        }
        
         finally
         {
            try{
            fr.close();
            br.close();
            }catch(IOException ie)
            {
                System.out.println("Error closing log file!");
            }
         }
          
        
        if(lastV!=null)
        {
            if (lastV.equals("<STOP>"))
                 return 34;
            else if (lastV.equals("<Done>"))
                 return 31;
            else if (lastV.equals("<Aborted>"))
                 return 32;
            else if (lastV.equals("<Failed>"))
                 return 33;
            else 
                return 0;    
        }else 
        {  return 34;    }
        
        /*
            if (lastV.equals("<STOP>"))
                 return 34;
            else if (lastV.equals("<Done>"))
                 return 31;
            else if (lastV.equals("<Aborted>"))
                 return 32;
            else if (lastV.equals("<Failed>"))
                 return 33;
            else 
                return 0;    
        */
        
    }
    
}
