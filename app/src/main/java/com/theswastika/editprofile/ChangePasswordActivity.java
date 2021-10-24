package com.theswastika.editprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ChangePasswordActivity extends AppCompatActivity {

    ImageButton back_to_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        back_to_edit = (ImageButton) findViewById(R.id.back_to_edit);

        back_to_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ChangePasswordActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

}