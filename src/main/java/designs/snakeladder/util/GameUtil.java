package designs.snakeladder.util;

import java.util.HashMap;
import java.util.Map;

public class GameUtil {

    private static Map<Integer,Integer> ladder = new HashMap<>();

    private static Map<Integer,Integer> snake = new HashMap<>();


    static  {
        ladder.put(3,12);
        ladder.put(21,49);
        ladder.put(11,72);
        ladder.put(89,99);
    }

    static {
        snake.put(99,9);
        snake.put(81,8);
        snake.put(65,22);
    }

    public static Map<Integer, Integer> getLadder() {
        return ladder;
    }

    public static Map<Integer, Integer> getSnake() {
        return snake;
    }
}
