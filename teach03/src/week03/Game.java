package week03;

import com.google.gson.Gson;
import com.google.gson.internal.$Gson$Preconditions;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Game {
    //Create a class called Game that will take an instance
    // of the Player class in its
    // constructor and store it in a member variable.
    Player p;

    /***********************************************
     * GAME NON DEFAULT CONSTRUCTOR
     * @param player
     *************************************************/
    public Game(Player player) throws IOException {
        p = player;
    }

    /************************************************
     * SAVE GAME
     * Create a function in the Game class called
     * saveGame() that will use the GSON library to
     * serialize the object to a string, and save that
     * string to a file.
     ***********************************************/
    public void saveGame()throws IOException {
        Gson gson = new Gson();
        String playerJson = gson.toJson(p);
        FileWriter writer = new FileWriter("playerInfo.txt");
        try(PrintWriter printWriter = new PrintWriter(writer)){
            printWriter.write(playerJson);
        }

    }
    public static Game loadGame(String file) throws IOException{
        //Load the file contents as a String
        String contents = new String(Files.readAllBytes(Paths.get(file)));
        //Use GSON library to deserialze it into
        // a new Player class.
        Gson gson = new Gson();
        Player player = gson.fromJson(contents, Player.class);
        //Create a new Game instance with that player
        Game g = new Game(player);
        //return a new Game()
        return g;
    }
}
