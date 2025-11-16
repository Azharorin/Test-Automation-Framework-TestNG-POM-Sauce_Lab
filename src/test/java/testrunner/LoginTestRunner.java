package testrunner;

import config.SetUp;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCart;

public class LoginTestRunner extends SetUp {

    @Test
    public void do_Login(){
        loginpage =launchApplication();
        AddToCart AddToCart =loginpage.do_Login("standard_user","secret_sauce");
        AddToCart.addToCart_Product();
        String expectedItemName = AddToCart.getInventoryItemName();
        String actualItemName = "Sauce Labs Backpack";
        Assert.assertEquals(expectedItemName, actualItemName);



    }


}
