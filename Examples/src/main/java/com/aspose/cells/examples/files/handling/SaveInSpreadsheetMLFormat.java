package com.aspose.cells.examples.files.handling;

import com.aspose.cells.FileFormatType;
import com.aspose.cells.Workbook;
import com.aspose.cells.examples.Utils;

public class SaveInSpreadsheetMLFormat {

	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SaveInSpreadsheetMLFormat.class) + "files/";

		// Creating an Workbook object with an Excel file path
		Workbook workbook = new Workbook();

		// Save in SpreadsheetML format
		workbook.save(dataDir + "SISSheetMLFormat-out.xml", FileFormatType.EXCEL_2003_XML);

		// Print Message
		System.out.println("Worksheets are saved successfully.");

	}
}