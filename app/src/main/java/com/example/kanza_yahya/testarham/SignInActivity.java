package com.example.kanza_yahya.testarham;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by KaNza_Yahya on 29/04/2018.
 */

public class SignInActivity extends AppCompatActivity{


    private EditText mDisplayName;
    private  EditText mEmail;
    private  EditText mPassword;
    private Button mCreateBtn;


    private Toolbar mToolbar;



    //ProgressDialog
    private ProgressDialog mRegProgress;

    //Firebase Auth
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);




        mRegProgress = new ProgressDialog(this);



        // Firebase Auth

        mAuth = FirebaseAuth.getInstance();


        // Android Fields
        mEmail = ( EditText) findViewById(R.id.email);
        mPassword = ( EditText) findViewById(R.id.pass);
        mCreateBtn = (Button) findViewById(R.id.btn_login);


        mCreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* String email = mEmail.getText().toString();
                String password = mPassword.getText().toString();

                if( !TextUtils.isEmpty(email) || !TextUtils.isEmpty(password)){

                    mRegProgress.setTitle("Login User");
                    mRegProgress.setMessage("Please wait while Processing!");
                    mRegProgress.setCanceledOnTouchOutside(false);
                    mRegProgress.show();

                    login_user(email, password);

                }*/
                Intent mainIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainIntent);
                finish();



            }
        });


    }

    private void login_user(String email, String password) {

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){


                    mRegProgress.dismiss();

                    Intent mainIntent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(mainIntent);
                    finish();

                }else {

                    mRegProgress.hide();
                    Toast.makeText(getApplicationContext(), "Cannot Sign in. Please check the form and try again.", Toast.LENGTH_LONG).show();

                }


            }
        });



    }
}
