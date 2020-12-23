package week03;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public class Player {
    //Create a class definition for a class called Player
    // that has properties for name, health, mana, and gold.
String name;
int health;
int mana;
int gold;
Map<String, Integer> equipment;

    /****************************
     * Player Constructor
     *****************************/
    public Player(String name, int health, int mana, int gold){
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.gold = gold;
    }
/******************************************************
* DISPLAY METHOD
* You might also want to add some kind of display function
* you can use to easily show those values.
*****************************************************/
    public void display(){
        System.out.println("Player name:" + name);
        System.out.println("Player health:" + health);
        System.out.println("Player mana:" + mana);
        System.out.println("Player gold:" + gold);
    }

    /******************************************************
     * ADD EQUIPMENT
     *
     ******************************************************/
    public void addEquipment(String s, int i){
        equipment.put(s,i);
        System.out.println("Equipment added:" + equipment);
    }

}
