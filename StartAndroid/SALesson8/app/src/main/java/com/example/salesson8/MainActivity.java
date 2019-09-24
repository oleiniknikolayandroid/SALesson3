package com.example.salesson8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //создаем переменную типа текст вью  и присваеваем ей вью по айди
        TextView myTextView = (TextView) findViewById(R.id.myText);
        //сэтим текст
        myTextView.setText("New text in TextView");
        //создаем переменную типа баттн  и присваеваем ей вью по айди
        Button myBtn = (Button) findViewById(R.id.myBtn);
        //сэтим текст
        myBtn.setText("My button");
        //запрещаем жать кнопку
        myBtn.setEnabled(false);
        //создаем переменную типа чек бокс  и присваеваем ей вью по айди
        CheckBox myChb = (CheckBox) findViewById(R.id.myChb);
        //сэтим текст
        myChb.setChecked(true);

    }
}
