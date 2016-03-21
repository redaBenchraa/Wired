/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wired;

import java.util.Date;

/**
 *
 * @author Reda ben
 */
public class Report {

    Request request;
    private int reportId;
    private Date reportDate;
    private String description;
    private int senderId;
    private boolean error;
    private boolean validated;

    Report(int rId, Date rD, String d, int sId, boolean e, boolean v, Request r) {
        reportId = rId;
        reportDate = rD;
        description = d;
        senderId = sId;
        error = e;
        validated = v;
        request = new Request(r);
        request.setter("error", error);
        request.setter("validated", error);
    }

    public void setter(String var, int intVal) {
        switch (var) {
            case "reportId":
                reportId = intVal;
                break;
            case "senderId":
                senderId = intVal;
                break;
        }
    }

    public void setter(String var, Date dateVal) {
        switch (var) {
            case "reportDate":
                reportDate = dateVal;
                break;
        }
    }

    public void setter(String var, String stringVal) {
        switch (var) {
            case "description":
                description = stringVal;
                break;
        }
    }

    public void setter(String var, boolean boolVal) {
        switch (var) {
            case "error":
                error = boolVal;
                break;
            case "validated":
                validated = boolVal;
                break;
        }
    }

    public int intGetter(String var) {
        switch (var) {
            case "reportId":
                return reportId;
            case "senderId":
                return senderId;
            default:
                return -1;
        }
    }

    public boolean boolGetter(String var) {
        switch (var) {
            case "error":
                return error;
            case "validated":
                return validated;
            default:
                return false;
        }
    }

    public String stringGetter(String var) {
        switch (var) {
            case "description":
                return description;
            default:
                return "";
        }
    }

    public Date dateGetter(String var) {
        switch (var) {
            case "reportDate":
                return reportDate;
            default:
                return new Date("01/01/1900");
        }
    }

}
