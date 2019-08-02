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
public abstract class CreperieStore {
    
    
    public Creperie orderCrepe(String type){
        Creperie crepe;
        
        crepe = createCrepe(type);
        
        crepe.prepare();
        crepe.bake();
        crepe.price();
        return crepe;
    }
    protected abstract Creperie createCrepe(String type);
    
}
