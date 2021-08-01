package com.application.view;

public enum MainView {
    INSTANCE;

    public void getFarewell(){
        System.out.println("Goodbye!");
    }

    public void getGreetings(){
        System.out.println("Hello, please, input:");
    }

    public void getHelpMessage(){
        System.out.println("Input first number, then the second one, then input math operation\n" +
                "('+' - addition, '-' - subtraction, '*' - multiplication, '/' - division, \n" +
                "'^' - exponentiation and '|' - root extraction)");
    }

    public void getAnswer(){
        System.out.println("Do you want continue ? (press 'Y' to continue)");
    }

    public void printResult(double a, double b, String operation, double result){
        System.out.println("Result of " + a + " " + operation + " " + b + " is:\n" + result);
    }
}
