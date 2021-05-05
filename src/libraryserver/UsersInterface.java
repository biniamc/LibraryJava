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
public interface UsersInterface extends Remote{
    
    public ArrayList<User>search(String name) throws RemoteException ;
    
    public User find(int id) throws RemoteException ;
    
    public Boolean delete(int id) throws RemoteException ;
    
    public Boolean update(int id, String name, String image) throws RemoteException ;
    
    public Boolean create(String name, String image) throws RemoteException ;
    
}
