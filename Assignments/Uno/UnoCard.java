package Assignments.Uno;

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

   
}
