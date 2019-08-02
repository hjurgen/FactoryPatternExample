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
public abstract class Creperie {
        String name;
        String ingredients;
      
        void prepare(){
            
            System.out.println("Preparing " + name);
            System.out.println("Ingredients : " + ingredients);

        }
        
        void bake(){
            System.out.println("Bake for 5 min");
}

        void price(){
            System.out.println("Price");
}
        public String getName(){
            return name;
        }
                
    
}
