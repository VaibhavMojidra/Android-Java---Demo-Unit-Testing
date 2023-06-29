package com.vaibhavmojidra.androidjavademounittesting;



import static com.google.common.truth.Truth.assertThat;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mockito;

public class MyViewModelTest {

    private MyViewModel myViewModel;
    private Calculations calculations;

    @Rule
    public InstantTaskExecutorRule instantTaskExecutorRule = new InstantTaskExecutorRule();

    @Before
    public void setUp() {
        calculations = Mockito.mock(Calculations.class);
        Mockito.when(calculations.calculateArea(2.1)).thenReturn(13.8474);
        Mockito.when(calculations.calculateCircumference(2.1)).thenReturn(13.188);
        myViewModel = new MyViewModel(calculations);
    }

    @Test
    public void calculateArea_radiusSent_updateLiveData() {
        myViewModel.calculateArea(2.1);
        String result = myViewModel.getAreaValue().getValue();
        assertThat(result).isEqualTo("13.8474");
    }

    @Test
    public void calculateCircumference_radiusSent_updateLiveData() {
        myViewModel.calculateCircumference(2.1);
        String result = myViewModel.getCircumferenceValue().getValue();
        assertThat(result).isEqualTo("13.188");
    }

}