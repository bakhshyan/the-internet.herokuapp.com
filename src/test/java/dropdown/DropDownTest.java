package dropdown;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropDownTest extends BaseTest {

    @Test
    public void testSelectOption() {

        var dropdownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropdownPage.selectFromDropDown(option);
        var selectedOptions =dropdownPage.getSelectedOptions();

        Assert.assertEquals(selectedOptions.size(), 1, "Iccorect number of  selections");
        Assert.assertTrue(selectedOptions.contains(option), "Option not selected");



    }
}

