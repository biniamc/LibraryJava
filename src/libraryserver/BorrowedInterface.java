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
public interface BorrowedInterface extends Remote {
    
    public ArrayList<Borrowed>searchByUser(int user) throws RemoteException;
    
    public ArrayList<Borrowed>searchByBook(int book) throws RemoteException;
    
    public ArrayList<Borrowed>bookStatus(int book, String status) throws RemoteException;
    
    public ArrayList<Borrowed> customerStatus(int customer, String status) throws RemoteException;//4605
    
    public Boolean delete(int customer, int book) throws RemoteException;
    
    public Boolean update(int user, int book, String status, String date) throws RemoteException;
    
    public Boolean create(int user, int book, String status, String date) throws RemoteException;
    
}
