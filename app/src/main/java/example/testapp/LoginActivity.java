package example.testapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class LoginActivity extends ActionBarActivity implements View.OnClickListener{

    EditText etUsername, etPassword;
    Button bLogin;
    TextView tvRegisterLink;
    ImageView ivRegisterLink;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etPassword = (EditText) findViewById(R.id.editTextPassword);
        etUsername = (EditText) findViewById(R.id.editTextUsername);
        bLogin = (Button) findViewById(R.id.buttonLogin);
        tvRegisterLink = (TextView) findViewById(R.id.textViewRegister);
        ivRegisterLink = (ImageView) findViewById(R.id.imageViewRegister);


        //listener muss auf class/button etc mit klassen "hören"
        ivRegisterLink.setOnClickListener(this);
        bLogin.setOnClickListener(this);
        tvRegisterLink.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){ //switch zum identifizieren des geclickten events
            case R.id.buttonLogin: //Login Button geklickt
                startActivity(new Intent(this, MainActivity.class));
                break;

            case R.id.textViewRegister: //Register Link geklickt
                startActivity(new Intent(this, RegisterActivity.class));
                break;

            case R.id.imageViewRegister:
                startActivity(new Intent(this, RegisterActivity.class));
                break;

        }
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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
    */
}
