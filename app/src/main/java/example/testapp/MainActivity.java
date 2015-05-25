package example.testapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    //meine View Elemente registrieren
    private TextView tvHead;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Layout und Code bekannt machen
        tvHead = (TextView) findViewById(R.id.textViewHead);




/*        buttonLogin = (Button) findViewById(R.id.button_section2);
        unameField = (EditText) findViewById(R.id.uName);*/

        //buttonLogin.callOnClick() = onButtonLoginClick(this.vi);
        //Layout Elemente bearbeiten
        //unameField.setHint("Bitte etwas eingeben");
        //string textViewIntro.getText();




    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
