package io.nurudeenlawal.rules.LessThanHundred;

import io.nurudeenlawal.rules.Rules;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class TeenRules implements Rules {
    @Override
    public boolean condition(int input) {
        return input<20&&input>=10;
    }

    @Override
    public String action(int input) {
        return array.tenToNineteen[input-10];
    }
}
