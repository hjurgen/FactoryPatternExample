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
public class LidiaCrepe extends Creperie{
    public LidiaCrepe(){
        name = "LidiaCrepe";
        ingredients = "Chocolate, Biscuit, Banana";
        
    }
    
    void price(){
        System.out.println("Price: 2 euro");
    }
    
}
