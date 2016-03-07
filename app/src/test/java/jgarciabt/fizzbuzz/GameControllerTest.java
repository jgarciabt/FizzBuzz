package jgarciabt.fizzbuzz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static jgarciabt.fizzbuzz.RockPaperScissorsLizardSpockHelper.DrawType.*;
import static jgarciabt.fizzbuzz.RockPaperScissorsLizardSpockHelper.DrawType;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

/**
 * Created by Jose Garcia on 04/03/2016.
 */
public class GameControllerTest {

    private GameController gameController;
    @Mock FizzBuzzHelper mockFizzBuzzHelper;
    @Mock RockPaperScissorsLizardSpockHelper mockRockPaperScissorsLizardSpockHelper;

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

        gameController = new GameController(mockFizzBuzzHelper, mockRockPaperScissorsLizardSpockHelper);
    }

    @After
    public void tearDown() throws Exception {

        gameController = null;
    }

    @Test
    public void whoWins_ReturnsCorrectStringWhenThereIsATie() throws Exception {

        DrawType PlayerOneOption = PAPER;
        DrawType PlayerTwoOption = PAPER;

        String expected = "Tie!";

        doReturn(0).when(mockRockPaperScissorsLizardSpockHelper).whoWins(PlayerOneOption, PlayerTwoOption);

        String result = gameController.whoWins(PlayerOneOption, PlayerTwoOption);

        assertEquals(expected, result);
    }

    @Test
    public void whoWins_ReturnsCorrectStringWhenPlayerOneWins() throws Exception {

        DrawType PlayerOneOption = PAPER;
        DrawType PlayerTwoOption = ROCK;

        String expected = "Player one wins";

        doReturn(1).when(mockRockPaperScissorsLizardSpockHelper).whoWins(PlayerOneOption, PlayerTwoOption);

        String result = gameController.whoWins(PlayerOneOption, PlayerTwoOption);

        assertEquals(expected, result);
    }

    @Test
    public void whoWins_ReturnsCorrectStringWhenPlayerTwoWins() throws Exception {

        DrawType PlayerOneOption = ROCK;
        DrawType PlayerTwoOption = PAPER;

        String expected = "Player two wins";

        doReturn(2).when(mockRockPaperScissorsLizardSpockHelper).whoWins(PlayerOneOption, PlayerTwoOption);

        String result = gameController.whoWins(PlayerOneOption, PlayerTwoOption);

        assertEquals(expected, result);
    }
}