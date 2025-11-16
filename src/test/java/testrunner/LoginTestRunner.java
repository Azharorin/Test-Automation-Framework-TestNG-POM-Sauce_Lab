package testrunner;

import config.SetUp;
import org.testng.annotations.Test;

public class LoginTestRunner extends SetUp {
    @Test

    public void do_login(){
        loginpage =launchApplication();
        loginpage.do_login("standard_user","secret_sauce");


    }

}
