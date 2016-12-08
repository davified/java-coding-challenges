package com.codechallenges;

import org.junit.Assert;
import org.junit.Test;

/* Created by davified on 8/12/16. */
public class AutoCorrectTest {
    @Test
    public void solution() throws Exception {
        String[] inputs = new String[] {
//                "hello how a re you",
                "u",
                "you",
                "Youuuuu",
                "youtube"
        };

        String[] outputs = new String[] {
//                "your sister",
                "your sister",
                "your sister",
                "your sister",
                "youtube"
        };

        for (int i = 0; i < inputs.length; i++) {
            Assert.assertEquals(String.format("Wrong result for \"%s\":", inputs[i]), outputs[i], com.codechallenges.AutoCorrect.solution(inputs[i]));
        }
    }

}