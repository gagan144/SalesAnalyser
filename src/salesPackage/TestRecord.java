package salesPackage;

import java.io.File;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.StringTokenizer;



public class TestRecord 
{

    public TestRecord() 
    {
         try  { 
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } 
        catch (Exception e) {
            System.err.println(e);
        }
    }
    
    
    public static void main(String arg[]) throws SQLException
    {
        /*
        File f1=new File("Inbox1.bin");        
        
        
        StrageticData obj=new StrageticData();
        
        
        obj.initializeTempData();
        /*
        //obj.r.createInsertIntoQuery();
        //obj.showData();        
        //obj.processAllData();
        //System.out.println(obj.diag2b[2][3]);
        obj.r.clientName="gagandeep";
        obj.r.recordID=1223;
        obj.r.saveToVirtualDb(obj.r,f1);
        */
        
        //obj.r=obj.r.getFromVirtalDb(f1);                 
        //obj.showData();
        
        
        /*
        Record obj2=new Record();
        obj2=obj2.getFromVirtalDb(f1);        
        //System.out.println("**********"+obj2.recordID+"************");
        */
        
                
        
        
        //--------------database
        /*
        DatabaseHandler DB= new DatabaseHandler();        
        DB.dataSourceName="SalesToolDB";
        DB.conn=DriverManager.getConnection("jdbc:odbc:"+"SalesToolDB","","");
            System.out.println(DB.conn.getCatalog());
            DB.conn.close();
        
        
        //DB.dataSourceName="SalesToolDB";        
        //System.out.println(DB.checkConnection());
        //DB.createTable();  
        /*
        obj.ResetAllData();
        obj.r.recordID=100;
        obj.r.phase2a[0][0]=2012;
        obj.r.phase2a[1][0]=2011;
        obj.r.phase2a[2][0]=2010;        
        obj.r.phase2b[0][0]=2012;
        obj.r.phase2b[1][0]=2011;
        obj.r.phase2b[2][0]=2010;
        obj.showData();
        DB.insertInto(obj.r);
        //obj.r.recordID=204; DB.insertInto(obj.r);
        //obj.r=DB.mineDataFromDB(144);
        //obj.showData();
        //DB.deleteRecord(144);
        //Record r=null;
        //DB.updateRecord(r);
        
        
        //StrageticData o2=new StrageticData();
        //o2.r=DB.mineDataFromDB(900);
        //o2.showData();
        /*
        //System.out.println("****"+o2.r.email_off+"*****");
        
        if(o2.r.email_off.equals("null"))
        {
            o2.r.email_off="abcde@gmail.com";
        }
        o2.showData();
        */
        
        //o2.initializeTempData();
        //o2.showData();
        //DB.updateRecord(o2.r);
        
        ///-------------------------------------------------------
       
        
        Configuration cfg=new Configuration();
        
       //cfg.writeConfigFile();
        cfg.readConfigFile(false);
       System.out.println("Activation Date : "+cfg.loginPass);
        
       //System.out.println(cfg.loginPass);
       
       
        /*
    
       String p=System.getenv("windir");
       p+="\\SPAconfig.cfg";
       System.out.println(p);
       
       File f=new File(p);
       System.out.println(f.exists());
       f.delete();
       System.out.println(f.exists());
     
        /*
        Diagnostic d=new Diagnostic();
        d.identifyProblem();
       */ 
        
        //---------LOG ---------------------
       /*
        File f=new File("log.txt");        
        Calendar cal=Calendar.getInstance();
        cal.setTimeInMillis(f.lastModified());        
        int month= cal.get(Calendar.MONTH);
        int year= cal.get(Calendar.YEAR);
        int day= cal.get(Calendar.DAY_OF_MONTH);
        int hour= cal.get(Calendar.HOUR);
        int min= cal.get(Calendar.MINUTE);
        int sec= cal.get(Calendar.SECOND);
                
        System.out.println(day+"/"+(month+1)+"/"+year+","+hour+":"+min+":"+sec);
        
        
        LogHandler log =new LogHandler();
        //log.writeToLog(34);
        int number= log.checkLogFile();
        System.out.println(number);
              */
        
        
        //----------------CAlendar-------
            //Calendar todayDate= Calendar.getInstance();            
            //Calendar actvtnDate=Calendar.getInstance();
            /*
            StringTokenizer st=new StringTokenizer(cnf.activationDate, "/");
            int temp[]=new int[3];
            int i=0;
            while(st.hasMoreTokens())
            {
                temp[i]=Integer.parseInt(st.nextToken()); 
                System.out.print(temp[i]+" ");
                i++;
            }            
            actvtnDate.set(temp[2], temp[1], temp[0]);
            
            System.out.println("Todays date : "+actvtnDate.get(Calendar.DAY_OF_MONTH));
            System.out.println("Activation date : "+temp[0]+"/"+temp[1]+"/"+temp[2]);
            * 
          
            
            actvtnDate.set(2012, 3-1, 42);
            
            actvtnDate.set(2012, 0, 32);
            todayDate.set(2012, 0, 13);
            
            System.out.println(actvtnDate.compareTo(todayDate)+"    "+actvtnDate.get(Calendar.DAY_OF_MONTH));      //if >0 activn is after today
        */
        
            /*
            //----------DOUBle
            int n=80,d=100;
            double per;
            per=((double)n/d)*100;
            System.out.println(per);
            
            
            int x=0;
            double b=(double)x;
            if(b==0)
            { System.out.println("Zero"); }
            
            int x1=0,x2=0,y;
            y=x1/x2;
            System.out.println(y);
                   */
            
            //----Inbox
            
            //InboxHandler inbox =new InboxHandler();
            //inbox.scanFiles();
            //inbox.delRecord("inx.spa");
            /*
            StrageticData obj2=new StrageticData();
            //obj2.initializeTempData();
            //inbox.saveToInbox(obj2.r);            
            //obj2.r=inbox.getFromInbox("Inbox$2.spa");
            
            //readd all data
            String lst[]=inbox.getList();
            for(int i=0;i<lst.length;i++)
            {
                System.out.println("Reading..."+lst[i]);
              obj2.r=inbox.getFromInbox(lst[i]);    
            if(obj2.r!=null)
            { obj2.showData();      }
            
            }
           */
            
            //-------PDF 
            /*
            StrageticData obj3=new StrageticData();
            obj3.initializeTempData();
            PDFGenerator pdf=new PDFGenerator();
            pdf.generate(obj3, new File("E:\\SPA_PDF.pdf"));
            * 
            */
        
    }
    
    @Override
    protected void finalize()
    {
        //LogHandler log=new LogHandler();
        //log.writeToLog(34);
        System.out.println("Byeee");
    }
    
    
    
    
}
