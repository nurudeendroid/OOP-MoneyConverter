package io.nurudeenlawal.rules;


import io.nurudeenlawal.rules.LessThanHundred.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class HundredRules implements Rules{
    List<Rules> collectionOfHundredRules;
    public HundredRules(){
        collectionOfHundredRules = new ArrayList<>();
        collectionOfHundredRules.add(new NinetyRule());
        collectionOfHundredRules.add(new EightyRule());
        collectionOfHundredRules.add(new SeventyRule());
        collectionOfHundredRules.add(new SixtyRule());
        collectionOfHundredRules.add(new FiftyRule());
        collectionOfHundredRules.add(new FortyRule());
        collectionOfHundredRules.add(new ThirtyRule());
        collectionOfHundredRules.add(new TwentyRule());
        collectionOfHundredRules.add(new TeenRules());
        collectionOfHundredRules.add(new TenOrLessRule());
    }
    public boolean condition(int input) {
        return (input<1000 && input>=100);
    }

    public String action(int input) {
        int nonHundredNumber = input;
        while (nonHundredNumber>100){
            nonHundredNumber = nonHundredNumber-100;
        }
        String remainder = "";
        for (Rules rule: collectionOfHundredRules) {
            if(rule.condition(nonHundredNumber)){
                remainder = rule.action(nonHundredNumber);
                break;
            }
        }
        return array.nothingToNine[input/100]+array.hundreds+remainder;
    }
}
