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
public class Subordinates extends Person {

    private int idTeam;

    public Subordinates(int id,int idt, String n, String ln, String nId, String pos, String pass) {
        super(id, n, ln, nId, pos, pass);
        idTeam = idt;
    }

    public int intGetter(String var) {
        switch (var) {
            case "idTeam":
                return idTeam;
            case "idUser":
                return getId();
            default:
                return -1;
        }
    }
    public void setter(String var, int intVal) {
        switch (var) {
            case "idUser":
                setId(intVal);
            case "idTeam":
                idTeam = intVal;
        }
    }
    
    public void sendReport(){
        
    }
    public void getRequestsList(){
        
    }
}
