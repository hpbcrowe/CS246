package week03;

import com.google.gson.Gson;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// Create an instance of the Player class,
    // and populate it's values.
        Player p = new Player ("Toto", 1, 0, 0, );

        //Create a new instance of the Game class,
        //passing the player you created to it's constructor
        Game g = new Game(p);

        //Call the saveGame() method.
        g.saveGame();
        //Verify the save file contains the correct Json data
        Game g2 = Game.loadGame("playerInfo.txt");
        g.p.addEquipment("Bat",2);
        g.p.display();

    }
}
