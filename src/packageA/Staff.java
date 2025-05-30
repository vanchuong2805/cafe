/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageA;

/**
 *
 * @author chuon
 */
public class Staff extends User implements IStaff{
    private double salary;
    private int workHour;

    public Staff() {
        super();
        salary = 0;
        workHour = 0; 
    }

    public Staff(double salary, int workHour, String id, String name, int age) {
        super(id, name, age);
        this.salary = salary;
        this.workHour = workHour;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(" salary:%.2f, workHour:%d", salary, workHour); 
    }

    @Override
    public double getIncome() {
        double income;
        income = salary * workHour;
        if (workHour >= 40){
            income *= 1.5;
        }
        return income;
    }
}
