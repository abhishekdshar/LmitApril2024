package resuable;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ser.Serializers;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.InvalidArgumentException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel extends BaseCode {

    public static String getExcelData(String sheetName, int row, int column) throws IOException {

        FileInputStream fis = null;
        if(pro.getProperty("datasheet").equals("login")){
           fis = new FileInputStream(new File("src/main/resources/testdata/TestingData.xlsx"))  ;
        }
        else if(pro.getProperty("datasheet").equals("sample")){

            fis = new FileInputStream(new File("src/main/resources/testdata/ff.xlsx"))  ;
        }
        else{
            throw new InvalidArgumentException("enter the correct sheet name");
        }

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetName);
       String data= sheet.getRow(row).getCell(column).getStringCellValue();
        return data;
    }
}
