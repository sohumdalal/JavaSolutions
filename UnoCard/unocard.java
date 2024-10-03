package Uno;

public class UnoCard {
    
    public enum Color {
        RED, 
        GREEN,
        BLUE, 
        YELLOW, 
        BLACK
    }

    public enum Value {
        ZERO("0"), 
        ONE("1"),
        TWO("2"), 
        THREE("3"), 
        FOUR("4"), 
        FIVE("5"),
        SIX("6"), 
        SEVEN("7"),
        EIGHT("8"), 
        NINE("9"), 
        SKIP("Skip"),
        REVERSE("Reverse"), 
        DRAW_TWO("Draw Two"), 
        WILD("Wild"), 
        WILD_DRAW_FOUR("Wild Draw Four");
    
        private final String displayValue;

        Value(String displayValue) {
            this.displayValue = displayValue;
        }

        @Override
        public String toString() {
            return displayValue;
        }
    }

    private Color color;
    private Value value;

    public UnoCard (Color color, Value value) {
        this.color = color;
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public Value getValue() {
        return value;
    }

    public boolean legalNext(UnoCard discardPileCard) {
        // If the discard pile card is black (wild), the current card can be played
        if (discardPileCard.getColor() == Color.BLACK) {
            return true;
        }
        // If the current card's color matches the discard pile card's color
        if (this.color == discardPileCard.getColor()) {
            return true;
        }
        // If the current card's value matches the discard pile card's value
        if (this.value == discardPileCard.getValue()) {
            return true;
        }
        // Otherwise, the card cannot be played
        return false;
    }

    public static void main(String[] args) {
        UnoCard card1 = new UnoCard(Color.RED, Value.FIVE);
        UnoCard card2 = new UnoCard(Color.GREEN, Value.FIVE);
        UnoCard card3 = new UnoCard(Color.BLACK, Value.WILD);
        UnoCard card4 = new UnoCard(Color.YELLOW, Value.SKIP);
        UnoCard card5 = new UnoCard(Color.YELLOW, Value.SKIP);
        UnoCard card6 = new UnoCard(Color.YELLOW, Value.SKIP);
        UnoCard card7 = new UnoCard(Color.YELLOW, Value.SKIP);
        UnoCard card8 = new UnoCard(Color.YELLOW, Value.SKIP);

        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
        System.out.println("Card 3: " + card3);
        System.out.println("Card 4: " + card4);


        System.out.println("Card 1 can be played on Card 4: " + card1.legalNext(card4));
        System.out.println("Card 2 can be played on Card 1: " + card2.legalNext(card1));
        System.out.println("Card 3 can be played on Card 1: " + card3.legalNext(card1));
        System.out.println("Card 4 can be played on Card 1: " + card4.legalNext(card1));
        System.out.println("Card 7 can be played on Card 8: " + card7.legalNext(card8));
    }
}
