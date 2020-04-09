package com.kamal.c0777682_w2020_mad3125_midterm.models;

import android.text.style.ImageSpan;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

    public CRACustomer(String sinNo, String fname, String lname, String dob, String gender, Double grossInc, Double rrsp) {
        this.sinNo = sinNo;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.gender = gender;
        this.txDate = caltaxFillingDate();
        this.grossInc = grossInc;
        this.rrsp = rrsp;
        this.age = calAge(dob);
        this.cpp = calCPP();
        this.empIns = calEI();
        this.fedTax = calFedTax();
        this.provTax = calProvTax();
        this.fwdRRSP = calcarryFwdRRSSP();
        this.totalTaxableInc = calTaxPayable();
        this.taxpayed = calTaxPayed();
        this.maxRRSP = calMxRRSP();
    }

    private int calAge(String dob) {
        return age = 18;
    }

    private String caltaxFillingDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        Date date = Calendar.getInstance().getTime();
        return dateFormat.format(date);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getCpp() {
        return cpp;
    }

    public void setCpp(Double cpp) {
        this.cpp = cpp;
    }

    public Double getEmpIns() {
        return empIns;
    }

    public void setEmpIns(Double empIns) {
        this.empIns = empIns;
    }

    public Double getFedTax() {
        return fedTax;
    }

    public void setFedTax(Double fedTax) {
        this.fedTax = fedTax;
    }

    public Double getProvTax() {
        return provTax;
    }

    public void setProvTax(Double provTax) {
        this.provTax = provTax;
    }

    public Double getFwdRRSP() {
        return fwdRRSP;
    }

    public void setFwdRRSP(Double fwdRRSP) {
        this.fwdRRSP = fwdRRSP;
    }

    public Double getTotalTaxableInc() {
        return totalTaxableInc;
    }

    public void setTotalTaxableInc(Double totalTaxableInc) {
        this.totalTaxableInc = totalTaxableInc;
    }

    public Double getTaxpayed() {
        return taxpayed;
    }

    public void setTaxpayed(Double taxpayed) {
        this.taxpayed = taxpayed;
    }

    public Double getMaxRRSP() {
        return maxRRSP;
    }

    public void setMaxRRSP(Double maxRRSP) {
        this.maxRRSP = maxRRSP;
    }


 private double calProvTax() {
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

     private double calFedTax() {
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

    private double calCPP() {
        double cpp;
        if (grossInc >= 57400) {
            cpp = 57400 * (5.10 / 100);
        } else {
            cpp = grossInc * (5.10 / 100);
        }
        //https://mkyong.com/java/how-to-round-double-float-value-to-2-decimal-points-in-java/
        BigDecimal bigDecimal = new BigDecimal(cpp).setScale(2, RoundingMode.UP);
        cpp = bigDecimal.doubleValue();
        return cpp;
    }


    private double calEI() {
        double empIns;
        if (grossInc >= 53100) {
            empIns = 53100 * (1.62 / 100);
        } else {
            empIns = grossInc * (1.62 / 100);
        }
        BigDecimal bigDecimal = new BigDecimal(empIns).setScale(2, RoundingMode.UP);
        empIns = bigDecimal.doubleValue();
        return empIns;
    }

    private double calMxRRSP() {
        if (rrsp > maxRRSP) {
            return maxRRSP;
        }else
        {maxRRSP = rrsp-5

        }
        BigDecimal bigDecimal = new BigDecimal(maxRRSP).setScale(2, RoundingMode.UP);
        maxRRSP = bigDecimal.doubleValue();
        return maxRRSP;
    }

    private double calcarryFwdRRSSP() {
        fwdRRSP = (calMxRRSP() - rrsp);
        BigDecimal bigDecimal = new BigDecimal(fwdRRSP).setScale(2, RoundingMode.UP);
        fwdRRSP = bigDecimal.doubleValue();
        return fwdRRSP;
    }

    private double calTaxPayable() {
        totalTaxableInc = (grossInc - (calCPP() + calEI() + rrsp));
        return totalTaxableInc;
    }
    private double calTaxPayed()
    {
        taxpayed =  calFedTax() + calProvTax();
        return taxpayed;
    }
}


