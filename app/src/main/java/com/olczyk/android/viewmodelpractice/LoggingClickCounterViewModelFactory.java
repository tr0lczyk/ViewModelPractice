package com.olczyk.android.viewmodelpractice;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class LoggingClickCounterViewModelFactory implements ViewModelProvider.Factory {

    private final ClickLoggingInterceptor loggingInterceptor;

    public LoggingClickCounterViewModelFactory(ClickLoggingInterceptor loggingInterceptor) {
        this.loggingInterceptor = loggingInterceptor;
    }


    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        if(modelClass.isAssignableFrom(LoggingClickCounterViewModel.class)){
            return (T) new LoggingClickCounterViewModel(loggingInterceptor);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
