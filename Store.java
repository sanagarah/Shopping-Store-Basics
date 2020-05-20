/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olineshopping;

import java.util.ArrayList;

public class Store {


    private String name;
    private ArrayList<Account> accounts;
    private ArrayList<Product> products;

    public Store(String name) {

        this.name = name;

        accounts = new ArrayList<>();
        products = new ArrayList<>();
        
    }
    
    
    public String getName() {

        return this.name;
    }


    public void addProduct(Product p) {

        products.add(p);
    }

    
    public void deleteProduct(int index) {

        products.remove(index);

    }

    public void addAccount(Account account) {

        accounts.add(account);

    }

    public void displayProducts() {

        for (Product p : products) {
            System.out.print(p);
            System.out.println("*************************************");

        }
    }

    public void displayAccounts() {

        for (Account account : accounts) {

            System.out.print(account);
            System.out.println("*********************************");

        }
    }

    public Product getProductById(String id) {

        for (Product p : products) {

            if (p.getId().equals(id)) {
                return p;
            }
        }

        return null;

    }

    
    public Account getAccountById(String id) {

        for (Account a : accounts) {

            if (a.getId().equals(id)) {
                return a;
            }
        }

        return null;

    }

    
}
