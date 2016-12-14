import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;


public class PDF {
    
    static String petName;
    static String petOwner;
//    static ArrayList<String> procedureNameList;
//    static ArrayList<Double> procedurePriceList;
    static double totalPrice;
    
    public PDF(String petName, String petOwner, double totalPrice) {
        PDF.petName = petName;
        PDF.petOwner = petOwner;
//        PDF.procedureNameList = nameList;
//        PDF.procedurePriceList = priceList;
        PDF.totalPrice = totalPrice;
    }
    
    public void printPDF() {
        
        Font boldStyle = new Font();
        boldStyle.setStyle("bold");
        
        Font helveticaTitle = new Font(Font.FontFamily.HELVETICA, 30, Font.BOLD);
        Font helveticaSmall = new Font(Font.FontFamily.HELVETICA, 20, Font.BOLD);
        
        Document document = new Document(PageSize.A4);
        document.addAuthor("Pet Clinic");
        document.addTitle("Pet Clinic Invoice");
        System.out.println("Invoice created");
        try{
            PdfWriter.getInstance(document, new FileOutputStream("Invoice.pdf"));
            document.open();
            
            Paragraph title = new Paragraph("Pet Clinic Invoice", helveticaTitle);
            Paragraph p1 = new Paragraph("Pet Owner: " + petOwner);
            Paragraph p2 = new Paragraph("Pet Name : " + petName);
//            Paragraph p3 = new Paragraph("Procedure subscribed as follows: ");
            Paragraph p4 = new Paragraph("Total Price: RM " + totalPrice, helveticaSmall);
            
            title.setAlignment(Element.ALIGN_CENTER);
            title.setSpacingBefore(10);
            p1.setIndentationLeft(20);
            p1.setSpacingBefore(10);
            p2.setIndentationLeft(20);
            p2.setSpacingBefore(10);
//            p3.setIndentationLeft(20);
//            p3.setSpacingBefore(10);
//            p3.setSpacingAfter(10);
            p4.setIndentationLeft(20);
            p4.setSpacingBefore(10);
            
            document.add(title);
            document.add(p1);
            document.add(p2);
//            document.add(p3);
            
//            for (int i = 0; i < procedureNameList.size(); i++) {
//                Paragraph procedureItem = new Paragraph("Procedure " + i++ + ": " + procedureNameList.get(i));
//                procedureItem.setIndentationLeft(40);
//                document.add(procedureItem);
//            }
            document.add(p4);
        }
        catch(FileNotFoundException | DocumentException e){
            System.out.println(e);
        }
        document.close();
    }
    
}
