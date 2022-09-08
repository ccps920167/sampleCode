package excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exportExcel {
	
	public static void main(String[] args) {
		
		String path = "D:\\測試.xlsx";
		String extString = path.substring(path.lastIndexOf("."));
		
		System.out.println(extString);
		
		Workbook wb = null;
		Row row = null;
		Cell cell = null;
		
		if(".xls".equals(extString)){
		    wb = new HSSFWorkbook();
		}else if(".xlsx".equals(extString)){
		    wb = new XSSFWorkbook();
		}else{
		    System.out.println("無效檔案");
		    return;
		}
		Sheet sheet = wb.createSheet(); 
		
		for(int r = 0; r < 9; r++){
		    row = sheet.createRow(r);
		    for(int c = 0; c < 9; c++){
		        cell = row.createCell(c);
			cell.setCellValue(
		            (c + 1) + " x " + (r + 1) + " = " + ((r + 1) * (c + 1))
		        );
		    }
		}
		
		try {
		    FileOutputStream fos = new FileOutputStream(new File(path));
		    wb.write(fos);
		    fos.flush();
		    fos.close();
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		
	}

}
