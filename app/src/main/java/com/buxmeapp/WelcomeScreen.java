package com.buxmeapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.Locale;
import com.buxmeapp.utilities.anim;

public class WelcomeScreen extends ActionBarActivity {
    RelativeLayout welcomeLayout = null;
    LinearLayout loginLayout  = null;
    LinearLayout  registerLayout  =  null;
    RelativeLayout container = null;
    LinearLayout linear_verification = null;
    ImageButton btnBack,btnBack2;
    Button btnSignUp,btnLogin,btnRegister ;
    LinearLayout    linear_Upload = null;
    Button btnVerification =  null;
    Button  btnSend = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        welcomeLayout = (RelativeLayout)  findViewById(R.id.relative_layout);
        container = (RelativeLayout)  findViewById(R.id.container);
        loginLayout = (LinearLayout) findViewById(R.id.linear_login);
        registerLayout = (LinearLayout) findViewById(R.id.linear_register);
        linear_verification = (LinearLayout) findViewById(R.id.linear_verification);
        btnBack = (ImageButton) findViewById(R.id.btnBack);
        btnBack2 = (ImageButton) findViewById(R.id.btnBack2);
        btnSignUp  =  (Button) findViewById(R.id.email_sign_up_button);
        btnLogin  = (Button) findViewById(R.id.email_sign_in_button);
        btnRegister = (Button) findViewById(R.id.register);
        linear_Upload  = (LinearLayout) findViewById(R.id.linear_Upload);
        btnSend = (Button) findViewById(R.id.btnSend);
        btnVerification = (Button) findViewById(R.id.verificationButton);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getVisibility(true,false,false, false,false, "");
            }
        });


        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getVisibility(false,true,false,false,false, "");
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getVisibility(false,false,true,false,false,"");
            }
        });

        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getVisibility(false,false,true,false,false,"");
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getVisibility(false,false,false,true,false ,"");
            }
        });

        btnVerification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getVisibility(false,false,false,false,true ,"");
            }
        });

        btnSend.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
    }



    private void getVisibility(Boolean login,Boolean register,Boolean welcome,Boolean verification,Boolean upload,String title ){
        if(login){
            loginLayout.setVisibility(View.VISIBLE);
           registerLayout.setVisibility(View.GONE);
            welcomeLayout.setVisibility(View.GONE);
            container.setBackgroundResource(R.drawable.dog_amadi);
            linear_verification.setVisibility(View.GONE);
            linear_Upload.setVisibility(View.GONE);
            //txtTitle.setText(title.toUpperCase(Locale.UK));
            anim.performAnimation(loginLayout);
        }
        if(register){
            loginLayout.setVisibility(View.GONE);
            registerLayout.setVisibility(View.VISIBLE);
            welcomeLayout.setVisibility(View.GONE);
            //txtTitle.setText(title.toUpperCase(Locale.UK));
            container.setBackgroundResource(R.drawable.leaf);
            linear_verification.setVisibility(View.GONE);
            linear_Upload.setVisibility(View.GONE);
            anim.performAnimation(registerLayout);
        }
        if(welcome){
            loginLayout.setVisibility(View.GONE);
            registerLayout.setVisibility(View.GONE);
            welcomeLayout.setVisibility(View.VISIBLE);
            container.setBackgroundResource(R.drawable.amadi_car);
            linear_verification.setVisibility(View.GONE);
            linear_Upload.setVisibility(View.GONE);
            //txtTitle.setText(title.toUpperCase(Locale.UK));
            anim.performAnimationRelativeLayout(welcomeLayout);
        }
         //linear_verification
        if(verification){
            loginLayout.setVisibility(View.GONE);
            registerLayout.setVisibility(View.GONE);
            welcomeLayout.setVisibility(View.GONE);
            container.setBackgroundResource(R.drawable.amadi_car);
            linear_verification.setVisibility(View.VISIBLE);
            //txtTitle.setText(title.toUpperCase(Locale.UK));
            linear_Upload.setVisibility(View.GONE);
            anim.performAnimation(linear_verification);
        }

        if(upload){
            loginLayout.setVisibility(View.GONE);
            registerLayout.setVisibility(View.GONE);
            welcomeLayout.setVisibility(View.GONE);
            container.setBackgroundResource(R.drawable.amadi_car);
            linear_verification.setVisibility(View.GONE);
            //txtTitle.setText(title.toUpperCase(Locale.UK));
           linear_Upload.setVisibility(View.VISIBLE);
            anim.performAnimation(linear_Upload);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_welcome_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
