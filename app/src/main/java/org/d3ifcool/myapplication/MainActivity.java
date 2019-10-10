package org.d3ifcool.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nim, nama, uts, uas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nim = findViewById(R.id.editText_nim);
        nama = findViewById(R.id.editText_nama);
        uts = findViewById(R.id.editText_uts);
        uas = findViewById(R.id.editText_uas);


        Button buttonSubmit = findViewById(R.id.button_test);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validasi();
            }
        });
    }

    private void validasi() {
        String nimString = nim.getText().toString().trim();
        String namaString = nama.getText().toString().trim();
        String utstring = uts.getText().toString().trim();
        String uasString = uas.getText().toString().trim();

        if (!TextUtils.isEmpty(nimString) && !TextUtils.isEmpty(namaString) && !TextUtils.isEmpty(uasString) && !TextUtils.isEmpty(utstring)) {
            Toast.makeText(MainActivity.this, "Data Berhasil Dimasukkan", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(MainActivity.this, "data gagal dimasukkan ", Toast.LENGTH_SHORT).show();
        }
    }
}
