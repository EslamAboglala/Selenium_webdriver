package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwg(){
        var wysiwygEditorPage= homePage.clickWYSIWYGEditor();
        String text1 = "Hello " , text2 = "World";
        wysiwygEditorPage.clearTextArea();
        wysiwygEditorPage.setTextArea(text1);
        wysiwygEditorPage.increaseIndention();
        wysiwygEditorPage.setTextArea(text2);
        assertEquals(wysiwygEditorPage.getTextFromEditor(),text1+text2  , "Text from editor is incorrect");
    }
}
