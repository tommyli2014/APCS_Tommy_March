
/**
 * Write a description of class Chick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Chick implements Animal
{
    private String myType;
    private String mySound;
    private String mySound2;
    
    Chick(String type, String sound, String sound2){
        myType = type;
        mySound = sound;
        mySound2 = sound2;
    }
    
    public String getType(){
        return myType;
    }
    public String getSound(){
        Random rand = new Random();
        int i = 0;
        i = rand.nextInt(2);
        if(i == 0){
            return mySound;
        } else {
            return mySound2;
        }
    }
}
