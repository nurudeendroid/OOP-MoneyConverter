package io.nurudeenlawal.rules;

import io.nurudeenlawal.Tools.IntegerTools;


/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class ThousandRules implements Rules {
    IntegerTools integerTools = new IntegerTools();
    @Override
    public boolean condition(int input) {
        return (input<1000000 && input>=1000);
    }


    public String action(int input) {
        String thousands;
        thousands=integerTools.runAgainstHundredOrLessRules(input/1000);
        int nonThousandNumber = input;
        while (nonThousandNumber>1000){
            nonThousandNumber = nonThousandNumber-1000;
        }
        String nonThousandResponse;
        nonThousandResponse=integerTools.runAgainstHundredOrLessRules(nonThousandNumber);
        return thousands+array.thousands+nonThousandResponse;
    }
}
