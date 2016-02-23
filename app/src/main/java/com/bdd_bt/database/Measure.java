package com.bdd_bt.database;

import io.realm.RealmObject;

/**
 * Created by isen on 23/02/2016.
 */
public class Measure extends RealmObject {

    private int measure;

    public int getMeasure() {
        return measure;
    }

    public void setMeasure(int measure) {
        this.measure = measure;
    }
}
