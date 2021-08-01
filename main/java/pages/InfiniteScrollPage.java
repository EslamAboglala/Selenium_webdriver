package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {

    private WebDriver driver;
    private By textBlock = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Scrolls until paragraph with index specified is in view
     * @param index 1-based
     */
    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0 , document.body.scrollHeight)";
        var jsExcuter = ((JavascriptExecutor)driver);

        while(getNumberOfParagraphSent() < index){
            jsExcuter.executeScript(script);
        }
    }

    private int getNumberOfParagraphSent(){
        return driver.findElements(textBlock).size();
    }

}
