package io.nurudeenlawal.Tools;

import io.nurudeenlawal.rules.HundredRules;
import io.nurudeenlawal.rules.LessThanHundred.*;
import io.nurudeenlawal.rules.Rules;
import io.nurudeenlawal.rules.ThousandRules;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nurudeenlawal on 6/12/16.
 */
public class IntegerTools {
    List<Rules> collectionOfHundredRules;
    public IntegerTools(){
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
    public String runAgainstHundredOrLessRules(int input){
        String response = "";
        for (Rules rule: collectionOfHundredRules) {
            if(rule.condition(input)){
                response = rule.action(input);
                break;
            }
        }
        return response;
    }
    public String runAgainstThousandRules(int input){
        ThousandRules thousandRules =new ThousandRules();
        String response="";
        if(thousandRules.condition(input)){
            response=thousandRules.action(input);
        }
        return response;
    }
}
