/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Interface.IBalance;

/**
 *
 * @author Diego Sullon
 */
public class Police extends Person implements IBalance {

    private int age;
    private String rank;
    private double balance;
    private double salary;

    public Police(int age, String rank, double balance,double salary, String code, String name, String surname, String dni) {
        super(code, name, surname, dni);
        this.age = age;
        this.rank = rank;
        this.balance = balance;
        this.salary = salary;
    }

    public void calculateBalance() {

    }

    @Override
    public String toString() {
        return "";
    }

    public int getAge() {
        return age;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public double getBalance() {
        return balance;
    }
    @Override
    public void calculateB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
