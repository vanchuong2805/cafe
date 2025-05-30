/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageA;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author chuon
 */
public class Customer extends User{
    // Map -> hashMap -> Item:Integer 
    
    private Map<Item, Integer> cash;
    
    public Customer() {
        super();
        cash = new HashMap<>();
    }

    public Customer(String id, String name, int age) {
        super(id, name, age);
        cash = new HashMap<>();
    }

    public Map<Item, Integer> getCash() {
        return cash;
    }

    public void setCash(Map<Item, Integer> cash) {
        this.cash = cash;
    }
    
    public Integer addItem(Item item){
        if (cash.containsKey(item)){
            return cash.put(item, cash.get(item) + 1);
        } 
        return cash.put(item, 1);
        // trasua:5
        // trasua:6 -> 5
        // :null
        // trasua:1 -> null
    }
    public Integer removeItem(Item item){
        return cash.remove(item);
        // trasua:5
        // 5
        // tradao:5, :null
        // null
    }
}
