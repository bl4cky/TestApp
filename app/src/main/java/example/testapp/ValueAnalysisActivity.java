package example.testapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class ValueAnalysisActivity extends ActionBarActivity implements View.OnClickListener{

    private ImageButton iBProfil;
    private ImageButton iBToDO;
    private ImageButton iBValueAnalysis;
    private ImageButton iBHistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_analysis);


        iBProfil = (ImageButton) findViewById(R.id.imageButtonProfil);
        iBToDO = (ImageButton) findViewById(R.id.imageButtonToDo);
        iBValueAnalysis = (ImageButton) findViewById(R.id.imageButtonVA);
        iBHistory = (ImageButton) findViewById(R.id.imageButtonHistory);

        iBProfil.setOnClickListener(this);
        iBToDO.setOnClickListener(this);
        iBValueAnalysis.setOnClickListener(this);
        iBHistory.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) { //switch zum identifizieren des geclickten events
            case R.id.imageButtonProfil: //Login Button geklickt
                startActivity(new Intent(this, MainActivity.class));
                break;

            case R.id.imageButtonToDo: //Register Link geklickt
                startActivity(new Intent(this, ToDoActivity.class));
                break;

            case R.id.imageButtonVA:
                startActivity(new Intent(this, ValueAnalysisActivity.class));
                break;

            case R.id.imageButtonHistory:
                startActivity(new Intent(this, HistoryActivity.class));
                break;

        }
    }
}
