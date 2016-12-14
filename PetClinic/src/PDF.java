import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;


public class PDF {
    
    static String petName;
    static String petOwner;
    static ArrayList procedureList;
    static double totalPrice;
    
    public PDF(String petName, String petOwner, ArrayList list, double totalPrice) {
        PDF.petName = petName;
        PDF.petOwner = petOwner;
        PDF.procedureList = list;
        PDF.totalPrice = totalPrice;
    }
    
    public void printPDF() {
        Document document = new Document(PageSize.A4);
        document.addAuthor("Pet Clinic");
        document.addTitle("Pet Clinic Invoice");
        System.out.println("Invoice created");
        try{
            PdfWriter.getInstance(document, new FileOutputStream("Invoice.pdf"));
            document.open();
            Paragraph p1 = new Paragraph("This is your invoice for " + petOwner + "'s " + petName);
		document.add(p1);
        }
        catch(FileNotFoundException | DocumentException e){
            System.out.println(e);
        }
        document.close();
    }
    
}
