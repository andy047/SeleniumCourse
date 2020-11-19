package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton   = By.xpath("//button[@onclick='jsAlert()']");
    private By triggerConfirmButton = By.xpath("//button[@onclick='jsConfirm()']");
    private By result = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }

}
