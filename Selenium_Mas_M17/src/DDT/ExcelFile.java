package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("./data/testData.xlsx");
		Workbook wb = WorkbookFactory.create(file);

		String value = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value);

//		Sheet sheet = wb.getSheet("Sheet1");
//		Row row = sheet.getRow(1);
//		Cell cell = row.getCell(1);
//		String value = cell.getStringCellValue();

	}

}
