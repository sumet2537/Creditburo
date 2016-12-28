/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Donut
 */
public class BurocForm extends org.apache.struts.action.ActionForm {
    private String sert;
 private String todo;
    private String br_Code;
    private String br_Account;
    private String br_Bank;
    private String br_Name;
    private String br_Lastname;
    private double br_Total;
    private String Status;

    public String getSert() {
        return sert;
    }

    public void setSert(String sert) {
        this.sert = sert;
    }

    
    public String getBr_Code() {
        return br_Code;
    }

    public void setBr_Code(String br_Code) {
        this.br_Code = br_Code;
    }

    public String getBr_Account() {
        return br_Account;
    }

    public void setBr_Account(String br_Account) {
        this.br_Account = br_Account;
    }

    public String getBr_Bank() {
        return br_Bank;
    }

    public void setBr_Bank(String br_Bank) {
        this.br_Bank = br_Bank;
    }

    public String getBr_Name() {
        return br_Name;
    }

    public void setBr_Name(String br_Name) {
        this.br_Name = br_Name;
    }

    public String getBr_Lastname() {
        return br_Lastname;
    }

    public void setBr_Lastname(String br_Lastname) {
        this.br_Lastname = br_Lastname;
    }

    public double getBr_Total() {
        return br_Total;
    }

    public void setBr_Total(double br_Total) {
        this.br_Total = br_Total;
    }



    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
 
}
