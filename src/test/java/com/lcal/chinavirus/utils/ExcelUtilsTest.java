package com.lcal.chinavirus.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExcelUtilsTest {

    @Test
    public void testReadExcelFile() {
        Path resourceDirectory = Paths.get("src", "test", "resources", "선별진료소목록.xlsx");
        File file = resourceDirectory.toFile();

        log.info(file.getAbsolutePath());

        try {
            XSSFWorkbook workbook = ExcelUtils.readExcelFile(file);
            XSSFSheet sheet = ExcelUtils.getSheet(workbook, 0);

            List<Row> rows = ExcelUtils.getAllRow(sheet);

            for (Row row : rows) {
                StringBuilder str = new StringBuilder();
                for (int i=0; i<row.getPhysicalNumberOfCells(); i++) {
                    str.append(row.getCell(i).getStringCellValue()).append(" ");
                }
                // log.info(str.toString());
            }
        } catch (InvalidFormatException | IOException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}