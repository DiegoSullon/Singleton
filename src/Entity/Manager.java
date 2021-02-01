/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Diego Sullon
 */
public class Manager extends Person {

    private String sector;

    public Manager(String sector, String code, String name, String surname, String dni) {
        super(code, name, surname, dni);
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }
    
}
