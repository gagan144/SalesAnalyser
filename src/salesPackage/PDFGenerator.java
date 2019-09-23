package salesPackage;

//import com.lowagie.text.*;
import com.lowagie.text.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

 
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Point;
import java.util.Calendar;


public class PDFGenerator 
{    
    
    boolean generate(StrageticData ref, File f)
    {
        LogHandler log =new LogHandler();
        
        log.writeToLog(21);
        try {            
            
            OutputStream file = new FileOutputStream(f);
            
            //Set page size and margins
            Document document = new Document(PageSize.A4, 50, 20, 10, 20); 
            PdfWriter.getInstance(document, file);
                        
           
            
            //set basic info            
            document.addTitle("SPA Analysis Report");
            document.addAuthor(SPA.CNF.firstName+" "+SPA.CNF.lastName);
            document.addSubject("Analysis Report of "+ref.r.clientName+" ("+ref.r.cmpName+")");
            document.addCreator("SPA - Sales Process Analyzer");      //Application
            
            
            Font authFont = FontFactory.getFont(FontFactory.HELVETICA, 9, Font.ITALIC);
            Font footrFont = FontFactory.getFont(FontFactory.HELVETICA, 9);
            Font normFont = FontFactory.getFont(FontFactory.HELVETICA, 10);
            Font boldFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10);
            Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 11, Font.UNDERLINE);
            
            
            //set Footer
            String foot="Sales Process Analyzer\n"+
                    "Developed by © 2012 United Avenir Engineers\n"+
                    "Core Team : Gagandeep Singh, Harmeet Singh Bahra, Hargeet Kaur Bhatia, Amanpreet Singh Chauhan\n"+
                    "singh.gagan144@gmail.com | 9717568636";
            
            Paragraph ftr=new Paragraph(foot, footrFont);
            
            HeaderFooter footer = new HeaderFooter( ftr ,false);
            footer.setAlignment(Element.ALIGN_CENTER);
            document.setFooter(footer);                   
            
            
            //Open Document
            document.open();
            
            //Write logo
            /*
            Image logo = Image.getInstance("/salesPackage/Images/pdf/SPA_logo_pdf.png");
            logo.setAlignment(Element.ALIGN_CENTER);
            document.add(logo);
            */
            Font logoFont = FontFactory.getFont(FontFactory.HELVETICA, 65, Font.BOLD);
            Paragraph praLogo=new Paragraph("SPA", logoFont);
            praLogo.setAlignment(Element.ALIGN_CENTER);
            document.add(praLogo);
            praLogo=new Paragraph("Sales Process Analyser", boldFont);
            praLogo.setAlignment(Element.ALIGN_CENTER);
            document.add(praLogo);
            
            
            //Write Content
            
            //set headings         
            
            
            Calendar cal=Calendar.getInstance();
            int month= cal.get(Calendar.MONTH);
            int year= cal.get(Calendar.YEAR);
            int day= cal.get(Calendar.DAY_OF_MONTH);
            
            Paragraph pra=new Paragraph("Author : \n"+
                    SPA.CNF.firstName+" "+SPA.CNF.lastName+"\n"+
                    SPA.CNF.email+"\n"+
                    SPA.CNF.phno+"\n"+
                    "Date : "+day+"/"+(month+1)+"/"+year+"\n\n", authFont);
            
            pra.setAlignment(Element.ALIGN_CENTER);
            document.add(pra);
                        
            
            //1. personal info
            pra=new Paragraph("Personal Information                                                                                                            ", headFont);
            pra.setAlignment(Element.ALIGN_LEFT);
            document.add(pra);                 
            
            pra=new Paragraph("\nClient Name : "+ref.r.clientName+"\n"+
                    "Address : "+ref.r.address+"\n"+
                    "Company : "+ref.r.cmpName+"\n"+
                    "Designation : "+ref.r.desig+"\n"+
                    "Product : "+ref.r.product+"\n"+
                    "Phone Number : "+ref.r.phNo+"\n"+
                    "Mobile Number : "+ref.r.mobileNo+"\n"+
                    "Fax Number : "+ref.r.faxNo+"\n"+
                    "Official eMail ID : "+ref.r.email_off+"\n"+
                    "Personal eMail ID : "+ref.r.email_per+"\n\n\n",
                    normFont);
            document.add(pra);
            
