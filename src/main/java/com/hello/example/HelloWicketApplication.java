package com.hello.example;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class HelloWicketApplication extends WebApplication {

    @Override
    public Class<? extends Page> getHomePage() {
        return HelloWicket.class;
    }

}
