package Game;

import Console.ConsoleInput;
import Game.CardGame;
import Structure.Hand;
import Structure.LoadConfig;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

class CardGameTest {
    CardGame cardGame = new CardGame();

    @Test
    void getDeck() {
        assertEquals(52, cardGame.getDeck().size());
    }

    @Test
    void cardGameOverride(){
        CardGame overrideCardGame = new CardGame("H3,H4,H5,D6");
        assertEquals(4, overrideCardGame.getDeck().size());
    }

    @Test
    void dealCards() {
        CardGame cardGame = new CardGame("D3,D2,S5,S6");
        Hand hand = new Hand();
        hand = cardGame.dealHand(hand, 3);
        assertEquals("S6, S5, D2", hand.toString());
    }

    @Test
    void outputOne(){
        cardGame.output("Test One");
        assertEquals("Test One", cardGame.userOutput.getStoreOutput().get(0));
    }

    @Test
    void outputTwo(){
        cardGame.output("Test One");
        cardGame.output("Test Two");
        assertEquals("Test Two", cardGame.userOutput.getStoreOutput().get(1));
    }

    @Test
    void outputTwoCount(){
        cardGame.output("Test One");
        cardGame.output("Test Two");
        assertEquals(2, cardGame.userOutput.getStoreOutput().size());
    }


    @Test
    void getNumberOfPlayers(){
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("3");
        cardGame.userInput.setUserInput(mockScanner);
        assertEquals(3, cardGame.getNumberOfPlayers());
    }

    @Test
    void getInteger(){
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("3");
        cardGame.userInput.setUserInput(mockScanner);
        assertEquals(3, cardGame.getInteger());
    }

    @Test
    void getIntegerFirstString(){
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("one");
        when(mockScanner.nextLine()).thenReturn("25");
        cardGame.userInput.setUserInput(mockScanner);
        assertEquals(25, cardGame.getInteger());
    }

    @Test
    void getString(){
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("yes");
        cardGame.userInput.setUserInput(mockScanner);
        assertEquals("yes", cardGame.getString());
    }

    @Test
    void getComputerPlayersNames(){
        LoadConfig loadConfig = mock(LoadConfig.class);
        when(loadConfig.getConfig()).thenReturn(new ArrayList<String>(List.of("Player1", "Player2", "Player3")));
        cardGame.setLoadConfig(loadConfig);
        ArrayList<String> playerNames = new ArrayList<>(List.of("Player1", "Player2", "Player3"));
        assertEquals(playerNames, cardGame.getComputerPlayersNames());
    }

    @Test
    void createComputerPlayers(){
        LoadConfig loadConfig = mock(LoadConfig.class);
        when(loadConfig.getConfig()).thenReturn(new ArrayList<String>(List.of("Player1", "Player2", "Player3")));
        cardGame.setLoadConfig(loadConfig);
        cardGame.createComputerPlayers(4);
        assertEquals("Player3", cardGame.players.get(2).getName());

    }

    @Test
    void createComputerPlayersSize(){
        LoadConfig loadConfig = mock(LoadConfig.class);
        // Got an error when I tried to use the List.of() method alone.
        when(loadConfig.getConfig()).thenReturn(new ArrayList<String>(List.of("Player1", "Player2", "Player3")));
        cardGame.setLoadConfig(loadConfig);
        cardGame.createComputerPlayers(4);
        assertEquals(3, cardGame.players.size());
    }

    @Test
    void createHumanPlayer(){
        Scanner scanner = mock(Scanner.class);
        when(scanner.nextLine()).thenReturn("Player1");
        cardGame.userInput.setUserInput(scanner);
        cardGame.createHumanPlayer();
        assertEquals("Player1", cardGame.players.get(0).getName());
    }

    @Test
    void initiatePlayers(){
        Scanner scanner = mock(Scanner.class);
        when(scanner.nextLine()).thenReturn("Player1");
        when(scanner.nextLine()).thenReturn("4");
        cardGame.userInput.setUserInput(scanner);

        cardGame.initiatePlayers();

        assertEquals(4, cardGame.players.size());
    }

    @Test
    void initiate(){
        fail("Not yet implemented"); //Remove
    }

    @Test
    void play(){
        fail("Not yet implemented"); //Remove
    }

}