/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import libraryserver.Books;
import libraryserver.User;

/**
 *
 * @author Prince
 */
public class Library {
    
    public static BookListsView main_page;
    public static newUser creation_page;
    public static newBook book_page;
    public static BorrowForm borrow_page;
    public static UserUpdateForm update_user;
    public static BookUpdateForm update_book;
    public static Credits credit_page;
    
    public static User user_borrow = null;
    public static Books book_borrow = null;
    
    public static String server_adress = "localhost:1099";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookListsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookListsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookListsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookListsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Library.main_page = new BookListsView();
                Library.creation_page = new newUser();
                Library.book_page = new newBook();
                Library.borrow_page = new BorrowForm();
                Library.update_user = new UserUpdateForm();
                Library.update_book = new BookUpdateForm();
                Library.credit_page = new Credits();
                Library.main_page.setVisible(true);
            }
        });
        
    }
    
    public static void closeLibrary(){
        Library.creation_page.setVisible(false);
        Library.main_page.setVisible(false);
        Library.book_page.setVisible(false);
        Library.borrow_page.setVisible(false);
        Library.creation_page.setVisible(false);
        Library.update_user.setVisible(false);
        Library.update_book.setVisible(false);
        Library.credit_page.setVisible(false);
        System.exit(0);
    }
    
}
