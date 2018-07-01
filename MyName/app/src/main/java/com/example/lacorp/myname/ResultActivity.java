package com.example.lacorp.myname;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by lacorp on 30/06/2018.
 */

public class ResultActivity extends AppCompatActivity {

    TextView namaView, npmView, genderView, deskrpsiView;
    String name, npm, gender, deskripsi;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.utsresult);
        namaView = (TextView)findViewById(R.id.nama);
        npmView = (TextView)findViewById(R.id.npm);
        genderView = (TextView)findViewById(R.id.gender);
        deskrpsiView = (TextView)findViewById(R.id.deskripsi);


        Intent terima = getIntent();
        name = terima.getStringExtra("name");
        npm = terima.getStringExtra("npm");
        gender = terima.getStringExtra("gender");
        deskripsi = terima.getStringExtra("deskripsi");

        Log.i("name", "onCreate: "+name);
        Log.i("npm", "onCreate: "+npm);
        namaView.setText(name);
        npmView.setText(npm);
        genderView.setText(gender);
        deskrpsiView.setText(deskripsi);


    }

}
