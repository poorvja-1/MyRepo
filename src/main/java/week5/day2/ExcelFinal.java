package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFinal {

	public static String[][] finalExcel(String excelfilename) throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook("C:/TestLeaf/data/"+excelfilename+".xlsx");
		XSSFSheet sheet = book.getSheet("CLEAD");
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count" + rowCount);
		short colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column Count" + colCount);
		
		String[][] data = new String[rowCount][colCount];
		for (int i=1; i<=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0; j<colCount; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j]=value;
			}
		}
		return data;
	}

}
