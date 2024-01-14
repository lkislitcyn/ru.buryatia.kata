package ru.buryatia.kata;

public class CheckNumber {
    boolean checkRomanNumerals(String str) {
        return str.matches("[IVX]*");
    }

    boolean checkArabianNumerals(String str) {
        return str.matches("\\d*");
    }
}
