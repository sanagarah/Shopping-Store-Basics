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
public class Customer {
    private String name;
    private String address;
    private String phone;
    private String email;

    public Customer(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }


    @Override
    public String toString() {
        return  "\n name=" + name + "\n address=" + address + "\n email=" + email+"\n phone=" + phone +"\n"  ;
    }
    
    
}
