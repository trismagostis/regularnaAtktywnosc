package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaActivity extends AppCompatActivity {
public String itemsTable[]=new String[10];
public ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        Resources res =getResources();
        itemsTable=res.getStringArray(R.array.items);

        if(getIntent().hasExtra("com.example.myapplication.transferredString")){
            myListView=(ListView) findViewById(R.id.myListView);
            String text[]=getIntent().getExtras().getStringArray("com.example.myapplication.transferredString");
            myListView.setAdapter(new ArrayAdapter<String>(getApplicationContext(),R.layout.text_view_layout,text));
        }
    }
}