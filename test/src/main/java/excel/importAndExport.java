package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class importAndExport {
	public static void main(String[] args) {
		FileInputStream input = null;
		String filePath = "D:\\testExcel-notitle.xlsx";
//		String filePath = "D:\\testExcel.xls";
		
		try {
			input = new FileInputStream(filePath);
			
			Workbook workbook = null;
			Sheet sheet = null;
			Row row = null;
			Cell cell = null;
			
			try {
				
				if(filePath.endsWith("xlsx")) {
					workbook = new XSSFWorkbook(input);
				}else if(filePath.endsWith("xls")) {
					workbook = new HSSFWorkbook(input);
				}
				sheet =  workbook.getSheetAt(0);
				
				
				int rowsCount = sheet.getPhysicalNumberOfRows();
				
				String [][]ret = new String[rowsCount][10];
				
				System.out.println("rowcount:"+rowsCount);
			System.out.println("LastRowNum:"+sheet.getLastRowNum());
			
			
			//EXCEL標題
//			if(sheet.getRow(0)!=null) {
				
			
			 /*	ret[0][0] = sheet.getRow(0).getCell(0).getStringCellValue();
		        ret[0][1] = sheet.getRow(0).getCell(1).getStringCellValue();
		        ret[0][2] = sheet.getRow(0).getCell(2).getStringCellValue();
		        ret[0][3] = sheet.getRow(0).getCell(3).getStringCellValue();
		        ret[0][4] = sheet.getRow(0).getCell(4).getStringCellValue();
		        ret[0][5] = sheet.getRow(0).getCell(5).getStringCellValue();
		        ret[0][6] = sheet.getRow(0).getCell(6).getStringCellValue();
		        ret[0][7] = sheet.getRow(0).getCell(7).getStringCellValue();
		        ret[0][8] = sheet.getRow(0).getCell(8).getStringCellValue();
		        ret[0][9] = sheet.getRow(0).getCell(9).getStringCellValue();*/
//			}
			
			for(int i =0;i<rowsCount;i++) {//i=1從第一欄開始 i=0是標題
				row = sheet.getRow(i);
				for(int j = 1;j<=10;j++) {
					
				}
				String ITEMS = String.valueOf(i);
		        String PRODUCT_NO = "";
		        String SPEC =""; //品名規格
		        String LICENSE_NO = "";
		        String SERIAL_NO = "";
		        String EXP_DATE = "";
		        String UDI = "";
		        String PRODUCT_QTY = "";
		        String user = "";
		        String currentTime = "";
		        
		        ret[i][0] = ITEMS;
		        ret[i][1] = PRODUCT_NO;
		        if(row.getCell(1)!=null && row.getCell(1).getCellType() != CellType.BLANK && StringUtils.isNotBlank(row.getCell(1).toString())) {
		        ret[i][2] = row.getCell(1).getStringCellValue();
		        }
		        ret[i][3] = LICENSE_NO;
		        if(row.getCell(2)!=null && row.getCell(2).getCellType() != CellType.BLANK && StringUtils.isNotBlank(row.getCell(2).toString())) {
		        ret[i][4] = row.getCell(2).getStringCellValue();
		        }
		        if(row.getCell(4)!=null && row.getCell(4).getCellType() != CellType.BLANK && StringUtils.isNotBlank(row.getCell(4).toString())) {
		        ret[i][5] = DateFormatUtils.format(row.getCell(4).getDateCellValue(), "yyyy/MM/dd");
		        }
		        ret[i][6] = UDI;
		        if(row.getCell(3)!=null && row.getCell(3).getCellType() != CellType.BLANK && StringUtils.isNotBlank(row.getCell(3).toString())) {
		        NumberFormat nf = NumberFormat.getInstance();
		        ret[i][7] = nf.format(row.getCell(3).getNumericCellValue());
		        }
		        ret[i][8] = user;
		        ret[i][9] = currentTime;
		        
				
			}
			
				for(String []arr:ret) {
					for (String str : arr) {
						System.out.println("arr:" + str);
					}
				}

				// 匯出
				String path = "D:\\測試2.xlsx";
				Sheet creSheet = workbook.createSheet();

				for (int i = 0; i < ret.length; i++) {
					row = sheet.createRow(i);
					for (int c = 0; c < ret[0].length; c++) {
						cell = row.createCell(c);
						cell.setCellValue(ret[i][c]);
					}
				}
				try {
				    FileOutputStream fos = new FileOutputStream(new File(path));
				    workbook.write(fos);
				    fos.flush();
				    fos.close();
				} catch (IOException e) {
				    e.printStackTrace();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
