package designs.snakeladder.service;

import designs.snakeladder.Dice;
import designs.snakeladder.model.Player;
import designs.snakeladder.util.GameUtil;

public class GameService {

    private Player[] players;

    private Dice dice;

    public GameService(Player[] players, Dice dice) {
        this.dice =dice;
        this.players = players;
    }

    public String startGame() {

        while(true) {
            for(Player player : players) {
                int position = player.getCurrPosition();
                int steps = dice.rollDice();

                System.out.println("Player "+player.getName()+ " rolled the dice and got " + steps);

                if(position + steps >100) {
                    continue;
                }
                int currStep = position + steps;

                if(currStep==100) {
                    System.out.println("Player "+player.getName()+ " moved to 100");
                    return player.getName();
                }


                if(GameUtil.getLadder().containsKey(currStep)){
                    int step = currStep;
                    currStep = currStep + GameUtil.getLadder().get(currStep);
                    player.setCurrPosition(currStep);
                    System.out.println("Player " + player.getName() + " moved to " + step + " and got a ladder there and went to " + currStep);
                    continue;
                }
                if(GameUtil.getSnake().containsKey(currStep)){
                    int step = currStep;
                    currStep = currStep  - GameUtil.getSnake().get(currStep);
                    player.setCurrPosition(currStep);

                    System.out.println("Player moved to " + step + " and got bitten by a snake there and went to" + currStep);
                    continue;
                }
                System.out.println("Player " + player.getName() + " moved to " + currStep);
                player.setCurrPosition(currStep);

            }
        }
    }



}
