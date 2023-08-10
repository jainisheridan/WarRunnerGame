/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.warrunnergame;

/**
 *
 * @author jaini
 */

import java.util.Collection;

public interface Player {
    String getName();
    boolean hasCards();
    Card flipCard();
    Card getCardWithRank(Rank rank);
    void addCard(Card card);
    int getHandSize(); // Add this method
    Card getCardAtIndex(int index); // Add this method
    void addCards(Collection<Card> cards);
}
