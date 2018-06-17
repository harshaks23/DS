package com.Sorting;

import java.util.List;
import java.util.ArrayList;

public class MaxDigit {
    // ... helper functions here

    // maximize function
    private static String maximize24Hour(int digits) {
        /*if (digits < 1000 || digits >= 10000) {
            return "invalid input";
        }
*/
        // get all possibles and find the biggest
        int max = -1;
        List<String> singleDigits = getDigits(digits);
        for (String s:singleDigits
             ) {
            System.out.println(s+" sdsf");

        }
        List<String> allPossibles = getPermutations(singleDigits);
        for (String s:allPossibles
                ) {
            System.out.println(s+"   second");

        }
        for (String timeStr : allPossibles) {
            int timeInt = Integer.parseInt(timeStr);
            if (isValidTime(timeInt) && timeInt > max) {
                max = timeInt;
            }
        }

        // If none is valid
        if (max < 0) {
            return "cannot find any valid time";
        }
        // Convert int to time
        return max/100 + ":" + max%100;
    }

    private static List<String> getDigits(int digits) {
        List<String> singleDigits = new ArrayList<>();
        while (digits > 0) {
            singleDigits.add(Integer.toString(digits%10));
            digits /= 10;
        }
        return singleDigits;
    }

    private static boolean isValidTime(int time) {
        int hour = time / 100;
        int min = time % 100;
        return hour <= 23 && min <= 59;
    }

    private static List<String> getPermutations(List<String> inputs) {
        if (inputs.size() <= 1) {
            return inputs;
        }

        List<String> ret = new ArrayList<>();
        for (int i = 0; i < inputs.size(); ++i) {
            List<String> copy = new ArrayList<>(inputs);
            copy.remove(i);
            List<String> recusive = getPermutations(copy);
            for (String values : recusive) {
                String temp=inputs.get(i) + values;
                if(isValidTime(Integer.parseInt(temp)))
                {

                    ret.add(temp);
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(maximize24Hour(0011));
    }
}
/**
 * Check specified time is valid
 * @param time Time in hhmm format
 * @return true if input time is valid
 */