package com.kamal.c0777682_w2020_mad3125_midterm;

import java.io.Serializable;

public class CRACustomer implements Serializable {
    private String sinNo;
    private String fname;
    private String lname;
    private String dob;
    private String gender;
    private String age;
    private String txDate;
    private String grossInc;
    private String fedTax;
    private String provTax;
    private String cpp;
    private String empIns;
    private String rrsp;
    private String fwdRRSP;
    private String totalTaxableInc;
    private String taxpayed;

    public CRACustomer(String sinNo, String fname, String lname, String dob, String gender, String age, String txDate, String grossInc,
                       String fedTax, String provTax, String cpp, String empIns, String rrsp, String fwdRRSP, String totalTaxableInc, String taxpayed) {
        this.sinNo = sinNo;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.gender = gender;
        this.age = age;
        this.txDate = txDate;
        this.grossInc = grossInc;
        this.fedTax = fedTax;
        this.provTax = provTax;
        this.cpp = cpp;
        this.empIns = empIns;
        this.rrsp = rrsp;
        this.fwdRRSP = fwdRRSP;
        this.totalTaxableInc = totalTaxableInc;
        this.taxpayed = taxpayed;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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

    public String getFedTax() {
        return fedTax;
    }

    public void setFedTax(String fedTax) {
        this.fedTax = fedTax;
    }

    public String getProvTax() {
        return provTax;
    }

    public void setProvTax(String provTax) {
        this.provTax = provTax;
    }

    public String getCpp() {
        return cpp;
    }

    public void setCpp(String cpp) {
        this.cpp = cpp;
    }

    public String getEmpIns() {
        return empIns;
    }

    public void setEmpIns(String empIns) {
        this.empIns = empIns;
    }

    public String getRrsp() {
        return rrsp;
    }

    public void setRrsp(String rrsp) {
        this.rrsp = rrsp;
    }

    public String getFwdRRSP() {
        return fwdRRSP;
    }

    public void setFwdRRSP(String fwdRRSP) {
        this.fwdRRSP = fwdRRSP;
    }

    public String getTotalTaxableInc() {
        return totalTaxableInc;
    }

    public void setTotalTaxableInc(String totalTaxableInc) {
        this.totalTaxableInc = totalTaxableInc;
    }

    public String getTaxpayed() {
        return taxpayed;
    }

    public void setTaxpayed(String taxpayed) {
        this.taxpayed = taxpayed;
    }
}
