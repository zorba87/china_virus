package com.lcal.chinavirus.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
    public static XSSFWorkbook readExcelFile(File file) throws InvalidFormatException, IOException {
        return new XSSFWorkbook(file);
    }

    public static XSSFSheet getSheet(XSSFWorkbook workbook, int sheetIndex) {
        return workbook.getSheetAt(sheetIndex);
    }

    public static List<Row> getAllRow(XSSFSheet sheet) {
        Iterator<Row> iter = sheet.iterator();
        List<Row> rows = new ArrayList<>();

        while(iter.hasNext()) {
            rows.add(iter.next());
        }

        return rows;
    }
}