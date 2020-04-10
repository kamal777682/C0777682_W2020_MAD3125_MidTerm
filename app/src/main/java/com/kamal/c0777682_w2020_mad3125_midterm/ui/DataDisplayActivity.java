package com.kamal.c0777682_w2020_mad3125_midterm.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.kamal.c0777682_w2020_mad3125_midterm.R;
import com.kamal.c0777682_w2020_mad3125_midterm.models.CRACustomer;

import java.io.Serializable;
//import com.kamal.c0777682_w2020_mad3125_midterm.models.TaxCalculator;
public class DataDisplayActivity extends AppCompatActivity  {
    private TextView sinNo;
    private TextView name;
    private TextView dob;
    private TextView gender;
    private TextView age;
    private TextView txDate;
    private TextView grossInc;
    private TextView fedTax;
    private TextView provTax;
    private TextView cpp;
    private TextView empIns;
    private TextView rrsp;
    private TextView fwdRRSP;
    private TextView totalTaxableInc;
    private TextView taxpayed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_display);
        sinNo = findViewById(R.id.textView);
        name = findViewById(R.id.textView4);
        dob = findViewById(R.id.textView5);
        gender = findViewById(R.id.textView6);
        age = findViewById(R.id.textView7);
        txDate = findViewById(R.id.textView8);
        grossInc = findViewById(R.id.textView9);
        fedTax = findViewById(R.id.textView10);
        provTax = findViewById(R.id.textView11);
        cpp= findViewById(R.id.textView12);
        empIns = findViewById(R.id.textView13);
        rrsp  = findViewById(R.id.textView14);
        fwdRRSP = findViewById(R.id.textView15);
        totalTaxableInc = findViewById(R.id.textView16);
        taxpayed = findViewById(R.id.textView17);


        CRACustomer tempObj = (CRACustomer) getIntent().getSerializableExtra("CRACustomerObj");

        sinNo.setText("SIN NUMBER        :   "+ tempObj.getSinNo());
        name.setText("NAME                    :   " +tempObj.getLname().toUpperCase()+" "+tempObj.getFname());
        dob.setText("DATE OF BIRTH      :   "+tempObj.getDob());
        gender.setText("GENDER                   :   "+tempObj.getGender());
        age.setText("AGE                         :   "+tempObj.getAge());
        txDate.setText("TAX FILLING DATE   :   "+tempObj.getTxDate());
        grossInc.setText("GROSS INCOME      :   $"+tempObj.getGrossInc());
        rrsp.setText("RRSP CONTRIBUTED      :   $"+tempObj.getRrsp());
        fedTax.setText("FEDERAL TAX          :   $"+tempObj.getFedTax());
        provTax.setText("PROVINCIAL TAX     :   $"+tempObj.getProvTax());
        cpp.setText("CPP                         :   $"+tempObj.getCpp());
        empIns.setText("EI                       :   $"+tempObj.getEmpIns());
        //maxRRSP.setText("MAXIMUM RRSP   :   "+tempObj.getEmpIns());
        Double carryfwdRRSP = tempObj.getFwdRRSP();
        if(carryfwdRRSP >0)
        {
            fwdRRSP.setText("CARRY FORWARD RRSP      :   $"+tempObj.getFwdRRSP());
        }
        else
        {
            fwdRRSP.setText("CARRY FORWARD RRSP      :   $"+tempObj.getFwdRRSP());
          // fwdRRSP.setTextColor(getResources().getColor(R.color.holo_dark_red));
        }
        totalTaxableInc.setText("TOTAL TAXABLE INCOME    :   $"+tempObj.getTotalTaxableInc());
       taxpayed.setText("TAX PAYED  :       $"+tempObj.getTaxpayed());
    }
}
