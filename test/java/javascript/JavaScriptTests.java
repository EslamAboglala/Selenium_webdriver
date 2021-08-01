package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTests {

    @Test
    public void testScrollToTable(){
        var largeAndDeepDOMPage= homePage.clickLargeAndDeepDOM();
        largeAndDeepDOMPage.scrollToTable();
    }

    @Test
    public void testScrollToFifteenthParagraph(){
        homePage.clickInfiniteScroll().scrollToParagraph(15);
    }

    @Test
    public void testAddMultipleAttributeToDropdown(){
        var dropdownPage= homePage.clickDropdown();
        dropdownPage.scrollToOption();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropdownPage::selectFromDropdown);

        var selectedOptions = dropdownPage.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");


    }
}
