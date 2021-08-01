package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickInBox();
        String text = contextMenuPage.getPopUpText();
        contextMenuPage.acceptPopUp();
        assertEquals(text,"You selected a context menu" , "PopUp message incorrect");
    }
}
