package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.NumberFormat;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class importExcel {
	
	 public static  String getCelltoString(Cell cell) {
	 		if (cell == null) {
	 			return "";
	 		}
	 		NumberFormat nf = NumberFormat.getInstance();
	 		String str = "";
	 		switch (cell.getCellType()) {
	 		case STRING:	//string
	 			str = cell.getStringCellValue(); break;
	 		case NUMERIC:	//數值型，轉爲string
	 			
	 			if (DateUtil.isCellInternalDateFormatted(cell)) {
	 				str = DateFormatUtils.format(cell.getDateCellValue(), "yyyy/MM/dd");break;
	 		    }else {
	 		    	str = String.valueOf(nf.format(cell.getNumericCellValue())); break;
	 		    }
	 		case BOOLEAN:	//Boolean型
	 			str = String.valueOf(cell.getBooleanCellValue()); break;
	 		case FORMULA:	//公式
	 			str = String.valueOf(cell.getCellFormula()); break;
	 		case BLANK:		//空白
	 			str = ""; break;
	 		case ERROR:		//錯誤
	 			str = ""; break;
	 		default:
	 			str = "";
	 		}
	 		return str;
	 	}
	
	public static void main(String[] args) {
		
		FileInputStream input = null;
//		String filePath = "D:\\testExcel-notitle.xlsx";
//		String filePath = "D:\\修改格式-ODBC_ShippingDetails_CHIU_22011833 (2)-.xlsx";
//		String filePath = "D:\\testExcel.xls";
		String filePath = "D:\\上傳範例 (3).xlsx";
		
		try {
			input = new FileInputStream(filePath);
			
			Workbook workbook = null;
			Sheet sheet = null;
			Row row = null;
			Cell cell = null;
//			HSSFFont font = (HSSFFont) workbook.createFont();
//			font.setBold(true);
			
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
				 NumberFormat nf2 = NumberFormat.getNumberInstance();
				String ITEMS = String.valueOf(i);
//		        String PRODUCT_NO = nf2.format(row.getCell(0).getNumericCellValue()).replace(",","")+"";
		        String PRODUCT_NO = "";
		        String SPEC =""; //品名規格
		        String LICENSE_NO = "";
		        String SERIAL_NO = "";
		        String EXP_DATE = "";
		        String UDI = "";
		        String PRODUCT_QTY = "";
		        String user = "";
		        String currentTime = "";
		        
				try {
					importExcel ie = new importExcel();
					PRODUCT_NO = getCelltoString(row.getCell(0)).replace(",","");
					PRODUCT_NO = StringUtils.leftPad(PRODUCT_NO, 18,'0');
					SPEC = ie.getCelltoString(row.getCell(1));
					SERIAL_NO = ie.getCelltoString(row.getCell(2));
					EXP_DATE = ie.getCelltoString(row.getCell(4));
					PRODUCT_QTY = ie.getCelltoString(row.getCell(3));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		        
		        ret[i][0] = ITEMS;
		        ret[i][1] = PRODUCT_NO;
//		        if(row.getCell(1)!=null && row.getCell(1).getCellType() != CellType.BLANK && StringUtils.isNotBlank(row.getCell(1).toString())) {
//		        ret[i][2] = row.getCell(1).getStringCellValue();
//		        }
		        ret[i][2] = SPEC;
		        ret[i][3] = LICENSE_NO;
		        ret[i][4] = SERIAL_NO;
		        ret[i][5] = EXP_DATE;
		        
//		        ret[i][4] = String.valueOf(row.getCell(2).getNumericCellValue());
//		        if(row.getCell(2)!=null && row.getCell(2).getCellType() != CellType.BLANK && StringUtils.isNotBlank(row.getCell(2).toString())) {
//		        ret[i][4] = row.getCell(2).getStringCellValue();
//		        }
//		        if(row.getCell(4)!=null && row.getCell(4).getCellType() != CellType.BLANK && StringUtils.isNotBlank(row.getCell(4).toString())) {
//		        ret[i][5] = DateFormatUtils.format(row.getCell(4).getDateCellValue(), "yyyy/MM/dd");
//		        }
		        ret[i][6] = UDI;
		        ret[i][7] = PRODUCT_QTY;
//		        if(row.getCell(3)!=null && row.getCell(3).getCellType() != CellType.BLANK && StringUtils.isNotBlank(row.getCell(3).toString())) {
//		        ret[i][7] = (String.valueOf(row.getCell(3).getNumericCellValue())).replaceAll(".0","");
//		        NumberFormat nf = NumberFormat.getInstance();
//		        ret[i][7] = nf.format(row.getCell(3).getNumericCellValue());
//		        }
		        ret[i][8] = user;
		        ret[i][9] = currentTime;
		        
				
				//======================
			/*for(int j =0;j<10;j++) {
				cell = row.getCell(j);
				String title = "項次"+i+"-"+j+" "+ret[0][j]+": ";
				if(cell.getCellType() == CellType.STRING) {
//					ret[i][j] = cell.getStringCellValue();
					System.out.println(title + cell.getStringCellValue());
				} 
				else if(cell.getCellType() == CellType.NUMERIC) {
					if(DateUtil.isCellDateFormatted(cell)) {
						
//						ret[i][j] = DateUtil.getJavaDate(cell.getNumericCellValue()).toString();
//						System.out.println(title + DateUtil.getJavaDate(cell.getNumericCellValue()).toString());
					
//						System.out.println(title + cell.getDateCellValue());
						System.out.println(title + DateFormatUtils.format(cell.getDateCellValue(), "yyyy/MM/dd"));
					}else {
//						ret[i][j] = String.valueOf(cell.getNumericCellValue());
						double cellValue = cell.getNumericCellValue();
						String numStr = String.valueOf(cellValue);
//						cellValue = new DecimalFormat("#").format(cellValue);
						System.out.println(title + numStr);
					}
					
				}
				
			}*/
			//====================
			}
//			CellStyle cellstyle = 	workbook.createCellStyle();
//			cellstyle.setAlignment(HorizontalAlignment.CENTER);
//			HSSFCell hc = null ;
//			hc.setCellType(CellType.STRING);
//			cellstyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//			cellstyle.setBorderBottom(BorderStyle.valueOf((short) 1));
			
				for(String []arr:ret) {
					for(String str:arr) {
						System.out.println("arr:"+str);
					}
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
