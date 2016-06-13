package MoneyConverterSpec;

import io.nurudeenlawal.Decisions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by nurudeenlawal on 6/9/16.
 */
    @RunWith(Parameterized.class)
    public class NumberInWordOutParameterizedTest {

        private int inputNumber;
        private String outputWord;

        public NumberInWordOutParameterizedTest(String name,String outputWord, int inputNumber) {
            this.inputNumber = inputNumber;
            this.outputWord = outputWord;
        }

        @Test
        public void timeToWordTest() {
            Decisions decisions = new Decisions();
            Assert.assertEquals(outputWord,decisions.getWordEquivalentOfNumber(inputNumber));
        }

        @Parameterized.Parameters(name = "{0}")
        public static Collection<Object[]> params() {
            Collection<Object[]> params = new ArrayList<>();
            params.add(new Object[]{"oneTest","OneDollars",1});
            params.add(new Object[]{"twoTest","TwoDollars",2});
            params.add(new Object[]{"tensTest","FifteenDollars",15});
            params.add(new Object[]{"tensTest","NinetyFiveDollars",95});
            params.add(new Object[]{"hundredsTest","FiveHundredTwentyFiveDollars",525});
            params.add(new Object[]{"thousandsTest","FiveThousandOneHundredTwentyFiveDollars",5125});
            params.add(new Object[]{"tensofthousandsTest","FiftyOneThousandOneHundredTwentyFiveDollars",51125});
            params.add(new Object[]{"hundredsofthousandsTest","FourHundredTwentyThreeThousandOneHundredTwentyFiveDollars",423125});
            params.add(new Object[]{"millionsTest","ThreeMillionOneHundredTwentyFiveDollars",3000125});
            params.add(new Object[]{"tensOfmillionsTest","ThirtyMillionOneHundredTwentyFiveDollars", 30000125});
            params.add(new Object[]{"hundredsOfmillionsTest","ThreeHundredTwentyMillionOneHundredTwentyFiveDollars", 320000125, });

            return params;
        }

    }

