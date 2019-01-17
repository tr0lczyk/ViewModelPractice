package com.olczyk.android.viewmodelpractice;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.TextView;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

//    @ViewById
//    TextView incrementText;
//    @ViewById
//    Button incrementButton;
//
//    int incrementation = 0;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if(savedInstanceState != null){
//            incrementation = Integer.parseInt(savedInstanceState.getString("incrementation"));
//        }
//    }
//
//    @AfterViews
//    public void aVoid() {
//        incrementText.setText(String.valueOf(incrementation));
//    }
//
//    @Click
//    public void incrementButton(){
//        incrementText.setText(String.valueOf(++incrementation));
//    }
//
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putString("incrementation",incrementText.getText().toString());
//    }
}
