package alerts;

import base.BaseTests;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {


    @Test
    public void triggerAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(),"You successfuly clicked an alert","Incorrect Result");
    }
    @Test
    public void triggerConfirm(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.triggerConfirm();
        alertPage.alert_clickToDismiss();
        //assertEquals(alertPage.alert_getText(), "I am a JS Confirm", "Incorrect confirm result");
    }
}
