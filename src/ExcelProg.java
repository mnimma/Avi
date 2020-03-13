import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class ExcelProg {
	public static void main(String args[]) throws Exception {
		FileInputStream f1 = new FileInputStream("D:\\Madhav\\Selenium Classes\\a.xls");
		Workbook w1 = Workbook.getWorkbook(f1);
		Sheet s1 = w1.getSheet("Sheet1");

		int i = 3;

		String EmpID = s1.getCell(0, i).getContents();
		String EmpName = s1.getCell(1, i).getContents();
		String EmpSal = s1.getCell(2, i).getContents();

		System.out.println(EmpID);
		System.out.println(EmpName);
		System.out.println(EmpSal);

	}
}