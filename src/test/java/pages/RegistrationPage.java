package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static junit.framework.Assert.assertEquals;
import static pages.LoggedInPage.productcategory_formalshoes;

public class RegistrationPage extends BrowserDriver {

    public static String userRegistration_xpath = "/html/body/center/h1";


    public static void validity_user_registrationPage() throws InterruptedException {
        String actualproductcategory =
                driver.findElement(By.xpath(userRegistration_xpath)).getText();
        assertEquals("User Registration Page", actualproductcategory);
    }

}
