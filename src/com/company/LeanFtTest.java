package com.company;

import com.hp.lft.sdk.internal.web.WebButton;
import com.hp.lft.sdk.web.*;
import org.junit.*;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;

import unittesting.*;

public class LeanFtTest extends UnitTestClassBase {

public LeanFtTest() {
    //Change this constructor to private if you supply your own public constructor
}

@BeforeClass
public static void setUpBeforeClass() throws Exception {
    instance = new LeanFtTest();
    globalSetup(LeanFtTest.class);
}

@AfterClass
public static void tearDownAfterClass() throws Exception {
    globalTearDown();
}

Browser browser;
@Before
public void setUp() throws Exception {
    browser = BrowserFactory.launch(BrowserType.CHROME);
}

@After
public void tearDown() throws Exception {
    browser.close();
}

@Test
public void test() throws GeneralLeanFtException {
    try{
        browser.navigate("www.google.com");
        EditField GSearch = browser.describe(EditField.class, new EditFieldDescription.Builder().name("q").build());
        GSearch.setValue("learn2automate");
        System.out.println(" entered search text");

       // Button btnSearch = browser.describe(Button.class, new ButtonDescription.Builder()
        //        .name("Google Search").build());
        Button googleSearchButton = browser.describe(Button.class, new ButtonDescription.Builder()
                .buttonType("submit")
                .index(1)
                .name("Google Search")
                .tagName("INPUT").build());
        googleSearchButton.click();
        System.out.println("clicked search button");
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
        Assert.fail("Unexpected error while looking for LeanFT on Learn2Automate - " + ex.getMessage());
    }
    }
}