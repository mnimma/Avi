
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPoi2 {

	public static void main(String[] args) throws Exception {
		File myFile = new File("D:\\Madhav\\Selenium Classes\\sample.xlsx");

		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
		XSSFSheet s1 = myWorkBook.getSheetAt(0);

		int rows = s1.getLastRowNum();
		for (int i = 1; i <= rows; i++) {

			String p = s1.getRow(i).getCell(0).getStringCellValue();
			String q = s1.getRow(i).getCell(1).getStringCellValue();
			String r = String.valueOf(s1.getRow(i).getCell(2).getDateCellValue());
			String s = String.valueOf(s1.getRow(i).getCell(3).getNumericCellValue());
			String t = s1.getRow(i).getCell(4).getStringCellValue();

			System.out.print(p + "\t");
			System.out.print(q + "\t");
			System.out.print(r + "\t");
			System.out.print(s + "\t");
			System.out.println(t);
		}

	}

}