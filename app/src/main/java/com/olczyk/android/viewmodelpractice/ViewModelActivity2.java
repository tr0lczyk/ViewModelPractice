package com.olczyk.android.viewmodelpractice;

import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

@EActivity(R.layout.activity_main)
public class ViewModelActivity2 extends AppCompatActivity {

    @ViewById
    TextView incrementText;

    private ClickCounterViewModel2 viewModel;

    @AfterViews
    public void aVoid(){
        viewModel = ViewModelProviders.of(this).get(ClickCounterViewModel2.class);
        displayClick(viewModel.getCount());
    }

    @Click
    public void incrementButton(){
        viewModel.setCount(viewModel.getCount()+1);
        displayClick(viewModel.getCount());
    }

    public void displayClick(int count){
        incrementText.setText(String.valueOf(count));
    }
}
