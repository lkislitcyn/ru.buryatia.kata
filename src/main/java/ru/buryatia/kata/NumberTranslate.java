package ru.buryatia.kata;

public class NumberTranslate {
    static int fromRomeToArabic(String str) {
        switch (str) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
        }
        return Integer.parseInt(str);
    }

    static String fromArabicToRome(int number) {
        var str = "";
        var romeNumerals = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        var arabNumerals = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; i < romeNumerals.length; i++) {
            while (number / arabNumerals[i] != 0) {
                str += romeNumerals[i];
                number -= arabNumerals[i];
            }
        }
       return str;
    }
}
