package com.udacity.gradle.builditbigger;

import android.test.ActivityInstrumentationTestCase2;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityInstrumentationTestCase2<MainActivity> {


    public ApplicationTest(){
        super(MainActivity.class);
    }

    public void testVerifyAsyncTask(){
        MainActivityFragment mainActivityFragment = new MainActivityFragment();
        assertNotNull(mainActivityFragment.getJoke());
    }

}