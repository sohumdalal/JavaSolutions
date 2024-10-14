package Assignments.Card;

public class program {
    public static void main(String[] args) {
        Card card1 = new Card(Card.Suit.HEARTS, Card.Value.ACE);
        Card card2 = new Card(Card.Suit.SPADES, Card.Value.KING);
        Card card3 = new Card(Card.Suit.DIAMONDS, Card.Value.TWO);
        
        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
        System.out.println("Card 3: " + card3);

        System.out.println("Card 1 is higher than Card 2: " + card1.isHigher(card2));
        System.out.println("Card 1 is higher than Card 2 with trump SPADES: " + card1.isHigher(card2, Card.Suit.SPADES));
        System.out.println("Card 1 is the same suit as Card 2: " + card1.sameSuit(card2));
        System.out.println("Card 1 is the same value as Card 2: " + card1.sameValue(card2));
        System.out.println("Card 1 is the same value as Card 1: " + card1.sameValue(card1));

   
    }
}
