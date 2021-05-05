/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryserver;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.*;
/**
 *
 * @author Prince
 */
public interface BooksInterface extends Remote{
    
    public ArrayList<Books>search(String word) throws RemoteException;
    
    public Books find(int id) throws RemoteException;
    
    public Boolean delete(int id) throws RemoteException;
    
    public Boolean update(int id, String title, String category, int shelf_number, String image) throws RemoteException;
    
    public Boolean create(String title, String category, int shelf_number, String image) throws RemoteException;
    
}
