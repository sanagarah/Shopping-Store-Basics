package olineshopping;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Account {
    private String id;
    private String username;
    private String possword; 
    private Customer customer;
    private ShoppingCart cart;
    
  public Account(String id, String username, String possword, Customer customer) {
        this.id = id;
        this.username = username;
        this.possword = possword;
        this.customer = customer;
         this.cart = new ShoppingCart();
        
        
        
    }
  public ShoppingCart cart() {

        return cart;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    @Override
    public String toString() {
   return ("Account id:"+id+"\n Account Username:"+username+"\nAccount Possword:"+possword+"\nCustomer detailes for this account :"+customer); 
    }
    
    
    
    
    
    
}
