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

**The project structure**
<img width="445" height="146" alt="Screenshot 2025-11-16 at 13 44 15" src="https://github.com/user-attachments/assets/52b961a7-e415-430d-ba68-09dd5de78e4d" />


**The UML Diagram :**
![CrazyCardGameSimulation](https://github.com/user-attachments/assets/6cafd645-abea-429d-be87-b46b43daf37d)

**Game Rules** (Summary)
1. Each player receives **5 cards**.
2. The game flips **one starting top card**.
3. On their turn, a player will:
   - Try to play a card that matches the **rank** or **suit** of the top card.
   - If they cannot play → they draw up to **3 cards**.
4. The first player to have **no cards left** wins the game.



