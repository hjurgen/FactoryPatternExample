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
public class CrepeTestDrive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CreperieStore nyStore = new CrepeStore1();
        
        Creperie crepe = nyStore.orderCrepe("lidia");
        System.out.println("Ethan ordered a " + crepe.getName() + "\n");

        crepe = nyStore.orderCrepe("baileys");
        System.out.println("Jack ordered a " + crepe.getName() + "\n");
        
        crepe = nyStore.orderCrepe("ananas");
        System.out.println("Joe ordered a " + crepe.getName() + "\n");
        

        

    }
    
}
