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
public class Ananas extends Creperie{
    public Ananas(){
        name = "Ananas Crepe";
        ingredients = "White Chocolate, Ananas, Coconout";
        
    }
    
    void price(){
        System.out.println("Price: 4 euro");
    }
    
}
