/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Police;
import Entity.Manager;
import java.util.ArrayList;

/**
 *
 * @author Diego Sullon
 */
public class Records {

    private String stationName = "AGUILAS NEGRAS";
    private ArrayList<Police> cops = new ArrayList<Police>();
    private ArrayList<Manager> managers = new ArrayList<Manager>();

//  Singleton
    private static Records records;

    public static Records getInstance() {
        if (records == null) {
            records = new Records();
        }
        return records;
    }

    private Records() {
    }

    public void registerPolice(int age, String rank, double balance, double salary, String name, String surname, String dni) {
        String code = String.valueOf(cops.size());
        Police police = new Police(age, rank, balance, salary, code, name, surname, dni);
        cops.add(police);
    }

    public void registerManager(String sector, String name, String surname, String dni) {
        String code = String.valueOf(managers.size());
        Manager manager = new Manager(sector, code, name, surname, dni);
        managers.add(manager);
    }

    public ArrayList<Police> listPolice() {
        return cops;
    }

    public ArrayList<Manager> listManager() {
        return managers;
    }

    private void caculateBalance() {

    }

    private void listPoliceSalary() {

    }

    public void execute() {

    }

    public int menu() {
        return 1;
    }

}
