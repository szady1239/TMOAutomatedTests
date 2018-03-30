package pl.execon.tmo.main.java.input;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellRangeAddress;
import pl.execon.tmo.main.java.utils.GenericDataHelper;
import pl.execon.tmo.main.java.utils.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Class used to parse and check xlsx sheets
 *
 * @author Pawel Lagodzinski
 * @since 2016-07-15
 * @version 1.0
 */
public class XlsHelper {

    private static String FIRST_FOOTER_VALUE = "Parametr";
    private static String SECOND_FOOTER_VALUE = "Wartość";
    private static String THIRD_FOOTER_NAME = "Zestaw danych";

    private XlsHelper() { }

    /**
     * Method to check if cell contains white chars and if is header
     *
     * @param paramCell cells contains parameter name
     * @return true if cells contains illegal content
     */
    public static boolean checkHeader(Cell paramCell) {
        boolean paramCellisNull = paramCell == null;
        if(!paramCellisNull) {
            String toCheck = GenericDataHelper.removeWhiteSpace(paramCell.getStringCellValue());
            return toCheck.equalsIgnoreCase(FIRST_FOOTER_VALUE) ||
                    toCheck.equalsIgnoreCase(SECOND_FOOTER_VALUE) ||
                    toCheck.contains(THIRD_FOOTER_NAME);
        } else {
            return true;
        }
    }

    /**
     * Method used to read sheet containing configuration / source data
     *
     * @param file workbook file (xlsx)
     * @param sheetName sheet containing data
     * @return null if sheet doesn't exists
     */
    public static Sheet readSheet(File file, String sheetName) {

        try(InputStream inp = new FileInputStream(file)) {
            Workbook wb = WorkbookFactory.create(inp);
            return wb.getSheet(sheetName);
        } catch (IOException|InvalidFormatException e) {
            Log.error("Can't read sheet " + sheetName + " : " + e.getMessage());
            return null;
        }
    }

    /**
     * Get merged cells from sheet
     *
     * @param sheet sheet to parse
     * @return list contains merged cells
     */
    public static List<CellRangeAddress> getMergedRegions(Sheet sheet) {
        List<CellRangeAddress> regionsList = new ArrayList<>();
        for(int i = 0; i < sheet.getNumMergedRegions(); i++) {
            regionsList.add(sheet.getMergedRegion(i));
        }
        return regionsList;
    }

    /**
     * Check if cell is merged cell
     *
     * @param regions list of merged cells
     * @param cell xlsx cell to check
     * @return true if cell is merged cell, false if not
     */
    public static boolean isCellInMergedRegion(List<CellRangeAddress> regions, Cell cell) {
        for(CellRangeAddress region : regions) {
            if(region.isInRange(cell.getRowIndex(), cell.getColumnIndex())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
