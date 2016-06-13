package io.nurudeenlawal.rules.LessThanHundred;

import io.nurudeenlawal.rules.Rules;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class TwentyRule implements Rules{
    @Override
    public boolean condition(int input) {
        return input<30&&input>=20;
    }

    @Override
    public String action(int input) {
        return array.twenties+array.nothingToNine[input-20];
    }
}
