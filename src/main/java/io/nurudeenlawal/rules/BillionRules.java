package io.nurudeenlawal.rules;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public class BillionRules implements Rules {
    public boolean condition(int input) {
        return (input<1000000000 && input>=1000000000);
    }

    public String action(int input) {
        return array.billions;
    }
    //add logic to return number that removes already considered part of number
}
