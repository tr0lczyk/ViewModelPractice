package com.olczyk.android.viewmodelpractice;

import android.os.Bundle;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

@EActivity(R.layout.activity_main)
public class LoggingViewModelDemoActivity extends AppCompatActivity {

    @ViewById
    TextView incrementText;

    private ClickCounterViewModel viewModel;

    @AfterViews
    public void aVoid(){
        LoggingClickCounterViewModelFactory factory = new LoggingClickCounterViewModelFactory(new ClickLoggingInterceptor());
        viewModel = ViewModelProviders.of(this,factory).get(LoggingClickCounterViewModel.class);
        displayClickCounts(viewModel.getCount());
    }

    @Click
    public void incrementButton(){
        viewModel.setCount(viewModel.getCount()+1);
        displayClickCounts(viewModel.getCount());
    }

    public void displayClickCounts(int clickCount){
        incrementText.setText(String.valueOf(clickCount));
    }
}
