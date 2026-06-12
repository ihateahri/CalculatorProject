package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> resultList = new ArrayList<>();

    public void removeResult() {
        if (!resultList.isEmpty()) {
            resultList.remove(0);
        }
    }

    public int calculator(int num1, int num2, String operator) {

        int result = 0;

        switch (operator) {
            case ("+"):
                result = num1 + num2;
                break;
            case ("-"):
                result = num1 - num2;
                break;
            case ("*"):
                result = num1 * num2;
                break;
            case ("/"):
                result = num1 / num2;
                break;
        }

        resultList.add(result);
        return result;
    }

    public List<Integer> getResultList() {
        return resultList;
    }

    public void setResultList(List<Integer> resultList) {
        this.resultList = resultList;
    }
}
