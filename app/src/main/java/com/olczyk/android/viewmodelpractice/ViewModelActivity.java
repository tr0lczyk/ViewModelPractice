package com.olczyk.android.viewmodelpractice;

import android.widget.TextView;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

@EActivity(R.layout.activity_main)
public class ViewModelActivity extends AppCompatActivity {

    @ViewById
    TextView incrementText;

    private ClickCounterViewModel clickCounterViewModel;

    @AfterViews
    public void aVoid(){
        clickCounterViewModel = ViewModelProviders.of(this).get(ClickCounterViewModel.class);
        displayClickCount(clickCounterViewModel.getCount());
    }

    @Click
    public void incrementButton(){
        clickCounterViewModel.setCount(clickCounterViewModel.getCount()+1);
        displayClickCount(clickCounterViewModel.getCount());
    }

    public void displayClickCount(int clickCount){
        incrementText.setText(String.valueOf(clickCount));
    }
}
