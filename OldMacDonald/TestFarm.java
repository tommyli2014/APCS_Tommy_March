
/**
 * Write a description of class TestFarm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestFarm
{
    public static void main(String[] args){
        Cow c = new Cow("cow", "moo");
        System.out.println(c.getType() + " goes " + c.getSound());
        
        Chick ck = new Chick("chick", "cluck", "cheep");
        System.out.println(ck.getType() + " goes " + ck.getSound());
        
        Pig p = new Pig("pig", "oink");
        System.out.println(p.getType() + " goes" + p.getSound());
    }
}
