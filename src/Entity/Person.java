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
public class Person {
    private String code;
    private String name;
    private String surname;
    private String dni;

    public Person(String code, String name, String surname, String dni) {
        this.code = code;
        this.name = name;
        this.surname = surname;
        this.dni = dni;
    }
    
    @Override
    public String toString(){
        return "";
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDni() {
        return dni;
    }
    
}
