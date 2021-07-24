class Player {
    private String playerName;
    private int playerPosition;
    
    public Player(String playerName){
        this.playerName = playerName;
        this.playerPosition = 0;
    }

    public String getPlayerName(){
        return this.playerName;
    }

    public void setPlayerPosition(int playerPosition){
        this.playerPosition = playerPosition;
    }

    public int getPlayerPosition(){
        return this.playerPosition;
    }

}
