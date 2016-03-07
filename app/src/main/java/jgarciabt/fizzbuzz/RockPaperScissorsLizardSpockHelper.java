package jgarciabt.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jose Garcia on 01/03/2016.
 */
public class RockPaperScissorsLizardSpockHelper {

    public enum DrawType {
        ROCK,
        PAPER,
        SCISSORS,
        LIZARD,
        SPOCK
    }

    private List<DrawType> rockWinsAgainstList;
    private List<DrawType> paperWinsAgainstList;
    private List<DrawType> scissorsWinsAgainstList;
    private List<DrawType> lizardWinsAgainstList;
    private List<DrawType> spockWinsAgainstList;

    public RockPaperScissorsLizardSpockHelper() {

        rockWinsAgainstList = new ArrayList<>();
        paperWinsAgainstList = new ArrayList<>();
        scissorsWinsAgainstList = new ArrayList<>();
        lizardWinsAgainstList = new ArrayList<>();
        spockWinsAgainstList = new ArrayList<>();

        initialiseData();
    }

    /**
     *
     * @param player1 Player 1 choice
     * @param player2 Player 2 choice
     * @return 0 if tie, 1 if player1 wins, 2 if player2 wins
     */
    public int whoWins(DrawType player1, DrawType player2) {

        if(player1.equals(player2)){
            return 0;
        }

        switch (player1) {
            case PAPER:
                if(paperWinsAgainstList.contains(player2)) {
                    return 1;
                } else {
                    return 2;
                }
            case ROCK:
                if(rockWinsAgainstList.contains(player2)) {
                    return 1;
                } else {
                    return 2;
                }
            case SCISSORS:
                if(scissorsWinsAgainstList.contains(player2)) {
                    return 1;
                } else {
                    return 2;
                }
            case LIZARD:
                if(lizardWinsAgainstList.contains(player2)) {
                    return 1;
                } else {
                    return 2;
                }
            case SPOCK:
                if(spockWinsAgainstList.contains(player2)) {
                    return 1;
                } else {
                    return 2;
                }
        }
        return -1;
    }

    private void initialiseData() {

        rockWinsAgainstList.add(DrawType.SCISSORS);
        rockWinsAgainstList.add(DrawType.LIZARD);

        paperWinsAgainstList.add(DrawType.ROCK);
        paperWinsAgainstList.add(DrawType.SPOCK);

        scissorsWinsAgainstList.add(DrawType.PAPER);
        scissorsWinsAgainstList.add(DrawType.LIZARD);

        lizardWinsAgainstList.add(DrawType.PAPER);
        lizardWinsAgainstList.add(DrawType.SPOCK);

        spockWinsAgainstList.add(DrawType.SCISSORS);
        spockWinsAgainstList.add(DrawType.ROCK);
    }
}
