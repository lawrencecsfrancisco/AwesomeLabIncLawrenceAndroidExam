package com.example.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mUserNameEditText, mPasswordEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUserNameEditText = findViewById(R.id.editTextUsername);
        mPasswordEditText = findViewById(R.id.editTextPassword);
    }


    public void login(View view){
        if (mUserNameEditText.getText().toString().equals("") || mPasswordEditText.getText().toString().equals("")){
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("ERROR")
                    .setMessage("Please type your username and password")
                    .setCancelable(false)
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    }).show();
        }
        else {
            Intent i = new Intent(this, GalleryActivity.class);
            startActivity(i);
        }
    }
}
