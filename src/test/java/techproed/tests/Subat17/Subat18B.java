package techproed.tests.Subat17;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Subat18B {
    Workbook workbook;
    Sheet sheet;
    public void ExcelReader(String dosyaYolu,String sayfaIsmi) throws IOException {
        FileInputStream fis=new FileInputStream(dosyaYolu);
        workbook= WorkbookFactory.create(fis);
        sheet=workbook.getSheet(sayfaIsmi);
    }
}
