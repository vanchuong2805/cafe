/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageA;


/**
 *
 * @author chuon
 */
public abstract class User implements Comparable<User>{
    private String id;
    private String name;
    private int age;
    
    public User() {
        id = "U000";
        name = "none";
        age = 18;
    }

    public User(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("id: %s, name: %s, age: %d", id, name, age);
    }

   

    @Override
    public int compareTo(User o) {
        return this.id.compareToIgnoreCase(o.id);
    }
    
    
    
}
