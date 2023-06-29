package com.vaibhavmojidra.androidjavademounittesting;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class MyViewModelFactory implements ViewModelProvider.Factory {

    private Calculations calculations;

    public MyViewModelFactory(Calculations calculations) {
        this.calculations = calculations;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(MyViewModel.class)) {
            return (T) new MyViewModel(calculations);
        }
        throw new IllegalArgumentException("Unknown View Model Class");
    }
}
