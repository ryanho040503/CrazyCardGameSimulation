package ca.sheridancollege.hohoan.project1_hoangduy_ho;

// Course: SYST 17796 — Object-Oriented Programming - UML Model
// Author: Ho Hoàng Duy  
// Student ID:
// Created on:November 16th 2025
// Instructor : Zaki Asmat

// File Including : Card.java, Deck.java, Game.java, Player.java, Project1.java
// Description : This project is a simple Java card game simulation where four players take turns playing cards that match the rank or suit of the top card.  


// Technologies Used:
// Java (JDK 17 or later)
// NetBeans 19
// Standard Java Collections API
// Visual Diagram for UML Classes Diagram

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Deck {

	private int numCards;
	private List<Card> cards;
	private Card topCard;
	private boolean empty;

	public Deck() 
        {
            cards = new ArrayList<>();
            String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
            int index = 0;

            for (String suit : suits) 
            {
                for (int rank = 1; rank <= 13; rank++) 
                {
                    cards.add(new Card(rank, suit, index++));
                }
            }
            numCards = cards.size();
            empty = false;
	}

        // Shuffle cards manually
	public void shuffle() 
        {
            Random rand = new Random();
            for (int i = 0; i < cards.size(); i++) 
            {
                int j = rand.nextInt(cards.size());
                Card temp = cards.get(i);
                cards.set(i, cards.get(j));
                cards.set(j, temp);
            }
	}

	/**
	 * 
	 * @param card
	 */
	public void setTopCard(Card card) 
        {
		this.topCard = card;
	}

	public boolean isEmpty() 
        {
		return this.empty;
	}

	public Card draw() 
        {
            if (cards.isEmpty()) 
            {
                empty = true;
                return null;
            }
            numCards--;
            return cards.remove(0);
	}

	public Card getTopCard() 
        {
		return this.topCard;
	}

}