

	package com.DDT;

	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

	public class ReadData {

		@Test
		public void readDataTest()  {
			
			XSSFWorkbook wb;
			XSSFSheet sheet;
			XSSFRow row;
			XSSFCell cell;
			 
			try {
				FileInputStream fis=new FileInputStream("D:\\Imp_Projects\\Selenium projects\\Current Workspace\\Data_Driven_Test_App\\Resources\\ReadExcel.xlsx");
				 wb=new XSSFWorkbook(fis);
				sheet=wb.getSheetAt(0);
				String sheetName=sheet.getSheetName();
				System.out.println("Sheet name is : "+sheetName);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
			
		}

	}


