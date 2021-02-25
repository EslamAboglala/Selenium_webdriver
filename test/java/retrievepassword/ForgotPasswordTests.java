package retrievepassword;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testRetrievePassword(){
        var forgotPasswordPage= homePage.clickForgotPassword();
        forgotPasswordPage.EnterEmail("TAU@example.com");
        var emailSentPage = forgotPasswordPage.clickRetrievePassword();
        assertEquals(emailSentPage.getAlertText(),"Your e-mail's been sent!" , "Message is incorrect");
    }
}
