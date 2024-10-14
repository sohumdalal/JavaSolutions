package Assignments.Uno;

public class program {
    public static void main(String[] args) {
        UnoCard card1 = new UnoCard(UnoCard.Color.RED, UnoCard.Value.FIVE);
        UnoCard card2 = new UnoCard(UnoCard.Color.GREEN, UnoCard.Value.FIVE);
        UnoCard card3 = new UnoCard(UnoCard.Color.BLACK, UnoCard.Value.WILD);
        UnoCard card4 = new UnoCard(UnoCard.Color.YELLOW, UnoCard.Value.SKIP);

        System.out.println("Card 1: " + card1);
        System.out.println("Card 2: " + card2);
        System.out.println("Card 3: " + card3);
        System.out.println("Card 4: " + card4);


        System.out.println("Card 1 can be played on Card 4: " + card1.legalNext(card4));
        System.out.println("Card 2 can be played on Card 1: " + card2.legalNext(card1));
        System.out.println("Card 3 can be played on Card 1: " + card3.legalNext(card1));
        System.out.println("Card 4 can be played on Card 1: " + card4.legalNext(card1));
       
    }
}
