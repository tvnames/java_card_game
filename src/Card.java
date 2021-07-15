public class Card {
    private String suit = "";
    private String rank_name = "";
    private int rank_value = 0;


    public Card(Ranks rank, Suits suit) {
        this.suit = suit.getSuit();
        rank_name = rank.getName();
        rank_value = rank.getValue();
    }

    @Override /* means there is already a toString method and will only return memory address unless overridden */
    public String toString() {
        return String.format( rank_name + " of " + suit);
    }
    public int getValue () {
        return rank_value;
    }

}
