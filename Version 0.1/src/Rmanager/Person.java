/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rmanager;

/**
 *
 * @author Reda ben
 */
public class Person {

    private int idUser;
    private String name;
    private String lname;
    private String nId;
    private String position;
    private String password;

    Person(int id, String n, String ln, String nId, String pos, String pass) {
        idUser = id;
        name = n;
        lname = ln;
        this.nId = nId;
        position = pos;
        password = pass;
    }

    public String getter(String var) {
        switch (var) {
            case "name":
                return name;
            case "lname":
                return lname;
            case "nId":
                return nId;
            case "position":
                return position;
            case "password":
                return password;
            default:
                return "";
        }
    }

    public int getId() {
        return idUser;
    }

    public void setId(int idUser) {
        this.idUser = idUser;
    }

    public void  setter(String var, String StringVal) {
        switch (var) {
            case "name":
                name = StringVal;
                break;
            case "lname":
                lname = StringVal;
                break;
            case "nId":
                nId = StringVal;
                break;
            case "position":
                position = StringVal;
                break;
            case "password":
                password = StringVal;
                break;
        }
    }
}
