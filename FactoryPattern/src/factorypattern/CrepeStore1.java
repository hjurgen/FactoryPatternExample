/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author User
 */
public class CrepeStore1 extends CreperieStore{
    protected Creperie createCrepe(String item){
        if( item.equals("lidia")){
            return new LidiaCrepe();
        } else if ( item.equals("baileys")){
           return new Baileys();
        } else if ( item.equals("ananas")){
            return new Ananas();
        } 
        else return null;
    }
}
