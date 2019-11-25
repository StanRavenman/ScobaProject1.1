package com.example.scobaproject_experiment2;


public class ScobaConverter {
    public static boolean btext=true;
    public static boolean bscoba=true;


    public static String[] letterToScoba(String s)  {

        btext=true;

        char[] arrLetter = s.toCharArray();
        String[] arrScoba = new String[arrLetter.length];

        for (int i = 0; i < arrLetter.length; i++) {
            for (int j = 0; j < ScobaKey.key().length; j++) {
                if (Character.toString(arrLetter[i]).equals(ScobaKey.key()[j][0])) {
                    arrScoba[i] = ScobaKey.key()[j][1];
                } else if (j==ScobaKey.key().length-1) btext = false;
            }

        }
        return arrScoba;
    }


    public static String[] scobaToLetter(String s)  {

        bscoba=true;

        char[] arrScoba = s.toCharArray();
        String[] arrLetter = new String[(arrScoba.length) / 5];
        int k = 0;
        for (int i = 0; i <= arrScoba.length - 5; i += 5) {
            for (int j = 0; j < ScobaKey.key().length; j++) {
                if ((Character.toString(arrScoba[i]) + arrScoba[i + 1] + arrScoba[i + 2] +
                        arrScoba[i + 3] + arrScoba[i + 4]).equals(ScobaKey.key()[j][1])) {
                    arrLetter[k] = ScobaKey.key()[j][0];
                } else if (j==ScobaKey.key().length-1) bscoba = false;
            }
            k++;
        }
        return arrLetter;
    }
}
