package io.nurudeenlawal.rules;

import io.nurudeenlawal.ArrayOfNumberWordEquivalents;

/**
 * Created by nurudeenlawal on 6/11/16.
 */
public interface Rules {
    ArrayOfNumberWordEquivalents array = new ArrayOfNumberWordEquivalents();
     boolean condition(int input);
    String action(int input);
}
