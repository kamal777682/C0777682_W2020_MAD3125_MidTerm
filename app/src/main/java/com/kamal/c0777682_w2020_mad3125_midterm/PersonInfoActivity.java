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
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Calendar;

public class PersonInfoActivity extends AppCompatActivity implements  DatePickerDialog.OnDateSetListener{
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
                showDatePickerDialog();
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            String sinNo = sin.getText().toString().trim();
            String fname= txtFname.getText().toString().trim();
            String lname= txtLname.getText().toString().trim();
            String birthDate = dob.getText().toString().trim();
            //String gender= rbgender.getCheckedRadioButtonId();
            String taxDate= sin.getText().toString().trim();
            String grossInc= sin.getText().toString().trim();
            String rrsp= sin.getText().toString().trim();
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(PersonInfoActivity.this,DataDisplayActivity.class);
                startActivity(mIntent);
            }
        });
        }
    private void showDatePickerDialog(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this, this,
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.YEAR));
        datePickerDialog.show();
    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String date =  dayOfMonth + "/" + month+1 + "/" + year;
        dob.setText(date);
    }
}

