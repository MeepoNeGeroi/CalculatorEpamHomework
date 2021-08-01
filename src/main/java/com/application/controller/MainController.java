package com.application.controller;

import com.application.model.Const;
import com.application.model.service.CalculateService;
import com.application.model.service.CheckService;
import com.application.view.MainView;

import java.util.Scanner;

public enum MainController {
    INSTANCE;

    public void execute() {
        Scanner sc = new Scanner(System.in);
        boolean isContinue = true;
        double a, b, result;
        String operation, answer;

        MainView.INSTANCE.getGreetings();

        while(isContinue){
            MainView.INSTANCE.getHelpMessage();

            a = sc.nextDouble();
            b = sc.nextDouble();
            operation = sc.next();

            result = CalculateService.INSTANCE.calculate(a, b, operation);

            MainView.INSTANCE.printResult(a, b, operation, result);

            MainView.INSTANCE.getAnswer();

            answer = sc.next();

            isContinue = CheckService.INSTANCE.isContinue(answer);
        }

        MainView.INSTANCE.getFarewell();
    }
}
