package base.exercise;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ShiftingContent {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        //driver.manage().window().setSize(new Dimension(375 , 812));

        WebElement inputsLink = driver.findElement(By.linkText("Shifting Content"));
        inputsLink.click();

        WebElement exampleLink = driver.findElement(By.linkText("Example 1: Menu Element"));
        exampleLink.click();


        List<WebElement> elements = driver.findElements(By.tagName("li"));
        System.out.println("Number of menu items: " + elements.size());


        System.out.println(driver.getTitle());
        driver.quit();
    }
    public static void main(String args[]){
        ShiftingContent test = new ShiftingContent();
        test.setUp();

    }

}
