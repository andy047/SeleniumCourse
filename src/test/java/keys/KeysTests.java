package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class KeysTests extends BaseTests {

    //private KeyPressesPage keyPressesPage;
    @Test
    public void testBackspace(){
        var keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE","Resultado diferentes");

    }
    @Test
    public void testPi(){
        var keyPressPage = homePage.clickKeyPresses();
        keyPressPage.enterPi();
        assertEquals(keyPressPage.getResult(),"You entered: 7","incorrect result");
    }
}
