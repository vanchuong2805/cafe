/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageA;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author chuon
 */
// 1 1 2  3 3 4 4 5 5 5 
// 2 3 1 4 5 0 4-> khong trung nhau SET
//          2                             3
//         / \                           / \
//        1   3                         1   4
//       /     \           ->          / \   \
//      0       4                     0   2   5
//               \
//                5
public class Application {
    private final Set<Staff> listStaff;
    private final Set<Customer> listCustomer;
    private final Set<Item> listItem;
    public Application() {
        this.listStaff = new TreeSet<>();
        this.listCustomer = new TreeSet<>();
        autoCus();
        this.listItem = new TreeSet<>();
    }

    public Set<Staff> getListStaff() {
        return listStaff;
    }

    public Set<Customer> getListCustomer() {
        return listCustomer;
    }

    public Set<Item> getListItem() {
        return listItem;
    }
    
    public boolean addStaff(Staff staff){
        return listStaff.add(staff);
    }
    public boolean removeStaff(Staff staff){
        return listStaff.remove(staff);
    }
    public boolean addCustomer(Customer customer){
        return listCustomer.add(customer);
    }
    public boolean removeCustomer(Customer customer){
        return listCustomer.remove(customer);
    }
    
    public Staff createStaff(){
        return null;
    }
    public Customer createCustomer(){
        return null;
    }
    
    public void order(Customer cus, Item item){
//        cus.addItem(item);
    }
    
    public void autoCus(){
        for (int i = 1; i <= 10; i++){
            Customer cus = new Customer("C00" + i, "Do Thanh Thuy " + i, 20 + i);
            addCustomer(cus);
        }
    }
    
    public void showCustomers(){
        for (Customer cus : listCustomer) {
            System.out.println(cus);
        }
    }
}
