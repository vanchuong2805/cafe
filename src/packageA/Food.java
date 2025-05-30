/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageA;

/**
 *
 * @author chuon
 */
public class Food extends Item{

    public Food() {
        super();
    }

    public Food(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double getFinalPrice() {
        double finalPrice;
        finalPrice = getPrice()*1.08;
        return finalPrice;
    }
}
