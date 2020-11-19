package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerAlertButton   = By.xpath("//button[@onclick='jsAlert()']");
    private By triggerConfirmButton = By.xpath("//button[@onclick='jsConfirm()']");
    private By triggerProntButton = By.xpath("//button[@onclick='jsPrompt()']");
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
    public void triggerPrompt(){
        driver.findElement(triggerProntButton).click();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public void alert_sendText(String text){
        //driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().sendKeys(text);
    }
    public void alert_clickToOK(){
        driver.switchTo().alert().accept();
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }

}
