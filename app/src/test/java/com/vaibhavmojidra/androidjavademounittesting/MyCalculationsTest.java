package com.vaibhavmojidra.androidjavademounittesting;


import static com.google.common.truth.Truth.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MyCalculationsTest {
    private MyCalculations calculations;

    @Before
    public void setUp(){
        calculations=new MyCalculations();
    }

    @Test
    public void calculateArea_radiusGiven_returnsCorrectResult(){
        double result =calculations.calculateArea(2.1);
        assertThat(result).isEqualTo(13.8474);
    }

    @Test
    public void calculateArea_zeroRadius_returnsCorrectResult() {
        double result = calculations.calculateArea(0.0);
        assertThat(result).isZero();
    }

    @Test
    public void calculateCircumference_radiusGiven_returnsCorrectResult() {
        double result = calculations.calculateCircumference(2.1);
        assertThat(result).isEqualTo(13.188);
    }

    @Test
    public void calculateCircumference_zeroRadius_returnsCorrectResult() {
        double result = calculations.calculateCircumference(0.0);
        assertThat(result).isZero();
    }
}