package Card;
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

    public static void main(String[] args) {
        Card card1 = new Card(Suit.HEARTS, Value.ACE);
        Card card2 = new Card(Suit.SPADES, Value.KING);
        Card card3 = new Card(Suit.DIAMONDS, Value.TWO);
        
        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
        System.out.println("Card 3: " + card3);

        System.out.println("Card 1 is higher than Card 2: " + card1.isHigher(card2));
        System.out.println("Card 1 is higher than Card 2 with trump SPADES: " + card1.isHigher(card2, Suit.SPADES));
        System.out.println("Card 1 is the same suit as Card 2: " + card1.sameSuit(card2));
        System.out.println("Card 1 is the same value as Card 2: " + card1.sameValue(card2));
        System.out.println("Card 1 is the same value as Card 1: " + card1.sameValue(card1));

   
    }
}