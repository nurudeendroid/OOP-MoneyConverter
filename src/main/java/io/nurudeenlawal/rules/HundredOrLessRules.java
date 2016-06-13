package io.nurudeenlawal.rules;

import io.nurudeenlawal.rules.LessThanHundred.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class HundredOrLessRules implements Rules {
   static List<Rules> collectionOfHundredRules;
    public HundredOrLessRules(){
            collectionOfHundredRules = new ArrayList<>();
            collectionOfHundredRules.add(new HundredRules());
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
    @Override
    public boolean condition(int input) {
        return input<1000;
    }

    @Override
    public String action(int input) {
        String response = "";
        for (Rules rule: collectionOfHundredRules) {
            if(rule.condition(input)){
                response = rule.action(input);
                break;
            }
        }
        return response;
    }

    }

