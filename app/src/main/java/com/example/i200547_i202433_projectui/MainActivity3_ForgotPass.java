package com.example.i200547_i202433_projectui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.ktx.Firebase;

public class MainActivity3_ForgotPass extends AppCompatActivity {

    FirebaseAuth mAuth;
    ImageButton i1;
    EditText e1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_3_forgot_pass);

        i1 = (ImageButton) findViewById(R.id.a15);
        e1 = (EditText) findViewById(R.id.a9);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email = e1.getText().toString().trim();
                if(!TextUtils.isEmpty(Email)){

                    i1.setVisibility(View.INVISIBLE);

                    mAuth.sendPasswordResetEmail(Email).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {
                                    Toast.makeText(MainActivity3_ForgotPass.this, "Reset Password Link has been sent to the Email!", Toast.LENGTH_LONG).show();
                                    Intent intent = new Intent(MainActivity3_ForgotPass.this, MainActivity2_SignIn.class);
                                    startActivity(intent);
                                    finish();
                                }
                            })
                            .addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Toast.makeText(MainActivity3_ForgotPass.this, "Error in resetting password!", Toast.LENGTH_LONG).show();
                                    i1.setVisibility(View.VISIBLE);
                                }
                            });
                }
                else{
                    e1.setError("Please fill the email!");
                }
            }
        });

    }
}