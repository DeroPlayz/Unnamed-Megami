class Player extends Actor{
    private String First;
    private String Last;
    public Player(String First, String Last){
        super(First + Last, Arcana.Fool);
    }
}