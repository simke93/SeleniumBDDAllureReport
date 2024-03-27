package stepdefinition;

import io.cucumber.java.en.Then;


import static pages.RegistrationPage.validity_user_registrationPage;

public class RegistrationPage {


    @Then("User should be able to view the registration page")
    public void userShouldBeAbleToViewTheRegistrationPage() throws InterruptedException {
        validity_user_registrationPage();
    }

}
