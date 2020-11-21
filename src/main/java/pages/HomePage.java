package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }


    public LoginPage clickFormAut(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

   private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
 }

    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploads clickFileUploads(){
        clickLink("File Upload");
        return new FileUploads(driver);
    }

    public FramePage clickFrame(){
        clickLink("WYSIWYG Editor");
        return new FramePage(driver);
    }
}
