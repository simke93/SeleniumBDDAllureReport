package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static junit.framework.Assert.assertEquals;

public class LoggedInPage extends BrowserDriver {


    public static String productcategory_formalshoes = "//*[text()='Formal Shoes']";
    public static String productcategory_sportshoes = "//*[text()='Sports']";
    public static String productcategory_sneakershoes = "//*[text()='Sneakers']";

    public static void validity_productcategory_formalshoes() throws InterruptedException {
        String actualproductcategory_fs =
                driver.findElement(By.xpath(productcategory_formalshoes)).getText();
        assertEquals("Formal Shoes", actualproductcategory_fs);
    }

    public static void validity_productcategory_sportsshoes() throws InterruptedException {
        String actualproductcategory_ss =
                driver.findElement(By.xpath(productcategory_sportshoes)).getText();
        assertEquals("Sports", actualproductcategory_ss);
    }

    public static void validity_productcategory_sneakershoes() throws InterruptedException {
        String actualproductcategory_s =
                driver.findElement(By.xpath(productcategory_sneakershoes)).getText();
        assertEquals("Sneakers",actualproductcategory_s);
    }

}
