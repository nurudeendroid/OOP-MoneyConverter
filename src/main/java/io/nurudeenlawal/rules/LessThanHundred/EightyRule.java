package io.nurudeenlawal.rules.LessThanHundred;

import io.nurudeenlawal.rules.Rules;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class EightyRule implements Rules {
    @Override
    public boolean condition(int input) {
        return input<90&&input>=80;
    }

    @Override
    public String action(int input) {
        return array.eighties+array.nothingToNine[input-80];
    }
}
