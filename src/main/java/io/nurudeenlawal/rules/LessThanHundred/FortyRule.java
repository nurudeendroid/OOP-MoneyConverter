package io.nurudeenlawal.rules.LessThanHundred;

import io.nurudeenlawal.rules.Rules;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class FortyRule implements Rules {
    @Override
    public boolean condition(int input) {
        return input<50&&input>=40;
    }

    @Override
    public String action(int input) {
        return array.forties+array.nothingToNine[input-40];
    }
}
