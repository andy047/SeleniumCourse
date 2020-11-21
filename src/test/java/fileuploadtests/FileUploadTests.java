package fileuploadtests;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void fileUploadTest(){
        var fileUpload = homePage.clickFileUploads();
        fileUpload.setInputField("C:\\testautomationu\\src\\main\\java\\pages\\AlertsPage.java");
        //WebDriverWait wait = new WebDriverWait(driver, 50);
        //wait.until(ExpectedConditions.attributeContains(By.tagName("div"),"id","uploaded-files"));
        assertEquals(fileUpload.getText(),"AlertsPage.java","incorrect result");
    }
}
