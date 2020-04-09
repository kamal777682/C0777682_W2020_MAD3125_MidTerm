package com.kamal.c0777682_w2020_mad3125_midterm.models;

import java.io.Serializable;

public class CRACustomer implements Serializable {
    private String sinNo;
    private String fname;
    private String lname;
    private String dob;
    private String gender;
    private String txDate;
    private String grossInc;
    private String rrsp;


    public CRACustomer(String sinNo, String fname, String lname, String dob, String gender, String txDate,
                       String grossInc, String rrsp) {
        this.sinNo = sinNo;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.gender = gender;
        this.txDate = txDate;
        this.grossInc = grossInc;
        this.rrsp = rrsp;
    }

    public String getSinNo() {
        return sinNo;
    }

    public void setSinNo(String sinNo) {
        this.sinNo = sinNo;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTxDate() {
        return txDate;
    }

    public void setTxDate(String txDate) {
        this.txDate = txDate;
    }

    public String getGrossInc() {
        return grossInc;
    }

    public void setGrossInc(String grossInc) {
        this.grossInc = grossInc;
    }

    public String getRrsp() {
        return rrsp;
    }

    public void setRrsp(String rrsp) {
        this.rrsp = rrsp;
    }
}

