package fileupload;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload() {
        String absolutePath = "C:\\Users\\hayk.bakhshyan\\IdeaProjects\\the-internet.herokuapp.com\\resources\\chromedriver.exe";
        var fileUpload = homePage.clickFileUploadPage();
        fileUpload.uploadFile(absolutePath);
        Assert.assertTrue(absolutePath.contains(fileUpload.uploadedFileConfirmation()),"File is not uploaded");
    }
}
