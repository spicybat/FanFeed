package com.btruong.fanfeed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class MyActivity extends Activity implements AdapterView.OnItemSelectedListener {
    public static String TEAM;

    private Spinner sport_spinner, team_spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        addItemsOnSportSpinner();
        addListenerOnSpinnerItemSelection();
    }

    public void addItemsOnSportSpinner(){
        sport_spinner = (Spinner) findViewById(R.id.sSport);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.sport_type, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sport_spinner.setAdapter(adapter);
    }

    public void addListenerOnSpinnerItemSelection(){
       // sport_spinner = (Spinner) findViewById(R.id.sSport);
        sport_spinner.setOnItemSelectedListener(this);
    }

    public void goRegister(View view){
        Intent intent = new Intent(this, RegisterActivity.class);
        //intent.putExtra(TEAM, team_spinner );
        TEAM=team_spinner.getSelectedItem().toString();
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(adapterView.getItemAtPosition(i).toString().equals("NFL"))
        {
            team_spinner = (Spinner) findViewById(R.id.sTeam);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.NFL, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            team_spinner.setAdapter(adapter);
        }
        else if(adapterView.getItemAtPosition(i).toString().equals("NBA"))
        {
            team_spinner = (Spinner) findViewById(R.id.sTeam);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.NBA, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            team_spinner.setAdapter(adapter);
        }
        else if(adapterView.getItemAtPosition(i).toString().equals("NHL"))
        {
            team_spinner = (Spinner) findViewById(R.id.sTeam);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.NHL, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            team_spinner.setAdapter(adapter);
        }
        else if(adapterView.getItemAtPosition(i).toString().equals("MLB"))
        {
            team_spinner = (Spinner) findViewById(R.id.sTeam);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.MLB, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            team_spinner.setAdapter(adapter);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}