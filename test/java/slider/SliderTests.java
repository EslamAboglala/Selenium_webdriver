package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void testSlider(){
        String value = "4";
        var horizontalSliderPage= homePage.clickHorizontalSlider();
        horizontalSliderPage.setSliderValue(value);
        assertEquals(horizontalSliderPage.getSliderValue() , value , "Slider is incorrect");
    }


}
