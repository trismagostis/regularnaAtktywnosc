package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public String[] itemList={"bieganie","skakanie","siatkówka","tenis","siłka","szachy","koszykówka","pływanie'","marsz","łyżwy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //attempts to lunch an activity within our application
        Button dodajAktywnoscBtn=(Button) findViewById(R.id.dodajAktywnoscBtn);
        dodajAktywnoscBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                itemList=getResources().getStringArray(R.array.items);
                EditText sport=(EditText) findViewById(R.id.sportEditText);
                String sportActivity=sport.getText().toString();

            for (int i= itemList.length-1;i>0;i--){
              itemList[i]=itemList[i-1];
            }
                itemList[0]=sportActivity;
            }
        });

        Button listaBtn=(Button) findViewById(R.id.listaBtn);
        listaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ListaActivity.class);
                startIntent.putExtra("com.example.myapplication.transferredString",itemList);
                startActivity(startIntent);
            }
        });
        Button zalogujBtn=(Button) findViewById(R.id.zalogujBtn);
        zalogujBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(startIntent);
            }
        });



    }
}