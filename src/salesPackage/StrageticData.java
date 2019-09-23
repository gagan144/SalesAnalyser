package salesPackage;

import java.io.Serializable;

public class StrageticData //extends Record
{
   Record r=new Record(); 
   //------------Outputs------------------
   
    double diag2a_Clients[]=new double[3];
    double diag2a_Sales[]=new double[3];    
    
    double diag2b[][]=new double[3][5];
    
    int diagnostic3;
    int diagnostic4;
    double diagnostic5;
    double totalScore;
    
   //-----------Methods-------------------
    
    void processTableData()
    {                 
        //Diagnostic 2
        int flag=1;
        //a
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(r.phase2a[i][j]==0)
                {  flag=0; break;}
            }
        }
        
        if(flag==1)
        {
            diag2a_Clients[0]=((double)r.phase2a[0][2]/r.phase2a[0][1])*100;            
            diag2a_Clients[1]=((double)r.phase2a[1][2]/r.phase2a[1][1])*100;
            diag2a_Clients[2]=((double)r.phase2a[2][2]/r.phase2a[2][1])*100;
            
            diag2a_Sales[0]=((double)r.phase2a[0][4]/r.phase2a[0][3])*100; 
            diag2a_Sales[1]=((double)r.phase2a[1][4]/r.phase2a[1][3])*100; 
            diag2a_Sales[2]=((double)r.phase2a[2][4]/r.phase2a[2][3])*100; 
        
        }        
        
        //b        
        
        flag=1;                
        //row 1        
            for(int j=0;j<5;j++)
            {
                if(r.phase2b[0][j]==0)
                {  flag=0; break;}
            }        
        
        if(flag==1)
        {        
            for(int j=0;j<5;j++)
            {                
                if(j==0)
                { diag2b[0][j]=r.phase2b[0][j]; }
                else if(j==4)
                {  diag2b[0][j]=(double)r.phase2b[0][j]/r.phase2b[0][1];  }
                else
                {  diag2b[0][j]=(double)r.phase2b[0][j+1]/r.phase2b[0][j];   }
            }
        
        }
        
        
        flag=1;                
        //row 2        
            for(int j=0;j<5;j++)
            {
                if(r.phase2b[1][j]==0)
                {  flag=0; break;}
            }        
        
        if(flag==1)
        {        
            for(int j=0;j<5;j++)
            {                
                if(j==0)
                { diag2b[1][j]=r.phase2b[1][j]; }
                else if(j==4)
                {  diag2b[1][j]=(double)r.phase2b[1][j]/r.phase2b[1][1];  }
                else
                {  diag2b[1][j]=(double)r.phase2b[1][j+1]/r.phase2b[1][j];   }
            }
        
        }
        
        flag=1;                
        //row 3        
            for(int j=0;j<5;j++)
            {
                if(r.phase2b[2][j]==0)
                {  flag=0; break;}
            }        
        
        if(flag==1)
        {        
            for(int j=0;j<5;j++)
            {                
                if(j==0)
                { diag2b[2][j]=r.phase2b[2][j]; }
                else if(j==4)
                {  diag2b[2][j]=(double)r.phase2b[2][j]/r.phase2b[2][1];  }
                else
                {  diag2b[2][j]=(double)r.phase2b[2][j+1]/r.phase2b[2][j];   }
            }
        
        }
        
        
        /*
        flag=1;        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(r.phase2b[i][j]==0)
                {  flag=0; break;}
            }
        }
        
        if(flag==1)
        {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {                
                if(j==0)
                { diag2b[i][j]=r.phase2b[i][j]; }
                else if(j==4)
                {  diag2b[i][j]=(double)r.phase2b[i][j]/r.phase2b[i][1];  }
                else
                {  diag2b[i][j]=(double)r.phase2b[i][j+1]/r.phase2b[i][j];   }
            }
        }
        }
        
        */
          
        /*
        //---------------------
        System.out.println("2.a. Sales productivity\n Clients Ratio\n");
        for(int i=0;i<3;i++)
        {
            System.out.println(diag2a_Clients[i]);
        }
        
        System.out.println("\nSales Ratio\n");
        for(int i=0;i<3;i++)
        {
            System.out.println(diag2a_Sales[i]);
        }
        
        
        /*
        //-----------------------------show-----------
        
        System.out.println("\n---------------------------------------");
        
        System.out.println("2.a. Sales productivity");
        System.out.println("Expected Client Growth : "+diag2a_expCl[0]+" <- "+diag2a_expCl[1]);
        System.out.println("Actual Client Growth : "+diag2a_actCl[0]+" <- "+diag2a_actCl[1]);
        System.out.println("Expected Sales Growth : "+diag2a_expSal[0]+" <- "+diag2a_expSal[1]);
        System.out.println("Actual Sales Growth : "+diag2a_actSal[0]+" <- "+diag2a_actSal[1]);
        
        System.out.println("\n2.b. Sale pipe Health");
        System.out.println("Year\tP:CT\tL:P\tS:L\tS:CT");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(diag2b[i][j]+"\t");
            }
            System.out.println("");
        }
        */
        
    }
    
    void processScores()
    {
        if(r.checkAllData()==false)
        {
            System.out.println("Incomplete Data");
            return;            
        }
            
        /*
        //Diagnostic 2
        int flag=1;
        //a
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(r.phase2a[i][j]==0)
                {  flag=0; break;}
            }
        }
        
        if(flag==1)
        {
        diag2a_expCl[0]=(double)( ((double)(r.phase2a[0][1]-r.phase2a[1][1])/r.phase2a[0][1])*100);  
        diag2a_expCl[1]=(double)( ((double)(r.phase2a[1][1]-r.phase2a[2][1])/r.phase2a[1][1])*100);        
        
        diag2a_actCl[0]=(double)( ((double)(r.phase2a[0][2]-r.phase2a[1][2])/r.phase2a[0][2])*100);        
        diag2a_actCl[1]=(double)( ((double)(r.phase2a[1][2]-r.phase2a[2][2])/r.phase2a[1][2])*100);        
        
        diag2a_expSal[0]=(double)( ((double)(r.phase2a[0][3]-r.phase2a[1][3])/r.phase2a[0][3])*100);        
        diag2a_expSal[1]=(double)( ((double)(r.phase2a[1][3]-r.phase2a[2][3])/r.phase2a[1][3])*100);        
        
        diag2a_actSal[0]=(double)( ((double)(r.phase2a[0][4]-r.phase2a[1][4])/r.phase2a[0][4])*100);        
        diag2a_actSal[1]=(double)( ((double)(r.phase2a[1][4]-r.phase2a[2][4])/r.phase2a[1][4])*100);        
        }        
        
        //b
        flag=1;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(r.phase2b[i][j]==0)
                {  flag=0; break;}
            }
        }
        
        if(flag==1)
        {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {                
                if(j==0)
                { diag2b[i][j]=r.phase2b[i][j]; }
                else if(j==4)
                {  diag2b[i][j]=(double)r.phase2b[i][j]/r.phase2b[i][1];  }
                else
                {  diag2b[i][j]=(double)r.phase2b[i][j+1]/r.phase2b[i][j];   }
            }
        }
        }
        */
        
        //Diagnostic 3
        diagnostic3=0;
        switch(r.phase3[0])
        {
            case 1 : diagnostic3+=10; break;
            case 2 : diagnostic3+=7; break;
            case 3 : diagnostic3+=5; break;
            case 4 : diagnostic3+=3; break;
            case 5 : diagnostic3+=0; break;
            case 6 : diagnostic3+=0; break;
        }
        switch(r.phase3[1])
        {
            case 1 : diagnostic3+=5; break;
            case 2 : diagnostic3+=3; break;
            case 3 : diagnostic3+=0; break;            
        }
        switch(r.phase3[2])
        {
            case 1 : diagnostic3+=15; break;
            case 2 : diagnostic3+=10; break;
            case 3 : diagnostic3+=5; break;
            case 4 : diagnostic3+=0; break;            
        }
        
        //Diagnostic 4
        diagnostic4=0;
        switch(r.phase4[0])
        {
            case 1 : diagnostic4+=15; break;
            case 2 : diagnostic4+=10; break;
            case 3 : diagnostic4+=5; break;
            case 4 : diagnostic4+=3; break;
            case 5 : diagnostic4+=0; break;            
        }
        switch(r.phase4[1])
        {
            case 1 : diagnostic4+=5; break;
            case 2 : diagnostic4+=3; break;
            case 3 : diagnostic4+=2; break;            
            case 4 : diagnostic4+=0; break;            
        }
        switch(r.phase4[2])
        {
            case 1 : diagnostic4+=5; break;
            case 2 : diagnostic4+=3; break;
            case 3 : diagnostic4+=0; break;            
        }
        switch(r.phase4[3])
        {
            case 1 : diagnostic4+=10; break;
            case 2 : diagnostic4+=5; break;
            case 3 : diagnostic4+=0; break;            
        }
        switch(r.phase4[4])
        {
            case 1 : diagnostic4+=15; break;
            case 2 : diagnostic4+=10; break;
            case 3 : diagnostic4+=5; break;            
            case 4 : diagnostic4+=0; break;            
        }
        
        //Diagnostic 5
        diagnostic5=0;
        switch(r.phase5[0])
        {
            case 1 : diagnostic5+=10; break;
            case 2 : diagnostic5+=7; break;
            case 3 : diagnostic5+=5; break;
            case 4 : diagnostic5+=0; break;            
        }
        switch(r.phase5[1])
        {
            case 1 : diagnostic5+=5; break;
            case 2 : diagnostic5+=3; break;
            case 3 : diagnostic5+=0; break;                        
        }
        switch(r.phase5[2])
        {
            case 1 : diagnostic5+=2.5; break;
            case 2 : diagnostic5+=0; break;            
        }
        switch(r.phase5[3])
        {
            case 1 : diagnostic5+=2.5; break;
            case 2 : diagnostic5+=1.5; break;            
            case 3 : diagnostic5+=0; break;            
        }
        
        totalScore=diagnostic3+diagnostic4+diagnostic5;
        
        //-----------------------------show-----------
        
        System.out.println("\n---------------------------------------");
        
        System.out.println("2.a. Sales productivity\n Clients Ratio\n");
        for(int i=0;i<3;i++)
        {
            System.out.println(diag2a_Clients[i]);
        }
        
        System.out.println("\nSales Ratio\n");
        for(int i=0;i<3;i++)
        {
            System.out.println(diag2a_Sales[i]);
        }
        
        System.out.println("\n2.b. Sale pipe Health");
        System.out.println("Year\tP:CT\tL:P\tS:L\tS:CT");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(diag2b[i][j]+"\t");
            }
            System.out.println("");
        }
        
        System.out.println("\n3.Generate Qualified Prospect list : "+diagnostic3+"/30");
        System.out.println("\n4.Generate Qualified Leads : "+diagnostic4+"/50");
        System.out.println("\n5.Generate sales : "+diagnostic5+"/20");
        System.out.println("\nTotal Score : "+totalScore+"/100");
        System.out.println("\n---------------------------------------");
        //--------------------------------------------------------------
    }
    
    
    void ResetAllData()
    {
        r.recordID=0;
        r.clientName="";
        r.address="";
        r.cmpName="";
        r.desig="";
        r.product="";
        r.phNo=0L;
        r.mobileNo=0L;
        r.faxNo=0L;
        r.email_off="";
        r.email_per="";
        r.date="";
            
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                r.phase2a[i][j]=0;
                r.phase2b[i][j]=0;
            }            
        }
        
        for(int i=0;i<3;i++)
        { r.phase3[i]=0; }
        
        for(int i=0;i<5;i++)
        { r.phase4[i]=0; }
                
        for(int i=0;i<4;i++)
        { r.phase5[i]=0; } 
                       
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                diag2b[i][j]=0;
            }
            diag2a_Clients[i]=0;
            diag2a_Sales[i]=0;
        }
        
    }
    
    
     
   //-----------TO BE DELETED --------------
    
    void initializeTempData()
    {
        r.recordID=144;
        r.clientName="Harmeet Singh Bahra";
        r.address="123/45 Nagar";
        r.cmpName="Zero One Sales Corp";
        r.desig="Managing Director" ;
        r.product="Sales Process";
        r.phNo=25796788L;        
        r.mobileNo=9717155311L;
        r.faxNo=112845455L;
        r.email_off="OfficialMail@yahoo.com";
        r.email_per="PersonalMail@gmail.com";
        
        
        r.phase2a[0][0]=2012;    r.phase2a[0][1]=40;    r.phase2a[0][2]=30;    r.phase2a[0][3]=60;   r.phase2a[0][4]=35;
        r.phase2a[1][0]=2011;    r.phase2a[1][1]=30;    r.phase2a[1][2]=20;    r.phase2a[1][3]=55;   r.phase2a[1][4]=30;
        r.phase2a[2][0]=2010;    r.phase2a[2][1]=20;    r.phase2a[2][2]=15;    r.phase2a[2][3]=45;   r.phase2a[2][4]=38;
        
        r.phase2b[0][0]=2012;    r.phase2b[0][1]=300;    r.phase2b[0][2]=250;    r.phase2b[0][3]=100;   r.phase2b[0][4]=35;
        r.phase2b[1][0]=2011;    r.phase2b[1][1]=250;    r.phase2b[1][2]=200;    r.phase2b[1][3]=90;   r.phase2b[1][4]=30;
        r.phase2b[2][0]=2010;    r.phase2b[2][1]=350;    r.phase2b[2][2]=320;    r.phase2b[2][3]=110;   r.phase2b[2][4]=38;
        
        
        
        r.phase3[0]=5;
        r.phase3[1]=3;
        r.phase3[2]=3;
        
        r.phase4[0]=3;
        r.phase4[1]=4;
        r.phase4[2]=2;
        r.phase4[3]=2;
        r.phase4[4]=3;
        
        r.phase5[0]=3;
        r.phase5[1]=2;
        r.phase5[2]=2;
        r.phase5[3]=3;             
        
    }
    
    void showData()
    {
        System.out.println("record ID : "+r.recordID);
        System.out.println("Name : "+r.clientName);
        System.out.println("Address : "+r.address);
        System.out.println("company : "+r.cmpName);
        System.out.println("Designation : "+r.desig);
        System.out.println("Product : "+r.product);
        System.out.println("Phone no : "+r.phNo);
        System.out.println("Mobile no : "+r.mobileNo);
        System.out.println("Fax no : "+r.faxNo);
        System.out.println("Official Mail : "+r.email_off);
        System.out.println("Personal Mail : "+r.email_per);
        System.out.println("Date : "+r.date);
        System.out.println("");
        
        System.out.println("2a.Your Current Sales Process : ");
        System.out.println("Year\tExpClients\tActualClients\tExpSales\tActSales");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(r.phase2a[i][j]+"\t");
            }
            System.out.println("");
        }
        
        System.out.println("\n2b.Sales pipe Health : ");
        System.out.println("Year\tCT\tP\tL\tS");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(r.phase2b[i][j]+"\t");
            }
            System.out.println("");
        }
        
        System.out.println("\n3.Generate qualified Prospect List");
        for(int i=0;i<3;i++)
        { System.out.println(i+1+") "+r.phase3[i]); }
        
        
        System.out.println("\n4.Generate qualified Leads");
        for(int i=0;i<5;i++)
        { System.out.println(i+1+") "+r.phase4[i]); }
        
        System.out.println("\n5.Generate Sales");
        for(int i=0;i<4;i++)
        { System.out.println(i+1+") "+r.phase5[i]); }        
        
    }
   //---------------------------------------
}
