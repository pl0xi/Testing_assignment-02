package org.example;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
public class GameSteps {
    Game g;

    @Before
    public void gameSetup() {
        g = new Game();
    }

    @Given("I am very bad, and can't hit a single pin doing the game")
    public void i_am_very_bad_and_can_t_hit_a_single_pin_doing_the_game() { }

    @When("I played {int} rounds and i hit {int} pins in each round")
    public void i_play_the_round_game_and_i_hit_pins_in_each_round(int rounds, int pins) {
        rollMany(rounds, pins);
    }

    @Then("the score should be {int} because i didn't hit any pin")
    public void i_should_have_no_points(int expectedPoints) {
        assertEquals(expectedPoints, g.score());
    }

    @Given("I am bad, but i was able to hit 1 pin in each round")
    public void i_am_bad_but_i_was_able_to_hit_1_pin_in_each_round() { }

    @When("I played {int} rounds and i was able to hit {int} pin in each round")
    public void i_play_the_round_game_and_i_was_able_to_hit_pin_in_each_round(int rounds, int pins) {
        rollMany(rounds, pins);
    }

    @Then("the score should be {int} because i hit 1 pin in each round")
    public void i_should_have_points(int expectedPoints) {
        assertEquals(expectedPoints, g.score());
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }

}
