package utility;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by izran on 1/9/2017.
 */
public class ExcelReader {
    public static List<List<String>> readExcelFile(String ExcelFile, int SheetNumber)
    {
        String excelFilePath = ExcelFile;// can be .xls or .xlsx
        Workbook workbook = null;

        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream(new File(excelFilePath));
            workbook = getWorkbook(inputStream, excelFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Sheet firstSheet = workbook.getSheetAt(SheetNumber);
        Iterator<Row> iterator = firstSheet.iterator();

        List<List<String>> SheetRows = new ArrayList<>();

        //ignore first row, expecting column headers
        if(iterator.hasNext())
            iterator.next();

        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            List<String> OneRow = new ArrayList<>();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();

                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        OneRow.add(cell.getStringCellValue());
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        OneRow.add(String.valueOf(cell.getBooleanCellValue()));
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        OneRow.add(String.valueOf(cell.getNumericCellValue()));
                        break;
                }
            }
            SheetRows.add(OneRow);
        }

        try {
            workbook.close();
            inputStream.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return SheetRows;

    }

    private static Workbook getWorkbook(FileInputStream inputStream, String excelFilePath)
            throws IOException {
        Workbook workbook = null;

        if (excelFilePath.endsWith("xlsx")) {
            workbook = new HSSFWorkbook(inputStream);
        } else if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook(inputStream);
        } else {
            throw new IllegalArgumentException("The specified file is not Excel file");
        }

        return workbook;
    }

    public static String[][] ListToTwoDimensionArray(List<List<String>> list)
    {
        String[][] twoDimensionArray = new String[list.size()][];
        int i = 0;
        for (List<String> next : list) {
            twoDimensionArray[i++] = next.toArray(new String[next.size()]);
        }

        return twoDimensionArray;
    }
}
