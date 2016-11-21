package com.qatestlab.twit;


import com.qatestlab.pages.TwitRange;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestTwitRange extends BaseTest{

    private TwitRange twitPage;

    @BeforeClass
    public void setUp() {
        twitPage = new TwitRange(driver);
    }

    @Test
    @Parameters("daysRange")
    public void testRangeOfTwits(int daysRange){

        twitPage.goToPage("https://twitter.com/f1");
        twitPage.findTwitsOfRange(daysRange);
        twitPage.doTwitsOfRange();
    }


}
