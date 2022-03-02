package com.vku.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtName, edtSinger;
    Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = (EditText) findViewById(R.id.edtName);
        edtSinger = (EditText) findViewById(R.id.edtSinger);
        btnAdd = (Button) findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),SongListActivity.class);
                intent.putExtra("NAME",edtName.getText().toString().trim());
                intent.putExtra("SINGER",edtSinger.getText().toString().trim());
                startActivity(intent);
            }
        });
    }
}