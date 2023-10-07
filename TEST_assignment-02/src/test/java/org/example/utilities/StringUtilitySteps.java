package org.example.utilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;


public class StringUtilitySteps {
    String reversedString;
    String capitalizedString;

    @Given("I want to reverse a text")
    public void i_want_to_reverse_a_text() {}

    @When("I reverse {string} with the string utility")
    public void i_reverse_the_text_with_the_string_utility(String text) {
        reversedString = StringUtility.reverse(text);
    }
    @Then("the text is reversed and equals {string}")
    public void the_text_is_reversed(String expectedText){
        assertEquals(expectedText, reversedString);
    }

    @Given("I want to capitalize a text")
    public void i_want_to_capitalize_a_text() {}

    @When("I capitalize {string} with the string utility")
    public void i_capitalize_the_text_with_the_string_utility(String text) {
        capitalizedString = StringUtility.capitalize(text);
    }

    @Then("the text is capitalized and equals {string}")
    public void the_text_is_capitalized(String expectedText){
        assertEquals(expectedText, capitalizedString);
    }
}