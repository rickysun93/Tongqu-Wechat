package com.sjtu.Datamodels;

/**
 * Created by sunhaoran on 2016/10/21.
 */
public class Tongqu_result {
    private int count;
    private Tongqu_acts[] acts;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Tongqu_acts[] getActs() {
        return acts;
    }

    public void setActs(Tongqu_acts[] acts) {
        this.acts = acts;
    }
}
