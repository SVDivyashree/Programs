package com.bridgelabz.cardmain;

import com.bridgelabz.cardDataImpl.*;
import com.bridgelabz.carddata.*;


public class DeckMain
{
	public static void main (String[] args)
	{
		DeckCardsImpl deck = new DeckCardsImpl();
		//Initialize the deck of cards
		deck.initDeck();
		//Shuffle the deck of cards
		deck.shuffleDeck();
		//Print the shuffled deck of cards
		//deck.printDeck();
		//Print the deck of 9 cards distributed to 4 people
	    deck.totalDeck();
	}
}

