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
public class Team {

    private int count;
    private int idTeam;

    Team(int c, int id) {
        count = c;
        idTeam = id;
    }

    public int getter(String var) {
        switch (var) {
            case "count":
                return count;
            case "idTeam":
                return idTeam;
            default:
                return -1;
        }
    }

    public void setter(String var, int val) {
        switch (var) {
            case "count":
                count = val;
            case "idTeam":
                idTeam = val;
        }
    }
}
