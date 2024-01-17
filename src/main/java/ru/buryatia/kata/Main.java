package ru.buryatia.kata;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите уравнение формата (1 + 6) или (I + IV), где числа от 1 до 10, математические операции +,-,*,/");
        Scanner scanner = new Scanner(System.in);
        var str = scanner.nextLine();
        System.out.println(calc(str));
    }
    public static String calc(String input) {

        var checkMoreLess = false;
        int result;

        String[] pars = input.trim().split(" ");
        var calculator = new Calculator();
        var checkNumber = new CheckNumber();
        if (pars.length != 3) {
            throw new IllegalArgumentException("Неверный формат уравнения");
        }

        try {
            checkMoreLess = (NumberTranslate.fromRomeToArabic(pars[0]) > 0 && NumberTranslate.fromRomeToArabic(pars[0]) <= 10)
                    && (NumberTranslate.fromRomeToArabic(pars[2]) > 0 && NumberTranslate.fromRomeToArabic(pars[2]) <= 10);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Неверные значения или формат уравнения");
            System.exit(0);
        }

        var checkArabianPair = (checkNumber.checkArabianNumerals(pars[0])) && (checkNumber.checkArabianNumerals(pars[2]));
        var checkRomanPair = (checkNumber.checkRomanNumerals(pars[0])) && (checkNumber.checkRomanNumerals(pars[2]));
        if ((checkArabianPair || checkRomanPair) && checkMoreLess) {
            result = calculator.mathOperation(NumberTranslate.fromRomeToArabic(pars[0]), NumberTranslate.fromRomeToArabic(pars[2]), CalcMethodsParser.calcMethods(pars[1]));
        } else {
            throw new IllegalArgumentException("Неверные значения");
        }
        if (checkRomanPair) {
            if (result > 0) {
                return NumberTranslate.fromArabicToRome(result);
            } else throw new IllegalArgumentException("Римские цифры не могут быть меньше нуля");
        } else {
            return Integer.toString(result);
        }

    }
}
