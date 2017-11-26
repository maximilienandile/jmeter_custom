package com.maximilien.jmeter;

public class FunctionalityForSampling {
    public String testFunction(String arguement1,String arguement2) throws Exception {
        if (arguement1.equals(arguement2)) {
            throw new Exception();
        }
        else return arguement1+arguement2;
    }
}
