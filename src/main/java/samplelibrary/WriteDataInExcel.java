package samplelibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericlibOrUtility.IconStantUtility;

public class WriteDataInExcel
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis=new FileInputStream(IconStantUtility.excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sample");
		sh.createRow(9).createCell(1).setCellValue("WELCOME");
		
		FileOutputStream fos=new FileOutputStream(IconStantUtility.excelpath);
		book.write(fos);
		System.out.println("Pass");
		
	}
}
