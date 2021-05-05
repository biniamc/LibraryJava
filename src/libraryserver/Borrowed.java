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
public class Borrowed implements Serializable {
    
    public int customer;
    public int book;
    public String status;
    public String date;
    
    public Borrowed(int customer, int book, String status, String date){
        this.customer = customer;
        this.book = book;
        this.status = status;
        this.date = date;
    }
    
}
