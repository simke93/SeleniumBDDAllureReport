package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static pages.HomePage.*;
import static pages.LoginPage.*;
public class LoginPage {

    @When("User successfully enters the log in details")
    public void user_successfully_enters_the_log_in_details() throws InterruptedException {
        sendkeys_username();
        snedkeys_password();
        click_login_btn();
    }


    @When("User click on new registration button")
    public void userClickOnNewRegistrationButton() throws InterruptedException {
        click_newuser_btn();
    }


}
