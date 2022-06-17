package com.codegym.service;

import org.springframework.stereotype.Service;

@Service
public class CalculationService implements ICalculationService {
    @Override
    public Double calculation(Double num1, Double num2, String result) {


        Double re = 0.0;
        switch (result) {
            case "addtion":
                re = num1 + num2;
                break;
            case "subtraction":
                re = num1 - num2;
                break;
            case "multiplication":
                re = num1 * num2;
                break;
            case "division":
                re = num1 / num2;
                break;
        }
        return re;
    }
}
