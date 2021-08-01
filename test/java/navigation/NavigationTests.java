package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com");

    }

    @Test
    public void testSwitchToTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
    }

    @Test
    public void testOpenExample2InNewTap(){
        var DynamicLoadingExample2Page= homePage.clickDynamicLoading().openExample2InNewTap();
        getWindowManager().switchToNewTab();
        assertTrue(DynamicLoadingExample2Page.isStartButtonDisplayed() , "Start button is not displayed");
    }
}
