package io.nurudeenlawal.rules.LessThanHundred;

import io.nurudeenlawal.rules.Rules;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class FiftyRule implements Rules {
    @Override
    public boolean condition(int input) {
        return input<60&&input>=50;
    }

    @Override
    public String action(int input) {
        return array.fifties+array.nothingToNine[input-50];
    }
}
