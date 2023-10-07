package org.example;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
public class GameSteps {
    Game g = new Game();
    @Given("I am very bad, and can't hit a single pin doing the game")
    public void i_am_very_bad_and_can_t_hit_a_single_pin_doing_the_game() { }

    @When("I play the {int} round game and i hit {int} pins in each round")
    public void i_play_the_round_game_and_i_hit_pins_in_each_round(int rounds, int pins) {
        for (int i=0; i<rounds; i++) {
            g.roll(pins);
        }
        assertEquals(0, g.score());
    }

    @Then("the score should be {int}")
    public void i_should_have_points(int expectedPoints) {
        assertEquals(expectedPoints, g.score());
    }
}
