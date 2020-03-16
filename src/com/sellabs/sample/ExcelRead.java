/**
 * 
 */
package com.sellabs.sample;

import java.io.File;

import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

/**
 * @author vijay
 *
 */
public class ExcelRead {

	String inputdata;

	public String[][] readExcel() throws Exception, IOException {
		File f = new File("D:\\Book1.xls"); // mention the path of the file to read
		// System.out.println(new File(".").getAbsoluteFile()); //to get path where
		// console is
		Workbook wb = Workbook.getWorkbook(f); // get the workbook of that file
		Sheet sh = wb.getSheet(0); // get the sheet of the workbook(we can give name also
		int rows = sh.getRows(); // get the rows of particular sheet
		int columns = sh.getColumns(); // get the cols of that particular sheet
		String[][] inputdata = new String[rows][columns]; // create an array to store the excel values
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns-1; j++) { // as we are not displaying headers,reduced count by 1(headers are
													// in 1st column)
				Cell c = sh.getCell(j + 1, i); // it will specify the particular cell and skip the first column so J+1
				inputdata[i][j] = c.getContents(); // get the contents of the cell
				System.out.print(inputdata[i][j] + "  ");
			}
			System.out.println();
		}

		return inputdata;
	}

	public static void main(String[] args) throws IOException, Exception {
		ExcelRead ew = new ExcelRead();
		ew.readExcel();

	}

}
