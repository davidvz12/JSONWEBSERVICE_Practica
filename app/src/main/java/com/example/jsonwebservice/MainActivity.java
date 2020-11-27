package com.example.jsonwebservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSearch (View view){
        Intent intent = new Intent(this, actValidateLogin.class);
        EditText txtName = (EditText)findViewById(R.id.txtName);
        Toast toast = Toast.makeText(this, "Ingrese el nombre del personaje", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);

        if (txtName.getText().length() > 0)
        {
            Bundle b = new Bundle();
            b.putString("name", txtName.getText().toString());
            intent.putExtras(b);
            startActivity(intent);
        }
        else toast.show();
    }
}