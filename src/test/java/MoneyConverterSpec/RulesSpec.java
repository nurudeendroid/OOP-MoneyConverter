package MoneyConverterSpec;

import io.nurudeenlawal.rules.HundredOrLessRules;
import io.nurudeenlawal.rules.HundredRules;
import io.nurudeenlawal.rules.LessThanHundred.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nurudeenlawal on 6/12/16.
 */
public class RulesSpec {
    @Test
    public void tenOrLessRuleTest(){
        TenOrLessRule tenOrLessRule = new TenOrLessRule();
        boolean expectedBoolean = true;
        boolean actualBoolean = tenOrLessRule.condition(4);
        String expectedString = "Four";
        String actualString = tenOrLessRule.action(4);
        Assert.assertEquals(expectedBoolean,actualBoolean);
        Assert.assertEquals(expectedString,actualString);
    }

    @Test
    public void teenRuleTest(){
        TeenRules teenRules = new TeenRules();
        boolean expectedBoolean = true;
        boolean actualBoolean = teenRules.condition(14);
        String expectedString = "Fourteen";
        String actualString = teenRules.action(14);
        Assert.assertEquals(expectedBoolean,actualBoolean);
        Assert.assertEquals(expectedString,actualString);
    }

    @Test
    public void twentyRuleTest(){
        TwentyRule twentyRule = new TwentyRule();
        boolean expectedBoolean = true;
        boolean actualBoolean = twentyRule.condition(24);
        String expectedString = "TwentyFour";
        String actualString = twentyRule.action(24);
        Assert.assertEquals(expectedBoolean,actualBoolean);
        Assert.assertEquals(expectedString,actualString);
    }

    @Test
    public void thirtyRuleTest(){
        ThirtyRule thirtyRule = new ThirtyRule();
        boolean expectedBoolean = true;
        boolean actualBoolean = thirtyRule.condition(34);
        String expectedString = "ThirtyFour";
        String actualString = thirtyRule.action(34);
        Assert.assertEquals(expectedBoolean,actualBoolean);
        Assert.assertEquals(expectedString,actualString);
    }

    @Test
    public void fortyRuleTest(){
        FortyRule fortyRule = new FortyRule();
        boolean expectedBoolean = true;
        boolean actualBoolean = fortyRule.condition(44);
        String expectedString = "FortyFour";
        String actualString = fortyRule.action(44);
        Assert.assertEquals(expectedBoolean,actualBoolean);
        Assert.assertEquals(expectedString,actualString);
    }

    @Test
    public void fiftyRuleTest(){
        FiftyRule fiftyRule = new FiftyRule();
        boolean expectedBoolean = true;
        boolean actualBoolean = fiftyRule.condition(54);
        String expectedString = "FiftyFour";
        String actualString = fiftyRule.action(54);
        Assert.assertEquals(expectedBoolean,actualBoolean);
        Assert.assertEquals(expectedString,actualString);
    }

    @Test
    public void sixtyRuleTest(){
        SixtyRule sixtyRule = new SixtyRule();
        boolean expectedBoolean = true;
        boolean actualBoolean = sixtyRule.condition(64);
        String expectedString = "SixtyFour";
        String actualString = sixtyRule.action(64);
        Assert.assertEquals(expectedBoolean,actualBoolean);
        Assert.assertEquals(expectedString,actualString);
    }

    @Test
    public void seventyRuleTest(){
        SeventyRule seventyRule = new SeventyRule();
        boolean expectedBoolean = true;
        boolean actualBoolean = seventyRule.condition(74);
        String expectedString = "SeventyFour";
        String actualString = seventyRule.action(74);
        Assert.assertEquals(expectedBoolean,actualBoolean);
        Assert.assertEquals(expectedString,actualString);
    }

    @Test
    public void eightyRuleTest(){
        EightyRule eightyRule = new EightyRule();
        boolean expectedBoolean = true;
        boolean actualBoolean = eightyRule.condition(84);
        String expectedString = "EightyFour";
        String actualString = eightyRule.action(84);
        Assert.assertEquals(expectedBoolean,actualBoolean);
        Assert.assertEquals(expectedString,actualString);
    }

    @Test
    public void ninetyRuleTest(){
        NinetyRule ninetyRule = new  NinetyRule();
        boolean expectedBoolean = true;
        boolean actualBoolean = ninetyRule.condition(94);
        String expectedString = "NinetyFour";
        String actualString = ninetyRule.action(94);
        Assert.assertEquals(expectedBoolean,actualBoolean);
        Assert.assertEquals(expectedString,actualString);
    }

    @Test
    public void hundredRuleTest(){
        HundredRules hundredRules = new HundredRules();
        boolean expectedBoolean = true;
        boolean actualBoolean = hundredRules.condition(104);
        String expectedString = "OneHundredFour";
        String actualString = hundredRules.action(104);
        Assert.assertEquals(expectedBoolean,actualBoolean);
        Assert.assertEquals(expectedString,actualString);
    }

    @Test
    public void hundredOrLessRuleTest(){
        HundredOrLessRules hundredOrLessRules = new HundredOrLessRules();
        boolean expectedBoolean = true;
        boolean actualBoolean = hundredOrLessRules.condition(104);
        String expectedString = "OneHundredFour";
        String actualString = hundredOrLessRules.action(104);
        Assert.assertEquals(expectedBoolean,actualBoolean);
        Assert.assertEquals(expectedString,actualString);
    }

}
