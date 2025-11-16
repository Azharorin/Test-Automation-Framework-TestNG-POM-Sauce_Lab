package testrunner;

import config.SetUp;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCart;
import pages.CheckOut;

public class LoginTestRunner extends SetUp {

    @Test
    public void do_Login() throws InterruptedException {
        loginpage = launchApplication();
        AddToCart AddToCart = loginpage.do_Login("standard_user", "secret_sauce");
        //AddToCart.addToCart_Product();
        CheckOut checkOut = AddToCart.addToCart_Product();
        String expectedItemName = AddToCart.getInventoryItemName();
        String actualItemName = "Sauce Labs Backpack";
        Assert.assertEquals(expectedItemName, actualItemName);
        checkOut.do_Checkout("azhar", "alam", "1229");
        String expected = checkOut.paymentInformationLabel();
        String actual = "Payment Information:";
        Assert.assertEquals(expected, actual);
        AddToCart.finishCheckOut();
        String expected_Name_For_Order = "Thank you for your order!";
        String ActualConfirmation_Name = checkOut.complete_Order();
        Assert.assertEquals(expected_Name_For_Order, ActualConfirmation_Name);
        AddToCart.backIn_Home();
        AddToCart.do_Logout();
    }


}
