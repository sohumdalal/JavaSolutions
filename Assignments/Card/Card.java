package Assignments.Card;

public class Card {

    public enum Suit {
        HEARTS, 
        DIAMONDS, 
        CLUBS, 
        SPADES
    }

    public enum Value {
        TWO(2), 
        THREE(3), 
        FOUR(4), 
        FIVE(5), 
        SIX(6), 
        SEVEN(7), 
        EIGHT(8), 
        NINE(9), 
        TEN(10),
        JACK(11),
        QUEEN(12), 
        KING(13), 
        ACE(14);

        private final int numericValue;

        Value(int numericValue) {
            this.numericValue = numericValue;
        }

        public int getNumericValue() {
            return numericValue;
        }
    }

    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }

    public boolean isHigher(Card other) {
        return this.value.getNumericValue() > other.value.getNumericValue();
    }

    public boolean isHigher(Card other, Suit trumpSuit) {

        if (this.suit == other.suit) {
            return this.isHigher(other);
        }

        if (this.suit == trumpSuit) {
            return true;
        }

        if (other.suit == trumpSuit) {
            return false;
        }
        return this.isHigher(other);
    }

    public boolean sameSuit(Card other) {
        return this.suit == other.suit;
    }

    public boolean sameValue(Card other) {
        return this.value == other.value;
    }

    public String toString() {
        return value + " of " + suit;
    }

}