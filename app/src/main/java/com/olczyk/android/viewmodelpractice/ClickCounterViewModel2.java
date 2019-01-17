package com.olczyk.android.viewmodelpractice;

import androidx.lifecycle.ViewModel;

public class ClickCounterViewModel2 extends ViewModel {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
