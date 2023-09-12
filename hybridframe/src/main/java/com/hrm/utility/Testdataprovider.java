package com.hrm.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testdataprovider {

	XSSFWorkbook book;
	
	public Testdataprovider()
	{
		File fis=new File("./testdata/testdata.xlsx");
		try {
			FileInputStream files=new FileInputStream(fis);
			 book=new XSSFWorkbook(files);
		} catch (Exception e) {
			System.out.println("File is missing" + e.getMessage());
		}
		}
	
	
	public String getexceldata(String sheetname,int row,int coloum)
	{
		return book.getSheet(sheetname).getRow(row).getCell(coloum).getStringCellValue();
	}
	
	public String getexceldata(int sheetindex,int row,int coloum)
	{
		return book.getSheetAt(sheetindex).getRow(row).getCell(coloum).getStringCellValue();
		
	}
	}

