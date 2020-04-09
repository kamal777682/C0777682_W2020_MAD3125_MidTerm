package com.kamal.c0777682_w2020_mad3125_midterm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class PersonInfoActivity extends AppCompatActivity {
    private TextInputEditText sin;
    private TextInputEditText txtFname;
    private TextInputEditText txtLname;
    private TextInputEditText dob;
    private RadioGroup rbgender;
    private RadioButton rbmale;
    private RadioButton rbfemale;
    private TextInputEditText taxDate;
    private TextInputEditText grossInc;
    private TextInputEditText rrsp;
    private Button btnClear;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Person Information Form");
        sin = findViewById(R.id.sin);
        txtFname = findViewById(R.id.txtFname);
        txtLname = findViewById(R.id.txtLname);
        dob = findViewById(R.id.txtDate);
        rbgender = findViewById(R.id.rbgender);
        rbmale = findViewById(R.id.rbMale);
        rbfemale = findViewById(R.id.rbFemale);
        taxDate = findViewById(R.id.txtTaxDate);
        grossInc = findViewById(R.id.txtGrossInc);
        rrsp = findViewById(R.id.txtRRSP);
        btnClear = findViewById(R.id.btnClear);
        btnSubmit = findViewById(R.id.btnGoNext);
        findViewById(R.id.btnDatePicker).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        private void showDatePickerDialog(){
            DatePickerDialog datePickerDialog = new DatePickerDialog(
                    this,this,

        }

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(PersonInfoActivity.this,DataDisplayActivity.class);
                startActivity(mIntent);
            }
        });
        }
    }

