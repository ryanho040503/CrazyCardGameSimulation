
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

package ca.sheridancollege.hohoan.project1_hoangduy_ho;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private String name;
	private int position;
	private List<Card> hand;
	private int score;

	/**
	 * 
	 * @param name
	 * @param position
	 */
        
        // Constructor
	public Player(String name, int position) 
        {
            this.name = name;
            this.position = position;
            this.hand = new ArrayList<>();
            this.score = 0;
	}

	public String getName() 
        {
		return this.name;
	}

	public List<Card> getHand() {
		return this.hand;
	}

	public void addCard(Card card) {
             hand.add(card);
	}

	/**
	 * 
	 * @param deck
	 */
	public void drawCard(Deck deck) {
//      We have to draw card from the deck to minus number of card(s)
        Card drawn = deck.draw();
        if (drawn != null) 
        {
//          Adding the drawn card into the hand of player
            hand.add(drawn);
            System.out.println(this.name + " drew: " + drawn);
        }
	}

	/**
	 * 
	 * @param topCard
	 */
	public Card matchCard(Card topCard) {
            for (Card card : hand) 
            {
                if (card.getSuit().equals(topCard.getSuit()) || card.getRank() == topCard.getRank()) 
                {
                    // Remove the card from hand if match
                    hand.remove(card);
                    System.out.println(name + " played: " + card);
                    return card;
                }
            }
                return null;
	}

	/**
	 * 
	 * @param deck
	 * @param topCard
	 */
        
        // Full turn: try to play, otherwise draw up to 3 times
	public void turn(Deck deck, Card topCard) 
        {
        Card played = matchCard(topCard);
        if (played != null) 
            {
                deck.setTopCard(played);
            } else 
            {
                for (int i = 0; i < 3 && played == null; i++) 
                {
                    drawCard(deck);
                    played = matchCard(deck.getTopCard());
                    if (played != null) 
                    {
                        deck.setTopCard(played);
                        break;
                    }
                }
                if (played == null) 
                    {
                    System.out.println(name + " has no playable card after 3 draws.\n");
                }
            }
	}

	public boolean hasNoCards() {
            return hand.isEmpty();
	}

	public void showHand() 
        {
            System.out.println(name + ":");
            for (Card c : hand) 
            {
                System.out.println("  " + c);
            }
            System.out.println();
	}

}