package org.example;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;


public class BulkUpload {
    //Function to Generate Random String.
    public static String randomString(int length){
        //Get the lower limit of character based on ASCII value.
        int lowerLimit=97;
        //Get the upper limit of character based on ASCII value.
        int upperLimit=122;
        //Memory Allocation for string based on the length of expected datatype.
        StringBuffer buffer=new StringBuffer(length);
        //Instantiate Random class to generate Random String or numeric.
        Random rand1=new Random();
        //For loop to generate random characters based on random ASCII values
        for (int a=0;a<length;a++){
            char res=(char)(lowerLimit+(int)(rand1.nextFloat()*(upperLimit-lowerLimit)));
            buffer.append(res);
        }
        //convert and return the Object type of StringBuffer to String
        return buffer.toString();
    }
    //Generate Random data based on Actual Data type and length
    public static Object generateRandomData(Object eDatatype,Object aDatatype,Integer length){
        Random rand=new Random();
        //If Expected Data type is String generate Actual Datatype as Integer.
        if(eDatatype=="String"){

            Integer result= rand.nextInt(length);
            return result;
        }
        //If Expected Data type is Integer or double  call the randomString generator to String value.
        else{
            String result=randomString(length);
            return result;
        }

    }
    //Derive Actual Datatype based on the Expected Datatype.
    public static String getActualDataType(String Edatatype){

        if(Edatatype.equals("String")){
            String Adatatype="Integer";
            return Adatatype;
        }
        else{
            String Adatatype="String";
            return Adatatype;
        }

    }
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("BulkDataSheet1.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            Sheet sheet1 = workbook.getSheetAt(0);
            //Get the first row, of the excel file, targetting the headers
            Row row1 = sheet1.getRow(0);
            String eDatatype;
            String aDatatype;
            Integer length;
            String dtype;
            //Get the number of rows to to populate data (Hard Coded)
            Integer rowCount = 10;
            //Get the first cell number of the first row
            int firstCellNum = row1.getFirstCellNum();
            //Get the last cell number of the first row
            int lastCellNum = row1.getLastCellNum();
            //Iterate through the rows for which we want populate data.
            for (int j = sheet1.getFirstRowNum()+1; j < rowCount; j++) {
                //Create an empty row.
                Row rowobj= sheet1.createRow(j);
                //Iterate through the headers
                for (int i = firstCellNum; i < lastCellNum; i++) {
                    //Getting the actual values of the headers for each column
                    String columnName = row1.getCell(i).getStringCellValue();

                    switch (columnName) {

                        case "SKU":
                            eDatatype = "String";
                            length = 100;

                            dtype=BulkUpload.getActualDataType(eDatatype);
                            //Creating an empty cell for each row,set cell values based on actual datatype and length
                            //Getting the Random data of object type and convert it into Double data type.
                            rowobj.createCell(i).setCellValue(new Double(BulkUpload.generateRandomData(eDatatype,dtype,length).toString()));
                            break;
                        case "BARCODE":
                            eDatatype = "String";
                            length = 150;
                            dtype=BulkUpload.getActualDataType(eDatatype);
                            //Creating an empty cell for each row,set cell values based on actual datatype and length
                            //Getting the Random data of object type and convert it into Double data type.
                            rowobj.createCell(i).setCellValue(new Double(BulkUpload.generateRandomData(eDatatype,dtype,length).toString()));
                            break;
                        case "MRP":
                            eDatatype = "Double";
                            length = 10;
                            dtype=BulkUpload.getActualDataType(eDatatype);
                            //Creating an empty cell for each row,set cell values based on actual datatype and length
                            //Getting the Random data of object type and convert it into String data type.
                            rowobj.createCell(i).setCellValue(BulkUpload.generateRandomData(eDatatype,dtype,length).toString());
                           break;
                        case "SP":
                            eDatatype = "Double";
                            length = 10;
                            dtype=BulkUpload.getActualDataType(eDatatype);
                            //Creating an empty cell for each row,set cell values based on actual datatype and length
                            //Getting the Random data of object type and convert it into String data type.
                            rowobj.createCell(i).setCellValue(BulkUpload.generateRandomData(eDatatype,dtype,length).toString());
                            break;
                        case "INVENTORY":
                            eDatatype = "Integer";
                            length = 11;
                            dtype=BulkUpload.getActualDataType(eDatatype);
                            //Creating an empty cell for each row,set cell values based on actual datatype and length
                            //Getting the Random data of object type and convert it into String data type.
                            rowobj.createCell(i).setCellValue(BulkUpload.generateRandomData(eDatatype,dtype,length).toString());
                            break;
                        case "POS_ID":
                            eDatatype = "String";
                            length = 40;
                            dtype=BulkUpload.getActualDataType(eDatatype);
                            rowobj.createCell(i).setCellValue(new Double(BulkUpload.generateRandomData(eDatatype,dtype,length).toString()));
                            break;
                        case "INTERNAL_ID":
                            eDatatype = "Integer";
                            length = 11;
                            dtype=BulkUpload.getActualDataType(eDatatype);
                            //Creating an empty cell for each row,set cell values based on actual datatype and length
                            //Getting the Random data of object type and convert it into String data type.
                            rowobj.createCell(i).setCellValue(BulkUpload.generateRandomData(eDatatype,dtype,length).toString());
                            break;

                    }
                }
            }
            //Opening the excel file to write the data
            FileOutputStream wfile=new FileOutputStream("BulkDataSheet1.xlsx");
            //writing the data in workbook
            workbook.write(wfile);
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
}