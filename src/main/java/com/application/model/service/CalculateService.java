package com.application.model.service;

public enum CalculateService {
    INSTANCE;

    public double calculate(double a, double b, String operation){
        switch (operation) {
            case ("+"):
                return (double)a + b;
            case ("-"):
                return (double) a-b;
            case ("*"):
                return (double) a * b;
            case ("/"):
                return (double) a/b;
            case ("^"):
                return (double) Math.pow(a, b);
            case ("|"):
                return (double) Math.pow(a, 1.0/b);
            default:
                return 0;
        }
    }
}
