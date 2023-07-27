package org.envision.seleniumTestngFeatures.commonUtil;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelReader {

    static Sheet ExcelSheet;

    static {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Ali\\base\\testdatafiles\\testData.xlsx.xlsx");
            Workbook wb = WorkbookFactory.create(fis);
            ExcelSheet = wb.getSheet("Sheet1");
        } catch (Exception e) {

        }

    }

    @DataProvider(name = "testData")
    public static String[][] readDataExcel(Method testCaseName1)
    {
        int RowNumber = ExcelSheet.getPhysicalNumberOfRows();
       ArrayList<String[]> allData = new ArrayList<>();

        for(int row = 1;row<RowNumber;row++)
        {
            Row r = ExcelSheet.getRow(row);

            int cellNum = r.getPhysicalNumberOfCells();

            String TestCaseName = r.getCell(1).getStringCellValue();
            String RunStatus = r.getCell(2).getStringCellValue();
            ArrayList<String> eachRow = new ArrayList<>();

            if(TestCaseName.equalsIgnoreCase(testCaseName1.getName())&& RunStatus.equalsIgnoreCase("yes"))
            {
                for(int col=3;col<cellNum;col++)
                {
                    eachRow.add(r.getCell(col).getStringCellValue());
                }
                allData.add(eachRow.toArray(new String[0]));
            }

        }
        return allData.toArray(new String[0][0]);

    }


}
