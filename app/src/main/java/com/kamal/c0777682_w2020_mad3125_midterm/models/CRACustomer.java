package com.kamal.c0777682_w2020_mad3125_midterm.models;

import java.io.Serializable;

public class CRACustomer implements Serializable {
    private String sinNo;
    private String fname;
    private String lname;
    private String dob;
    private String gender;
    private int age;
    private String txDate;
    private Double grossInc;
    private Double rrsp;
    private Double cpp;
    private Double empIns;
    private Double fedTax;
    private Double provTax;
    private Double fwdRRSP;
    private Double totalTaxableInc;
    private Double taxpayed;
    private Double maxRRSP;

    public CRACustomer(String sinNo, String fname, String lname, String dob, String gender, String txDate,
                       Double grossInc, Double rrsp) {
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

    public Double getGrossInc() {
        return grossInc;
    }

    public void setGrossInc(Double grossInc) {
        this.grossInc = grossInc;
    }

    public Double getRrsp() {
        return rrsp;
    }

    public void setRrsp(Double rrsp) {
        this.rrsp = rrsp;
    }
    public double calProvTax(double grossInc) {
        if (grossInc <= 10582) {
            return grossInc * 0.0;
        } else if (grossInc >= 10582 && grossInc <= 43906) {
            return grossInc * (5.05 / 100);
        } else if (grossInc >= 43906 && grossInc <= 87813) {
            return grossInc * (0.0915);
        } else if (grossInc >= 87813 && grossInc <= 150000) {
            return grossInc * (11.16 / 100);
        } else if (grossInc >= 150000 && grossInc <= 220000) {
            return grossInc * (12.16 / 100);
        } else {
            return grossInc * (13.16 / 100);
        }
    }

    public double calFedTax(double grossInc) {
        if (grossInc <= 12069) {
            return grossInc;
        } else if (grossInc >= 12069.01 && grossInc <= 47630) {
            return grossInc * (0.15);
        } else if (grossInc >= 47630.01 && grossInc <= 95259) {
            return grossInc * (0.205);
        } else if (grossInc >= 95259.01 && grossInc <= 147667) {
            return grossInc * (0.26);
        } else if (grossInc >= 147667.01 && grossInc <= 210371) {
            return grossInc * (0.29);
        } else {
            return grossInc * (0.33);
        }
    }

    public double calCPP(double grossInc) {
        double cpp;
        if (grossInc >= 57400) {
            cpp = 57400 * (5.10 / 100);
        } else {
            cpp = grossInc * (5.10 / 100);
        }
        return cpp;
    }

    public double calEI(double grossInc) {
        double empIns;
        if (grossInc >= 53100) {
            empIns = 53100 * (1.62 / 100);
        } else {
            empIns = grossInc * (1.62 / 100);
        }
        return empIns;
    }
}


