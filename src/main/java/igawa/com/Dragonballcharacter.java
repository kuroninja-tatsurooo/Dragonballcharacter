package igawa.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Dragonballcharacter {

    public static void main(String[] args) throws Exception {
        try {
            Integer character = getCombatPower ("Son Goku");
            System.out.println ( character );
        } catch (Exception e) {
            System.out.println ( "It name isn't Dragon ball character" );
        }
    }

    public static Integer getCombatPower(String name) throws Exception {
        Map<String,Integer>characters = new HashMap<> ();
        characters.put ( "Son Goku",1000000 );
        characters.put ( "Kuririn",50000 );
        characters.put ( "Buruma",10);
        characters.put ( "Yamucha",1500 );
        characters.put ( "Pual",20 );
        characters.put ( "U-ron",20 );
        characters.put ( "Son Gohan",1000 );
        Integer character = characters.get ( name );

        if (character == null){
            throw new Exception ("It name isn't Dragon ball character");
        }
        return character;
    }
}