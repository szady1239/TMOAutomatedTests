package pl.execon.tmo.main.java.input;

import com.google.common.collect.ArrayListMultimap;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import pl.execon.tmo.main.java.utils.GenericDataHelper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Class used to read test data from xlsx configuration file
 *
 * @author Pawel Lagodzinski
 * @author Mateusz Grajper
 * @version 1.0
 * @since 2016-07-15
 */
public class XlsSourceDataReader implements SourceDataReaderInterface {

  private static final String TC_CONFIGURATION_SHEET_NAME = "Konfiguracja";


  /**
   * Read test case data from xlsx file
   *
   * @param dataFilePath path where we can find test case data for selected test case
   * @param testCaseName name of test case
   * @return
   */

  @Override
  public List<ArrayListMultimap<String, String>> readTestCaseData(String dataFilePath,
      String testCaseName) {
    List<ArrayListMultimap<String, String>> result = new ArrayList<>();
    File file = new File(dataFilePath);
    if (file.exists()) {
      Sheet sheet = XlsHelper.readSheet(file, testCaseName);
      List<CellRangeAddress> mergedRegionsList = XlsHelper.getMergedRegions(sheet);

      if (sheet != null) {
        int columnNum = sheet.getRow(0).getPhysicalNumberOfCells();
        for (int col = 1; col < columnNum; col++) {
          ArrayListMultimap<String, String> columnMap = ArrayListMultimap.create();
          Iterator<Row> rowIterator = sheet.rowIterator();
          while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Cell paramCell = row.getCell(0);
            XSSFCell valueCell = (XSSFCell) row.getCell(col);
            if (row.getRowNum() == 0 && XlsHelper.checkHeader(paramCell)) {
              continue;
            }
            if (paramCell == null || (paramCell != null
                && XlsHelper.isCellInMergedRegion(mergedRegionsList, paramCell))) {
              continue;
            }
            String paramCellText = paramCell.getStringCellValue().toLowerCase();
            if (valueCell != null && valueCell.getCellType() == Cell.CELL_TYPE_STRING) {
              columnMap.put(GenericDataHelper.removeWhiteSpace(paramCellText),
                  GenericDataHelper.removeWhiteSpace(valueCell.getStringCellValue()));
            } else if (valueCell != null && valueCell.getCellType() == Cell.CELL_TYPE_BLANK) {
              columnMap.put(GenericDataHelper.removeWhiteSpace(paramCellText), "");
            } else if (valueCell != null && valueCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
              String cellValueString = valueCell.getRawValue();
              if (HSSFDateUtil.isCellDateFormatted(valueCell)) {
                Date cellDate = valueCell.getDateCellValue();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                cellValueString = sdf.format(cellDate);
              }
              columnMap.put(GenericDataHelper.removeWhiteSpace(paramCellText),
                  GenericDataHelper.removeWhiteSpace(cellValueString));
            } else {
              columnMap.put(GenericDataHelper.removeWhiteSpace(paramCellText), "");
            }

          }
          result.add(columnMap);
        }
      }
    }
    return result;
  }



  /**
   * Get list of name of test case's to execute
   *
   * @param dataFilePath path to information which test we should be executed
   * @return list of name of test case's to execute
   * @throws IOException when can't find or read sheet containing information which test should be
   *         executed
   */

  @Override
  public List<String> getTestCasesToRun(String dataFilePath) throws IOException {
    List<String> result = new ArrayList<>();
    File file = new File(dataFilePath);
    if (!file.exists()) {
      throw new IOException("File " + dataFilePath + " not exists");
    }
    Sheet sheet = XlsHelper.readSheet(file, TC_CONFIGURATION_SHEET_NAME);
    if (sheet != null) {
      Iterator<Row> rowIterator = sheet.rowIterator();
      while (rowIterator.hasNext()) {
        Row row = rowIterator.next();
        Cell paramCell = row.getCell(0);
        Cell valueCell = row.getCell(1);
        if (row.getRowNum() == 0 && XlsHelper.checkHeader(paramCell)) {
          continue;
        }
        if (paramCell == null) {
          continue;
        }
        if (valueCell != null && valueCell.getCellType() == Cell.CELL_TYPE_STRING) {
          if (GenericDataHelper
              .parseBool(GenericDataHelper.removeWhiteSpace(valueCell.getStringCellValue()))) {
            result.add(GenericDataHelper.removeWhiteSpace(paramCell.getStringCellValue()));
          }
        }
      }
    }

    return result;
  }
}
