package com.pioneers.daggertut;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@ActivityScope
public class Coffe {

    private static final String TAG = "Coffe";

    @Inject
    Farm farm;

    River river;

    int sugar;

    int milk;

    @Inject
    public Coffe(River river, @Sugar int sugar ,@Milk int milk) {
     this.river=river;
     this.sugar=sugar;
     this.milk=milk;
    }

    @Inject
    public void connectElectricity(){
        Log.d(TAG, "Yousef connectElectricity: connecting .... ");
    }

    public String getCoffeCup(){
      return farm.getBeans()+" + "+river.getWater()+" sugar: "+sugar+" milk: "+milk;
    }
}
