/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author ThirukkumaranShanmug
 */
public class Order {
    private String products[];
    private int quantity[];
    
    public Order(String p[],int q[]){
        products=p;
        quantity=q;
    }
    
    public String[] getProducts(){
        return products;
    }
    
    public int[] getQuantity(){
        return quantity;
    }
    
}
