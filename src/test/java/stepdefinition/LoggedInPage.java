package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static pages.LoggedInPage.*;
public class LoggedInPage {

    @Then("User should be able to view the product category page")
    public void user_should_be_able_to_view_the_product_category_page() throws InterruptedException {
        validity_productcategory_formalshoes();
        validity_productcategory_sportsshoes();
        validity_productcategory_sneakershoes();
    }

}
