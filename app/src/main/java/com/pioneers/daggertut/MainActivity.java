package com.pioneers.daggertut;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Inject
    Coffe coffe,coffe2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponent component=((MainApplication)getApplication()).getAppComponent();
        CoffeComponent coffeComponent= component.getCoffeComponentBuilder().milk(2).sugar(4).build();
        coffeComponent.inject(this);

        Log.d(TAG, "Yousef onCreate: coffe1: "+coffe+"\n coffe2: "+coffe2);
        Log.d(TAG, "Yousef onCreate: "+ coffe.getCoffeCup()+" \n farm for coffe1: "+coffe.farm+"\n farm coffe2: "+coffe2.farm);
        Log.d(TAG, "Yousef onCreate: "+ coffe.getCoffeCup()+" \n river for coffe1: "+coffe.river+"\n river coffe2: "+coffe2.river);

    }
}