package com.hello.example;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HelloWicket extends WebPage {

    public HelloWicket() {
        add(new Label("welcome", "Welcome to Wicket!"));
    }

}
