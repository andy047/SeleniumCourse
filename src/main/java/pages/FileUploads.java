package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploads {
    WebDriver driver;

    private By inputField       = By.id("file-upload");
    private By uploadButton     = By.id("file-submit");
    private By result           = By.id("uploaded-files");

    public FileUploads(WebDriver driver) {
        this.driver=driver;
    }

    public void setInputField(String path){
        driver.findElement(inputField).sendKeys(path);
        clickUploadButton();
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    public String getText() {
        return driver.findElement(result).getText();
    }
}
