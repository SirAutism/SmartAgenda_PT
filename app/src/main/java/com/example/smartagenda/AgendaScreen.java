package com.example.smartagenda;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class AgendaScreen extends AppCompatActivity {
    Button button;
    //Button addEvent;
    //Button addTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weekly_main);

        // Referencing and Initializing the button
        button = (Button) findViewById(R.id.popupBtn);
        //addEvent = (Button) findViewById(R.id.eventAddBtn);
        //addTask = (Button) findViewById(R.id.taskAddBtn);


    }

    public void onPlusBtn_Clicked(View caller)
    {
        PopupMenu popupMenu = new PopupMenu(AgendaScreen.this, button);
        popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());
        popupMenu.show();
    }

    public void onAccountBtn3_Clicked(View caller)
    {
        AccountOverviewFragment dialogFragment=new AccountOverviewFragment();
        dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
    }

    public void onTaskAddBtn_Clicked(View caller)
    {
        NewTaskFragment dialogFragment=new NewTaskFragment();
        dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
    }

    public void onGroupBtn_Clicked(View caller)
    {
        Intent intent = new Intent(this, GroupListActivity.class);
        startActivity(intent);
    }

    public void onPersonalBtn_Clicked(View caller)
    {
        NewEventFragment dialogFragment=new NewEventFragment();
        dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
    }

}

