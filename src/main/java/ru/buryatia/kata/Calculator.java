package ru.buryatia.kata;

public class Calculator {
    int mathOperation(int a, int b, CalcMethods calcMethods) {
        if (calcMethods == CalcMethods.PLUS) {
            return a + b;
        } else if (calcMethods == CalcMethods.MINUS) {
            return a - b;
        } else if (calcMethods == CalcMethods.MULTIPLY) {
            return a * b;
        } else if (calcMethods == CalcMethods.DIVISION) {
            return a / b;
        }
        return 0;
    }
}
