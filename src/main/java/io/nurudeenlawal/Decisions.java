package io.nurudeenlawal;

import java.util.ArrayList;
import java.util.List;
import io.nurudeenlawal.rules.*;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class Decisions {

    List<Rules> rules;

    public Decisions(){
        rules = new ArrayList<>();

        rules.add(new BillionRules());
        rules.add(new MillionRules());
        rules.add(new ThousandRules());
        rules.add(new HundredRules());
        rules.add(new HundredOrLessRules());
    }

    public String getWordEquivalentOfNumber(int input){
        String response = "";
        for (Rules rule: rules) {
            if(rule.condition(input)){
                response = rule.action(input);
                break;
            }
        }
        return response+"Dollars";
    }
}
