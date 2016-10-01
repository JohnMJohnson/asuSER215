import java.util.*;
/*
 * @author John M. Johnson
 */

public class Deck {
Card[] shuffledDeck = new Card[52];
LinkedList<Card> dealingShoe = new LinkedList<Card>();

Deck(){
suitBuilder(0, Suit.SPADE);
suitBuilder(13, Suit.HEART);
suitBuilder(26, Suit.CLUB);
suitBuilder(39, Suit.DIAMOND);
shuffleDeck();
for(int i = 0; i < 52; i++){
	dealingShoe.add(shuffledDeck[i]);
}
}

public Card removeCard(){
	return dealingShoe.removeFirst();
}

//Uses Knuth-Fisher-Yates shuffle algorithm 
private void shuffleDeck(){
	Random rand = new Random();
	for (int i = 51; i > 0; i--)
	{
	int n = rand.nextInt(i + 1);
	//Swap(shuffledDeck[i], shuffledDeck[n]);
	swap(shuffledDeck, i, n);
	}
}

private void suitBuilder(Integer startingPosition, Suit suit){
	shuffledDeck[0+startingPosition] = new Card(Rank.ACE, suit, 1);
	shuffledDeck[1+startingPosition] = new Card(Rank.TWO, suit, 2);
	shuffledDeck[2+startingPosition] = new Card(Rank.THREE, suit, 3);
	shuffledDeck[3+startingPosition] = new Card(Rank.FOUR, suit, 4);
	shuffledDeck[4+startingPosition] = new Card(Rank.FIVE, suit, 5);
	shuffledDeck[5+startingPosition] = new Card(Rank.SIX, suit, 6);
	shuffledDeck[6+startingPosition] = new Card(Rank.SEVEN, suit, 7);
	shuffledDeck[7+startingPosition] = new Card(Rank.EIGHT, suit, 8);
	shuffledDeck[8+startingPosition] = new Card(Rank.NINE, suit, 9);
	shuffledDeck[9+startingPosition] = new Card(Rank.TEN, suit, 10);
	shuffledDeck[10+startingPosition] = new Card(Rank.JACK, suit, 10);
	shuffledDeck[11+startingPosition] = new Card(Rank.QUEEN, suit, 10);
	shuffledDeck[12+startingPosition] = new Card(Rank.KING, suit, 10);
}
private static void swap(Card[] data, int index1, int index2)
{
Card temp = data[index1];
data[index1] = data[index2];
data[index2] = temp;
}
}
