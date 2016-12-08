package com.codechallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AutoCorrect {
    public static String solution(String s) {
        ArrayList<String> stringArray = new ArrayList<String>(Arrays.asList(s.split(" ")));
        String output = "";

        Pattern p = Pattern.compile("you*$");
//        Matcher m = ;
//        boolean b = m;


        for (int i = 0; i < stringArray.size(); i++) {
            if (stringArray.get(i).toLowerCase() == "u" || stringArray.get(i).toLowerCase() == "you") {
                stringArray.set(i, "your sister");
            } else if (stringArray.get(i).toLowerCase().contains(" u ")) {
                stringArray.set(i, "your sister");
            } else if (p.matcher(stringArray.get(i).toLowerCase()).matches()) {
                stringArray.set(i, "your sister");
            }
        }

        StringBuilder stringOutput = new StringBuilder();

        if (stringArray.size() == 1) {
            stringOutput.append(stringArray.get(0));
        } else {
            for (String word2 : stringArray)
                stringOutput.append(word2);
        }



        return stringOutput.toString();
    }
}
