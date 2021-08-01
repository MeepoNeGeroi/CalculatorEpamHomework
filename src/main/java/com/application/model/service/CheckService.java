package com.application.model.service;

import com.application.model.Const;

public enum CheckService {
    INSTANCE;

    public boolean isContinue(String answer){
        if(!answer.toUpperCase().equals(Const.answerToContinue)){
            return false;
        }

        return true;
    }
}
