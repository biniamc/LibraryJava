/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryserver;

import java.io.Serializable;

/**
 *
 * @author Prince
 */
public class User implements Serializable {
    
    public String name;
    public int id;
    public String image;
    
    public User(int id, String name, String image){
        
        this.id = id;
        this.name = name;
        this.image = image;
        
    }
    
}
