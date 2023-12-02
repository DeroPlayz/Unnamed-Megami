import Item.Item;

class Player extends Actor{
    private String First;
    private String Last;
    private Item[] Inventory = new Item[15];
    private double Cash;
    
    public Player(String First, String Last){
        super(First + Last, Arcana.Fool);
    }
}