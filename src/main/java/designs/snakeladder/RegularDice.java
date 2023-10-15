package designs.snakeladder;

public class RegularDice implements Dice{
    @Override
    public int rollDice() {
        return (int) (Math.random() * 5) + 1;
    }
}
