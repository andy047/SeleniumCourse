package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage {

    private WebDriver driver;
    private String frameId = "mce_0_ifr";
    private By BodyFrameId = By.id("tinymce");

    public FramePage(WebDriver driver){
        this.driver =driver;
    }

    private void switchEditorArea(){
        driver.switchTo().frame(frameId);
    }

    public void clearAreaText(){
        switchEditorArea();
        driver.findElement(BodyFrameId).clear();
        switchToParentArea();
    }

    public void setText(String text){
        driver.findElement(BodyFrameId).sendKeys(text);
    }

    private void switchToParentArea() {
        driver.switchTo().parentFrame();
    }

}
