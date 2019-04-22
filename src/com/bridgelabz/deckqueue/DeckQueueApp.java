package com.bridgelabz.deckqueue;

import com.bridgelabz.deckqueueimpl.DeckQueueManagerImpl;
import com.bridgelabz.deckqueueservice.DeckQueueManager;

public class DeckQueueApp
{
	public static void main (String[] args)
	{
		DeckQueueManager deck = new DeckQueueManagerImpl();
		//Initialize the deck of cards
		deck.initDeck();
		//Shuffle the deck of cards
		deck.shuffleDeck();
		//Print the shuffled deck of cards
		//deck.printDeck();
		//Print the deck of 9 cards distributed to 4 people
	    deck.totalDeck();
	    deck.printDeck();
	}
}
