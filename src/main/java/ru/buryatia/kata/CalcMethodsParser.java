package ru.buryatia.kata;

public class CalcMethodsParser {
    static CalcMethods calcMethods(String str) {
        switch (str) {
            case "+":
                return CalcMethods.PLUS;
            case "-":
                return CalcMethods.MINUS;
            case "*":
                return CalcMethods.MULTIPLY;
            case "/":
                return CalcMethods.DIVISION;
            default:
                throw new RuntimeException("Ошибочный символ матемаетической операции");
        }
    }
}
