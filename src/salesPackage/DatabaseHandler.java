package salesPackage;

import java.io.File;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class DatabaseHandler 
{
    LogHandler log = new LogHandler();
    
    String dataSourceName;   //="SalesToolDB";     
    //String dataSourceName="excedsgdsl";
    String workBook="";
    
    Connection conn=null;
    Statement stmt=null;
    String sql="";
    ResultSet rs=null;
        
    static 
    {
        try  
        { 
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }catch (Exception e) 
        { System.out.println("ERROR! Cannot Load jdbcOdbc Driver!\n"+e);  }        
    }
    
    
    boolean checkReadOnly(boolean dispMsg)
    {
        boolean read;
        try
        {
            conn=DriverManager.getConnection("jdbc:odbc:"+dataSourceName,"","");
            read=conn.isReadOnly();
            if(read==true && dispMsg==true)
            { 
                Dialog_ErrorHandler derr=new Dialog_ErrorHandler(null, true);
                derr.recieveInfo("The Database is set 'Read Only'.", new int[]{2,0,6,0,0,0});
                derr.setVisible(true);                
            }
            conn.close();
        }catch(Exception e)
        { 
            System.out.println(e.getMessage());
            return(false);
        }   
        
        return(read);        
    }
        
       
    int checkConnection()
    {
        
        int RIDmax=99;
        
        String filePath="";
        try
        {
            conn=DriverManager.getConnection("jdbc:odbc:"+dataSourceName,"","");            
            conn.close();
        }catch(Exception e)
        { 
            //System.out.println("0"+e.getMessage());
            return(0);
        }
            
        
        try
        {
            conn=DriverManager.getConnection("jdbc:odbc:"+dataSourceName,"","");
            filePath=conn.getCatalog();
            conn.close();
        
            filePath+=".xls";            
            File f=new File(filePath);
            if(f.exists()==false)
            {
                throw new Exception("Not a Valid Workbook!");
            }
            workBook=filePath;
                       
            
            //Check for readOnly
            //checkReadOnly(true);
            
            
            //Check Data Consistency and Get Max RID
            conn=DriverManager.getConnection("jdbc:odbc:"+dataSourceName,"","");
            stmt=conn.createStatement();            
            //----------------------------------
            
            int tmp,count=0;
            //Read Data            
            sql="select * from [Data$]";
            rs=stmt.executeQuery(sql);
                        
            while(rs.next())
            {     
                tmp=rs.getInt("RECORD_ID");
                if(tmp==0)
                { throw new Exception("Incompatible File!"); }
                if(tmp>RIDmax)
                {  RIDmax=tmp; }                
            } 
            
            //Read SaleProd            
            int tmp2=0;
            sql="select * from [SaleProd$]";
            rs=stmt.executeQuery(sql);
                   
            count=0;
            while(rs.next())
            {     
                tmp=rs.getInt("RID");
                count++;
                
                if(count==1 || count==4)
                { count=1; tmp2=tmp; }
                else if(tmp==0)
                { throw new Exception("Incompatible File!"); } 
                else if(count<=3 && tmp!=tmp2)
                { throw new Exception("Incompatible File!"); }    
                else if(tmp>RIDmax)
                {  RIDmax=tmp; }                
            } 
            
            //Read SalePipeH            
            tmp2=0; count=0;
            sql="select * from [SalePipeH$]";
            rs=stmt.executeQuery(sql);
                        
            while(rs.next())
            {     
                tmp=rs.getInt("R_ID");
                count++;
                
                if(count==1 || count==4)
                { count=1; tmp2=tmp; }
                else if(tmp==0)
                { throw new Exception("Incompatible File!"); } 
                else if(count<=3 && tmp!=tmp2)
                { throw new Exception("Incompatible File!"); }    
                else if(tmp>RIDmax)
                {  RIDmax=tmp; }    
                
                if(tmp==0)
                { throw new Exception("Incompatible File!"); }
                if(tmp>RIDmax)
                {  RIDmax=tmp; }                
            } 
            
            //System.out.println(RIDmax);  //Send it
            
            
         }catch(Exception e)
        { 
            System.out.println(e.getMessage());
            return(-1);
        }   
        
        //-------------------------------------------
        finally 
        {
            try{
                //rs.close();
                //stmt.close();
                conn.close();
                rs=null;
                stmt=null;
                conn=null; 
            }catch(Exception e)
            { System.out.println("ERROR! Closing connections!\n"+e); }
        }
        
        return(RIDmax);        
        
    }
    
    void createTable()
    {
        
        try
        {
            conn=DriverManager.getConnection("jdbc:odbc:"+dataSourceName,"","");
            stmt=conn.createStatement(); 
            //----------------------------------
            
            
            //(1) Create table Data
            sql="create table Data (RECORD_ID integer, CLIENT_NAME varchar(30), ADDRESS varchar(30), CMP_NAME varchar(30), DESIG varchar(30), PRODUCT varchar(30), PHONE_NO integer, MOBILE_NO integer, FAX_NO integer, EMAIL_OFF varchar(50), EMAIL_PER varchar(50), R_DATE varchar(10), QUES3_1 integer, QUES3_2 integer, QUES3_3 integer, QUES4_1 integer, QUES4_2 integer, QUES4_3 integer, QUES4_4 integer, QUES4_5 integer, QUES5_1 integer, QUES5_2 integer, QUES5_3 integer, QUES5_4 integer)";
            stmt.executeUpdate(sql);    
                        
            sql="insert into [Data$] values (null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null)";
            stmt.executeUpdate(sql);             
            sql="select * from [Data$]";
            rs=stmt.executeQuery(sql);

            
            //(2) create Table SaleProd
            sql="create table SaleProd (RID integer, YEAR integer, EXP_NO_CL integer, ACT_NO_CL integer, EXP_SL_REV integer, ACT_SL_REV integer)";
            stmt.executeUpdate(sql);    
            
            
            sql="insert into [SaleProd$] values (null,null,null,null,null,null)";
            stmt.executeUpdate(sql); 
            sql="select * from [SaleProd$]";
            rs=stmt.executeQuery(sql);
            
            //(3) create Table SalePipeH
            sql="create table SalePipeH (R_ID integer, YR integer, CT integer, PROSPECTS integer, LEADS integer, SALES integer)";
            stmt.executeUpdate(sql);    
            
            
            sql="insert into [SalePipeH$] values (null,null,null,null,null,null)";
            stmt.executeUpdate(sql); 
            sql="select * from [SalePipeH$]";
            rs=stmt.executeQuery(sql);
                        
                                       
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        //-------------------------------------------
        finally 
        {
            try{
                rs.close();
                stmt.close();
                conn.close();
                rs=null;
                stmt=null;
                conn=null; 
            }catch(Exception e)
            { System.out.println("ERROR! Closing connections!\n"+e); }
        }
        
    }
    
    void insertInto(Record r)
    {
        String sql_arr[]=new String[7];
        
        try
        {
            conn=DriverManager.getConnection("jdbc:odbc:"+dataSourceName,"","");
            stmt=conn.createStatement();    
            log.writeToLog(17);
            //----------------------------------
            
            sql_arr=r.createInsertIntoQuery();
            
            //-----PROBLEM AREA
            
            //(1) Insert into Data
            sql=sql_arr[0];            
            stmt.executeUpdate(sql);    
            
            sql="select * from [Data$]";
            rs=stmt.executeQuery(sql);
            
            //(2) Insert into SaleProd
            for(int i=0;i<3;i++)
            {
                sql=sql_arr[i+1];
                stmt.executeUpdate(sql);    
            }           
           
            sql="select * from [SaleProd$]";
            rs=stmt.executeQuery(sql);
            
            //(3) Insert into SalePipeH
            for(int i=0;i<3;i++)
            {
                sql=sql_arr[i+4];
                stmt.executeUpdate(sql);    
            }           
           
            sql="select * from [SalePipeH$]";
            rs=stmt.executeQuery(sql);
            
            
            
        }catch(Exception e)
        {   log.writeToLog(33); 
            System.out.println("ERROR! Cannot Insert data!\n"+e);   
            SPA.panelController("Database connectivity Error!", new int[]{1,0,3,0,0,0}); 
        }
        
        //-------------------------------------------
        finally 
        {
            try{
                rs.close();
                stmt.close();
                conn.close();
                rs=null;
                stmt=null;
                conn=null; 
                log.writeToLog(31);
            }catch(Exception e)
            { System.out.println("ERROR! Closing connections!\n"+e); }
        }
    }
    
    
    Record mineDataFromDB(int rid)
    {
        Record r=new Record();
        try
        {
            conn=DriverManager.getConnection("jdbc:odbc:"+dataSourceName,"","");
            stmt=conn.createStatement();   
            log.writeToLog(18);
            //----------------------------------
            
            //Read Data
            sql="select * from [Data$] where RECORD_ID="+rid;
            rs=stmt.executeQuery(sql);
            
            //transfer to class          
            while(rs.next())
            {     
                r.recordID=rs.getInt("RECORD_ID");                
                r.clientName=rs.getString("CLIENT_NAME");
                r.address=rs.getString("ADDRESS");
                r.cmpName=rs.getString("CMP_NAME");
                r.desig=rs.getString("DESIG");
                r.product=rs.getString("PRODUCT");
                r.phNo=rs.getLong("PHONE_NO");
                r.mobileNo=rs.getLong("MOBILE_NO");
                r.faxNo=rs.getLong("FAX_NO");
                r.email_off=rs.getString("EMAIL_OFF");
                r.email_per=rs.getString("EMAIL_PER");
                r.date=rs.getString("R_DATE");  
                r.phase3[0]=rs.getInt("QUES3_1");
                r.phase3[1]=rs.getInt("QUES3_2");
                r.phase3[2]=rs.getInt("QUES3_3");
                r.phase4[0]=rs.getInt("QUES4_1");
                r.phase4[1]=rs.getInt("QUES4_2");
                r.phase4[2]=rs.getInt("QUES4_3");
                r.phase4[3]=rs.getInt("QUES4_4");
                r.phase4[4]=rs.getInt("QUES4_5");
                r.phase5[0]=rs.getInt("QUES5_1");
                r.phase5[1]=rs.getInt("QUES5_2");
                r.phase5[2]=rs.getInt("QUES5_3");
                r.phase5[3]=rs.getInt("QUES5_4");                  
                
            } 
            
            //Read SaleProd
            sql="select * from [SaleProd$] where RID="+rid;
            rs=stmt.executeQuery(sql);
                        
            //transfer to class                      
            int i=0;
            while(rs.next())
            {   
                r.phase2a[i][0]=rs.getInt("YEAR");
                r.phase2a[i][1]=rs.getInt("EXP_NO_CL");
                r.phase2a[i][2]=rs.getInt("ACT_NO_CL");
                r.phase2a[i][3]=rs.getInt("EXP_SL_REV");
                r.phase2a[i][4]=rs.getInt("ACT_SL_REV");                
                i++;
            } 
            
            //Read SaleProd
            sql="select * from [SalePipeH$] where R_ID="+rid;
            rs=stmt.executeQuery(sql);
                        
            //transfer to class                      
            i=0;
            while(rs.next())
            {   
                r.phase2b[i][0]=rs.getInt("YR");
                r.phase2b[i][1]=rs.getInt("CT");
                r.phase2b[i][2]=rs.getInt("PROSPECTS");
                r.phase2b[i][3]=rs.getInt("LEADS");
                r.phase2b[i][4]=rs.getInt("SALES");                
                i++;
            }             
                        
            
        }catch(Exception e)
        {   System.out.println("ERROR! Cannot Select data!\n"+e);   
            log.writeToLog(33);
            SPA.panelController("Database connectivity Error!", new int[]{1,0,3,3,2,0}); 
        }
        
        //-------------------------------------------
        finally 
        {
            try{
                rs.close();
                stmt.close();
                conn.close();
                rs=null;
                stmt=null;
                conn=null; 
                log.writeToLog(31);
            }catch(Exception e)
            { System.out.println("ERROR! Closing connections!\n"+e); }
        }
        
        return(r);
    }
    
    void updateRecord(Record r)
    {
        try
        {
            conn=DriverManager.getConnection("jdbc:odbc:"+dataSourceName,"","");
            stmt=conn.createStatement();  
            log.writeToLog(17);
            //----------------------------------
             
            //sql="delete fro [Data$] where RECORD_ID="+rid;
            //rs=stmt.executeQuery(sql);
            
            r.setDate();
            
            sql="update [Data$] set CLIENT_NAME='"+r.clientName+"', "+
                "ADDRESS='"+r.address+"', "+
                "CMP_NAME='"+r.cmpName+"', "+                
                "DESIG='"+r.desig+"', "+
                "PRODUCT='"+r.product+"', "+
                "PHONE_NO="+r.phNo+", "+                    
                "MOBILE_NO="+r.mobileNo+", "+
                "FAX_NO="+r.faxNo+", "+    
                "EMAIL_OFF='"+r.email_off+"', "+
                "EMAIL_PER='"+r.email_per+"', "+
                "R_DATE='"+r.date+"', "+
                "QUES3_1="+r.phase3[0]+", "+
                "QUES3_2="+r.phase3[1]+", "+
                "QUES3_3="+r.phase3[2]+", "+
                "QUES4_1="+r.phase4[0]+", "+
                "QUES4_2="+r.phase4[1]+", "+
                "QUES4_3="+r.phase4[2]+", "+
                "QUES4_4="+r.phase4[3]+", "+
                "QUES4_5="+r.phase4[4]+", "+
                "QUES5_1="+r.phase5[0]+", "+
                "QUES5_2="+r.phase5[1]+", "+
                "QUES5_3="+r.phase5[2]+", "+
                "QUES5_4="+r.phase5[3]+" "+                            
                "where RECORD_ID="+r.recordID;            
            //System.out.println(sql);            
            stmt.executeUpdate(sql);

            sql="select * from [Data$]";
            rs=stmt.executeQuery(sql);
            
            
            for(int i=0;i<3;i++)
            {
                sql="update [SaleProd$] set "+
                    "EXP_NO_CL="+r.phase2a[i][1]+", "+
                    "ACT_NO_CL="+r.phase2a[i][2]+", "+                
                    "EXP_SL_REV="+r.phase2a[i][3]+", "+
                    "ACT_SL_REV="+r.phase2a[i][4]+" "+
                    "where RID="+r.recordID+" AND YEAR="+r.phase2a[i][0];            
                //System.out.println(sql);
                stmt.executeUpdate(sql);

                sql="select * from [SaleProd$]";
                rs=stmt.executeQuery(sql);
                
            }
            
            for(int i=0;i<3;i++)
            {
                sql="update [SalePipeH$] set "+
                    "CT="+r.phase2b[i][1]+", "+
                    "PROSPECTS="+r.phase2b[i][2]+", "+                
                    "LEADS="+r.phase2b[i][3]+", "+
                    "SALES="+r.phase2b[i][4]+" "+
                    "where R_ID="+r.recordID+" AND YR="+r.phase2b[i][0];            
                //System.out.println(sql);
                stmt.executeUpdate(sql);

                sql="select * from [SalePipeH$]";
                rs=stmt.executeQuery(sql);
                
            }
            
            /*
            sql="delete from [SaleProd$] where RECORD_ID="+rid;
            rs=stmt.executeQuery(sql);
            
            sql="delete from [SalePipeH$] where RECORD_ID="+rid;
            rs=stmt.executeQuery(sql);
            
            /*
            sql="select * from [Data$]";
            rs=stmt.executeQuery(sql);  
            * 
            */           
            
            
        }catch(Exception e)
        {   log.writeToLog(33); System.out.println("ERROR! Cannot Update data!\n"+e);   }
        
        //-------------------------------------------
        finally 
        {
            try{
                rs.close();
                stmt.close();
                conn.close();
                rs=null;
                stmt=null;
                conn=null; 
                log.writeToLog(31);
            }catch(Exception e)
            { System.out.println("ERROR! Closing connections!\n"+e); }
        }
    }
    
    int showAllRecord(javax.swing.JTable tb)
    {
        Record r=new Record();
        int i=0;
        
        try
        {
            conn=DriverManager.getConnection("jdbc:odbc:"+dataSourceName,"","");
            stmt=conn.createStatement();  
            log.writeToLog(18);
            //----------------------------------
            
            //Read Data
            sql="select * from [Data$]";
            rs=stmt.executeQuery(sql);
            
            /*
            String data[][] = {{"", "", "", "", "", "", ""}};
            String col[] = {"Record ID", "Client Name", "Company Name", "Product", "Mobile No.", "EMail (Official)", "Date"};
            * 
            */
            
            DefaultTableModel model=(DefaultTableModel)tb.getModel();
            
            
            //transfer to class          
            while(rs.next())
            {  
                model.insertRow(tb.getRowCount(), new Object[]{rs.getInt("RECORD_ID"), rs.getString("CLIENT_NAME"), rs.getString("CMP_NAME"), rs.getString("PRODUCT"), rs.getLong("MOBILE_NO"), rs.getString("EMAIL_OFF"), rs.getString("R_DATE")});
                i++;                                   
            }             
            
            
        }catch(Exception e)
        {   
            log.writeToLog(33);
            System.out.println("ERROR! Cannot Read records! File Missing!\n"+e);             
        }
                
        
        //-------------------------------------------
        finally 
        {
            try{
                rs.close();
                stmt.close();
                conn.close();
                rs=null;
                stmt=null;
                conn=null; 
                log.writeToLog(31);
            }catch(Exception e)
            { System.out.println("ERROR! Closing connections!\n"+e); }
        }
        
        return(i);
    }
    
    //-----------------------------------------------------------------
    void deleteRecord(int rid)
    {
        try
        {
            conn=DriverManager.getConnection("jdbc:odbc:"+dataSourceName,"","");
            stmt=conn.createStatement();            
            //----------------------------------
              
            
            sql="delete from [Data$] where RECORD_ID="+rid;
            rs=stmt.executeQuery(sql);
            
            /*
            sql="delete from [SaleProd$] where RECORD_ID="+rid;
            rs=stmt.executeQuery(sql);
            
            sql="delete from [SalePipeH$] where RECORD_ID="+rid;
            rs=stmt.executeQuery(sql);
            
            /*
            sql="select * from [Data$]";
            rs=stmt.executeQuery(sql);  
            * 
            */           
            
            
        }catch(Exception e)
        {   System.out.println("ERROR! Cannot Select data!\n"+e);   }
        
        //-------------------------------------------
        finally 
        {
            try{
                rs.close();
                stmt.close();
                conn.close();
                rs=null;
                stmt=null;
                conn=null; 
            }catch(Exception e)
            { System.out.println("ERROR! Closing connections!\n"+e); }
        }
    }
    
    /*
    @Override
    protected void finalize()
    {
        try{
                rs.close();
                stmt.close();
                conn.close();
                rs=null;
                stmt=null;
                conn=null; 
        }catch(Exception e)
        { System.out.println("ERROR! Closing connections!\n"+e); }
    }
    */
}
