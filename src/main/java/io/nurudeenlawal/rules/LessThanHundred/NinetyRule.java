package io.nurudeenlawal.rules.LessThanHundred;

import io.nurudeenlawal.rules.Rules;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class NinetyRule implements Rules{
    @Override
    public boolean condition(int input) {
        return input<100&&input>=90;
    }

    @Override
    public String action(int input) {
        return array.nineties+array.nothingToNine[input-90];
    }
}
