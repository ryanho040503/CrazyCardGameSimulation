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

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class Game {

	private List<Player> players;
	private Deck deck;

        // Constructor with 4 players
	public Game() 
        {
            deck = new Deck();
            players = new ArrayList<>();
            players.add(new Player("Hoang Duy", 0));
            players.add(new Player("Jame", 1));
            players.add(new Player("Ash", 2));
            players.add(new Player("Dylan", 3));
	}

        // Start the game
	public void start() {
            deck.shuffle();
        dealCards();

        // Flip first card
        Card first = deck.draw();
        deck.setTopCard(first);
        System.out.println("Starting card: " + first + "\n");

        boolean gameOver = false;
        while (!gameOver) 
            {
                for (Player player : players) 
                {
                    System.out.println("Top card: " + deck.getTopCard());
                    player.turn(deck, deck.getTopCard());

                    if (player.hasNoCards()) 
                    {
                        System.out.println("********** " + player.getName() + " won ***********");
                        gameOver = true;
                        break;
                    }
                }
            }
	}

        // Deal 5 cards to each player
	public void dealCards() {
        for (int i = 0; i < 5; i++) 
        {
            for (Player p : players) 
            {
                p.addCard(deck.draw());
            }
        }

        for (Player p : players) 
        {
            p.showHand();
        }
	}

        // Return the winner (optional for Week 6)
	public Player playerWon() {
	
        for (Player p : players) 
        {
            if (p.hasNoCards()) 
            {
                return p;
            }
        }
            return null;
	}

}