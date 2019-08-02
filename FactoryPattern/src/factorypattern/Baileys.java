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
public class Baileys extends Creperie{
    public Baileys(){
        name = "BaileysCrepe";
        ingredients = "Chocolate, Biscuit, Baileys";
        
    }
    
    void price(){
        System.out.println("Price: 3 euro");
    }
    
}
