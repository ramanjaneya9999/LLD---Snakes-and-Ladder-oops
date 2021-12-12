
class Player {
    private String name;
    private int playerLocation = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPlayerLocation(int location) {
        this.playerLocation = location;

    }

    public int getPlayerLocation() {
        return this.playerLocation;
    }
}
