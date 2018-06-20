package com.goldengate.xls.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	 XSSFWorkbook wb;
	 XSSFSheet  wbsheet;
	 
	public ExcelReader(String filePath,String fileName) throws IOException{

    //Create a object of File class to open xlsx file

    File file =    new File(filePath+ "/" +fileName);

    //Create an object of FileInputStream class to read excel file

    FileInputStream inputStream = new FileInputStream(file);

   // Workbook wb = null;

    //Find the file extension by spliting file name in substring and getting only extension name

  //  String fileExtensionName = fileName.substring(fileName.indexOf("."));

    //Check condition if the file is xlsx file

   // if(fileExtensionName.equals(".xlsx")){

    //If it is xlsx file then create object of XSSFWorkbook class

    wb = new XSSFWorkbook(inputStream);

 /*  }

    //Check condition if the file is xls file

    else if(fileExtensionName.equals(".xls")){

        //If it is xls file then create object of XSSFWorkbook class

        wb = new HSSFWorkbook(inputStream);

    }*/
    
	}
    
    public String getData(int sheetName, int rowName, int columnName)
    
    {

    //Read sheet inside the workbook by its name

     wbsheet = wb.getSheetAt(sheetName);

    //Create a loop over all the rows of excel file to read it

		
     Row row = wbsheet.getRow(rowName);
        
     Cell cell1 = row.getCell(columnName);
        
     DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
     
     String data  = formatter.formatCellValue(cell1);

     return data;
    
    }   
    
    
   
    
    public  int getRowCount(int sheetIndex )
    
    {
    	
        System.out.println("inside getRowCount Method");

        int rowCount = wb.getSheetAt(sheetIndex).getLastRowNum();

        
        System.out.println("total no. of rows are" + rowCount);
        
        rowCount = rowCount+1;
        		
    	return rowCount;
    }
    

}

    