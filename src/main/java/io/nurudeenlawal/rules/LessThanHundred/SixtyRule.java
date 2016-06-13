package io.nurudeenlawal.rules.LessThanHundred;

import io.nurudeenlawal.rules.Rules;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class SixtyRule implements Rules {
    @Override
    public boolean condition(int input) {
        return input<70&&input>=60;
    }

    @Override
    public String action(int input) {
        return array.sixties+array.nothingToNine[input-60];
    }
}