            //2.YOY
            pra=new Paragraph("Year on year Growth and Productivity                                                                                            ", headFont);
            pra.setAlignment(Element.ALIGN_LEFT);
            document.add(pra);                 
            
            //table a  
            pra=new Paragraph("\n(a) Your Current Sales Process (Business) Productivity :", normFont);
            pra.setAlignment(Element.ALIGN_LEFT);
            document.add(pra); 
            
            Table t = new Table(5,4);    //col,row
            t.setBorderColor(Color.WHITE);
            t.setPadding(1);
            t.setSpacing(0);
            t.setTableFitsPage(true);
            t.setWidth(80);
            t.setBorderWidth(0);
            
            pra=new Paragraph("Year", normFont);
            Cell c1 = new Cell(pra);
            c1.setHeader(true);
            t.addCell(c1);
            pra=new Paragraph("Expected No. of Clients", normFont);
            c1 = new Cell(pra);
            t.addCell(c1);
            pra=new Paragraph("Actual No. of Clients", normFont);
            c1 = new Cell(pra);
            t.addCell(c1);
            pra=new Paragraph("Expected Sales Revenue", normFont);
            c1 = new Cell(pra);
            t.addCell(c1);
            pra=new Paragraph("Actual Sales Revenue", normFont);
            c1 = new Cell(pra);
            t.addCell(c1);
            t.endHeaders();       
            
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<5;j++)
                {
                    t.addCell(String.valueOf(ref.r.phase2a[i][j]));
                }
            }
            
            t.setAlignment(Element.ALIGN_LEFT);
            document.add(t);
            
                  
            
            boolean showMsg=true;
            int tmpAvg=0;
            String msg="";
            for(int i=0;i<3;i++)
            {
                  if(ref.r.phase2a[i][1]==0 || ref.r.phase2a[i][2]==0)
                  { showMsg=false; break; }
            }   
        
            if(showMsg==true)
            {
             tmpAvg=((int)(ref.diag2a_Clients[0]+ref.diag2a_Clients[1]+ref.diag2a_Clients[2]))/3;
                     
             if(tmpAvg>=81)
             {  msg="• Expected Vs Actual Clients :  Your company is doing most of the Sales Process related tasks correctly. To know where the improvements can be made to further enhance the output, please proceed to take analytic test."; }
             else if(tmpAvg>=70 && tmpAvg<81)        
             {  msg="• Expected Vs Actual Clients :  Your company is doing some of the Sales Process related tasks correctly. However there seems to be an imperative need to identify weak areas to achieve considerable improvement and conversions. Please proceed to take analytic test."; }        
             else
             {  msg="• Expected Vs Actual Clients :  Your company is facing alot of challenges in Sales Process Management. We highly recommend you to take analytic test to identify weak areas and take immediate corrective actions for considerable improvement and conversions."; }
            }    
            
            showMsg=true;
            for(int i=0;i<3;i++)
            {
                  if(ref.r.phase2a[i][3]==0 || ref.r.phase2a[i][4]==0)    
                  { showMsg=false; break; }
            }   
        
            if(showMsg==true)
            {
            tmpAvg=((int)(ref.diag2a_Sales[0]+ref.diag2a_Sales[1]+ref.diag2a_Sales[2]))/3;        
            
            if(tmpAvg>=81)
            {  msg+="\n• Expected Vs Actual Sales :  Your company is doing most of the Sales Process related tasks correctly. To know where the improvements can be made to further enhance the output, please proceed to take analytic test."; }
            else if(tmpAvg>=70 && tmpAvg<81)        
            {  msg+="\n• Expected Vs Actual Sales :  Your company is doing some of the Sales Process related tasks correctly. However there seems to be an imperative need to identify weak areas to achieve considerable improvement and conversions. Please proceed to take analytic test."; }
            else
            {  msg+="\n• Expected Vs Actual Sales :  Your company is facing alot of challenges in Sales Process Management. We highly recommend you to take analytic test to identify weak areas and take immediate corrective actions for considerable improvement and conversions."; }

            pra=new Paragraph("\nAnalysis :", boldFont);
            pra.setAlignment(Element.ALIGN_LEFT);
            document.add(pra);             
            pra=new Paragraph(msg, normFont);
            pra.setAlignment(Element.ALIGN_LEFT);
            document.add(pra);   
            
            }   
            
                
            
            document.newPage();
            
            //table b  
            pra=new Paragraph("\n\n(b) Clients Touched to Prospects to Leads to Sales Conversion :", normFont);
            pra.setAlignment(Element.ALIGN_LEFT);
            document.add(pra); 
            
            t = new Table(5,4);    //col,row
            t.setBorderColor(Color.WHITE);
            t.setPadding(1);
            t.setSpacing(0);
            t.setTableFitsPage(true);
            t.setWidth(80);
            t.setBorderWidth(0);
            
            pra=new Paragraph("Year", normFont);
            c1 = new Cell(pra);
            c1.setHeader(true);
            t.addCell(c1);
            pra=new Paragraph("Clients Touched (CT)", normFont);
            c1 = new Cell(pra);
            t.addCell(c1);
            pra=new Paragraph("Prospects (P)", normFont);
            c1 = new Cell(pra);
            t.addCell(c1);
            pra=new Paragraph("Leads (L)", normFont);
            c1 = new Cell(pra);
            t.addCell(c1);
            pra=new Paragraph("Sales (S)", normFont);
            c1 = new Cell(pra);
            t.addCell(c1);
            t.endHeaders();       
            
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<5;j++)
                {
                    t.addCell(String.valueOf(ref.r.phase2b[i][j]));
                }
            }
            
            t.setAlignment(Element.ALIGN_LEFT);
            document.add(t);
            
            showMsg=true;
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<5;j++)
                {
                    if(ref.r.phase2b[0][j]==0)  
                    {  showMsg=false; break;  }           
                }
            }
            
            if(showMsg==true)
            {        
                 tmpAvg=0;
                 msg="";
        
            //p:ct
            tmpAvg=(int)( (ref.diag2b[0][1]*100)+(ref.diag2b[1][1]*100)+(ref.diag2b[2][1]*100) )/3;        
            if(tmpAvg<70)
            {  msg+="• The Prospecting Methodology is not correct or we are not touching the right accounts or our team does not have the correct qualified customer definition.\n"; }
        
            //l:p
            tmpAvg=(int)( (ref.diag2b[0][2]*100)+(ref.diag2b[1][2]*100)+(ref.diag2b[2][2]*100) )/3;                
            if(tmpAvg>=60 && tmpAvg<70)
            {  msg+="• Lead Generation Methodology is not correct. There is a need to check the quality of \"Reason to Call\" strategy and communication.\n"; }
            else if(tmpAvg<60)
            {  msg+="• Lead Generation Methodology does not seem to exist and business dependence on external factors seems to be very high.\n"; }
        
            //s:l
            tmpAvg=(int)( (ref.diag2b[0][3]*100)+(ref.diag2b[1][3]*100)+(ref.diag2b[2][3]*100) )/3;                
            if(tmpAvg>=60 && tmpAvg<70)
            {  msg+="• The leads are not qualified on 06 aspects or sales is lost to competition on pricing / service / terms.\n"; }
            else if(tmpAvg<60)
            {  msg+="• The customers are not clear our offering: Services / Products/ Solutions. Our offering is not clear to the customer from Strategic / Technical / Economic view point\n"; }
                
            if(msg.equals(""))
            {}
            else
            {
            pra=new Paragraph("\nAnalysis :", boldFont);
            pra.setAlignment(Element.ALIGN_LEFT);
            document.add(pra);  
            pra=new Paragraph(msg, normFont);
            pra.setAlignment(Element.ALIGN_LEFT);
            document.add(pra); 
            }
            
            }
            
            
            pra=new Paragraph("\n\n", normFont);
            pra.setAlignment(Element.ALIGN_LEFT);
            document.add(pra); 
            
            
            //ANALYSIS REPORT
            pra=new Paragraph("ANALYSIS REPORT                                                                                                                    ", headFont);
            pra.setAlignment(Element.ALIGN_LEFT);
            document.add(pra); 
            
            
            String prospects="",leads="",sales="";
        
        
            //PROSPECTS
            if(ref.r.phase3[0]==1 || ref.r.phase3[0]==2)
            { prospects+="• You may wish to discuss with us the data mining process to check if there are areas for improvement."; }
            else
            { prospects+="• You need a dedicated data mining process to supply qualified accounts for sales enablement. We can help you with the same."; }
        
            if(ref.r.phase3[1]==1)
            { prospects+="\n• You may wish to discuss with us the definition of qualified accounts and seek expertise opinion is improving the definition."; }
            else
            { prospects+="\n• You need to have a precise qualifying account definition for enabling sales."; }
        
            if(ref.r.phase3[2]==3 || ref.r.phase3[2]==4 )
            { prospects+="\n• You need to study the profile of each account and draw an annual sales strategy plan to engage with these accounts."; }
        
            pra=new Paragraph("\n3. Generate Qualified Prospect List:\n"+prospects, normFont);
            pra.setAlignment(Element.ALIGN_LEFT);
            document.add(pra); 
        
            //LEADS
            if(ref.r.phase4[0]>=3)
            { leads+="• You need to have STE calling scripts with a dedicated inside sales team to generate qualified leads.\n"; }
                
            if(ref.r.phase4[1]>=3)
            { leads+="• We recommend you to have a trained inside sale team that has a forward looking RTC Calendar in place to generate qualified leads.\n"; }
            
        
            if(ref.r.phase4[2]>=2)
            { leads+="• We strongly recommend you to have regular EDM/DM communication for customer activation.\n"; }
        
            if(ref.r.phase4[3]==3)
            { leads+="• Your sales team needs to send the EDMs to the customers and then engage with them in discussions.\n"; }
        
            if(ref.r.phase4[4]>=3)
            { leads+="• The 6 aspects need to be answered else they will come up as sales objections at the time of closure."; }
        
            if(leads.equals(""))
            { }
            else
            { 
                pra=new Paragraph("\n4. Generate Qualified Leads : \n"+leads, normFont);
                pra.setAlignment(Element.ALIGN_LEFT);
                document.add(pra); 
            }
        
        
            //SALES
            if(ref.r.phase5[0]>=3)
            { sales+="• We strongly recommend that you should convert your sales presentations addressing the Strategic, Technical and Economic aspects, separately.\n"; }
                
            if(ref.r.phase5[1]>=2)
            { sales+="• We strongly recommend you to have a sales query form that covers all aspects of Strategic, Technical and Economic Buying.\n"; }
        
            if(ref.r.phase5[2]==2)
            { sales+="• We strongly recommend that sales forecasting should be done through STE qualification success rate.\n"; }
        
            if(ref.r.phase5[3]>=2)
            { sales+="• You need to use the CRM tool aggressively to manage sales and sales projections.\n"; }
        
        
            if(sales.equals(""))
            { }
            else
            { 
                pra=new Paragraph("\n5. Generate Sales : \n"+sales, normFont);
                pra.setAlignment(Element.ALIGN_LEFT);
                document.add(pra); 
            }
            
            
            pra=new Paragraph("\n________________________\nTotal Score : "+ref.totalScore+" /100\n________________________", normFont);
            pra.setAlignment(Element.ALIGN_LEFT);
            document.add(pra); 
            
            pra=new Paragraph("__________________\nSignature", normFont);
            pra.setAlignment(Element.ALIGN_RIGHT);
            document.add(pra); 
            
            
           /*
            pra=new Paragraph("\nAnalysis :", boldFont);
            pra.setAlignment(Element.ALIGN_LEFT);
            document.add(pra); 
            
            
            pra=new Paragraph(msg, normFont);
            pra.setAlignment(Element.ALIGN_LEFT);
            document.add(pra); 
            */
            //GifImage img = new GifImage("E:\\happy.gif");
            //document.add(img.getImage(1));
 
            document.close();
            file.close();
            
            log.writeToLog(31); 
            
        }catch(Exception e) 
        {  
            System.out.println("Error Creating PDF FIle!\n"+e);
            Dialog_ErrorHandler d=new Dialog_ErrorHandler(null, true);
            d.recieveInfo("Error Creating Pdf File!", new int[]{2,0,9,3,1,2});
            d.setVisible(true);
            log.writeToLog(33);
            return(false);
        }
        
        return(true);
        
    }
}
