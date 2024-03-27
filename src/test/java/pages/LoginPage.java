package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {



    public static String username_text_id = "usr";
    public static String password_text_id = "pwd";
    public static String click_login_btn = "//*[@id=\"second_form\"]/input";

    public static String newregister_click_btn_id = "NewRegistration";

    public static void sendkeys_username() throws InterruptedException {
        driver.findElement(By.id(username_text_id)).sendKeys("test@gmail.com");
    }

    public static void snedkeys_password() throws InterruptedException {
        driver.findElement(By.id(password_text_id)).sendKeys("12345");
    }

    public static void click_login_btn(){
        driver.findElement(By.xpath(click_login_btn)).click();
    }

    public static void click_newuser_btn(){
        driver.findElement(By.id(newregister_click_btn_id)).click();
    }

}
