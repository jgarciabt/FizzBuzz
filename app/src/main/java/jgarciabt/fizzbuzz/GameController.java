package jgarciabt.fizzbuzz;

import static jgarciabt.fizzbuzz.RockPaperScissorsLizardSpockHelper.DrawType;

/**
 * Created by Jose Garcia on 01/03/2016.
 */
public class GameController {

    private FizzBuzzHelper fizzBuzzHelper;
    private RockPaperScissorsLizardSpockHelper rockPaperScissorsLizardSpockHelper;

    public GameController(FizzBuzzHelper fizzBuzzHelper,
                          RockPaperScissorsLizardSpockHelper rockPaperScissorsLizardSpockHelper) {

        this.fizzBuzzHelper = fizzBuzzHelper;
        this.rockPaperScissorsLizardSpockHelper = rockPaperScissorsLizardSpockHelper;
    }

    public String getFizzBuzz(int number) {

        return fizzBuzzHelper.getFizzBuzz(number);
    }

    public String whoWins(DrawType playerOne, DrawType playerTwo) {

        int winner = rockPaperScissorsLizardSpockHelper.whoWins(playerOne, playerTwo);

        if(winner == 0) {
            return "Tie!";
        } else if (winner == 1) {
            return "Player one wins";
        } else {
            return "Player two wins";
        }
    }
}
