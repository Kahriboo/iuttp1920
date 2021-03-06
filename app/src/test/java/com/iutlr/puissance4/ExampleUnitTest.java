package com.iutlr.puissance4;

import com.iutlr.puissance4.exceptions.JoueurException;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test(expected = JoueurException.class)
    public void notEnoughPlayersTest() throws Exception {
        List<Joueur> joueurs = new ArrayList<>();
        Plateau p = new Plateau(10, 10, joueurs);
    }


    @Test
    public void gameVictoryTest() throws Exception {
        Joueur j1 = new Joueur("J1", 0);
        Joueur j2 = new Joueur("J2", 0);

        List<Joueur> joueurs = new ArrayList<>();
        joueurs.add(j1);
        joueurs.add(j2);

        Plateau p = new Plateau(10, 10, joueurs);

        // ..

        assertEquals(j1, p.getGagnant());
    }
}