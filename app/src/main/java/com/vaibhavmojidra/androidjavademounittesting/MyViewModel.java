package com.vaibhavmojidra.androidjavademounittesting;

import android.text.TextUtils;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private Calculations calculations;

    public MyViewModel(Calculations calculations) {
        this.calculations = calculations;
    }

    public MutableLiveData<String> radius=new MutableLiveData<>();

    private MutableLiveData<String> area=new MutableLiveData<>();
    public LiveData<String> getAreaValue() {
        return area;
    }

    private MutableLiveData<String> circumference=new MutableLiveData<>();
    public LiveData<String> getCircumferenceValue() {
        return circumference;
    }


    public void calculate() {
        if (!TextUtils.isEmpty(radius.getValue())) {
            double radiusDoubleValue = Double.parseDouble(radius.getValue());
            calculateArea(radiusDoubleValue);
            calculateCircumference(radiusDoubleValue);
        } else {
            area.setValue(null);
            circumference.setValue(null);
        }
    }

    public void calculateArea(double radius) {
        double calculatedArea = calculations.calculateArea(radius);
        area.setValue(Double.toString(calculatedArea));
    }

    public void calculateCircumference(double radius) {
        double calculatedCircumference = calculations.calculateCircumference(radius);
        circumference.setValue(Double.toString(calculatedCircumference));
    }
}
