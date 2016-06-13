package io.nurudeenlawal.rules.LessThanHundred;

import io.nurudeenlawal.rules.Rules;
import io.nurudeenlawal.ArrayOfNumberWordEquivalents;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class TenOrLessRule implements Rules{
    ArrayOfNumberWordEquivalents array = new ArrayOfNumberWordEquivalents();
    @Override
    public boolean condition(int input) {
        return (input<10);
    }

    @Override
    public String action(int input) {
        return array.nothingToNine[input];
    }
}
