package CardsWithPower;

public enum CardColour {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;
    CardColour(int power){
        this.power=power;
    }

    public int getPower() {
        return power;
    }
}
