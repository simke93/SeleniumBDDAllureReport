package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class OnlineProductsPage extends BrowserDriver {

    public static String formalshoes_dropdown_selector = "body > div:nth-child(9) > center > div > i.fa.fa-angle-double-down.formalshoedropdown";

    public static String formalshoes_webtable_xpath = "/html/body/div[2]/table";

    public static String formalshoes_webtable_tr_xpath = "/html/body/div[2]/table/tbody/tr[1]/td" +
            "[1]";


    public static void click_formalshoes_dropdown() throws InterruptedException {
        driver.findElement(By.cssSelector(formalshoes_dropdown_selector)).click();
    }

    public static String gettext_formalshoes_firstvalue(){
        String formalshoesText =
                driver.findElement(By.xpath(formalshoes_webtable_tr_xpath)).getText();
        return formalshoesText;
    }




}
