/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rmanager;

import java.util.Date;

/**
 *
 * @author Reda ben
 */
public class Request {

    private int idRequest;
    private String clientTel;
    private String address1;
    private String address2;
    private String clientName;
    private boolean seen;
    private boolean error;
    private boolean validated;
    private Date seenDate;
    private Date errorDate;
    private Date validatedDate;
    private String requestType;
    private String requestNet;
    private int idBoss;
    private int idTeam;
    public Request(){
    }
    public Request(Request r) {
        idRequest = r.idRequest;
        clientTel = r.clientTel;
        address1 = r.address1;
        address2 = r.address2;
        clientName = r.clientName;
        seen = r.seen;
        error = r.error;
        validated = r.validated;
        seenDate = r.seenDate;
        errorDate = r.errorDate;
        validatedDate = r.validatedDate;
        requestType = r.requestType;
        requestNet = r.requestNet;
        idBoss = r.idBoss;
        idTeam = r.idTeam;
    }

    public Request(int id, String cT, String a1, String a2, String cN, boolean s, boolean v, boolean e, Date sD, Date eD, Date vD, String rT, String rN, int idB, int idT) {
        idRequest = id;
        clientTel = cT;
        address1 = a1;
        address2 = a2;
        clientName = cN;
        seen = s;
        error = e;
        validated = v;
        seenDate = sD;
        errorDate = eD;
        validatedDate = vD;
        requestType = rT;
        requestNet = rN;
        idBoss = idB;
        idTeam = idT;
    }

    public String stringGetter(String var) {
        switch (var) {
            case "clientTel":
                return clientTel;
            case "address2":
                return address2;
            case "address1":
                return address1;
            case "clientName":
                return clientName;
            case "requestType":
                return requestType;
            case "requestNet":
                return requestNet;
            default:
                return "";
        }
    }

    public int intGetter(String var) {
        switch (var) {
            case "idRequest":
                return idRequest;
            case "idBoss":
                return idBoss;
            case "idTeam":
                return idTeam;
            default:
                return -1;
        }
    }

    public boolean boolGetter(String var) {
        switch (var) {
            case "seen":
                return seen;
            case "idBoss":
                return error;
            case "validated":
                return validated;
            default:
                return true;
        }
    }

    public Date dateGetter(String var) {
        switch (var) {
            case "seen":
                return seenDate;
            case "validated":
                return validatedDate;
            case "error":
                return errorDate;
            default:
                return new Date("01/01/1900");
        }
    }

    public void setter(String var, String stringVal) {
        switch (var) {
            case "clientTel":
                clientTel = stringVal;
                break;
            case "address1":
                address1 = stringVal;
                break;
            case "address2":
                address2 = stringVal;
                break;
            case "clientName":
                clientName = stringVal;
                break;
            case "requestType":
                requestType = stringVal;
                break;
            case "requestNet":
                requestNet = stringVal;
                break;
        }
    }

    public void setter(String var, int intVal) {
        switch (var) {
            case "idRequest":
                idRequest = intVal;
                break;
            case "idBoss":
                idBoss = intVal;
                break;
            case "idTeam":
                idTeam = intVal;
                break;
        }
    }

    public void setter(String var, boolean boolval) {
        switch (var) {
            case "seen":
                seen = boolval;
                break;
            case "error":
                error = boolval;
                break;
            case "validated":
                validated = boolval;
                break;
        }
    }

    public void setter(String var, Date dateVal) {
        switch (var) {
            case "seenDate":
                seenDate = dateVal;
                break;
            case "errorDate":
                errorDate = dateVal;
                break;
            case "validatedDate":
                validatedDate = dateVal;
                break;
        }
    }
}
