package designs;

import designs.snakeladder.Dice;
import designs.snakeladder.RegularDice;
import designs.snakeladder.service.GameService;
import designs.snakeladder.model.Player;

public class Main {

    public static void main(String[] args) {


       // playSnakeAndLadder();

       // useSplitWise();

        playSnakeAndLadder();

    }

    private static void playSnakeAndLadder() {

        Player player1 = new Player("Vaibhav", 0);
        Player player2 = new Player("Deepak",0);

        Player [] players = new Player[2];
        players[0] = player1;
        players[1] = player2;

        Dice dice = new RegularDice();

        GameService gameService = new GameService(players,dice);

        String winner = gameService.startGame();

        System.out.println("The Winner is "+winner);
    }

    private static void useSplitWise() {

    }



}