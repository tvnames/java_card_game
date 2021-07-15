public enum Suits {

    SPADES("Spades"),
    HEARTS("Hearts"),
    CLUBS("Clubs"),
    DIAMONDS("Diamonds");

    private String val;

    private Suits(String value) {
        this.val = value;
    }
    public String getSuit() {
        return val;
    }
    
}
