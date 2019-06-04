package com.company;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;

import unittesting.*;

public class LeanFTJunitWindowTest extends UnitTestClassBase {

    public LeanFTJunitWindowTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LeanFTJunitWindowTest();
        globalSetup(LeanFTJunitWindowTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException {
    Aut TextEditor = Desktop.launchAut("DesktopWindowTest");
    }

}