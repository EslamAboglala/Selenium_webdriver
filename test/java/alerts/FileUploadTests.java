package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUploadPage= homePage.clickFileUpload();
        fileUploadPage.uploadFile("F:\\Testing\\testautomation\\webdriver_java15\\pom.xml");
        assertEquals(fileUploadPage.getUploadedFilesNames(), "pom.xml" , "File name is incorrect");
    }

}
