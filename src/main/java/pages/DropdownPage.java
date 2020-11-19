package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    WebDriver driver;
    private By drownDown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        this.driver=driver;
    }

    public void selectFromDropdown(String option){
        Select dropdownElement = FindDropdownElement();
        FindDropdownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions(){
       List<WebElement> selectedElements = FindDropdownElement().getAllSelectedOptions();
       return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private Select FindDropdownElement(){
        return new Select(driver.findElement(drownDown));
    }
}
