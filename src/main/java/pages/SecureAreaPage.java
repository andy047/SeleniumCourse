package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;

    private By statusAlert = By.id("flash");
    //private By signOutButton = By.cssSelector();

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getStatusAlert(){
        return driver.findElement(statusAlert).getText();
    }


}
