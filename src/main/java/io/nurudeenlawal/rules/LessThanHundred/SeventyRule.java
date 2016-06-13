package io.nurudeenlawal.rules.LessThanHundred;

import io.nurudeenlawal.rules.Rules;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class SeventyRule implements Rules {
    @Override
    public boolean condition(int input) {
        return input<80&&input>=70;
    }

    @Override
    public String action(int input) {
        return array.seventies+array.nothingToNine[input-70];
    }
}
