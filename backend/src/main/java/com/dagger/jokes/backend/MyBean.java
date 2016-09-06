package com.dagger.jokes.backend;

import com.example.JokeTeller;

/** The object model for the data we are sending through endpoints */
public class MyBean {

//    String joke;

//    public MyBean() {
//        joke = JokeTeller.getJoke();
//    }

    public String getData() {
        return JokeTeller.getJoke();
    }
    public void setData(String data) {

    }
}