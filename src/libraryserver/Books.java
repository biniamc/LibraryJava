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
public class Books implements Serializable {
    
    public int id;
    public String title;
    public String category;
    public int shelf_number;
    public String image;
    
    public Books(int id, String title, String category, int shelf_number, String image){
        
        this.id = id;
        this.title = title;
        this.category = category;
        this.shelf_number = shelf_number;
        this.image = image;
        
    }
    
}
