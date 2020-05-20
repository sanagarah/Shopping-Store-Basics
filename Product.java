/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olineshopping;

/**
 *
 * @author lenovo
 */
public class Product {
    private String id;
    private String name;       
    private String Supplier;  
    private double price;

    public Product(String id, String name, String Supplier, double price) {
        this.id = id;
        this.name = name;
        this.Supplier = Supplier;
        setPrice (price) ;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
        this.price = 0;}
        else 
            this.price = price;
            
    }

    @Override
    public String toString() {
      return ("the product id :"+id +"\n the product name: "+ name+"\n the product Supplier "+Supplier+"\nthe product Price "+price+"\n");
    }
    
    
    
}
 