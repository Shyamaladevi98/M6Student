package samplelibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UsingExcelAllValues_dataformatter 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("D:\\Selenium\\Excel\\Sample.Book.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sample");
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(sh.getRow(4).getCell(2));
		System.err.println(value);
	}
	
}
