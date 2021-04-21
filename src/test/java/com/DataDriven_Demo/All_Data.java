package com.DataDriven_Demo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data {
	public static void all_data() throws Throwable {
		File f = new File("E:\\automation eng\\.metadata\\.metadata\\.metadata\\Automation_Projecthh\\Sample.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int row_size = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < row_size; i++) {
			Row row = sheetAt.getRow(i);
			int cell_Size = sheetAt.getPhysicalNumberOfCells();
			
			for (int j = 0; j < cell_Size; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);

				} else if (cellType.equals(CellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int value = (int) numericCellValue;
					System.out.println(value);

				}
			}
		}
	}

	public static void main(String[] args) throws Throwable {
		all_data();
	}
}



