package com.example.lacorp.myname;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.List;

/**
 * Created by lacorp on 30/06/2018.
 */

public class DataActivity extends AppCompatActivity{

    EditText namaTxt, npmTxt, deskripsiTxt;
    Button btn;
    String inputNama;
    String inputNpm;
    String inputDeskripsi;
    String inputGender;
    private String[] Gender={"Laki-Laki","Perempuan"};
    Spinner genderSpinner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.utsdata);
        super.onCreate(savedInstanceState);

        namaTxt=(EditText)findViewById(R.id.nama);
        npmTxt=(EditText)findViewById(R.id.npm);
        deskripsiTxt=(EditText)findViewById(R.id.deskripsi);
        btn=(Button)findViewById(R.id.btn);
        genderSpinner = (Spinner)findViewById(R.id.gender_spin);
        final ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,Gender);
        genderSpinner.setAdapter(adapter);
        genderSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                inputGender =adapter.getItem(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void gotoResult(View view){
        inputNama = namaTxt.getText().toString();
        inputNpm = npmTxt.getText().toString();
        inputDeskripsi = deskripsiTxt.getText().toString();

        Intent kirim = new Intent(this,ResultActivity.class);
        kirim.putExtra("name",inputNama);
        kirim.putExtra("npm",inputNpm);
        kirim.putExtra("gender",inputGender);
        kirim.putExtra("deskripsi",inputDeskripsi);
        startActivity(kirim);

    }
}
