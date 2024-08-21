import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {
public static void main(String[] args) throws IOException {
	String filePath=System.getProperty("user.dir")+"/text_data/test.xlsx";
	Workbook book=new XSSFWorkbook(filePath);
}
}
