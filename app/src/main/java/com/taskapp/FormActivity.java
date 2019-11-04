package com.taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {
    EditText editText1, editText2;
    static final String RK = "res_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        editText1 = findViewById(R.id.ET1);
        editText2 = findViewById(R.id.ET2);
    }
    public void save (View v){
        Intent intent = new Intent();
        String text = editText1.getText()+" "+editText2.getText();
        intent.putExtra(RK, text);
        setResult(RESULT_OK, intent);
        finish();
}
}
