package com.lcal.chinavirus.service;

import com.lcal.chinavirus.utils.ExcelUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.h2.util.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class HospitalService {


    public String getExcelFileFromServer(){
        Path resourceDirectory = Paths.get("src", "test", "resources", "선별진료소목록.xlsx");
        File file = resourceDirectory.toFile();

        log.info(file.getAbsolutePath());

        String result= "";
        StringBuilder str = new StringBuilder();

        try {
            XSSFWorkbook workbook = ExcelUtils.readExcelFile(file);
            XSSFSheet sheet = ExcelUtils.getSheet(workbook, 0);

            List<Row> rows = ExcelUtils.getAllRow(sheet);

            List<Object[]> list = new ArrayList<>();

            for (Row row : rows) {
                for (int i=0; i<row.getPhysicalNumberOfCells(); i++) {
                    str.append(row.getCell(i).getStringCellValue()).append(" ");
                }
                log.info(str.toString());
            }

        } catch (InvalidFormatException | IOException e) {
            e.printStackTrace();
        }

        return result = str.toString();
    }

    public JSONObject excelToJsonFormat(){
        JSONObject object =null ;

        return object;
    }
}
