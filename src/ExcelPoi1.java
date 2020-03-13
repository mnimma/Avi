
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPoi1 {

	public static void main(String[] args) throws Exception {
		File myFile = new File("D:\\Madhav\\Selenium Classes\\sample.xlsx");

		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
		XSSFSheet s1 = myWorkBook.getSheetAt(0);

		int i = 2;

		String p = s1.getRow(i).getCell(0).getStringCellValue();
		String q = s1.getRow(i).getCell(1).getStringCellValue();
		String r = String.valueOf(s1.getRow(i).getCell(2).getDateCellValue());
		String s = String.valueOf(s1.getRow(i).getCell(3).getNumericCellValue());
		String t = s1.getRow(i).getCell(4).getStringCellValue();

		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s);
		System.out.println(t);

	}

}