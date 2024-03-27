package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static pages.OnlineProductsPage.click_formalshoes_dropdown;
import static pages.OnlineProductsPage.gettext_formalshoes_firstvalue;

public class OnlineProductsPage {


    @When("User clicks on Formal shoes drop down")
    public void user_clicks_on_formal_shoes_drop_down() throws InterruptedException {
        click_formalshoes_dropdown();
    }

    @Then("User should be able to view the Products")
    public void user_should_be_able_to_view_the_products() throws InterruptedException {
        gettext_formalshoes_firstvalue();
        assertEquals("   Classic Cheltenham", gettext_formalshoes_firstvalue());
    }


}
