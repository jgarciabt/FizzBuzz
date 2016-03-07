package jgarciabt.fizzbuzz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static jgarciabt.fizzbuzz.RockPaperScissorsLizardSpockHelper.DrawType.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Jose Garcia on 01/03/2016.
 */
public class RockPaperScissorsLizardSpockHelperTest {

    private RockPaperScissorsLizardSpockHelper rockPaperScissorsLizardSpockHelper;

    @Before
    public void setUp() throws Exception {

        rockPaperScissorsLizardSpockHelper = new RockPaperScissorsLizardSpockHelper();
    }

    @After
    public void tearDown() throws Exception {

        rockPaperScissorsLizardSpockHelper = null;
    }

    @Test
    public void whoWins_ReturnsZeroWhenBothPlayersPlayTheSame() {

        assertEquals(0, rockPaperScissorsLizardSpockHelper.whoWins(PAPER, PAPER));
        assertEquals(0, rockPaperScissorsLizardSpockHelper.whoWins(SPOCK, SPOCK));
        assertEquals(0, rockPaperScissorsLizardSpockHelper.whoWins(ROCK, ROCK));
        assertEquals(0, rockPaperScissorsLizardSpockHelper.whoWins(SCISSORS, SCISSORS));
        assertEquals(0, rockPaperScissorsLizardSpockHelper.whoWins(LIZARD, LIZARD));
    }

    @Test
    public void whoWins_ReturnsOneWhenPlayer1WinsPlayingPaper() {

        assertEquals(1, rockPaperScissorsLizardSpockHelper.whoWins(PAPER, ROCK));
        assertEquals(1, rockPaperScissorsLizardSpockHelper.whoWins(PAPER, SPOCK));
    }

    @Test
    public void whoWins_ReturnTwoWhenPlayer1LoosesPlayingPaper() {

        assertEquals(2, rockPaperScissorsLizardSpockHelper.whoWins(PAPER, LIZARD));
        assertEquals(2, rockPaperScissorsLizardSpockHelper.whoWins(PAPER, SCISSORS));
    }

    @Test
    public void whoWins_ReturnsOneWhenPlayer1WinsPlayingRock() {

        assertEquals(1, rockPaperScissorsLizardSpockHelper.whoWins(ROCK, SCISSORS));
        assertEquals(1, rockPaperScissorsLizardSpockHelper.whoWins(ROCK, LIZARD));
    }

    @Test
    public void whoWins_ReturnTwoWhenPlayer1LoosesPlayingRock() {

        assertEquals(2, rockPaperScissorsLizardSpockHelper.whoWins(ROCK, PAPER));
        assertEquals(2, rockPaperScissorsLizardSpockHelper.whoWins(ROCK, SPOCK));
    }

    @Test
    public void whoWins_ReturnsOneWhenPlayer1WinsPlayingScissors() {

        assertEquals(1, rockPaperScissorsLizardSpockHelper.whoWins(SCISSORS, PAPER));
        assertEquals(1, rockPaperScissorsLizardSpockHelper.whoWins(SCISSORS, LIZARD));
    }

    @Test
    public void whoWins_ReturnTwoWhenPlayer1LoosesPlayingScissors() {

        assertEquals(2, rockPaperScissorsLizardSpockHelper.whoWins(SCISSORS, ROCK));
        assertEquals(2, rockPaperScissorsLizardSpockHelper.whoWins(SCISSORS, SPOCK));
    }

    @Test
    public void whoWins_ReturnsOneWhenPlayer1WinsPlayingLizard() {

        assertEquals(1, rockPaperScissorsLizardSpockHelper.whoWins(LIZARD, PAPER));
        assertEquals(1, rockPaperScissorsLizardSpockHelper.whoWins(LIZARD, SPOCK));
    }

    @Test
    public void whoWins_ReturnTwoWhenPlayer1LoosesPlayingLizard() {

        assertEquals(2, rockPaperScissorsLizardSpockHelper.whoWins(LIZARD, ROCK));
        assertEquals(2, rockPaperScissorsLizardSpockHelper.whoWins(LIZARD, SCISSORS));
    }

    @Test
    public void whoWins_ReturnsOneWhenPlayer1WinsPlayingSpock() {

        assertEquals(1, rockPaperScissorsLizardSpockHelper.whoWins(SPOCK, ROCK));
        assertEquals(1, rockPaperScissorsLizardSpockHelper.whoWins(SPOCK, SCISSORS));
    }

    @Test
    public void whoWins_ReturnTwoWhenPlayer1LoosesPlayingSpock() {

        assertEquals(2, rockPaperScissorsLizardSpockHelper.whoWins(SPOCK, PAPER));
        assertEquals(2, rockPaperScissorsLizardSpockHelper.whoWins(SPOCK, LIZARD));
    }

}