package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTests {

    @Test
    public void testNestedFrames(){
        var nestedFramesPage= homePage.clickFrames().clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(),"LEFT" ,"Frame text is incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM" ,"Frame text is incorrect");
    }
}
