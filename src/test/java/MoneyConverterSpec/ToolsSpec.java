package MoneyConverterSpec;

import io.nurudeenlawal.Tools.IntegerTools;
import io.nurudeenlawal.Tools.StringTools;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nurudeenlawal on 6/12/16.
 */

public class ToolsSpec {

    @Test
    public void runAgainstHundredOrLessRulesTest(){
        IntegerTools integerTools = new IntegerTools();
        String expectedValue = "OneHundredTwentyFive";
        String actualValue = integerTools.runAgainstHundredOrLessRules(125);
        Assert.assertEquals(expectedValue,actualValue);
    }

    @Test
    public void runAgainstHundredOrLessRulesFailTest(){
        IntegerTools integerTools = new IntegerTools();
        String expectedValue = "TwoHundredThirtyFive";
        String actualValue = integerTools.runAgainstHundredOrLessRules(125);
        Assert.assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void runAgainstThousandRulesTest(){
        IntegerTools integerTools = new IntegerTools();
        String expectedValue = "OneHundredThousand";
        String actualValue = integerTools.runAgainstThousandRules(100000);
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void runAgainstThousanRulesFailTest(){
        IntegerTools integerTools = new IntegerTools();
        String expectedValue = "OneHundredFiftyThousand";
        String actualValue = integerTools.runAgainstThousandRules(140000);
        Assert.assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void stringInIntOutTest(){
        StringTools stringTools = new StringTools();
        int expectedValue = 3555;
        int actualValue = stringTools.stringInIntOut("3555");
        Assert.assertEquals(expectedValue,actualValue);
    }
    @Test
    public void stringInIntOutFailTest(){
        StringTools stringTools = new StringTools();
        int expectedValue = 3555;
        int actualValue = stringTools.stringInIntOut("3454");
        Assert.assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void checkStringTest(){
        StringTools stringTools = new StringTools();
        boolean actualValue = stringTools.checkString("3555");
        Assert.assertTrue(actualValue);
    }
    @Test
    public void checkStringFailTest(){
        StringTools stringTools = new StringTools();
        boolean actualValue = stringTools.checkString("gfdhdjhk");
        Assert.assertFalse(actualValue);
    }
    @Test
    public void formatStringForProcessing(){
        StringTools stringTools = new StringTools();
        String expectedValue = "35555";
        String actualValue = stringTools.formatStringForProcessing("3fd555@5");
        Assert.assertEquals(expectedValue,actualValue);
    }
}
