package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var dynamicLoadingExample1Page= homePage.clickDynamicLoading().clickExample1();
        dynamicLoadingExample1Page.clickStartButton();
        assertEquals(dynamicLoadingExample1Page.getLoadedText() ,"Hello World!" , "Loaded text is incorrect");
    }

    @Test
    public void testWaitUntilShown(){
        var dynamicLoadingExample2Page= homePage.clickDynamicLoading().clickExample2();
        dynamicLoadingExample2Page.clickStartButton();
        assertEquals(dynamicLoadingExample2Page.getLoadedText() ,"Hello World!" , "Loaded text is incorrect");
    }
}
