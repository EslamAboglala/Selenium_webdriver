package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var javaScriptAlertsPage= homePage.clickJavaScriptAlert();
        javaScriptAlertsPage.triggerAlert();
        javaScriptAlertsPage.alert_clickToAccept();
        assertEquals(javaScriptAlertsPage.getResultText(),"You successfully clicked an alert", "Result text incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var javaScriptAlertsPage= homePage.clickJavaScriptAlert();
        javaScriptAlertsPage.triggerConfirm();
        String text = javaScriptAlertsPage.alert_getText();
        javaScriptAlertsPage.alert_clickToDismiss();
        assertEquals(text ,"I am a JS Confirm","Alert Text is incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var javaScriptAlertsPage= homePage.clickJavaScriptAlert();
        javaScriptAlertsPage.triggerPrompt();
        String text = "Iam Eslam Aboglala";
        javaScriptAlertsPage.alert_setInput(text);
        javaScriptAlertsPage.alert_clickToAccept();
        assertEquals(javaScriptAlertsPage.getResultText() , "You entered: "+text , "Result text incorrect");
    }
}
