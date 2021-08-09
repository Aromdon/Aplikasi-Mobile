package com.romdon.aplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //mendeklarasikan variable
     EditText TextNama;
     TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //memanggil variabel berdasarkan id
        TextNama= (EditText)findViewById(R.id.txtNama);
        hasil= (TextView)findViewById(R.id.lbl_Nama);
    }

    public void TampilNama(View view) {
        hasil.setText("Nama Anda: "+TextNama.getText());
    }
}