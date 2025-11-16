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

public class Card {

	private int rank; // rank 1 - 13 (Ace - King)
        private String suit; // "Hearts", "Diamonds", "Clubs", "Spades"
        private int index; // 0 - 51 unique index

	/**
	 * 
	 * @param rank
	 * @param suit
	 * @param index
	 */
	public Card(int rank, String suit, int index) {
            this.rank = rank;
            this.suit = suit;
            this.index = index; 
	}

        @Override
	public String toString() {
		return "(" + index + ") " + rank + " " + suit;
	}

	public int getRank() {
		return this.rank;
	}

	public String getSuit() {
		return this.suit;
	}

	public int getIndex() {
		return this.index;
	}

}