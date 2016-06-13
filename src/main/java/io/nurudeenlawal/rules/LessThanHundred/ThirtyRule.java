package io.nurudeenlawal.rules.LessThanHundred;

import io.nurudeenlawal.rules.Rules;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class ThirtyRule implements Rules {
    @Override
    public boolean condition(int input) {
        return input<40&&input>=30;
    }

    @Override
    public String action(int input) {
        return array.thirties+array.nothingToNine[input-30];
    }
}
