package io.kubeless;

import io.kubeless.Event;
import io.kubeless.Context;

public class Hello{
    public String sayHi(io.kubeless.Event event, io.kubeless.Context context) {
        return "Hello world!";
    }
}
