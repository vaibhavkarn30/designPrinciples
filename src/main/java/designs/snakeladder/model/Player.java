package designs.snakeladder.model;


public class Player {


    private String name;

    private int currPosition;

    public Player (String name,int currPosition) {
        this.name = name;
        this.currPosition = currPosition;
    }


    public int getCurrPosition() {
        return currPosition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrPosition(int currPosition) {
        this.currPosition = currPosition;
    }

    public String getName() {
        return name;
    }
}
