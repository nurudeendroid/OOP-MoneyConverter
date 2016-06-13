package io.nurudeenlawal.rules;


import io.nurudeenlawal.Tools.IntegerTools;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class MillionRules  implements Rules{
   IntegerTools integerTools = new IntegerTools();

    @Override
    public boolean condition(int input) {
        return (input<1000000000 && input>=1000000);
    }


    public String action(int input) {
        String millions;
        millions=integerTools.runAgainstHundredOrLessRules(input/1000000);
        int nonMillionNumber = input;
        while (nonMillionNumber>1000000){
            nonMillionNumber = nonMillionNumber-1000000;
        }
        String thousands = integerTools.runAgainstThousandRules(nonMillionNumber);
        int nonThousandNumber= nonMillionNumber;
        while (nonThousandNumber>1000){
            nonThousandNumber = nonThousandNumber-1000;
        }
        String hundredsOrLess;
        hundredsOrLess=integerTools.runAgainstHundredOrLessRules(nonThousandNumber);
        return millions+array.millions+thousands+hundredsOrLess;
    }
}
