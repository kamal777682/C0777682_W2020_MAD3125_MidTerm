package com.kamal.c0777682_w2020_mad3125_midterm;

public class TaxCalculator {
    private Double grossInc;
    private Double rrsp;

    public TaxCalculator(Double grossInc, Double rrsp) {
        this.grossInc = grossInc;
        this.rrsp = rrsp;
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
            return grossInc * (0.915);
        } else if (grossInc >= 87813 && grossInc <= 150000) {
            return grossInc * (11.16 / 100);
        } else if (grossInc >= 150000 && grossInc <= 220000) {
            return grossInc * (12.16 / 100);
        } else
            {
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






    }

}
