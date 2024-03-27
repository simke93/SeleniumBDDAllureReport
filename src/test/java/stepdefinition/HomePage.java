package stepdefinition;

import io.cucumber.java.en.Given;
import static pages.HomePage.*;
public class HomePage {


    @Given("User navigates to the Login page")
    public void user_navigates_to_the_login_page() throws InterruptedException {
        click_hamburger_menu();
        click_singIn_link();

    }

    @Given("User navigates to the Online products page")
    public void user_navigates_to_the_online_products_page() throws InterruptedException {
        click_hamburger_menu();
        click_onlineProducts_link();
    }

}
